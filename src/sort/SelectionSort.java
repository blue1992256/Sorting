/*
  선택 정렬(Selection sort)
  참조 : https://st-lab.tistory.com/168
  설명 : 1. 주어진 리스트에서 최솟값을 찾는다.
        2. 최솟값을 맨 앞 자리의 값과 교환한다.
        3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
 */
package sort;

public class SelectionSort {

  public static void sort(Integer[] array) {
    for (int i = 0; i < array.length; i++) {

      int targetIdx = i;
      for (int k = i+1; k < array.length; k++) {
        if (array[k] < array[targetIdx]) {
          targetIdx = k;
        }
      }

      // 최솟값이 위치하는 인덱스의 배열값과 제일 앞 값과 교환
      int tmp = array[i];
      array[i] = array[targetIdx];
      array[targetIdx] = tmp;
    }
  }

}
