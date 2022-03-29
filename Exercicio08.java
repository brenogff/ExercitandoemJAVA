import java.util.Scanner;

/*Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com o usuário;*/

public class Exercicio08 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double valorDolar, quantidadeDolar, cambio;

        System.out.println("Qual a cotação do dolar no momento: ");
        valorDolar = leitor.nextDouble();
        System.out.println("Qual a quantidade de dolares disponiveis: ");
        quantidadeDolar = leitor.nextDouble();
 
        cambio = quantidadeDolar * valorDolar;

        System.out.println("O valor reais seria: " + cambio);


        leitor.close();
    }
    
}
