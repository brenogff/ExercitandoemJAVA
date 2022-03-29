import java.util.Scanner;

/*Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No finalinformar o nome do aluno e a sua média (aritmética);*/

public class Exercicio05 {

    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        String aluno;
        Float nota1, nota2, nota3, media;

        System.out.println("Digite o nome do aluno: ");
        aluno = leitor.nextLine();
        System.out.println("Digite a nota 1: ");
        nota1 = leitor.nextFloat();
        System.out.println("Digite a nota 1: ");
        nota2 = leitor.nextFloat();
        System.out.println("Digite a nota 1: ");
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O aluno " + aluno + " obteve a seguinte media: " + media);

        leitor.close();
    }
    
}
