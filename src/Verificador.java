// 4 - Escreva um código onde o usuário informa um número inicial, posteriormente
// irá informar outros N números, a execução do código irá continuar até que
// o número informado dividido pelo primeiro número tenha resto diferente
// de 0 na divisão, números menores que o primeiro número devem ser ignorados

import java.util.Scanner;

public class Verificador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scan.nextInt();

        while(true){
            System.out.println("Digite mais um número: ");
            int number2 = scan.nextInt();

            if(number2 < number) continue;
            if(number2 % number != 0) {
                System.out.printf("Resto da divisão de %s por %s é %s. \n", number2, number, number2 % number);
                System.out.println("Fim da aplicação...");
                break;
            }else{
                System.out.printf("Resto da divisão de %s por %s é %s. \n", number2, number, number2 % number);

            }
        }
    }
}
