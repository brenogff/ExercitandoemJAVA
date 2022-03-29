//Faça um algoritmo que receba dois números e exiba o resultado da sua soma

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args){
        Scanner leitor =  new Scanner(System.in);

        float a, b, soma;

        System.out.println("Digite um numero");
        a = leitor.nextFloat();
        System.out.println("Digite outro numero");
        b = leitor.nextFloat();

        soma = a + b;

        System.out.println("A soma dos numeros foi: " + soma);

        leitor.close();

    }
}