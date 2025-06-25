# Recuperação do RA4 - ORDENAÇÃO
# Resolução de Problemas Estruturados em Computação

Algoritmos requisitados:
- Radix Sort
- Quick Sort Não recursivo (Iterativo)
- Merge Sort Não recursivo (iterativo, bottom-up)

Os dados são tirados a partir de 100 rodadas, para todos os algoritmos.

São comparados os resultados dos três algoritmos contra três datasets de 50 elementos desorganizados de formas diferentes.
Essa desorganização interage diferentemente com as fraquezas e as forças de cada um dos algoritmos.

# Análise Dataset 1
_Característica: 50 elementos, alternado com picos entre cada elemento (menor, maior)._
O algoritmo com melhor desempenho foi o radix.

# Análise Dataset 2
_Característica: 50 elementos, começa ordenado, tem um pico e continua invertido desde então._
O algoritmo com melhor desempenho foi o radix.

# Análise Dataset 3
_Característica: 50 elementos, invertido. Sequência de 50 a 1._
O algoritmo com melhor desempenho foi o radix.

# Outras anotações
O merge sort é o mais consistente em todos os datasets para as trocas e iterações.
O quick sort tem uma quantidade média de iterações muito maior que os outros algoritmos nos datasets invertidos (2,3).

# Conclusão
O melhor algoritmo no geral é o Radix. Ele teve o desempenho mais satisfatório quando comparado aos outros, para todos os datasets. Isso ocorre pois os datasets são ideais para o radix. Eles são pequenos (50 elementos), e são compostos de integers positivos e não muito grandes.




![Image](https://github.com/user-attachments/assets/e913e68a-8eb1-4d80-98a0-48007e6ad82e)

![Image](https://github.com/user-attachments/assets/e624ab39-9c3f-4064-9e16-40a14f3582c4)

![Image](https://github.com/user-attachments/assets/ffdfa451-ae93-4405-aea3-b02a6b8cad36)
