import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioList2 {
    
    /*Dadas as seguintes informações sobre gatos,  crie uma lista e ordene esta lista exibindo (Nome - idade - cor)
    Gato 1 = nome: Sol, idade = 1, cor = preto
    Gato 2 = nome: Preto, idade = 10, cor = branco
    Gato 3 = nome: Cecilia, idade = 2, cor = tigrado
    */
    public static void main(String[] args){

        List<Gato> gatos = new ArrayList<>() {{

            add(new Gato("Sol",  1, "preto"));
            add(new Gato("Preto", 10, "branco"));
            add(new Gato("Cecilia", 2, "tigrado"));

        }};

        gatos.sort(Comparator.comparing(Gato::getNome));

        System.out.println("---Ordem de Insercao---");
        System.out.println(gatos);

        System.out.println("---Ordem Aleatória---");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("---Ordem Natural (Nome)---");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem Idade\t---");
        
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("--Ordem cor---");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);


    }

}

    class Gato implements Comparable<Gato> {
        private String nome;
        private Integer idade;
        private String cor;

        public Gato(String nome, Integer idade, String cor){
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome(){
            return nome;
        }

        public Integer getIdade(){
            return idade;
        }

        public String getCor(){
            return cor;
        }

        @Override
        public String toString() {
            return "Gato{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    "cor='" + cor + '\'' +
                    '}'; 
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }

    }

    class ComparatorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
    
    class ComparatorCor implements Comparator<Gato> {
    
        @Override
        public int compare(Gato g1, Gato g2) {
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
    }
    
    class ComparatorNomeCorIdade implements Comparator<Gato> {
    
        @Override
        public int compare(Gato g1, Gato g2) {
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if (nome != 0) return nome;
    
            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if(cor !=0) return cor;
    
            return Integer.compare(g1.getIdade(), g2.getIdade());
    
        }
    }
