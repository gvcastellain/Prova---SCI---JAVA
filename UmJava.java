import java.util.Scanner;

public class UmJava {
    public static void main(String[] args) {
        
        Scanner teclado =new Scanner(System.in);
        
        double media = 0;
        int vetor[] = new int[5];   

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + " - Digite um número: ");
            vetor[i] = teclado.nextInt();    
        }


        System.out.println(" ");


        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i];
        }


        System.out.println("média: " + media / 5);


        System.out.print("par: ");
        for (int i = 0; i < 5; i++) {
        
            if (vetor[i] % 2 ==0) {
                System.out.print(vetor[i] + " ");
            }
            
        }

        System.out.println(" ");

        
        System.out.print("ímpar: ");
        for (int i = 0; i < 5; i++) {
        
            if(vetor[i] % 2 != 0) {   

                System.out.print(vetor[i] + " ");
            }
        }


        teclado.close();

    }
}
 