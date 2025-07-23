import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 10: ");
        int numero = scan.nextInt();

        if(numero > 10 || numero < 0){
            System.out.println("Número inválido.");
        }else {
            for (int numero2 = 1; numero2 <= 10; numero2++) {
                System.out.printf("%s x %s = %s \n", numero, numero2, numero * numero2);
            }
        }

    }
}
