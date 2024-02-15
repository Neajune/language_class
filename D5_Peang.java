//1. 5번 반복
//2. num 입력받음
//3. sum/5

import java.util.Scanner;

class D5_Peang{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i =0;i<5;i++){
            int num = sc.nextInt();
            if (num < 40){
                sum += 40;
            }else{
                sum += num;
            }
        }
        System.out.println(sum/5);
    }
}