package controller;

import java.time.*;
import java.time.format.DateTimeFormatter;

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

        //i TODO: fazer esse item do exercício
        System.out.println("\n\n************ i ************");
        System.out.println("Em desenvolvimento");
    }
}
