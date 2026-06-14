package Condicional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int opcao = 0;
		
		do {
			System.out.println("\n------------------------------------\n");
			System.out.println("EXERCÍCIOS - ESTRUTURA CONDICIONAL\n");
			System.out.println("EXERCÍCIO 1");
			System.out.println("EXERCÍCIO 2");
			System.out.println("EXERCÍCIO 3");
			System.out.println("EXERCÍCIO 4");
			System.out.println("EXERCÍCIO 5");
			System.out.println("EXERCÍCIO 6");
			System.out.println("EXERCÍCIO 7");
			System.out.println("EXERCÍCIO 8");
			System.out.println("EXERCÍCIO 9");
			System.out.println("EXERCÍCIO 10");
			System.out.println("EXERCÍCIO 11");
			System.out.println("EXERCÍCIO 12");
			System.out.println("EXERCÍCIO 13");
			System.out.print("\nDigite o número do exercício: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("\nInforme um número: ");
				int n1 = sc.nextInt();
				System.out.print("Informe um número: ");
				int n2 = sc.nextInt();
				
				if (n1>n2) {
					System.out.println(n1 + " é maior que " + n2);
				} else if (n1==n2) {
					System.out.println(n1 + " e " + n2 + " são iguais.");
				} else {
					System.out.println(n2 + " é maior que " + n1);
				}
				break;
				
			case 2:
				System.out.print("\nInforme a primeira nota: ");
				double nota1 = sc.nextDouble();
				System.out.print("Informe a segunda nota: ");
				double nota2 = sc.nextDouble();
				
				double soma = nota1 + nota2;
				double media = soma/2.0;
				
				System.out.println("\nMédia: " + media);
				
				if (media >= 7.0) {
					System.out.println("APROVADO");
				} else {
					System.out.println("REPROVADO");
				}
				break;
				
			case 3:
				System.out.print("\nInforme a primeira nota: ");
				double nota3 = sc.nextDouble();
				System.out.print("Informe a segunda nota: ");
				double nota4 = sc.nextDouble();
				System.out.print("Informe a terceira nota: ");
				double nota5 = sc.nextDouble();
				
				double soma1 = nota3 + nota4 + nota5;
				double media1 = soma1/3.0;
				System.out.println("\nMédia: " + media1);
				
				if (media1 > 7 && media1 <= 10) {
					System.out.println("APROVADO");
				} else if (media1 >= 3 && media1 < 7) {
					System.out.println("EXAME");
				} else {
					System.out.println("REPROVADO");
				}
				break;
				
			case 4:
				System.out.print("\nInforme o valor de X: ");
				double x = sc.nextDouble();
				System.out.print("Informe o valor de Y: ");
				double y = sc.nextDouble();
				System.out.print("Informe o valor de Z: ");
				double z = sc.nextDouble();
				
				if (x < y + z && y < x + z && z < x + y) {
					System.out.println("Os valores informados formam um triângulo.");
				} else {
					System.out.println("Os valores informados não formam um triângulo.");
				}
				break;
				
			case 5:
				System.out.print("\nInforme seu sexo (1. Masculino / 2. Feminino): ");
				int sexo = sc.nextInt();
				System.out.print("Informe sua altura (em metros): ");
				double h = sc.nextDouble();
				
				double pesoIdeal;
				
				switch (sexo) {
		            case 1:
		                pesoIdeal = (72.7 * h) - 58;
		                System.out.printf("Peso ideal (Homem): %.2f kg%n", pesoIdeal);
		                break;

		            case 2:
		                pesoIdeal = (62.1 * h) - 44.7;
		                System.out.printf("Peso ideal (Mulher): %.2f kg%n", pesoIdeal);
		                break;

		            default:
		                System.out.println("Sexo inválido!");
		        }
				break;
				
			case 6:
				System.out.print("\nInforme seu peso: ");
				double peso = sc.nextDouble();
				
				System.out.print("Informe sua altura (em metros): ");
				double alt = sc.nextDouble();
				
				double IMC = peso / (alt * alt);
				System.out.printf("IMC: %.2f\n" , IMC);
				
				if (IMC < 20) {
					System.out.println("Abaixo do peso.");
				} else if (IMC > 20 && IMC < 25) {
					System.out.println("Peso normal.");
				} else if (IMC > 25 && IMC < 30) {
					System.out.println("Sobre Peso.");
				} else if (IMC > 30 && IMC < 40) {
					System.out.println("Obeso.");
				} else {
					System.out.println("Obeso Mórbido.");
				}
				break;
				
			case 7:
				System.out.print("\nInforme seu salário: ");
				double salario = sc.nextDouble();
				
				System.out.println("Salário: R$" + salario);
				
				if (salario < 1000) {
					double reajuste = (salario * 0.3) + salario;
					System.out.println("Seu salário foi reajustado. Novo salário: R$" + reajuste);
				} else {
					System.out.println("Você não tem direito a aumento.");
				}
				break;
				
			case 8:
				System.out.print("\nInforme sua idade: ");
				int idade = sc.nextInt();
				
				if (idade < 7) {
					System.out.println("Categoria: INFANTIL");
				} else if (idade > 7 && idade < 10) {
					System.out.println("Categoria: JUVENIL");
				} else if (idade > 10 && idade < 15) {
					System.out.println("Categoria: ADOLESCENTE");
				} else if (idade > 15 && idade < 30) {
					System.out.println("Categoria: ADULTO");
				} else {
					System.out.println("Categoria: SENIOR");
				}
				break;
				
			case 9:
				System.out.print("\nInforme sua idade: ");
				int id = sc.nextInt();
				
				System.out.print("Classe Eleitoral: ");
				if (id < 16) {
					System.out.println("NÃO ELEITOR.");
				} else if ((id >= 16 && id < 18) || id > 65) {
					System.out.println("ELEITOR FACULTATIVO.");
				} else {
					System.out.println("ELEITOR OBRIGATÓRIO.");
				}
				break;
				
			case 10:
				 System.out.print("\nDigite um número de 1 a 7: ");
			        int dia = sc.nextInt();

			        switch (dia) {
			            case 1:
			                System.out.println("Domingo");
			                break;
			            case 2:
			                System.out.println("Segunda-feira");
			                break;
			            case 3:
			                System.out.println("Terça-feira");
			                break;
			            case 4:
			                System.out.println("Quarta-feira");
			                break;
			            case 5:
			                System.out.println("Quinta-feira");
			                break;
			            case 6:
			                System.out.println("Sexta-feira");
			                break;
			            case 7:
			                System.out.println("Sábado");
			                break;
			            default:
			                System.out.println("Não existe dia da semana correspondente a esse número.");
			        }
				break;
				
			case 11:
				System.out.print("\nDigite um número de 1 a 12: ");
				int mes = sc.nextInt();
				
				switch (mes) {
				case 1:
					System.out.println("Janeiro");
					break;
				case 2:
					System.out.println("Fevereiro");
					break;
				case 3:
					System.out.println("Março");
					break;
				case 4:
					System.out.println("Abril");
					break;
				case 5:
					System.out.println("Maio");
					break;
				case 6:
					System.out.println("Junho");
					break;
				case 7:
					System.out.println("Julho");
					break;
				case 8:
					System.out.println("Agosto");
					break;
				case 9:
					System.out.println("Setembro");
					break;
				case 10:
					System.out.println("Outubro");
					break;
				case 11:
					System.out.println("Novembro");
					break;
				case 12:
					System.out.println("Dezembro");
					break;
				default:
					System.out.println("Não existe mês correspondente a este número.");
				}
				break;    
				
			case 12:
				System.out.print("\nInforme dois números.\nPrimeiro número: ");
				double n3 = sc.nextInt();
				System.out.print("Segundo número: ");
				double n4 = sc.nextInt();
				
				int op = 5;
				do {
					System.out.println("\nMENU:");
					System.out.println("1. SOMAR");
					System.out.println("2. SUBTRAIR");
					System.out.println("3. MULTIPLICAR");
					System.out.println("4. DIVIDIR");
					System.out.println("5. SAIR");
					System.out.print("\nEscolha uma das opções disponíveis acima: ");
					op = sc.nextInt();
					
					switch (op) {
					case 1:
						double somar = n3 + n4;
						System.out.print("A soma dos números é: " + somar);
						break;
					case 2: 
						double subtrair = n3 - n4;
						System.out.print("A subtração dos números é: " + subtrair);
						break;
					case 3: 
						double multiplicar = n3 * n4;
						System.out.print("A multiplicação dos números é: " + multiplicar);
						break;
					case 4: 
						double divisão = n3 / n4;
						if (n4 != 0) {
							System.out.println("A divisão dos números é: " + divisão);
						} else {
							System.out.println("Não existe divisão por 0.");
						}
						break;
					case 5:
						System.out.println("Saindo...");
						break;
					default:
							System.out.println("Opção inválida.");
					}
				}while (op != 5);
				break;
				
			case 13:
				  System.out.print("Digite o valor de a: ");
			        double a = sc.nextDouble();

			        System.out.print("Digite o valor de b: ");
			        double b = sc.nextDouble();

			        System.out.print("Digite o valor de c: ");
			        double c = sc.nextDouble();

			        double delta = (b * b) - (4 * a * c);

			        System.out.println("Delta = " + delta);

			        if (delta < 0) {
			            System.out.println("Não existem raízes reais.");
			        } else if (delta == 0) {
			            double xx = (-b) / (2 * a);
			            System.out.println("Existe apenas uma raiz real.");
			            System.out.println("x = " + xx);
			        } else {
			            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

			            System.out.println("Existem duas raízes reais.");
			            System.out.println("x1 = " + x1);
			            System.out.println("x2 = " + x2);
			        }
				break;
				
		       default:
		    	   System.out.println("\nEssa opção não existe. Selecione uma das disponíveis.");
			}
		}while (opcao != 0);
		sc.close();
	} 
}
