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
        /*
            a. Dado o Instant 1723066578101, em UTC-0, faça o programa imprimir a data e a hora no
            formato dd/MM/yyyy HH:mm referente a este instante em UTC-0;
         */
        System.out.println("************ a ************");
        Instant instant = Instant.ofEpochMilli(1723066578101L);
        System.out.println("Valor antes da aplicação da máscara (observe que ISO é o formato padrão do Java)= "+ instant);
        LocalDateTime data = LocalDateTime.ofInstant(instant, ZoneId.of("UTC-0"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data));

        /*
            b. Dado o mesmo Instant do item “a” faça o programa imprimir a data e a hora no formato
            dd/MM/yyyy HH:mm referente a este instante em UTC-3, e UTC+1;
         */
        System.out.println("\n\n************ b ************");
        System.out.println(instant.atZone(ZoneId.of("UTC-3")));
        System.out.println(instant.atZone(ZoneId.of("UTC+1")));

        /*
            c. Dado o mesmo Instant do item “a” faça o programa imprimir a data e a hora no formato
            dd/MM/yyyy HH:mm referente a este instante em “America/Sao_Paulo”, e “Europe/Paris”.
         */
        /*
            Não há diferença entre UTC-3 e "America/Sao_Paulo", desde que em "America/Sao_Paulo"
            não estejam em horário de verão.
            Há diferença entre UTC+1 se em "Europe/Paris" for horário de verão.
            Justificando: o horário UTC pode ser dirente do fuso horário America/Sao_Paulo ou Europe/Paris,
            pois, estes últimos consideram o horário de verão (uma espécie de deslocamento no UTC).
         */
        System.out.println("\n\n************ c ************");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("America/Sao_Paulo"))));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("Europe/Paris"))));

        /*
            d. Dada a String “07/08/2024” faça o programa criar uma instância para armazenar esta data,
            depois, imprima o resultado no formato dd/MM/yyyy;
         */
        System.out.println("\n\n************ d ************");
        String dataString = "07/08/2024";
        LocalDate dataD = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataD));

        /*
            e. Dada a String 14:05 faça o programa criar uma instância para armazenar esta hora, depois,
            imprima o resultado no formato HH:mm;
         */
        System.out.println("\n\n************ e ************");
        String horaString = "14:05";
        LocalTime horaE = LocalTime.parse(horaString, DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(horaE);

        /*
            f. Data a data 07/09/1822 faça o programa calcular quantos Anos, Meses, e dias se passaram
            até o dia de hoje. Imprima o resultado;
         */
        System.out.println("\n\n************ f ************");
        String dataEmString = "07/09/1822";
        LocalDate dataIndependencia = LocalDate.parse(dataEmString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataIndependencia, hoje);
        System.out.println(periodo);

        /*
            g. Dado o timestamp 2024-08-07T21:50:41Z de início de execução de um algoritmo e o
            timestamp 2024-08-07T21:50:44Z de fim de execução do mesmo algoritmo, faça o
            programa calcular o tempo que o algoritmo levou em execução (resultado = 3s);
         */
        System.out.println("\n\n************ g ************");
        Instant inicio = Instant.parse("2024-08-07T21:50:41Z");
        Instant fim = Instant.parse("2024-08-07T21:50:44Z");
        Duration duracao = Duration.between(inicio, fim);
        System.out.println(duracao.getSeconds() + " segundos");

        /*
            h. O front-end de uma aplicação enviou a seguinte data e hora para ser armazena no back-end
            “12/06/2014 17:00” (uma String). Com base nesse dado, faça o programa armazenar esta
            data e hora e imprima o resultado no formato dd/MM/yyyy HH:mm;
         */
        System.out.println("\n\n************ h ************");
        String dataHoraEnviada = "12/06/2014 17:00";
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraEnviada, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataHora));

        /*
            i. Para o diagrama Produto-Fornecedor-Fornecimento (para todos os fornecimentos considere
            o preço de custo de cada produto R$ 10,00 e a quantidade fornecida 100 unidades, o estoque
            de produto inicial 0, e um único produto de um mesmo fornecedor.):
         */
        System.out.println("\n\n************ i ************");
        //regitro de fornecimentos
        Fornecedor f1 = new Fornecedor("1234320001-12", "Silva e Silva LTDA", "Tio do Arroz", "tiodoarroz@email.com", "5355551234", null);
        Produto p1 = new Produto("12345aed", "Arroz", "Arroz Ceolin tipo 1 5kg", 0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(12.0), List.of(f1));
        //i-a - fornecimento com a data de hoje
        /*
            a. Faça o programa registrar um fornecimento com a data de hoje. Imprima o resultado;
         */
        Fornecimento fn1 = new Fornecimento(LocalDateTime.now(), 100, p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)),f1, p1);
        System.out.print("+++++ i-a +++++");
        System.out.println(fn1);

        //i-b - fornecimento 30 dias atrás
        /*
            b. Faça o programa registrar um fornecimento com a data de 30 dias atrás. Imprima o resultado;
         */
        Fornecimento fn2 = new Fornecimento(LocalDateTime.now().minusDays(30L), 100, p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)),f1, p1);
        System.out.print("+++++ i-b +++++");
        System.out.println(fn2);

        //i-c - fornecimento 60 dias atrás
        /*
            c. Faça o programa registrar um fornecimento com a data de 60 dias atrás. Imprima o resultado;
         */
        Fornecimento fn3 = new Fornecimento(LocalDateTime.now().minusDays(60L), 100, p1.getPrecoDeCompra().multiply(BigDecimal.valueOf(100)),f1, p1);
        System.out.print("+++++ i-c +++++");
        System.out.println(fn3);

        List<Fornecimento> fornecimentos = List.of(fn1, fn2, fn3);

        //i-d - fornecimentos detalhados dos últimos 30 dias e o total
        /*
           d. Agora faça o programa imprimir um relatório com os fornecimentos detalhados
            dos últimos 30 dias, bem como, o total desses fornecimentos;
         */
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
        /*
            e. Agora faça o programa imprimir um relatório com os fornecimentos detalhados
            dos últimos 60 dias, bem como, o total desses fornecimentos;
         */
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
