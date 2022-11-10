package hora_de_codar2;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // Exercicio 1
        /*
        System.out.println("Informe um número: ");
        double numero = scan.nextInt();

        if(numero < 0) {
            System.out.println("Número é negativo");
        }
        else if(numero  > 0) {
            System.out.println("Número é positivo");
        }
        else {
            System.out.println("Zero");
        }
        */


    // Exercicio 2
        /*
        int maior = Integer.MIN_VALUE;   // Variável maior recebe um valor negativo
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o " + (i+1) + " valor:");
            int numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;   // Número é atribuido para o maior valor
            }
        }
        System.out.println("O maior número é: " + maior);
        */


    // Exercicio 3
        /*
        int maior = 0;

        System.out.println("Informe o primeiro valor:");
        int numero1 = scan.nextInt();

        System.out.println("Informe o segundo valor:");
        int numero2 = scan.nextInt();

        System.out.println("Informe o terceiro valor:");
        int numero3 = scan.nextInt();

        if (numero1 > numero2 || numero1 > numero3) {
            maior += numero1;
        }
        if (numero2 > numero1 || numero2 > numero3) {
            maior += numero2;
        }
        if (numero3 > numero1 || numero3 > numero2) {
            maior += numero3;
        }
        System.out.println("A soma dos dois maiores é: " + maior);

         */


       // Exercicio 4
       /*
       double []numeros = new double[10];
       double total = 0;
       for (int i = 0; i < numeros.length; i++) {
           System.out.println("Informe o " + (i + 1) + "º valor:");
          double valor = scan.nextDouble();
           numeros[i] = valor;
           total += valor;
       }

        System.out.println("Os números digitados são: ");
        for (double exibirNumeros : numeros) {
            System.out.println(exibirNumeros);
        }
        System.out.println("Média aritmética: " + (total/numeros.length));

        */


       // Exercicio 5
        /*
       float total = 0f;

       for (int i = 0; i < 4; i++) {
           System.out.println("Informe a " + (i + 1) + "º nota:");
           float valor = scan.nextFloat();

           total += valor;
       }

       if (total/4 >= 6)
           System.out.println("Aprovado! Sua média é: " + (total/4));
       else
           System.out.println("Reprovado. Sua média é: " + (total/4));

         */
    }
}
