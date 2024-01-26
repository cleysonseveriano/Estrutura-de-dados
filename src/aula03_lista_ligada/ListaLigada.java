package aula03_lista_ligada;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
        if(primeiro == null && ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
            this.tamanho++;
        } else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
            setTamanho(getTamanho()+1);
        }
    }
    
    public void remover(String novoValor){

    }

    public Elemento get(int posicao){
        Elemento atual = this.primeiro;
        for(int i =0; i <= posicao; i = i + 1){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
    }
    
}
