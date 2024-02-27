public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        p1.nome = "fulano";
        System.out.println(p1.nome);
        p2 = p1;
        System.out.println(p2.nome);
        Cliente c1 = new Cliente();
        c1.nome="testinho";
        Cliente c2 = new Cliente("235.111.1..1.22", "falido","silva","dois","121212-111", "()3266177","hjhjh@jkhjkhk");
        System.out.println(c2.nome);
    }
}