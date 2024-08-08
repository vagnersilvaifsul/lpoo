package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Objetivo5Controller {
    public static void main(String[] args) {
        //a
        System.out.println("************ a ************");
        Instant instant = Instant.ofEpochMilli(1723066578101L);
        System.out.println("Valor antes da aplicação da máscara (observe que ISO é o formato padrão do Java)= "+ instant);
        LocalDateTime data = LocalDateTime.ofInstant(instant, ZoneId.of("UTC-0"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data));

        //b
        System.out.println("\n\n************ b ************");
        System.out.println(instant.atZone(ZoneId.of("UTC-3")));
        System.out.println(instant.atZone(ZoneId.of("UTC+1")));

        //c
        /*
            Não há diferença entre UTC-3 e "America/Sao_Paulo", desde que em "America/Sao_Paulo"
            não estejam em horário de verão.
            Há diferença entre UTC+1 se em "Europe/Paris" for horário de verão.
            Justificando: o horário UTC pode ser dirente do fuso horário America/Sao_Paulo ou Europe/Paris,
            pois, estes últimos consideram o horário de verão (uma espécie de deslocamento no UTC).
         */
        System.out.println("\n\n************ c ************");
        System.out.println(instant.atZone(ZoneId.of("America/Sao_Paulo")));
        System.out.println(instant.atZone(ZoneId.of("Europe/Paris")));

        //d
        System.out.println("\n\n************ d ************");
        String dataString = "07/08/2024";
        LocalDate dataD = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataD));

        //e
        System.out.println("\n\n************ e ************");
        String horaString = "14:05";
        LocalTime horaE = LocalTime.parse(horaString, DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(horaE);

        //d
        System.out.println("\n\n************ f ************");
        String dataEmString = "15/09/1822";
        LocalDate dataIndependencia = LocalDate.parse(dataEmString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataIndependencia, hoje);
        System.out.println(periodo);

        //g
        System.out.println("\n\n************ g ************");
        Instant inicio = Instant.parse("2024-08-07T21:50:41Z");
        Instant fim = Instant.parse("2024-08-07T21:50:44Z");
        Duration duracao = Duration.between(inicio, fim);
        System.out.println(duracao.getSeconds() + " segundos");

        //h
        System.out.println("\n\n************ h ************");
        String dataHoraEnviada = "12/06/2014 17:00";
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraEnviada, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataHora));

        //i
        System.out.println("\n\n************ i ************");
        //regitro de fornecimentos
        Fornecedor f1 = new Fornecedor("1234320001-12", "Silva e Silva LTDA", "Tio do Arroz", "tiodoarroz@email.com", "5355551234", null);
        Produto p1 = new Produto("12345aed", "Arroz", "Arroz Ceolin tipo 1 5kg", 0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(12.0), List.of(f1));
        //i-a - fornecimento com a data de hoje
        Fornecimento fn1 = new Fornecimento(LocalDateTime.now(), 100, p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)),f1, p1);
        System.out.print("+++++ i-a +++++");
        System.out.println(fn1);
        //i-b - fornecimento 30 dias atrás
        Fornecimento fn2 = new Fornecimento(LocalDateTime.now().minusDays(30L), 100, p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)),f1, p1);
        System.out.print("+++++ i-b +++++");
        System.out.println(fn2);
        //i-c - fornecimento 60 dias atrás
        Fornecimento fn3 = new Fornecimento(LocalDateTime.now().minusDays(60L), 100, p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)),f1, p1);
        System.out.print("+++++ i-c +++++");
        System.out.println(fn3);

        List<Fornecimento> fornecimentos = List.of(fn1, fn2, fn3);
        //i-d - fornecimentos detalhados dos últimos 30 dias e o total
        System.out.println("\n\n+++++ i-d +++++");
        System.out.print("Relatório com os fornecimentos detalhados dos últimos 30 dias");
        Double acum = 0.0;
        for (Fornecimento f : fornecimentos){
            if(f.getData().isAfter(LocalDateTime.now().minusDays(31L))){
                System.out.print(f);
                acum += f.getTotal().doubleValue();
            }
        }
        System.out.println("\nTotal Fornecido ======> " + NumberFormat.getCurrencyInstance().format(acum));

        //i-e - fornecimentos detalhados dos últimos 60 dias e o total
        System.out.println("\n\n+++++ i-e +++++");
        System.out.print("Relatório com os fornecimentos detalhados dos últimos 60 dias");
        acum = 0.0;
        for (Fornecimento f : fornecimentos){
            if(f.getData().isAfter(LocalDateTime.now().minusDays(61L))){
                System.out.print(f);
                acum += f.getTotal().doubleValue();
            }
        }
        System.out.println("\nTotal Fornecido ======> " + NumberFormat.getCurrencyInstance().format(acum));
    }
}
