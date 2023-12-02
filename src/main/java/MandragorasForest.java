import java.util.List;

public class MandragorasForest {

    /**
     * Metododo para clacular o maximo de pontos de experiencia
     * dada uma lista de mandragoras H. A estratégia foi prdenar a lista
     * de mandragoras em ordem crescente, e iniciar a verificação considerando
     * que foram comidas todas as mandragoras menos a última com maior saúde.
     * Assim, pe feita o calcula da saúde do pet considerando o tamanho da
     * lista de mandragoras - 1, pois a última será enfrentada na batalha.
     *
     * O resultado da esperiência obitida é guardada na variavel bestScore.
     * As demais variaveis são reiniciadas. É realizado uma nova verificação, no
     * entanto, considerando comer até a antepenultima mandragora e enfrentar as duas
     * ultimas com maior saude. A variavel eatenMandragoras representa a quantidade
     * de mandragoras comidas na verificação atual. Ordenar a lista em ordem crescente
     * garante que apenas a demenor saúde serão comidas, deixando as que mais
     * contribuem com o ganho de esperiência para serem enfrentadas.
     *
     * O metodo repere em loop até que o bestScore guardado da verificação anterior
     * seja maior que a experiância calculada.
     *
     * O método inicia com eatenMandragoras = H.size - 1 e decrementa essa variavel
     * até o ponto onde enfrentar uma mandragora a mais em vez de come-la não
     * gera maior experiência.
     *
     * @param H
     * @return
     */
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
}