package Oracle;

import java.util.Scanner;

public class exercicio6parte1 {
    public static void main(String[] args) {
        int pinValido = 123456789;
        int pinDigitado;
        System.out.println(" Digte um PIN: ");
        Scanner scan = new Scanner(System.in);
        pinDigitado = scan.nextInt();

        while (pinDigitado != pinValido) {
            System.out.println(" Digite o PIN novamente:");
            break;

        }

        while (pinDigitado == pinValido) {
            System.out.println(" Sistema Liberado");
            break;

        }
        scan.close();
    }

}
