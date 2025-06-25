// Hash map que usa o método de DOBRAMENTO para hashing.
public class HashMapDOBRA {
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

    public HashMapDOBRA(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new Node[tamanho];
        this.colidiuNoIndice = new boolean[tamanho];
        this.colisoes = 0;
        this.comparacoesTotais = 0;
    }

    private int hash(String codigo) {
        long k = Long.parseLong(codigo);
        int soma = 0;
        while (k > 0) {
            soma += k % 1000;
            k /= 1000;
        }
        return soma % tamanho;
    }

    public void inserir(String codigo) {
        Registro registro = new Registro(codigo);
        int indice = hash(codigo);

        // Se já tinha algo no índice e ainda não marcamos colisão, então foi a 1ª colisão ali
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
