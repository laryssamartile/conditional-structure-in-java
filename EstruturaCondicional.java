import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //variaveis
        int num1;
        int num2;
        double valor;
        double salario;
        double resultadoImposto;

        System.out.println("EXERCICIO 1");
        //verifica se dois numeros sao multiplos

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(multiplos(num1, num2) == true){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }

        System.out.println();
        System.out.println("EXERCICIO 2");
        //verifica em qual intervalo esta o numero informado

        valor = scanner.nextDouble();

        if(valor < 0 || valor > 100){
            System.out.println("Fora de intervalo");
        }
        else{
            if(valor <= 25){
                System.out.println("Intervalo [0, 25]");
            }
            else if(valor <= 50){
                System.out.println("Intervalo (25, 50]");
            }
            else if(valor <= 75){
                System.out.println("Intervalo (50, 75]");
            }
            else if(valor <= 100){
                System.out.println("Intervalo (75, 100]");
            }
        }

        System.out.println();
        System.out.println("EXERCICIO 3");
        //calcula o imposto de renda de uma pessoa

        salario = scanner.nextDouble();
        resultadoImposto = calculaImposto(salario);

        if(resultadoImposto == 0.0){
            System.out.println("Isento");
        }
        else{
            System.out.printf("R$ %.2f", resultadoImposto);
        }
        
        scanner.close();
    }

    public static boolean multiplos(int a, int b){
        boolean testeBool = false;
        if(a > b){
            if(a % b == 0){
                testeBool = true;
            }
        }
        if(b > a){
            if(b % a == 0){
                testeBool = true;
            }
        }
        return testeBool;
    }

    public static double calculaImposto(double sal){
        double imp;

        if (sal <= 2000.0) {
			imp = 0.0;
		}
		else if (sal <= 3000.0) {
			imp = (sal - 2000.0) * 0.08;
		}
		else if (sal <= 4500.0) {
			imp = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imp = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

        return imp;
    }

}
