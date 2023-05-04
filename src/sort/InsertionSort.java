/*
  삽입 정렬(Insertion sort)
  참조 : https://st-lab.tistory.com/179
  설명 : 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
        2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
        3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
 */
package sort;

public class InsertionSort {

  public static void sort(Integer[] array) {
    for (int i = 1; i < array.length; i++) {
      int key = array[i];
      int k = i-1;

      while (k >= 0 && array[k] > key) {
        array[k+1] = array[k];
        k--;
      }

      // 타켓 숫자가 앞의 숫자보다 큰 경우 바로 뒤에 위치해야함
      array[k+1] = key;
    }
  }

}
