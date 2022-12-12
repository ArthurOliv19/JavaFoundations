package Oracle;

import java.util.Scanner;


public class exercicio4parte2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome = entrada.nextLine();
        System.out.println(" Digite o sobrenome:");
        String sobrenome = entrada.nextLine();

        seunome(nome);
        seusobrenome(nome, sobrenome);
        entrada.close();
    }

    public static void seunome(String nome) {
        System.out.println("Bem vindo " + nome);
    }

    public static void seusobrenome(String nome, String sobrenome) {
        String primeiraLetra = Character.toString(nome.charAt(0));
        System.out.printf("Seu nome é " + sobrenome + "," + primeiraLetra);

    }

}
