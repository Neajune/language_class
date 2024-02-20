import java.util.Scanner;

public class D16_0220_line_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] ST = new String[num+1];
        for (int i=1;i<=num;i++){
            ST[i] = i+". "+sc.next(); 
        }
        for (String s: ST){
            System.out.println(s);
        }
           
    }
}
