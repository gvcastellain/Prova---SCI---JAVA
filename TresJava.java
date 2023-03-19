import java.util.Scanner;

public class TresJava {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String resposta = " ";
        String nome;
        double nota;
        double media = 0;


        do {

            System.out.println(" ");

            for (int i = 0; i < 1; i++) {
                System.out.print("Digite o nome: ");
                nome = teclado.next();

                for (int j = 0; j < 4; j++) {
                    System.out.print((j+1) + " - Insira a nota: ");
                    nota = teclado.nextInt();
                    media += nota;
                }
                System.out.println(" ");
                System.out.println(nome + " : " + media / 4);
                if (media / 4 >= 6) {
                    System.out.println("Aprovado");
                }  else {
                    System.out.println("Reprovado");
                }

                System.out.println("Deseja continuar: S/N");
                resposta = teclado.next().toUpperCase();
            }



            
            
        } while (resposta.equals("S"));





        teclado.close();

    }
}
