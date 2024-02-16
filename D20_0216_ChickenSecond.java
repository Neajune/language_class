//1. 두통장의 합 변수 생성
//2. 합 또는 치킨값을 뺀 합을 반환

import java.util.Scanner;

public class D20_0216_ChickenSecond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long chicken_price = sc.nextLong();
        long sum = A+B;
        if (sum > chicken_price){
            System.out.println(sum-chicken_price);
        }else if (sum < chicken_price){
            System.out.println(sum);
        }
    }
}
