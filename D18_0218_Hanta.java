//나
//  1. charAt(0), charAt(2), charAt(4) 씀
//  2. Inger.parseInt(String.valueOf(char)) 사용
//영상
//  1. sc.nextLine().split("/"); 
//  2. kda[0], kda[1], kda[2]
//  3. and 조건을 ||로 표현함 

import java.util.Scanner;

public class D18_0218_Hanta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String kDA = sc.nextLine();
        int K = Integer.parseInt(String.valueOf(kDA.charAt(0)));
        int D = Integer.parseInt(String.valueOf(kDA.charAt(2)));
        int A = Integer.parseInt(String.valueOf(kDA.charAt(4)));
        if ((K+A)<D){
            System.out.println("hasu");
        }else if (D==0){
            System.out.println("hasu");
        }else{
            System.out.println("gosu");
        }
    }
}
