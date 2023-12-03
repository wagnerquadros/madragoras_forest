# Madragoras Forest HackerHank Problem

O espaço de trabalho contém duas pastas por padrão, onde:

- `src`: a pasta origem com classe main e pacotes do ChiefHooper e Test
- `scr/main/java`: pacote com classes Main e MandragorasForest
- `scr/test/java`: pacote de testes com as classes EntriesReader e MandragorasForestTest
- `scr/test/java/entries`: pacote com arquivos .txt contendo as entradas para os testes

## Sobre o Exercício
Este exercício descreve uma jornada através de uma floresta perigosa, onde Garnet e seu animal de estimação 
encontram mandrágoras. Cada mandrágora tem um certo nível de saúde, representado por uma lista H. Garnet 
começa com 1 ponto de saúde (s) e 0 pontos de experiência (p).

A cada encontro com uma mandrágora, Garnet tem duas opções:

1. O animal de estimação de Garnet come a mandrágora, aumentando s em 1 ponto e derrota a mandrágora.
2. O animal de estimação de Garnet batalha com a mandrágora, o que aumenta p em s vezes o valor de saúde (H) da mandrágora e derrota a mandrágora.

O objetivo é determinar o número máximo de pontos de experiência que Garnet pode coletar em sua jornada, 
dado um conjunto de mandrágoras com diferentes níveis de saúde.

### Restrições

Número de mandragoras (n) -> **1 <= n <= 100000**
Saúde das Mandragoras H[i] -> **1 <= H[i] <= 10000000, 1<= i <= n onde**

### Exemplo prático
Se a lista de saúde das mandrágoras for H = [3, 2, 5], Garnet tem duas escolhas para cada mandrágora. 
Uma possibilidade seria Garnet comer todas as três mandrágoras, resultando em nenhum ponto de experiência. 
Outra possibilidade seria Garnet comer as duas primeiras mandrágoras para ter 1 + 2 + 3 = 6 pontos de saúde e, 
em seguida, batalhar com a terceira mandrágora para ganhar 3 * 5 = 15 pontos de experiência. Neste exemplo, 
a melhor opção seria comer a mandrágora com 2 pontos de saúde e batalhar com as outras, resultando 
em 2 * (3 + 5) = 16 pontos de experiência


## Resolvendo o Exercício 

O método usa a técnica de programação dinâmica para otimizar o cálculo dos pontos de experiência, armazenando
resultados anteriores e verificando se continuar o cálculo é vamtajoso em termos de pontuação de experiência.

1. **Variáveis Iniciais**: O método começa inicializando variáveis como *expPoints* para acumular os pontos de experiência, 
*mandragorasHealthSum* para acumular a soma da saúde das mandrágoras, e *previousResults* para armazenar os resultados anteriores.

2. **Ordenação**: As mandrágoras são ordenadas em ordem decrescente.

3. **Caso Base**: Se houver apenas uma mandrágora, o valor dela é retornado imediatamente.

4. **Loop Principal**: O método entra em um *loop* que percorre as mandrágoras. Para cada mandrágora, acumula a saúde, 
calcula os pontos de experiência, e armazena os resultados anteriores.

5. **Otimização**: Uma verificação é feita para determinar se o resultado atual é menor que o anterior. Se sim, atualiza *p* e 
encerra o *loop*, economizando tempo computacional.

6. **Resultado Final**: O método retorna o valor de *p*, que representa a melhor pontuação de experiência obtida com a abordagem dinâmica.

## Método implementado

```
    public Long mandragoraDynamicPrograming(List<Integer> H) {

        Long p = null;
        Long expPoints = 0L;
        int health = 1;
        Long mandragorasHealthSum = 0L;

        List<Long> previousResults = new ArrayList<>();

        int eatenMandragoras = H.size() - 1;

        H.sort(Comparator.reverseOrder());

        if (H.size() == 1) {
            return Long.valueOf(H.get(0));
        }

        for (int i = 0; i < H.size() - eatenMandragoras; i++) {
            mandragorasHealthSum += (long) H.get(i);
            expPoints += (long) mandragorasHealthSum * (eatenMandragoras + health);
            previousResults.add(expPoints);
            expPoints = 0L;
            eatenMandragoras--;

            if(i != 0) {
                if (previousResults.get(i) < previousResults.get(i - 1)) {
                    p = previousResults.get(i - 1);
                    break;
                }
            }
        }
        return p;
    }
```
## Testes Realizados

Foi implementada a classe de testes *MandragorasForestTest* contendo 7 casos de testes propostos
pelo portal HackerHank. Os testes variam em números de entradas. Para entradas maiores, os valores
são lidos de arquivos txt. A classe responsável pela leitura das entradas é a *EntriesReader*.

### Resultados

![Result](src/images/testes.png)

## Submit Result

![Submit Result](src/images/Results.png)