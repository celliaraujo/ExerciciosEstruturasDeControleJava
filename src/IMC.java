import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        double IMC = peso/(altura * altura);

        if(IMC <= 18.5) System.out.println("Abaixo do peso");
        else if(IMC >= 18.6 && IMC <= 24.9) System.out.println("Peso ideal");
        else if(IMC >= 25 && IMC <= 29.9) System.out.println("Levemente acima do peso");
        else if(IMC >= 30 && IMC <= 34.9) System.out.println("Obesidade Grau I");
        else if(IMC >= 35 && IMC <= 39.9) System.out.println("Obesidade Grau II (Severa)");
        else if(IMC >= 40) System.out.println("Obesidade III (Mórbida)");

    }
}
