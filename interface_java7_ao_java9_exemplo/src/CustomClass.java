public class CustomClass implements CustomInterface{
    @Override
    public void method1() {
        System.out.println("Hello World method1");
    }

//    @Override
//    public void method2() {
//        System.out.println("sobreescreve o comportamento default method2");
//    }

    public static void main(String[] args) {
        CustomInterface instance = new CustomClass();
        //chamada de um método padrão da interface (note que ele teve que ser sobreescrito na classe)
        instance.method1();
        //chamada de um método default da interface (não foi necessário sobreescrever o método da interface)
        instance.method2();
        //chamada de um método static da interface ((não foi necessário sobreescrever o método da interface
        // e faz-se necessário prefixar com o nome da interface (já que ele é um membro da interface e não
        // de sua instância.) )
        CustomInterface.method3();
    }
}
