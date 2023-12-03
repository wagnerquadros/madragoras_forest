import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MandragorasForestTest {

    MandragorasForest mf = new MandragorasForest();
    EntriesReader er = new EntriesReader();
    List<Integer> H = new ArrayList<>();

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
        String path = "src/test/java/entries/testCase3.txt";
        H = er.getEntries(path);

        long result = mf.mandragora(H);
        Assertions.assertEquals(116928304010376L, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(116928304010376L, dynamicResult);
    }

    @Test
    public void testCase4(){
        String path = "src/test/java/entries/testCase4.txt";
        H = er.getEntries(path);

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
        String path = "src/test/java/entries/testCase6.txt";
        H = er.getEntries(path);

        //long result = mf.mandragora(H);
        //Assertions.assertEquals(9760016801005104L, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(9760016801005104L, dynamicResult);
    }

    @Test
    public void testCase7(){
        String path = "src/test/java/entries/testCase7.txt";
        H = er.getEntries(path);

        //long result = mf.mandragora(H);
        //Assertions.assertEquals(17892186985803078L, result);

        Long dynamicResult = mf.mandragoraDynamicPrograming(H);
        Assertions.assertEquals(17892186985803078L, dynamicResult);
    }

}
