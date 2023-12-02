import java.util.List;

public class MandragorasForest {

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

            if(H.size() == 1){
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
