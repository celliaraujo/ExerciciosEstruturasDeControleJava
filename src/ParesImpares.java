import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scan.nextInt();
        int number2;

        while(true){
            System.out.println("Digite um número maior que o primeiro: ");
            number2 = scan.nextInt();

            if(number2 > number) break;
        }

        System.out.println("Escolha a opção desejada: ");
        System.out.println("1 - Par");
        System.out.println("2 - Ímpar");

        int option = scan.nextInt();
        switch (option){
            case 1:
                for(int x = number2; x >= number; x--){
                    if(x % 2 == 0) System.out.printf("%s \n", x);
                }
                break;
            case 2:
                for(int x = number2; x >= number; x--){
                    if(x % 2 != 0) System.out.printf("%s \n", x);
                }
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("Fim da aplicação...");
    }
}
