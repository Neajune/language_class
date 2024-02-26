import java.util.Scanner;

public class MancheHanGansu_0226 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<sc.nextInt();i++){
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int l=2;l<=num;l++){
                for (int j=1;j<=num/l;j++){
                    arr[l*j-1] += 1;
                }
                
            }
            for (int s:arr){
                if (s%2==0){
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
