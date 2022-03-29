import java.util.Scanner;

/*Escreva um algoritmo para determinar o consumo médio de um automóvel 
sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;*/


public class Exercicio03 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        float totalDistancia, totalCombustivel, consumoMedio;

        System.out.println("A distância percorrida em KM foi: ");
        totalDistancia = leitor.nextFloat();
        System.out.println("O total de combustível gasto foi: ");
        totalCombustivel = leitor.nextFloat();

        consumoMedio = totalDistancia / totalCombustivel;

        System.out.println("O consumo medio do automovel foi: " + consumoMedio);

    leitor.close();
    }
}
