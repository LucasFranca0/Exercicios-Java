package hora_de_codar1;

import java.util.Scanner;

public class Level1 {
        public static void main(String[] args) {


                Scanner scan = new Scanner(System.in); // Declarando Scanner para receber entrada de dados via teclado

                // Exercicio 1  - Declarar uma variável planeta e inserir dentro "plutão" //
                /*
                String planeta = "Plutão";
                System.out.println("Planeta " + planeta);
                */

                // Exercicio 2 - Exibir o nome de um usuário //
                /*
                System.out.println("Informe seu nome, por favor: ");

                String nome = scan.nextLine();      // Sistema espera uma resposta do usuário
                System.out.println("Olá, " + nome +".");  // Exibe o nome/resposta do usuário
                */

                // Exercicio 3 - Exibir nome e idade de um  usuário //
                /*
                System.out.println("Informe seu nome, por favor: ");
                nome = scan.nextLine();   // "nextLine" permite que o usuário informe mais de uma palavra/linha
                System.out.println("Informe sua idade: ");
                int idade = scan.nextInt(); // nextInt para tipo int(inteiro)

                System.out.println("Olá, " + nome + ", sua idade é " + idade + ".");

                 */


                // Exercicio 4 - Áreas de Figuras Planas //
                // Retângulo
                /*
                System.out.println("Informe a base do Retângulo: ");
                int baseRetangulo = scan.nextInt();

                System.out.println("Informe a altura: ");
                int alturaRetangulo = scan.nextInt();

                System.out.println("A área do retângulo é: " + baseRetangulo * alturaRetangulo);
                */

                // Quadrado
                /*
                System.out.println("Informe o primeiro lado do Quadrado: ");
                int lado1 = scan.nextInt();

                System.out.println("Informe o segundo lado: ");
                int lado2 = scan.nextInt();

                int total = lado1 * lado2;
                System.out.println("A área do quadrado é: " + total);
                */

                // Losango
                /*
                System.out.println("Informe a diagonal maior: ");
                int diagonalMaior = scan.nextInt();

                System.out.println("Informe a diagonal menor: ");
                int diagonalMenor = scan.nextInt();

                System.out.println("A área do losango é: " + (diagonalMaior * diagonalMenor) / 2);
                */

                // Trapezio
                /*
                System.out.println("Informe a base maior do trapézio: ");
                int baseMaior = scan.nextInt();

                System.out.println("Informe a base menor: ");
                int baseMenor = scan.nextInt();

                System.out.println("Informe a altura: ");
                int altura = scan.nextInt();
                System.out.println("A área do trapezio é: " + (diagonalMaior + diagonalMenor) * altura / 2);
                */


                // Paralelogramo
                /*
                System.out.println("Informe a base do paralelogramo: ");
                int baseParalelograma = scan.nextInt();

                System.out.println("Informe a altura: ");
                int alturaParalelograma = scan.nextInt();

                System.out.println("A área do paralelogramo é: " + baseParalelograma * alturaParalelograma);
                */

                // Triângulo
                /*
                System.out.println("Informe a base do paralelogramo: ");
                int baseTriangulo = scan.nextInt();

                System.out.println("Informe a altura: ");
                int alturaTriangulo = scan.nextInt();

                System.out.println("A área do triângulo é: " + baseTriangulo * alturaTriangulo / 2);
                */

                // Circulo
                /*
                double pi = Math.PI;

                System.out.println("Informe o valor do raio: ");
                int raio = scan.nextInt();

                System.out.println("A área do circulo é: " + pi * raio);
                */

                // Exercicio 5 //
                /*
                System.out.println("Informe um valor: ");
                int valor = scan.nextInt();

                if(valor < 0) {
                        System.out.println("O valor " + valor + " é negativo.");
                }
                else if(valor > 0) {
                        System.out.println("O valor " + valor + " é positivo.");
                } else {
                        System.out.println("O valor " + valor + " é neutro");
                }
                */


                // Exercicio 6 //
                /*
                int maior = Integer.MIN_VALUE;
                for (int i = 0; i < 3; i++) {
                        System.out.println("Informe o " + (i+1) + " valor.");
                        int numero = scan.nextInt();

                        if (numero > maior) {
                                maior = numero;
                        }
                }
                System.out.println("O maior número é: " + maior);

                 */


                // Exercicio 7 //
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


                // Exercicio 8 //
                /*
                System.out.println("Informe o primeiro valor: ");
                double numero1 = scan.nextDouble();

                System.out.println("Informe o segundo valor: ");
                double numero2 = scan.nextDouble();

                while (numero2 <= 0) {
                        System.out.println("Valor inválido! Insira novamente o segundo valor: ");
                }
                System.out.println("O resultado da divisão do valor 1 pelo valor 2 é: " + (numero1 /numero2));
        */
        }
}