// num1 + num2 = Plus
// num1 - num2 = Minus
// Plus + Minsu = 2(num1)
//1.5/1= 1, (0.5)(나머지)

import java.util.Scanner;

public class D19_0217_PlusMinus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Plus = sc.nextInt();
        int Minus = sc.nextInt();
        int num1 = (Plus+Minus)/2;
        if (num1%1==0){
            System.out.print(num1);
            System.out.print(" ");
            System.out.print(Plus - num1);
        }else{
            System.out.println(-1);
        }
        
    }
}
