import java.util.Scanner;

public class QuatroJava {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vetor[i] = teclado.nextInt();
        }

        System.out.println(" ");
        System.out.println("Terceira posição: " + vetor[2]);


        teclado.close();

    }
}
