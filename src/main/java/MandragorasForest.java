import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MandragorasForest {

    /**
     * Métododo para calcular o máximo de pontos de experiância
     * dada uma lista de mandragoras H. A estratégia foi prdenar a lista
     * de mandragoras em ordem crescente, e iniciar a verificação considerando
     * que foram comidas todas as mandragoras menos a última com maior saúde.
     * Assim, pe feita o calcula da saúde do pet considerando o tamanho da
     * lista de mandragoras - 1, pois a última será enfrentada na batalha.
     * O resultado da esperiência obitida é guardada na variavel bestScore.
     * As demais variaveis são reiniciadas. É realizado uma nova verificação, no
     * entanto, considerando comer até a antepenultima mandragora e enfrentar as duas
     * ultimas com maior saude. A variavel eatenMandragoras representa a quantidade
     * de mandragoras comidas na verificação atual. Ordenar a lista em ordem crescente
     * garante que apenas a demenor saúde serão comidas, deixando as que mais
     * contribuem com o ganho de esperiência para serem enfrentadas.
     * O metodo repere em loop até que o bestScore guardado da verificação anterior
     * seja maior que a experiância calculada.
     * O método inicia com eatenMandragoras = H.size - 1 e decrementa essa variavel
     * até o ponto onde enfrentar uma mandragora a mais em vez de come-la não
     * gera maior experiência.
     *
     * @param H
     * @return bestScore
     *
     * @deprecated Este método foi decontinuado.
     *             Use mandragoraDynamicPrograming() em vez desse.
     */
    @Deprecated
    public long mandragora(List<Integer> H) {

        //Status iniciais: saúde = 1 e experiência = 0
        Long expPoints = 0L;
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
                expPoints += (long) H.get(i-1) * health;
            }

            if(expPoints > bestScore){
                bestScore = expPoints;
                //Reiniciando os Statuss para nova verificação
                expPoints = 0L;
                health = 1;
                eatenMandragoras--;
            } else {
                found = true;
            }
        }
        return bestScore;
    }

    /**
     * O método usa a técnica de programação dinâmica para otimizar o cálculo dos pontos de experiência,
     * armazenando resultados anteriores e verificando se continuar o cálculo é vantajoso em termos de
     * pontuação de experiência.
     * @param H
     * @return p
     */
    public Long mandragoraDynamicPrograming(List<Integer> H) {

        Long p = null;
        Long expPoints = 0L;
        int health = 1;
        Long mandragorasHealthSum = 0L;

        List<Long> previousResults = new ArrayList<>(); //Lista para armazenar resutaldos anteriores e evitar recalculos.

        int eatenMandragoras = H.size() - 1;

        MergeSort mergeSort = new MergeSort();
        mergeSort.decreasingMergeSort(H);

        if (H.size() == 1) {
            return Long.valueOf(H.get(0));
        }

        for (int i = 0; i < H.size() - eatenMandragoras; i++) {
            mandragorasHealthSum += (long) H.get(i);
            expPoints += (long) mandragorasHealthSum * (eatenMandragoras + health);
            previousResults.add(expPoints);
            expPoints = 0L;
            eatenMandragoras--;

            //Verifica se a experiência atual é menor que a experiência armazenada no passo anterior.
            //A partir daí já o ganho de experiência diminui.
            if(i != 0) {
                if (previousResults.get(i) < previousResults.get(i - 1)) {
                    p = previousResults.get(i - 1);
                    break;
                }
            }
        }
        return p;
    }
}


