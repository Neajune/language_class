import java.util.Scanner;

class D17_0219_LucbiClub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String[] name = sc.nextLine().split(" ");
            //정지 조건
            if (name[0]=="#"||name[1]=="0" || name[2]=="0"){
                break;
            }//17살 이상 또는 몸무게 80은 성인
            else if (Integer.parseInt(name[1])>17&&Integer.parseInt(name[1])>=80){
                System.out.println(name[0]+" Senior");
            }//아니면 다 청소년
            else{
                System.out.println(name[0]+" junior");
            }
        }
    }
}