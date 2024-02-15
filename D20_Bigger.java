//1. 계속 반복
//2. 0 0을 만나면 종료

import java.util.Scanner;

class D20_Bigger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            long num1 = sc.nextInt();
            long num2 = sc.nextInt();
            if (num1==0){
                if (num2==0){
                    break;
                }
            }else if(num1 > num2){
                System.out.println("Yes");
            }else if (num1 < num2){
                System.out.println("No");
            }
        }
    }
}