import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tamanhos = {1000, 10_000, 100_000};
        long seed = 12345;

        System.out.println("\n--- TESTES PARA HASHMAP QUE USA HASH DE MULTIPLICAÇÃO...\n");
        for (int tamanho : tamanhos) {
            System.out.println("Testando tamanho: " + tamanho);

            HashMapMULT mapa = new HashMapMULT(tamanho * 2);
            Random random = new Random(seed);

            String[] chavesInseridas = new String[tamanho];

            // Inserção
            long startInsert = System.currentTimeMillis();
            for (int i = 0; i < tamanho; i++) {
                String codigo = String.format("%09d", random.nextInt(1_000_000_000));
                mapa.inserir(codigo);
                chavesInseridas[i] = codigo; // armazenar para usar nas buscas
            }
            long endInsert = System.currentTimeMillis();

            System.out.println("Tempo de inserção: " + (endInsert - startInsert) + " ms");
            System.out.println("Colisões ocorridas: " + mapa.getColisoes());

            // Busca
            Random randomBusca = new Random(seed + 1000);
            long totalTempoBusca = 0;
            int totalComparacoesBusca = 0;
            int buscasFeitas = 5;

            for (int i = 0; i < buscasFeitas; i++) {
                int idxBusca = randomBusca.nextInt(tamanho);
                String chaveBusca = chavesInseridas[idxBusca];

                mapa.setComparacoesBusca(0);
                long startBusca = System.nanoTime();
                boolean encontrado = mapa.buscar(chaveBusca);
                long endBusca = System.nanoTime();

                long duracaoBusca = endBusca - startBusca;
                totalTempoBusca += duracaoBusca;
                totalComparacoesBusca += mapa.getComparacoesBusca();

                if (!encontrado) {
                    System.out.println("Aviso: chave " + chaveBusca + " não encontrada na busca.");
                }
            }

            System.out.println("Média tempo de busca (ns): " + (totalTempoBusca / buscasFeitas));
            System.out.println("Média comparações na busca: " + (totalComparacoesBusca / buscasFeitas));
            System.out.println("---------------------------");
        }

        System.out.println("\n--- TESTES PARA HASHMAP QUE USA HASH DE RESTO DE DIVISÃO...\n");
        for (int tamanho : tamanhos) {
            System.out.println("Testando tamanho: " + tamanho);

            HashMapDIV mapa = new HashMapDIV(tamanho * 2);
            Random random = new Random(seed);

            String[] chavesInseridas = new String[tamanho];

            // Inserção
            long startInsert = System.currentTimeMillis();
            for (int i = 0; i < tamanho; i++) {
                String codigo = String.format("%09d", random.nextInt(1_000_000_000));
                mapa.inserir(codigo);
                chavesInseridas[i] = codigo; // armazenar para usar nas buscas
            }
            long endInsert = System.currentTimeMillis();

            System.out.println("Tempo de inserção: " + (endInsert - startInsert) + " ms");
            System.out.println("Colisões ocorridas: " + mapa.getColisoes());

            // Busca
            Random randomBusca = new Random(seed + 1000);
            long totalTempoBusca = 0;
            int totalComparacoesBusca = 0;
            int buscasFeitas = 5;

            for (int i = 0; i < buscasFeitas; i++) {
                int idxBusca = randomBusca.nextInt(tamanho);
                String chaveBusca = chavesInseridas[idxBusca];

                mapa.setComparacoesBusca(0);
                long startBusca = System.nanoTime();
                boolean encontrado = mapa.buscar(chaveBusca);
                long endBusca = System.nanoTime();

                long duracaoBusca = endBusca - startBusca;
                totalTempoBusca += duracaoBusca;
                totalComparacoesBusca += mapa.getComparacoesBusca();

                if (!encontrado) {
                    System.out.println("Aviso: chave " + chaveBusca + " não encontrada na busca.");
                }
            }

            System.out.println("Média tempo de busca (ns): " + (totalTempoBusca / buscasFeitas));
            System.out.println("Média comparações na busca: " + (totalComparacoesBusca / buscasFeitas));
            System.out.println("---------------------------");
        }


        System.out.println("\n--- TESTES PARA HASHMAP QUE USA HASH DE DOBRAMENTO...\n");
        for (int tamanho : tamanhos) {
            System.out.println("Testando tamanho: " + tamanho);

            HashMapDOBRA mapa = new HashMapDOBRA(tamanho * 2);
            Random random = new Random(seed);

            String[] chavesInseridas = new String[tamanho];

            // Inserção
            long startInsert = System.currentTimeMillis();
            for (int i = 0; i < tamanho; i++) {
                String codigo = String.format("%09d", random.nextInt(1_000_000_000));
                mapa.inserir(codigo);
                chavesInseridas[i] = codigo; // armazenar para usar nas buscas
            }
            long endInsert = System.currentTimeMillis();

            System.out.println("Tempo de inserção: " + (endInsert - startInsert) + " ms");
            System.out.println("Colisões ocorridas: " + mapa.getColisoes());

            // Busca
            Random randomBusca = new Random(seed + 1000);
            long totalTempoBusca = 0;
            int totalComparacoesBusca = 0;
            int buscasFeitas = 5;

            for (int i = 0; i < buscasFeitas; i++) {
                int idxBusca = randomBusca.nextInt(tamanho);
                String chaveBusca = chavesInseridas[idxBusca];

                mapa.setComparacoesBusca(0);
                long startBusca = System.nanoTime();
                boolean encontrado = mapa.buscar(chaveBusca);
                long endBusca = System.nanoTime();

                long duracaoBusca = endBusca - startBusca;
                totalTempoBusca += duracaoBusca;
                totalComparacoesBusca += mapa.getComparacoesBusca();

                if (!encontrado) {
                    System.out.println("Aviso: chave " + chaveBusca + " não encontrada na busca.");
                }
            }

            System.out.println("Média tempo de busca (ns): " + (totalTempoBusca / buscasFeitas));
            System.out.println("Média comparações na busca: " + (totalComparacoesBusca / buscasFeitas));
            System.out.println("---------------------------");
        }
    }
}
