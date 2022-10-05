public interface CustomInterface {

    //método da instância da interface
    void method();

    //método default da interface (equivalente ao método de instância, mas não exige sobreescrita)
    default void method2() {
        method4();  //private method inside default method
        method5();  //static method inside other non-static method
        System.out.println("default method");
    }

    //método static da interface (o método passa a ser um membro da interface (ao invés de membro da instância da classe)
    static void method3() {
        System.out.println("static method");
    }

    private void method4(){
        System.out.println("private method");
    }

    private static void method5(){
        System.out.println("private static method");
    }
}
