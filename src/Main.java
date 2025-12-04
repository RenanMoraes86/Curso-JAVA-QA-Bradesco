import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // setando valores manualmente,calculando area do triangulo
        triangulo triangulo1 = new triangulo(50, 80);
        System.out.println("A área do seu triangulo é: " + (triangulo1.base * triangulo1.altura));


        // solicitando ao usuario para preencher dados, area quadrado
        quadrado quadrado1 = new quadrado();

        System.out.println("Digite o valor para o lado 1 do seu quadrado");
        double valorLado1 = scanner.nextDouble();
        quadrado1.lado1 = valorLado1;


        System.out.println("Digite o valor para o lado 2 do seu quadrado");
        double valorLado2 = scanner.nextDouble();
        quadrado1.lado2 = valorLado2;


        System.out.println("A área do seu quadrado é: " + (quadrado1.lado1 * quadrado1.lado2));


        //recebendo dados de nome e idade
        //pessoa1
        Fulano pessoa1 = new Fulano();
        System.out.println("Por favor, insira seu nome:");
        String nome1 = scanner.next();
        pessoa1.nome = nome1;

        System.out.println("Por favor, insira sua idade");
        int idade1 = scanner.nextInt();
        pessoa1.idade = idade1;

        System.out.println("Olá " + pessoa1.nome + ", sua idade é: " + pessoa1.idade + " anos");

        //pessoa2
        Fulano pessoa2 = new Fulano();
        System.out.println("Por favor, insira seu nome:");
        String nome2 = scanner.next();
        pessoa2.nome = nome2;

        System.out.println("Por favor, insira sua idade");
        int idade2 = scanner.nextInt();
        pessoa2.idade = idade2;

        System.out.println("Olá " + pessoa2.nome + ", sua idade é:" + pessoa2.idade + " anos");

        //diferença de idade
        System.out.println("A diferença de idade entre " +pessoa1.nome + " e " + pessoa2.nome + " é " + (pessoa1.idade - pessoa2.idade));





        }

    }




