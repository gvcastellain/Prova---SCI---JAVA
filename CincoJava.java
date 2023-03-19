import java.util.Scanner;

public class CincoJava {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        
        String matriz[][] = new String[3][5];
        int media[] = new int[3];


        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            System.out.print("nome: ");
            matriz[i][0] = teclado.next();

            for (int j = 1; j < 5; j++) {
                System.out.print("nota: ");
                matriz[i][j] = teclado.next();
            }
        }

        for (int i = 0; i < 3; i++) {
                for (int j = 1; j < 5; j++) {
                    media[i] += Double.parseDouble(matriz[i][j]);
                }
        }
        System.out.println(" ");

        for (int i = 0; i < media.length; i++) {
            System.out.println(matriz[i][0] + " - média: " +  media[i] / 4.0);
        }

        System.out.println(" ");
        
        if (media[0] > media[1] && media[0] > media[2]) {
            if (media[1] > media[2]) {
                System.out.println("maior: " + matriz[0][0]);
                System.out.println("menor: " + matriz[2][0]);
            }
            if (media[2] > media[1]) {
                System.out.println("maior: " + matriz[0][0]);
                System.out.println("menor: " + matriz[1][0]);
            }
        }

        if (media[1] > media[0] && media[1] > media[2]) {
            if (media[2] > media[0]) {
                System.out.println("maior: " + matriz[1][0]);
                System.out.println("menor: " + matriz[0][0]);
            }
            if (media[0] > media[2]) {
                System.out.println("maior: " + matriz[1][0]);
                System.out.println("menor: " + matriz[2][0]); 
            }
        }

        if (media[2] > media[0] && media[2] > media[1]) {
            if (media[0] > media[1]) {
                System.out.println("maior: " + matriz[2][0]);
                System.out.println("menor: " + matriz[1][0]);
            }
            if (media[1] > media[0]) {
                System.out.println("maior: " + matriz[2][0]);
                System.out.println("menor: " + matriz[0][0]);
            }
        }



        teclado.close();
    }
}
