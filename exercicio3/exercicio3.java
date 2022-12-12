package Oracle;

import java.util.*;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // a história de um menino que foi viajar ao museu
        System.out.println("Em um dia ensolarado um menino resolveu ir ao museu");
        System.out.println(" Digite seu nome");
        String nome = teclado.next(); // primeira entrada

        // primeira parte da história
        System.out.println("O menino de nome " + nome
                + " se arrumou para comprar pão e café na padaria que ficava na esquina de sua casa, antes de ir ao museu");

        System.out.println("Ao chegar na padaria perguntou a atendente quanto custava o pão e o café");
        System.out.println(" A atendente foi ao sistema e digitou o preço na tela");
        System.out.println("Digite o valor do pão");
        int valorpão = teclado.nextInt(); // segunda entrada

        System.out.println("Digite o valor do café:");
        int valorcafé = teclado.nextInt(); // terceira entrada

        System.out.println("Ela mostrou ao menino o valor dos dois");
        System.out.println(" Menino, o pão custa r$:" + valorpão + " e o café custa r$:" + valorcafé);
        System.out.println(" O menino então vai ao caixa para pagar seu pão e seu café e ir para casa");
        System.out.println("O menino pergunta qual o valor total");
        System.out.println(" Moça, qual o valor total ?");
        double valortotal;
        valortotal = valorcafé + valorpão;

        System.out.println(" O total de sua compra fica r$: " + valortotal);
        System.out.println(" A atendente encerra a compra após o pagamento");

        // segunda parte da história

        System.out.println(nome + " sai da padaria e retorna a sua casa ");
        System.out.println(nome + " pega seu carro e vai ao posto abastecê-lo antes de ir ao museu");
        System.out.println(nome + " Ao chegar no posto, pergunta o valor do litro da gasosa");
        System.out.println(" Qual o valor do litro seu frentista ?");
        double preçolitro;
        preçolitro = teclado.nextDouble(); // quarta entrada

        System.out.println(" O preço é:" + preçolitro);
        System.out.println(" Ao término do abastecimento, " + nome + " pergunta quanto deu tudo");
        double totalgasolina;
        double tamanhotanque;
        System.out.println(
                " O frentista responde que antes de falar o preço, precisa saber quantos litros cabem no tanque");
        System.out.println(" Informe ao frentista o tamanho de seu tanque");
        tamanhotanque = teclado.nextDouble(); // quinta entrada

        System.out.println(" Feito, sendo assim o valor total fica r$:");
        System.out.println(" O frentista calcula o valor multiplicando o tamanho do tanque pelo preço por litro");
        totalgasolina = preçolitro * tamanhotanque;
        System.out.println(" O valor fica R$: " + totalgasolina);
        System.out.println(nome + " entrega o dinheiro ao frentista e segue para o museu");

        // terceira parte da história

        System.out.println(nome + " finalmente se dirige ao museu");
        System.out.println(" Ao chegar ao museu " + nome + " estaciona seu carro e chega a recepção do museu");
        System.out.println(" Chegando a recepção " + nome
                + " pergunta ao balconista qual o nome dele e o quanto custa o ingresso ");
        String nome2;
        System.out.println(" Balconista digite seu nome:");
        nome2 = teclado.next(); // sexta entrada
        double ingresso;
        System.out.println(" Agora informe o preço do ingresso:");
        ingresso = teclado.nextDouble(); // sétima entrada
        System.out.println(" A balconista então diz que seu nome é " + nome2 + " e o ingresso custa R$: " + ingresso);
        System.out.println(" Antes de entrar, preciso que você diga sua altura e sua idade: ");
        double altura;
        int idade;
        System.out.println("Informe sua altura para o balconista: ");
        altura = teclado.nextDouble(); // oitava entrada
        System.out.println(" Agora informe sua idade para o balconista ");
        idade = teclado.nextInt(); // nona entrada
        System.out.println(" Ok, após eu ver que sua altura é " + altura + " e sua idade é " + idade
                + " você pode entrar. Seja bem-vindo e divirta-se");
        System.out.println(
                " Depois de várias horas se divertindo no museu " + nome + " pega seu carro e vai para sua casa ");

        // última parte da história
        System.out.println(nome + " chega em casa e decide então calcular tudo que gastou em seu dia ");
        double gastototalDia;
        gastototalDia = valortotal + totalgasolina + ingresso;
        System.out.println(" Um programa então calcula para " + nome + " o quanto gastou no seu dia ");
        System.out.println(" Seu gasto total é " + gastototalDia);
        System.out.println(nome + " digita o total em seu bloco de notas ");
        double Valordigitado;
        System.out.println(" Digite aqui o gasto total calculado:");
        Valordigitado = teclado.nextDouble(); // décima entrada
        System.out.println(nome + " avisa sua gerente que gastou " + Valordigitado
                + " para que a mesma retire esse valor de sua conta bancária");
        System.out.println(" Após seu longo e cansativo dia " + nome + " vai dormir lindamente ");
        System.out.println(" FIM !!!!!!!!! ");
        teclado.close();
    }

}
