import java.util.Arrays;

public class VarArgsController {
    public static void main(String[] args) {
        System.out.println(calcular(1, 2, 3)); //6
        System.out.println(calcular(1, 2, 3, 4)); //10
    }

    /*
        Os ... (três pontos) após o tipo do argumento indica que a quantidade de argumentos desse método
        é variável, aceitando para processamento a quantidade identificada na chamada do método.
     */
    private static int calcular(int... args){
        return Arrays.stream(args).sum(); //soma todos os argumento e retorna o valor
    }
}
