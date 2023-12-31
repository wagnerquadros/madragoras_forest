import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Gerador de entradas
 */
public class InputsGenerator {
    /**
     * o método gera uma Lista de mandragoras com valores aleatórios de saúde.
     * Recebe o número de mandragoras e devolve a lista H.
     * @param manddragorasNumber
     * @return H
     */
    public List<Integer> generateInputs(int manddragorasNumber){
        Random rand =  new Random();
        List<Integer> H = new ArrayList<>();

        for(int i=1; i<=  manddragorasNumber; i++){
            int height = rand.nextInt(100000)+1;
            H.add(height);
        }
        return H;
    }
}
