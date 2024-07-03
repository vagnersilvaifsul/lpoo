/*
    As interfaces, até o Java 7, tinham como regra o seguinte:
    1. Qualquer atributo em uma interface deve ser público e constante;
    2. Qualquer método em uma interface deve ser público e abstrato.

    Porém, essa rigidez na regra fez com que, ao dar manutenção nas classes do Java,
    isto é, ao implementar melhorias, os desenvolvedores passassem por um problema. Ao
    adicionar um novo método em uma interface toda e qualquer classe que a implementasse
    no SDK deveria sofrer atualização (implementar esse novo método). Como resposta a esse
    problema, os desenvolvedores do Java, a partir da sua versão 8, adicionaram outros tipos
    de métodos as interfaces, os default e os private.

    Método Default: Um método default aceita ter algoritmo (é implementado), logo, ele quebra a
    regra 2 "Qualquer método em uma interface deve ser público e abstrato". Assim, ao adionar um
    novo método em uma interface ele já é implementado, deixando, a cargo de quem o herda a decisão
    de modificar sua implementação.

    Método Private: este é um método que também aceita ter algoritmo (é implementado). Mas,
    diferente do método default, ele não é visível por quem implementa a interface (em outras
    palavras, ele é interno a interface. Muito útil quando um método deve ter sua implementação
    final no escopo da interface (não permitindo modificar sua implementação e outro espaço)).

    Mais tarde, seguindo a evolução da tecnologia, os desenvolvedores viram a necessidade de
    criar métodos static. Asssim, não seria necessário criar um objeto da interface, mas apenas
    utilizar o método (já que ele é um membro da Interface, e não da instância da interface).
    Método Static: este é um método que aceita ter algoritmo (é implementado). Mas, diferente do
    default e do private, ele é marcado com o modificador static, para representar que esse é
    um método membro da interface e não de sua instância (de seu objeto) que, em outras palavras,
    significa que para chamar o método basta colocar o nome da interface como prefixo, assim:
    NomeDaInterface.NomeDoMétodoStatic()

 */


public interface CustomInterface {

    //método da instância da interface (até o Java 7 era somente assim)
    void method1();

    //método default da interface (Java8+)
    default void method2() {
        method4();  //private method inside default method
        method5();  //static method inside other non-static method
        System.out.println("default method2");
    }

    //método static da interface (Java9+)
    static void method3() {
        System.out.println("static method3");
    }

    //método private (Java9+)
    private void method4(){
        System.out.println("private method4");
    }

    //método private e static (Java9+)
    private static void method5(){
        System.out.println("private static method5");
    }
}
