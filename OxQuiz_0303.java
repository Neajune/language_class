import java.util.Scanner;

public class OxQuiz_0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i=0;i<T;i++){
            String st = sc.next();
            int answer = 0;
            int plus = 0;
            for (int l=0;l<st.length();l++){
                if (st.substring(l,l+1).equals("O")){
                    plus++;
                }else{
                    plus = 0;
                }
                answer += plus;
            }
            arr[i] = answer;
        }
        for (int ar:arr){
            System.out.println(ar);
        }
    }
}
