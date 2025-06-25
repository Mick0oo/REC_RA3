public class HashMapMULT {
    public static class Node {
        Registro dado;
        Node proximo;

        public Node(Registro dado, Node proximo) {
            this.dado = dado;
            this.proximo = proximo;
        }
    }

    private Node[] tabela;
    private boolean[] colidiuNoIndice;
    private int tamanho;
    private int colisoes;
    private int comparacoesBusca;
    private int comparacoesTotais;

    private static final double A = 0.6180339887;  // Constante de Knuth

    public HashMapMULT(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new Node[tamanho];
        this.colidiuNoIndice = new boolean[tamanho];
        this.colisoes = 0;
        this.comparacoesTotais = 0;
    }

    // Função hash por multiplicação
    private int hash(String codigo) {
        long k = Long.parseLong(codigo);
        double frac = (k * A) % 1;
        return (int) (tamanho * frac);
    }

    public void inserir(String codigo) {
        Registro registro = new Registro(codigo);
        int indice = hash(codigo);

        if (tabela[indice] != null && !colidiuNoIndice[indice]) {
            colisoes++;
            colidiuNoIndice[indice] = true;
        }

        Node novo = new Node(registro, tabela[indice]);
        tabela[indice] = novo;
    }

    public boolean buscar(String codigo) {
        comparacoesBusca = 0;
        int indice = hash(codigo);
        Node atual = tabela[indice];

        while (atual != null) {
            comparacoesBusca++;
            comparacoesTotais++;
            if (atual.dado.getCodigo().equals(codigo)) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public int getColisoes() {
        return colisoes;
    }

    public void setColisoes(int colisoes) {
        this.colisoes = colisoes;
    }

    public int getComparacoesBusca() {
        return comparacoesBusca;
    }

    public void setComparacoesBusca(int comparacoesBusca) {
        this.comparacoesBusca = comparacoesBusca;
    }

    public int getComparacoesTotais() {
        return comparacoesTotais;
    }

    public void setComparacoesTotais(int comparacoesTotais) {
        this.comparacoesTotais = comparacoesTotais;
    }
}
