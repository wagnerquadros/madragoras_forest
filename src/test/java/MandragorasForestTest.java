import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MandragorasForestTest {

    MandragorasForest mf = new MandragorasForest();
    InputsReader er = new InputsReader();
    List<Integer> H = new ArrayList<>();
    InputsGenerator inputs = new InputsGenerator();

    @Test
    public void testCase0(){
        H.add(3);
        H.add(2);
        H.add(2);

        //long result = mf.mandragora(H);
        //Assertions.assertEquals(10, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(10, dynamicResult);
    }

    @Test
    public void testCase1(){
        H.add(1188729);
        H.add(1052940);
        H.add(9159214);
        H.add(1041177);
        H.add(1109408);
        H.add(1127712);
        H.add(708150);
        H.add(1358977);
        H.add(769261);
        H.add(990618);
        H.add(8711306);
        H.add(656084);
        H.add(156949);
        H.add(1188775);
        H.add(9153873);
        H.add(9345902);

        //long result = mf.mandragora(H);
        //Assertions.assertEquals(472813835, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(472813835, dynamicResult);
    }

    @Test
    public void testCase3(){
        String path = "src/test/java/inputs/testCase3.txt";
        H = er.getInputs(path);

        long result = mf.mandragora(H);
        Assertions.assertEquals(116928304010376L, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(116928304010376L, dynamicResult);
    }

    @Test
    public void testCase4(){
        String path = "src/test/java/inputs/testCase4.txt";
        H = er.getInputs(path);

        //long result = mf.mandragora(H);
        //Assertions.assertEquals(55523551406028L, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(55523551406028L, dynamicResult);
    }

    @Test
    public void testCase5(){
        H.add(5);
        H.add(2);
        H.add(6);
        H.add(11);
        H.add(29);
        H.add(12);
        H.add(7);

        //long result = mf.mandragora(H);
        //Assertions.assertEquals(260, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(260, dynamicResult);
    }

    @Test
    public void testCase6(){
        String path = "src/test/java/inputs/testCase6.txt";
        H = er.getInputs(path);

        //long result = mf.mandragora(H);
        //Assertions.assertEquals(9760016801005104L, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(9760016801005104L, dynamicResult);
    }

    @Test
    public void testCase7(){
        String path = "src/test/java/inputs/testCase7.txt";
        H = er.getInputs(path);

        //long result = mf.mandragora(H);
        //Assertions.assertEquals(17892186985803078L, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(17892186985803078L, dynamicResult);
    }

    /**
     * Os testes abaixo tem o objetivo de medir o tempo de execução do
     * método para diferentes tamanhos de entradas.
     */

    @Test
    public void testCase8_1Input(){
        H = inputs.generateInputs(1);
        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (01): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test //
    public void testCase9_100Input(){
        H = inputs.generateInputs(100);

        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (100): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test //
    public void testCase10_1000Input(){
        H = inputs.generateInputs(1000);

        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (1.000): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test //
    public void testCase11_5000Input(){
        H = inputs.generateInputs(5000);

        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (5.000): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test //
    public void testCase12_10000Input(){
        H = inputs.generateInputs(10000);

        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (10.000): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test //
    public void testCase13_25000Input(){
        H = inputs.generateInputs(25000);

        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (25.000): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test //
    public void testCase14_50000Input(){
        H = inputs.generateInputs(50000);

        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (50.000): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test //
    public void testCase15_75000Input(){
        H = inputs.generateInputs(75000);

        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (75.000): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test //
    public void testCase16_100000Input(){
        H = inputs.generateInputs(100000);

        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (100.000): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test
    public void testCase17_25Input(){
        H = inputs.generateInputs(25);
        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (25): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test
    public void testCase18_50Input(){
        H = inputs.generateInputs(50);
        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (50): " + (endTime - startTime) + " nanoSegundos");
    }

    @Test
    public void testCase19_75Input(){
        H = inputs.generateInputs(75);
        long startTime = System.nanoTime();
        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        long endTime = System.nanoTime();

        System.out.println("Tempo de execução (75): " + (endTime - startTime) + " nanoSegundos");
    }
}
