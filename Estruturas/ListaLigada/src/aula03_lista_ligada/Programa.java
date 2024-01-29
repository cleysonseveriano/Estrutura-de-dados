package aula03_lista_ligada;

public class Programa {
    public static void main(String[] args) {
        // Instanciando lista
        ListaLigada lista = new ListaLigada();

        // Adicionar
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");        
        
        // Remover
        lista.remover("AC");
        
        // Printando lista 
        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

        
        System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo: "+lista.getUltimo().getValor());

        // Tamanho da lista
        System.out.println("Tamanho da lista: "+lista.getTamanho());
    }
}
