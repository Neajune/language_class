//내생각
    // 1. (num-1)%8=0
    // 2. 
    // 3. (num-3)%4==0
    // 4. 
    // 5. (num-5)%8==0
//답
    // 1. num % 8 ==1
    // 2. num % 8==2||num%8==0
    // 3. num % 8==3||num%8==7
    // 4. num % 8==4||num%8==6
    // 5. num % 8==5
//알게된점: 수식을 대입할떄 */를 최대한 시도해본후에야 +-를 시도해야 시행착오가 적다.
import java.util.Scanner;

class D20_0216_MathIsPE{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 8 ==1){
            System.out.println(1);
        }else if (num % 8==2||num%8==0){
            System.out.println(2);
        }else if (num % 8==3||num%8==7){
            System.out.println(3);
        }else if (num % 8==4||num%8==6){
            System.out.println(4);
        }else if (num % 8==5){
            System.out.println(5);
        }
    }
}