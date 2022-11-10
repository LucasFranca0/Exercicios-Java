import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {


        System.out.println("Escreva seu nome: ");
        Scanner scan = new Scanner(System.in);  // Para capturar o que vem do teclado
        String nome = scan.nextLine();          // Converter a entrada para texto

        System.out.println("Digite um número de nomes que deseja cadastrar: ");
        int numero = scan.nextInt();   // Converter a entrada para número inteiro

        String[] nomes = new String[numero];  // Declara um Array e recebe o tamanho da variável numero

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira o " + (i+1) + "º nome:");
            String nome_inserido = scan.next();
            nomes[i] = nome_inserido;
        }

        System.out.println("Nomes inseridos: ");
        for (String lista_nomes : nomes) {
            System.out.println(lista_nomes + "");
        }

        System.out.println("\n " + nome + ", você inseriu " + numero + " numeros");
    }
}