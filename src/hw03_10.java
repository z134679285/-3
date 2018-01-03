
import java.util.Scanner;
public class hw03_10 {
    //輾轉相除法
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println(fun(a,b));
}
 public  static int fun(int a,int b){
        if(b==0) {
            return a;
        }else {
            return fun(b,a%b);
        }
    }
}