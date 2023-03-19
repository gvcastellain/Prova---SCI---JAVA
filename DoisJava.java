import java.util.Scanner;

public class DoisJava {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[5];
		int maior = 0;
        int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + " - Digite o valor: ");
			numeros[i] = teclado.nextInt();

			if (numeros[i] > maior) { 
				maior = numeros[i];
			}
		}

		for (int j = 0; j < numeros.length; j++) {

			if (numeros[j] < menor) {
				menor = numeros[j];
			}
		}

		System.out.println("Maior valor: "+ maior);
		System.out.println("Menor valor: "+ menor);
     

        teclado.close();

    }
}
