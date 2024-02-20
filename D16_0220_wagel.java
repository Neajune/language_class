import java.util.Scanner;
import java.math.*;

public class D16_0220_wagel {
    public static void main(String[] args){
        //입력
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        int H = sc.nextInt();
        //최솟값 계산
        int KH = Integer.min(K, H);
        int num = Integer.min(KH,S);
        // 만약에. 출력
        if (S+K+H>=100){
            System.out.println("OK");
        }else if (num==S){
            System.out.println("Soongsil");
        }else if(num==K){
            System.out.println("Korea");
        }else if(num==H){
            System.out.println("Hanyang");
        }
    }
}
