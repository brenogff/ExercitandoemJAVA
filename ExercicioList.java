import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Dada uma lista de 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:
//
public class ExercicioList {

    public static void main (String[] args) {

        System.out.println("Crie uma lista e adicione 7 notas: ");
 
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add( 4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista:" + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma = soma + next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media dos valores: " + soma/notas.size());

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        /*System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iteradorDois = notas.iterator();
        while (iteradorDois.hasNext()){
            Double next = iteratorDois.next();
            if (next < 7) iteratorDois.remove();
        } (entender o motivo de não estar rodando a variável iteradorDois no while e if) */

        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}