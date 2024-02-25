import java.util.Scanner;

public class CookTime_0225 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {300,60,10};
        int[] print = new int[3];
        int Ts = sc.nextInt();
        for (int num=0;num<arr.length;num++){
            
            print[num] = Ts/arr[num];
            Ts -= Ts/arr[num];
            
        }
        if (Ts!=0) {
            System.out.println(-1);
        }else{
            for (int o:print){
                System.out.print(o);
                System.out.print(" ");
            }
        }
    }
}
