import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //criando uma lista de nomes
        ArrayList<String> nomes = new ArrayList<>();

        //Adicionando elementos
        nomes.add("Luiz");
        nomes.add("Ana");
        nomes.add("Carlos");

        //Exibindo a lista
        System.out.println("Lista de nomes: " + nomes);

        //removendo um nome
        nomes.remove("Ana");

        //Exibindo após remoção
        System.out.println("Lista após remoção: " + nomes);
    }
}
