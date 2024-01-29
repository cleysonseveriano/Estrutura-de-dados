package aula03_lista_ligada;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada(){
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
        if ( getPrimeiro() == null && getUltimo() == null ) {
            setPrimeiro(novoElemento);
            setUltimo(novoElemento);
        } else {
            this.ultimo.setProximo(novoElemento);
            setUltimo(novoElemento);
        }
        setTamanho(getTamanho() + 1);
    }

    public void remover(String valorProcurado){
        Elemento anterior = null;
        Elemento atual = getPrimeiro();
        for (int i=0; i < this.getTamanho(); i++){
            if (atual.getValor().equalsIgnoreCase(valorProcurado)){
                if(atual==getPrimeiro() && atual==getUltimo()){
                    setPrimeiro(null);
                    setUltimo(null);
                }
                if(atual == getPrimeiro()){
                    setPrimeiro(atual.getProximo());
                    atual.setProximo(null);
                } else if(atual == getUltimo()){
                    setUltimo(anterior);
                    anterior.setProximo(null);
                } else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                setTamanho(getTamanho()-1);
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public Elemento get(int posicao){
        Elemento atual = getPrimeiro();
        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }
}
