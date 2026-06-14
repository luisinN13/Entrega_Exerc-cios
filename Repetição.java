package Repetição;

import java.util.Scanner;
public class Repetição {

	public static void exercicio1(Scanner scanner) {

        System.out.println("\n===== EXERCÍCIO 1 =====");

        while (true) {
            System.out.print("Informe a matrícula (negativa para sair): ");
            int matricula = scanner.nextInt();

            if (matricula < 0) {
                break;
            }
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Nota 3: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;
            System.out.printf("Média: %.2f%n", media);

            if (media >= 70) {
                System.out.println("Situação: APROVADO");
            } else if (media >= 60) {
                System.out.println("Situação: EXAME");
            } else {
                System.out.println("Situação: REPROVADO");
            }
        }
    }

    public static void exercicio2(Scanner scanner) {

        System.out.println("\n===== EXERCÍCIO 2 =====");

        double somaSalarios = 0;
        int somaFilhos = 0;
        int quantidade = 0;

        while (true) {
            System.out.print("Salário (negativo para encerrar): ");
            double salario = scanner.nextDouble();
            
            if (salario < 0) {
                break;
            }

            System.out.print("Número de filhos: ");
            int filhos = scanner.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            quantidade++;
        }
        if (quantidade > 0) {
            double mediaSalario = somaSalarios / quantidade;
            double mediaFilhos = (double) somaFilhos / quantidade;

            System.out.printf("Média salarial: %.2f%n", mediaSalario);
            System.out.printf("Média de filhos: %.2f%n", mediaFilhos);
        } else {
            System.out.println("Nenhum dado informado.");
        }
    }

    public static void exercicio3(Scanner scanner) {

        System.out.println("\n===== EXERCÍCIO 3 =====");

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite o " + i + "º valor: ");
            double valor = scanner.nextDouble();

            System.out.println("Dobro = " + (valor * 2));
        }
    }

    public static void exercicio4(Scanner scanner) {

        System.out.println("\n===== EXERCÍCIO 4 =====");

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Números ímpares:");

        for (int i = 1; i <= numero; i += 2) {
            System.out.println(i);
        }
    }

    public static void exercicio5(Scanner scanner) {

        System.out.println("\n===== EXERCÍCIO 5 =====");
        double soma = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Temperatura do dia " + i + ": ");
            double temperatura = scanner.nextDouble();

            soma += temperatura;
        }
        double media = soma / 10;

        System.out.printf("Média das temperaturas: %.2f%n", media);

    }

    public static void exercicio6(Scanner scanner) {

        System.out.println("\n===== EXERCÍCIO 6 =====");

        int homens = 0;
        int mulheres = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("\nPessoa " + i);
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.next().toUpperCase();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();

            if (sexo.equals("M") && peso >= 60 && peso <= 80) {
                homens++;
            }
            if (sexo.equals("F") && peso >= 50 && peso <= 70) {
                mulheres++;
            }
        }
        System.out.println("Homens entre 60 e 80 kg: " + homens);
        System.out.println("Mulheres entre 50 e 70 kg: " + mulheres);
    }

    public static void exercicio7(Scanner scanner) {

        System.out.println("\n===== EXERCÍCIO 7 =====");

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }

    public static void exercicio8(Scanner scanner) {

        System.out.println("\n===== EXERCÍCIO 8 =====");

        int acima90 = 0;
        int somaIdades = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.println("\nPessoa " + i);

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Peso: ");
            double peso = scanner.nextDouble();

            somaIdades += idade;

            if (peso > 90) {
                acima90++;
            }
        }
        double mediaIdades = (double) somaIdades / 7;

        System.out.println("\nQuantidade de pessoas com mais de 90 kg: " + acima90);
        System.out.printf("Média das idades: %.2f%n", mediaIdades);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=================================");
            System.out.println(" LISTA DE EXERCÍCIOS");
            System.out.println("=================================");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            System.out.println("4 - Exercício 4");
            System.out.println("5 - Exercício 5");
            System.out.println("6 - Exercício 6");
            System.out.println("7 - Exercício 7");
            System.out.println("8 - Exercício 8");
            System.out.println("0 - Sair");
            System.out.println("=================================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exercicio1(scanner);
                    break;

                case 2:
                    exercicio2(scanner);
                    break;

                case 3:
                    exercicio3(scanner);
                    break;

                case 4:
                    exercicio4(scanner);
                    break;

                case 5:
                    exercicio5(scanner);
                    break;

                case 6:
                    exercicio6(scanner);
                    break;

                case 7:
                    exercicio7(scanner);
                    break;

                case 8:
                    exercicio8(scanner);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scanner.close();
	}
}