// 1. 원 둘레 길이 2파이r
// 2. 가로 길이*2
// 3. 1+2 반환
import java.util.Scanner;

class D19_0217_OneTurn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long d1 = sc.nextLong();
        long d2 = sc.nextLong();
        System.out.println(d1*2+d2*2*3.141592);
    }
}