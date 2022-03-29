import java.util.Scanner;

/*Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o 
valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados;*/

public class Exercicio06 {

    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        int A, B, troca;

        System.out.println("Digite um valor para a variavel A: ");
        A = leitor.nextInt();
        System.out.println("Digite outro valor para a variavel B: ");
        B = leitor.nextInt();

        troca = A;
        A = B;
        B = troca;
        

        System.out.println("O valor A agora sera: " + A + " e o valor B sera: " + B);


        leitor.close();
        
    }
    
}
