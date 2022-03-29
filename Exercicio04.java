import java.util.Scanner;

/*Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
 Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o seu nome, o salário fixo e salário no final do mês;*/

public class Exercicio04 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String vendedor;
        Float salarioFixo, totalVendas, comissaoVendedor, salarioFinal;

        System.out.println("Digite o nome do vendedor: ");
        vendedor = leitor.nextLine();
        System.out.println("Digite o valor do salario fixo do vendedor: ");
        salarioFixo = leitor.nextFloat();
        System.out.println("Digite o total de vendas efetuadas pelo vendedor no mes em questao: ");
        totalVendas = leitor.nextFloat();

        comissaoVendedor = totalVendas * 15 / 100;

        salarioFinal = salarioFixo + comissaoVendedor;

        System.out.println("O salario final do " + vendedor + " foi de :" + salarioFinal);

        leitor.close();
    }
    
}
