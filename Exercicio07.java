import java.util.Scanner;

/*Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5,
 sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;*/

public class Exercicio07 {

    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        int celsius, fahrenheit;

        System.out.println("Digite o valor em graus Celsius que deseja converter: ");
        celsius = leitor.nextInt();

        fahrenheit=(9*celsius+160)/5;

        System.out.println("O valor em graus Fahrenheit sera: " + fahrenheit);

        leitor.close();
    }
    
}
