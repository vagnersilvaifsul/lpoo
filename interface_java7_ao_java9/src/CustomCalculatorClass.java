public class CustomCalculatorClass implements CustomCalculatorInterface {
    public static void main(String[] args) {
        CustomCalculatorInterface demo = new CustomCalculatorClass();

        int sumOfEvens = demo.addEvenNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfEvens);

        int sumOfOdds = demo.addOddNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfOdds);
    }
}
