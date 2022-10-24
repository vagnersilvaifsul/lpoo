package controller;

import java.time.*;
import java.time.format.DateTimeFormatter;

/** Nova API de Data no Java, java.time
 *  Rerefência: JAVA_DOC. Documentação oficial do JDK 18. https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/package-summary.html. Acesso em, outubro de 2022.
 *
 *  A partir do Java 8 o JDK começou a contar com uma nova API para manipulação de datas, o java.time.
 *  Esta é a "A API principal para datas, horas, instantes e durações". (JAVA_DOC, 2022)
 *
 *  "As classes definidas aqui representam os principais conceitos de data e hora, incluindo instantes, durações, datas,
 *  horas, fusos horários e períodos. Eles são baseados no sistema de calendário ISO, que é o calendário mundial de
 *  fato seguindo as regras gregorianas prolépticas. Todas as classes são imutáveis e thread-safe". (JAVA_DOCS, 2022)
 *
 *  A maioria dos aplicativos pode começar com apenas cinco tipos de data/hora (JAVA_DOC, 2022):
 *  Instant- um carimbo de data/hora
 *  LocalDate- uma data sem hora, ou qualquer referência a um deslocamento ou fuso horário
 *  LocalTime- uma hora sem data ou qualquer referência a um deslocamento ou fuso horário
 *  LocalDateTime- combina data e hora, mas ainda sem qualquer deslocamento ou fuso horário
 *  ZonedDateTime- uma data-hora "completa" com fuso horário e deslocamento resolvido de UTC/Greenwich
 *
 *  Instant é a classe equivalente mais próxima de java.util.Date. ZonedDateTime é a classe equivalente mais próxima de
 *  java.util.GregorianCalendar. (JAVA_DOC, 2022)
 *
 *  Sempre que possível, os aplicativos devem usar LocalDate, LocalTimee LocalDateTime. (JAVA_DOC, 2022)
 *
 *  Um dos principais conceitos dessa nova API é a separação de como dados temporais são interpretados em duas
 *  categorias: a dos computadores e a dos humanos.
 *
 *  ++++ ATENÇÃO ++++
 *  A API de datas, java.time, possuir um grande conjunto de métodos, logo, sufixos foram criados para facilitar
 *  a busca pelo método mais adequado para o problema a ser resolvido, são eles (JAVA_DOC, 2022):
 *      of- método de fábrica estático (valor de)
 *      parse- método de fábrica estático focado na análise (converte de um tipo para outro)
 *      get- obtém o valor de algo
 *      is- verifica se algo é verdade
 *      with- o equivalente imutável de um setter
 *      plus- adiciona uma quantidade a um objeto
 *      minus- subtrai uma quantidade de um objeto
 *      to- converte este objeto para outro tipo
 *      at- combina este objeto com outro, comodate.atTime(time)
 *
 *  As principais classes para representar datas e horas são:
 *      Para Computadores
 *      Instant - Representa um momento (data e hora) no tempo em UTC.
 *      Duration - Mede o intervalo entre dois instantes
 *
 *      Para Humanos:
 *      LocalDate - Representa uma data.
 *      LocalTime - Representa um horário.
 *      LocalDateTime - Representa uma data com hora.
 *      ZoneDateTime - Representa uma data com hora e fuso horário.
 *      Period - Calcula o período decorrido entre duas datas (considera anos bissextos).
 *
 */

public class Main {
    public static void main(String[] args) {
        /**
         * ++++ Datas para computadores ++++
         * Para um computador, o tempo é um número que cresce a cada instante. No Java, historicamente era utilizado um
         * long que representava os milissegundos desde 01/01/1970 às 00:00:00. Na javq.time, a classe Instant é utilizada
         * para representar esse número, agora com precisão de nanossegundos.
         */
        //Instant +++++++++++++++++++++++++++
        /* Retorna a data e hora atual em nanosegundos */
        System.out.println("\n++++ Datas para computadores ++++");
        System.out.println("--------- Exemplo de uso do Instant (data e hora atual do sistema) --------- ");
        Instant agora = Instant.now();
        System.out.print("Saída padrão (note que está com o offset de Greenwich): " + agora); //exemplo: 2022-10-21T14:11:25.109702Z (formato ISO-8601)
        LocalDateTime dataHoraSP = LocalDateTime.ofInstant(agora, ZoneId.of("America/Sao_Paulo"));
        System.out.println("\nSaída ajustada pelo ZoneId (note que está com o offset de São Paulo): " + dataHoraSP);

        System.out.println("\n--------- Exemplo de uso do Instant a partir de uma String (data e hora atual do sistema - Um TIMESTAMP) --------- ");
        agora = Instant.parse("2022-10-24T14:21:00Z");
        System.out.println("Saída padrão: " + agora); //formato ISO-8601

        //Hora do Sistema com o ZoneId
        System.out.println("\n--------- Exemplo de uso do Instant para pegar a data/hora do sistema no ZoneId --------- ");
        LocalDateTime dataHoraSaoPaulo = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Sao_Paulo"));
        System.out.println("America/Sao_Paulo: " + dataHoraSaoPaulo);
        LocalDateTime dataHoraParis = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Paris"));
        System.out.println("Europe/Paris: " + dataHoraParis);

        //Podemos usar um Instant, por exemplo, para medir o tempo de execução de um algoritmo.
        Instant inicio = Instant.now();
        rodaAlgoritmo();
        Instant fim = Instant.now();

        //Duration +++++++++++++++++++++++++++
        /* Mede o intervalo entre dois instantes (Instant) em até nanogundos */
        System.out.println("\n--------- Exemplo de uso do Duration (intervalo entre dois instantes) --------- ");
        Duration duracao = Duration.between(inicio, fim);
        long duracaoEmMilissegundos = duracao.toMillis(); //observe o uso do to como prefixo
        System.out.println(duracaoEmMilissegundos + "ms");


        /**
         * ++++ Datas para humanos ++++
         * Já para um humano, há uma divisão do tempo em anos, meses, dias, semanas, horas, minutos, segundos e por
         * aí vai. Temos ainda fusos horários, horário de verão e diferentes calendários.
         *
         * Várias questões surgem ao considerarmos a interpretação humana do tempo. Por exemplo, no calendário judaico,
         * um ano pode ter 13 meses. As classes do pacote java.time permitem que essas interpretações do tempo sejam definidas
         * e manipuladas de forma precisa, ao contrário do que acontecia ao usarmos Date ou Calendar (A partir de java.time
         * procure descontinuar o uso de java.util.Date e java.util.Calendar).
         */
        //LocalDate +++++++++++++++++++++++++++
        /* Representa uma data, ou seja, um período de 24 horas, com dia, mês, e ano. */
        System.out.println("\n\n++++ Datas para humanos ++++");
        System.out.println("--------- Exemplo de uso do LocalDate (data do sistema, sem a hora) --------- ");
        LocalDate hoje = LocalDate.now();
        System.out.print("Saída padrão: " + hoje); //2022-10-21 (formato ISO-8601)
        System.out.print("\nSaída formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(hoje));

        /*
            Um LocalDate serve para representarmos, por exemplo, a data de emissão do nosso RG, em que não nos importa as horas
            ou minutos, mas o dia da emissão. Podemos criar um LocalDate para uma data específica utilizando o método of.
         */
        System.out.println("\n\n--------- Exemplo de uso do LocalDate com uma data específica --------- ");
        LocalDate emissaoRG = LocalDate.of(2022, 10, 20);
        System.out.print("Saída padrão: " + emissaoRG);
        System.out.print("\nSaída formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(emissaoRG));

        System.out.println("\n\n--------- Exemplo de uso do LocalDate a partir de uma data específica, com o uso do Enum Month --------- ");
        emissaoRG = LocalDate.of(2022, Month.OCTOBER, 20);
        System.out.print("Saída padrão: " + emissaoRG);
        System.out.print("\nSaída formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(emissaoRG));

        System.out.println("\n\n--------- Exemplo de uso do LocalDate a partir de uma String (data específica) --------- ");
        emissaoRG = LocalDate.parse("2022-10-20");
        System.out.print("Saída padrão: " + emissaoRG);
        System.out.print("\nSaída formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(emissaoRG));
        //ou
        System.out.println("ou");
        emissaoRG = LocalDate.parse("20/10/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Saída padrão: " + emissaoRG);
        System.out.print("\nSaída formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(emissaoRG));

        //Period +++++++++++++++++++++++++++
        /*  Para calcularmos a duração entre dois LocalDate, devemos utilizar um Period, que já trata anos bissextos e outros
            detalhes.
         */
        System.out.println("\n\n--------- Exemplo de uso do Period (distância entre dois LocalDate) --------- ");
        Period periodo = Period.between(hoje, emissaoRG);
        System.out.println(periodo);

        System.out.println("\n--------- Outro exemplo de uso do Period (distância entre dois LocalDate) --------- ");
        LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
        LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);
        periodo = Period.between(homemNoEspaco, homemNaLua); System.out.println(periodo);
        System.out.printf("Saída formatada: %s anos, %s mês e %s dias", periodo.getYears(), periodo.getMonths(), periodo.getDays() );


        //LocalTime +++++++++++++++++++++++++++
        /*  Já a classe 'LocalTime' serve para representar apenas um horário, sem data específica. Podemos, por exemplo, usá-la
            para representar o horário de entrada no trabalho.
         */
        System.out.println("\n\n--------- Exemplo de uso do LocalTime (hora atual do sistema, sem a data) --------- ");
        LocalTime horarioDeEntrada = LocalTime.now();
        System.out.println(horarioDeEntrada);//imprime a hora atual do sistema (em nanosegundos)

        System.out.println("\n\n--------- Exemplo de uso do LocalTime a partir de uma hora específica (hora específica, sem a data) --------- ");
        horarioDeEntrada = LocalTime.of(14, 0);
        System.out.println(horarioDeEntrada); //14:00

        System.out.println("\n\n--------- Exemplo de uso do LocalTime a partir de uma String (hora específica, sem a data) --------- ");
        horarioDeEntrada = LocalTime.parse("14:00");
        System.out.println(horarioDeEntrada); //14:00

        //LocalDateTime +++++++++++++++++++++++++++
        /*  A classe LocalDateTime serve para representar uma data e hora específicas. Podemos representar uma data e hora de
            uma prova importante ou de uma audiência em um tribunal.
         */
        System.out.println("\n\n--------- Exemplo de uso do LocalDateTime (data e hora atual) --------- ");
        LocalDateTime agoraLD = LocalDateTime.now();
        System.out.println(agoraLD); //2014-06-12T17:00 (formato ISO-8601)

        System.out.println("\n\n--------- Exemplo de uso do LocalDateTime a partir de uma data e hora específica --------- ");
        LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
        System.out.print("Saída padrão: " + aberturaDaCopa); //2014-06-12T17:00 (formato ISO-8601)
        System.out.print("\nSaída formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(aberturaDaCopa));

        System.out.println("\n\n--------- Exemplo de uso do LocalDateTime a partir de uma String (data e hora específica) --------- ");
        aberturaDaCopa = LocalDateTime.parse("2014-06-12T17:00");
        System.out.print("Saída padrão: " + aberturaDaCopa); //2014-06-12T17:00 (formato ISO-8601)
        System.out.print("\nSaída formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(aberturaDaCopa));

        System.out.println("\n\n");
    }

    private static void rodaAlgoritmo(){
        for (int i = 0; i < 1000000; i++) {

        }
    }
}