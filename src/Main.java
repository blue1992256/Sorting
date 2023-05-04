import java.util.Arrays;
import sort.InsertionSort;
import sort.SelectionSort;

public class Main {

  public static void main(String[] args) {
    Integer[] array = {8,7,6,1,5,2,4,5};
//    InsertionSort.sort(array);
    SelectionSort.sort(array);
    System.out.println(Arrays.toString(array));
  }
}
