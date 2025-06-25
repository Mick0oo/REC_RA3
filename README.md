# Recuperação do RA3 - HASHMAP
# Resolução de Problemas Estruturados em Computação

São criadas tabelas hash com 3 tamanhos (1.000, 10.000 ou 100.000 elementos) para 3 diferentes algoritmos de hashing diferentes, resultando em 9 tabelas diferentes. Todas usando o mesmo conjunto de dados criado por meio do uso da mesma seed.

Os algoritmos escolhidos para o hashing das tabelas foram: _Multiplicação_, _Resto de Divisão_ e _Dobramento_.

O código se encontra na pasta src. Contém classes para cada HashMap diferente, uma classe Registro (auxiliar) e a classe Main (main, testes).

## Análise:
__Para tempo de inserção:__

O algoritmo de hashing por Dobramento fora o mais rápido em todos os cenários.

__Para quantidades de colisões:__ 

Dos algoritmos de hashing por Multiplicação e Resto de Divisão foram similar para todos os cenários.
Já o algoritmo de Dobramento, ao aumentar o volume, ocorreram muito mais colisões que os outros, chegando a ter 355% mais colisões que o algoritmo de Resto de Divisão no caso de 100.000 elementos.

__Para as buscas:__

O algoritmo de Dobramento começa sendo o mais rápido, mas acaba escalando horrívelmente ao aumentar o volume de dados. Nos cenários com grandes volumes de dados o algoritmo mais veloz foi o de Resto de Divisão. 
Para todos os cenários o algoritmo de Dobramento teve maior méda de comparações.


__Para cada algoritmo:__
- O algoritmo de _Multiplicação_ é o mais mediano entre os algoritmos testados. Não houveram resultados notáveis.
- O algoritmo de _Resto de Divisão_ é o melhor algoritmo para busca com grandes volumes de dados. Ele também tem um bom tempo de inserção para cenários de menores volumes de dados, mas não é muito mais notável além disso.
- O algoritmo de _Dobramento_ é muito rápido com as inserções, mas não escala muito bem para colisões e busca.

### Conclusão:
Entre os algoritmos de hashing testados, o algoritmo de Resto de Divisão teve o maior desempenho geral. 



![Image](https://github.com/user-attachments/assets/e913e68a-8eb1-4d80-98a0-48007e6ad82e)

![Image](https://github.com/user-attachments/assets/e624ab39-9c3f-4064-9e16-40a14f3582c4)

![Image](https://github.com/user-attachments/assets/ffdfa451-ae93-4405-aea3-b02a6b8cad36)
