package zeonghun;

import java.util.Scanner;

/**
 * @brief Swap메소드를 호출하는 Main클래스
 * 
 * @author jhkim
 * @date 230310
 */
public class Main {
    public static void main(String[] args) {
        Swap swap = new Swap(); // 객체 생성
        Scanner sc = new Scanner(System.in);
        try { // 예외 발생시 catch 블록 실행
            System.out.print("첫번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // // 키보드로 입력한 문자를 받아옴
            System.out.print("두번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            swap.swap(num1, num2); // swap 메소드로 num1, num2 전달
        } catch (Exception e) {
            System.out.println("숫자만 입력하세요");
        }
        sc.close();
    }
}