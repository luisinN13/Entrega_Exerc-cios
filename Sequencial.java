package Sequencial;

import java.util.Scanner;
public class Sequencial {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int exercicio = -1;
		
		while (exercicio != 0)
		{
			System.out.println("\n------------------//------------------");
			System.out.println("\nEXERCÍCIOS - ESTRUTURA SEQUENCIAL");
			System.out.println("\n1. EXERCICIO 1");
			System.out.println("2. EXERCICIO 2");
			System.out.println("3. EXERCICIO 3");
			System.out.println("4. EXERCICIO 4");
			System.out.println("5. EXERCICIO 5");
			System.out.println("6. EXERCICIO 6");
			System.out.println("7. EXERCICIO 7");
			System.out.println("8. EXERCICIO 8");
			System.out.println("9. EXERCICIO 9");
			System.out.println("10. EXERCICIO 10");
			System.out.println("11. EXERCICIO 11");
			System.out.println("12. EXERCICIO 12");
			System.out.println("13. EXERCICIO 13");
			System.out.println("14. EXERCICIO 14");
			System.out.println("15. EXERCICIO 15");
			System.out.println("\n0. SAIR");
			System.out.print("\nSelecione o exercício: ");
			exercicio = sc.nextInt();
			
			switch (exercicio)
			{
			case 1:
				System.out.print("\nInforme o primeiro número inteiro: ");
				int n1 = sc.nextInt();
				System.out.print("Informe o segundo número inteiro: ");
				int n2 = sc.nextInt();
				System.out.print("Informe o terceiro número inteiro: ");
				int n3 = sc.nextInt();
				
				double media = (n1 + n2 + n3) / 3.0;
				
				System.out.println("\nMédia: " + media);			
				break;
				
			case 2:
				System.out.print("\nInforme seu ano de nascimento: ");
				int AnoNascimento = sc.nextInt();
				
				System.out.print("Informe o ano atual:");
				int AnoAtual = sc.nextInt();
				
				int IdadeAtual = AnoAtual - AnoNascimento;
				int Idade2050 = 2050 - AnoNascimento;
				
				System.out.println("\nIDADE ATUAL: " + IdadeAtual);
				System.out.println("IDADE em 2050: " + Idade2050);
				break;
				
			case 3:
				System.out.print("\nInforme a cotação do dolar (em reais): ");
				double cotacao = sc.nextDouble();
				
				System.out.print("Digite um valor em dolares: ");
				double dolar = sc.nextDouble();
				
				double reais = cotacao * dolar;
				System.out.println("\nValor convertido em reais: R$" + reais);
				break;
				
			case 4:
				System.out.print("\nInforme o valor para diagonal maior: ");
				double diagonalMaior = sc.nextDouble();
				
				System.out.print("Informe o valor para diagonal menor: ");
				double diagonalMenor = sc.nextDouble();
				
				double area = (diagonalMaior * diagonalMenor)/2.0;
				System.out.println("\nÁrea do losango: " + area);
				break;
				
			case 5:
				System.out.print("\nInforme a temperatura (em Celsius): ");
				double temperatura = sc.nextDouble();
				
				double fahrenheit = (temperatura * 1.8) + 32;
				System.out.println("\nTemperatura em Fahrenheit: " + fahrenheit);
				break;
				
			case 6:
				System.out.println("\nInforme os coeficientes A, B e C de uma esquação de segundo grau:\n");
				System.out.print("Coeficiente A: "); 
				double coeficienteA = sc.nextDouble();
				
				System.out.print("Coeficiente B: ");
				double coeficienteB = sc.nextDouble();
				
				System.out.print("Coeficiente C: ");
				double coeficienteC = sc.nextDouble();
				
				double delta = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);
				System.out.println("\nDelta: " + delta);
				
				double x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
				System.out.println("Valor de x1: " + x1);
				
				double x2 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);
				System.out.println("Valor de x2: " + x2);
				break;
				
			case 7:
				System.out.print("\nInforme o valor do salário mínimo: ");
				double salarioMin = sc.nextDouble();
				
				System.out.print("Informe seu salário: ");
				double salarioFunc = sc.nextDouble();
				
				double qtdSalario = salarioFunc / salarioMin;
				System.out.print("\nO funcionário ganha " + qtdSalario + " salários mínimos.");
				break;
				
			case 8:
				System.out.print("\nInforme um número: ");
				int n4 = sc.nextInt();
				
				System.out.println("\nTABUADA DO " + n4);
				for (int i = 0; i <= 10; i++) {
					int result = n4 * i;
					System.out.println(n4 + " x " + i + " = " + result);
				}
				break;
				
			case 9:
				System.out.print("\nInforme um número positivo: ");
				double n5 = sc.nextDouble();
				
				double quad = n5 * n5;
				System.out.println(n5 + " ao quadrado: " + quad);
				
				double cubo = n5 * n5 * n5;
				System.out.println(n5 + " ao cubo: " + cubo);
				
				double raiz = Math.sqrt(n5);
				System.out.println("Raiz quadrada de " + n5 + ": " + raiz);
				
				double raizcub = Math.cbrt(n5);
				System.out.println("Raiz cúbica de " + n5 + ": "  + raizcub);
				break;
				
			case 10:
				System.out.print("\nInforme o valor da conta: ");
				double conta = sc.nextDouble();
				
				double gorjeta = (conta * 0.10) + conta;
				System.out.println("Valor a ser pago com gorjeta: " + gorjeta);
				break;
				
			case 11:
				System.out.print("\nInforme um número inteiro: ");
				int n6 = sc.nextInt();
				
				int ant = n6 - 1;
				System.out.println("Antecessor de " + n6 + ": " + ant);
				
				int suc = n6 + 1;
				System.out.println("Sucessor de " + n6 + ": " + suc);
				
				int dobro = n6 * 2;
				System.out.println("Dobro de " + n6 + ": " + dobro);
				
				double met = n6 / 2;
				System.out.println("Metade de " + n6 + ": " + met);
				break;
				
			case 12:
				System.out.print("\nInforme sua altura (em metros): ");
				double hh = sc.nextDouble();
				
				double ph = (72.7 * hh) - 58;
				System.out.println("Peso Ideal: " + ph);
				break;
				
			case 13:
				System.out.print("\nInforme sua altura (em metros): ");
				double hm = sc.nextDouble();
				
				double pm = (62.1 * hm) - 44.7;
				System.out.println("Peso Ideal: " + pm);
				break;
				
			case 14:
				System.out.print("\nInforme a variável A: ");
				double a = sc.nextDouble();
				System.out.print("Informe a variável B: ");
				double b = sc.nextDouble();
				
				double inv;
				inv = a;
				a = b;
				b = inv;
				
				System.out.println("A = " + a);
				System.out.println("B = " + b);
				break;
				
			case 15:
				System.out.print("\nInforme o total de eleitores: ");
			    int totalEleitores = sc.nextInt();

			    System.out.print("Informe os votos do candidato 1: ");
			    int votosCand1 = sc.nextInt();

			    System.out.print("Informe os votos do candidato 2: ");
			    int votosCand2 = sc.nextInt();

			    int votosNulos = totalEleitores - (votosCand1 + votosCand2);

			    double percCand1 = (votosCand1 * 100.0) / totalEleitores;
			    double percCand2 = (votosCand2 * 100.0) / totalEleitores;
			    double percNulos = (votosNulos * 100.0) / totalEleitores;

			    System.out.printf("\nPercentual do Candidato 1: %.2f%%\n", percCand1);
			    System.out.printf("Percentual do Candidato 2: %.2f%%\n", percCand2);
			    System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulos);
				break;
				
			case 0:
				System.out.println("\nOperação finalizada.\nSaindo...");
				break;
				
			default:
				System.out.println("Opção inválida. Escolha um dos exercícios disponíveis.");
			}
		}
		sc.close();
	}
}
