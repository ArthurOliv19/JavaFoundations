package Oracle;

import java.util.Scanner;

public class exercicio5parte1 {
    public static void main(String[] args) {
        /*
         * espectros: violeta 380-450
         * azul 450-495
         * verde 495-570
         * amarelo 570-590
         * laranja 590-620
         * vermelho 620-750
         */
        double comprimentoOnda;
        System.out.println(" Digite o comprimento da onda: ");
        Scanner entrada = new Scanner(System.in);
        comprimentoOnda = entrada.nextDouble();

        if (comprimentoOnda >= 380 && comprimentoOnda <= 450) {
            System.out.println(" A cor é violeta ");
        }

        else if (comprimentoOnda >= 450 && comprimentoOnda <= 495) {
            System.out.println(" A cor é azul ");
        } else if (comprimentoOnda >= 495 && comprimentoOnda <= 570) {
            System.out.println(" A cor é verde ");
        } else if (comprimentoOnda >= 570 && comprimentoOnda <= 590) {
            System.out.println(" A cor é amarelo");
        } else if (comprimentoOnda >= 590 && comprimentoOnda <= 620) {
            System.out.println(" A cor é laranja");
        } else if (comprimentoOnda >= 620 && comprimentoOnda <= 750) {
            System.out.println(" A cor é vermelho ");
        } else {
            System.out.println(" Número inválido, comprimento da onda não foi encontrada no espectro visível");
        }
        entrada.close();

    }
}
