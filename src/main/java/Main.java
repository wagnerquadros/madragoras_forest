import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MandragorasForest m = new MandragorasForest();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(5);
        l.add(90);
        l.add(2);
        l.add(45);

        System.out.println(m.mandragoraDynemicPrograming(l));
    }

}
