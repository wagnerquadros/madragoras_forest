import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public void decreasingMergeSort(List<Integer> H){
        if(H.size() > 1){
            int middle = H.size() / 2;

            List<Integer> leftPart = new ArrayList<>(H.subList(0, middle));
            List<Integer> rightPart = new ArrayList<>(H.subList(middle, H.size()));

            decreasingMergeSort(leftPart);
            decreasingMergeSort(rightPart);

            merge(H, leftPart, rightPart);
        }
    }

    private void merge(List<Integer> H, List<Integer> leftPart, List<Integer> rightPart) {
        int i = 0; // left index
        int j = 0; // right index
        int k = 0; // result index

        while(i < leftPart.size() && j < rightPart.size()){
            if(leftPart.get(i) >= rightPart.get(j)){
                H.set(k++, leftPart.get(i++));
            } else{
                H.set(k++, rightPart.get(j++));
            }
        }

        while(i < leftPart.size()){
            H.set(k++, leftPart.get(i++));
        }

        while(j < rightPart.size()){
            H.set(k++, rightPart.get(j++));
        }
    }
}
