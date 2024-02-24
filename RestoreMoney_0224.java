import java.util.Scanner;

class RestoreMoney_0224 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = {25,10,5,1};
        for (int i=0;i<T;i++){
            int num = sc.nextInt();
            for (int No : arr){
                System.out.print(num/No);
                System.out.print(" ");
                num = num%No;
            }
        }

    }
}
