package control;

public class GenericProcedureController {
	public static void main(String[] args) {
		// create arrays of Integer, Double and Character
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.printf("Array integerArray contains:%n");
		printArray(integerArray); // pass an Integer array
		System.out.printf("%nArray doubleArray contains:%n");
		printArray(doubleArray); // pass a Double array
		System.out.printf("%nArray characterArray contains:%n");
		printArray(characterArray); // pass a Character array
		
		
	}

	/* 
	 * Este método substitui os métodos específicos apresentados, entre comentários, entre as linhas 32 e 71.
	 * Nota: O compilador vai fazer a operação de Erasure. Isto é traduz o tipo genérico para substituir os tipos reais.
	 * */
	private static <T> void printArray(T[] inputArray) {
		// display array elements
		for (T element : inputArray)
			System.out.printf("%s ", element);

		System.out.println();
	}	

	/* 
	 * Nota: O compilador vai fazer a operação de Erasure. Isto é traduz o tipo genérico para substituir os tipos reais.
	 * Aqui o exemplo de como ficaria na tradução do compilador.
	 * */
//	public static void printArray(Object[] inputArray) {
//		// display array elements
//		for (Object element : inputArray)
//			System.out.printf("%s ", element);
//
//		System.out.println();
//	}
	
	
	
//	// method printArray to print Integer array
//	public static void printArray(Integer[] inputArray) {
//		// display array elements
//		for (Integer element : inputArray)
//			System.out.printf("%s ", element);
//
//		System.out.println();
//	}
//
//	// method printArray to print Double array
//	public static void printArray(Double[] inputArray) {
//		// display array elements
//		for (Double element : inputArray)
//			System.out.printf("%s ", element);
//
//		System.out.println();
//	}
//
//	// method printArray to print Character array
//	public static void printArray(Character[] inputArray) {
//		// display array elements
//		for (Character element : inputArray)
//			System.out.printf("%s ", element);
//
//		System.out.println();
//	}

}//fim classe GenericController
