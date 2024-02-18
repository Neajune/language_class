//나
//  1. 횟수 입력
//  2. String[] 크기 지정
//  3. for문과 toLowerCase() 사용
//  4. for문 밖에서 배열 값 하나씩 print
//영상
//  1. 횟수 입력
//  2. for문 안에서 입력받음과 동시에 출력
import java.util.Scanner;

public class D18_0218_InTheRoom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] a = new String[sc.nextInt()];
        for (int i=0;i<a.length;i++) {
            a[i] = sc.next().toLowerCase();
        }
        for (String ob : a){
            System.out.println(ob);
        }
    }
}
