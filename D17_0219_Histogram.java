import java.util.Scanner;

public class D17_0219_Histogram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        //print ====
        for (int i=0;i<times;i++){
            int how_num = sc.nextInt();
            for (int j=0;j<how_num;j++){
                System.out.print("=");
            }
            System.out.print("\n");
        }
        
    }
}
