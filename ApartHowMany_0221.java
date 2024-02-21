import java.util.Scanner;

class ApartHowMany_0221{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(apart(num1, num2));
        }
        
        
    }
    public static int apart(int num1, int num2){
        int[][] arr2= new int[num1][num2];
        if (num2==1){
            return arr2[num1][num2-1];
        }else{
            for (int i=0;i<num2;i++){
                arr2[0][i] = i+1;
            }
            for (int l=0;l<=num1;l++){
                for (int j=1;j<=num2;j++){
                    arr2[l+1][j] = arr2[l][j]+arr2[l+1][j-1];
                }
            }
            return arr2[num1][num2-1];
            
        }
    }
}