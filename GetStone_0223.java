import java.util.Scanner;

class GetStone_0223 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        GetStone_0223 im = new GetStone_0223();
        System.out.println(im.getstone(N));
    }
    public String getstone(int N){
        if (N % 2 == 0){
            return "SY";
        }else{
            return "CK";
        }
    }
}
