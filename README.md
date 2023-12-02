# Madragoras Forest HackerHank Problem

O espaço de trabalho contém duas pastas por padrão, onde:

- `src`: a pasta origem com classe main e pacotes do ChiefHooper e Test
- `scr/main/java`: pacote com classes Main e MandragorasForest
- `scr/test/java`: pacote de testes com as classes EntriesReader e MandragorasForestTest
- `scr/test/java/entrie`: pacote com arquivos .txt contendo as entradas para os testes


## Sobre o Exercício
Este exercício descreve uma jornada através de uma floresta perigosa, onde Garnet e seu animal de estimação 
encontram mandrágoras. Cada mandrágora tem um certo nível de saúde, representado por uma lista H. Garnet 
começa com 1 ponto de saúde (s) e 0 pontos de experiência (p).

A cada encontro com uma mandrágora, Garnet tem duas opções:

1. O animal de estimação de Garnet come a mandrágora, aumentando s em 1 ponto e derrota a mandrágora.
2. O animal de estimação de Garnet batalha com a mandrágora, o que aumenta p em s vezes o valor de saúde (H) da mandrágora e derrota a mandrágora.

O objetivo é determinar o número máximo de pontos de experiência que Garnet pode coletar em sua jornada, 
dado um conjunto de mandrágoras com diferentes níveis de saúde.

### Exemplo prático
Se a lista de saúde das mandrágoras for H = [3, 2, 5], Garnet tem duas escolhas para cada mandrágora. 
Uma possibilidade seria Garnet comer todas as três mandrágoras, resultando em nenhum ponto de experiência. 
Outra possibilidade seria Garnet comer as duas primeiras mandrágoras para ter 1 + 2 + 3 = 6 pontos de saúde e, 
em seguida, batalhar com a terceira mandrágora para ganhar 3 * 5 = 15 pontos de experiência. Neste exemplo, 
a melhor opção seria comer a mandrágora com 2 pontos de saúde e batalhar com as outras, resultando 
em 2 * (3 + 5) = 16 pontos de experiência


## Resolvendo o Exercício 



## Método implementado

```
    public long mmandragora(List<Integer> H) {

        //Status iniciais: saúde = 1 e experiência = 0
        Long expPonits = 0L;
        int health = 1;

        H.sort(null);

        //Mandragoras comidas durante a jornada
        int eatenMandragoras = H.size() - 1;
        Long bestScore = 0L;

        boolean found = false;

        while (!found) {
            health += eatenMandragoras;

            if(H.size() == 1) {
                return H.get(0);
            }

            for (int i = H.size(); i > eatenMandragoras; i--) {
                expPonits += (long) H.get(i-1) * health;
            }

            if(expPonits > bestScore){
                bestScore = expPonits;
                //Reiniciando os Statuss para nova verificação
                expPonits = 0L;
                health = 1;
                eatenMandragoras--;
            } else {
                found = true;
            }
        }
        return bestScore;
    }

```

