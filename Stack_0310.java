import java.util.Scanner;
import java.util.Stack;

public class Stack_0310 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        for (int i=0;i<K;i++){
            int N = sc.nextInt();
            if (N==0){
                st.pop();
            }else{
                st.add(N);
            }
        }
        for (int o:st){
            answer += o;
        }
        System.out.println(answer);
    }
}
