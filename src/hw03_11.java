
import java.util.Scanner;
//
public class hw03_11 {
    //遞迴程式
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println(fun(a));
    }
    public static int fun(int b){
        if(b==0 || b==1){
            return b+1;
        }else  {
            return fun(b-1)+fun(b/2);
        }
    }
}