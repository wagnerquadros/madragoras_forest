import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;


/**
 * Classe para leitura de arquivo txt com as alturas dos predios para realização
 * dos Testes.
 */

public class InputsReader {
    /**
     * Recebe o caminho do arquivo .txt contendo as alturas dos edifícios e
     * retorna um ArrayList de edificios e suas respectivas alturas.
     * @param path
     * @return H
     */
    public List<Integer> getInputs(String path){
        List<Integer> H = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new java.io.FileReader(path))){

            String line;
            while((line = br.readLine()) != null) {
                String[] entries = line.split(" ");
                for(String entrie : entries){
                    int mandragora = Integer.parseInt(entrie);
                    H.add(mandragora);
                }
            }

        } catch( IOException e){
            e.printStackTrace();
        }

        return H;
    }
}
