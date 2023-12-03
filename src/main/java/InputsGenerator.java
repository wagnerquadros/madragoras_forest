import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InputsGenerator {
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
