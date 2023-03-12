package zeonghun;

/**
 * @brief Main에서 입력한 두개의 숫자를 교환하는 Swap메소드
 * 
 * @param index1 바꿀 숫자1
 * @param index2 바꿀 숫자2
 * 
 * @author jhkim
 * @date 230310
 */
public class Swap {
    public void swap(int index1, int index2) { // 
        int[] arr = { index1, index2 };
        
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

        System.out.println("첫번째 숫자: "+arr[0]);
        System.out.println("첫번째 숫자: "+arr[1]);
    }
}