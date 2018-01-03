
import java.util.Scanner;
//rint是取四捨五入
//Math.pow是平方
public class hw03_02 {
    //四捨五入取小數點n位
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a=scn.nextDouble();
        int n=scn.nextInt();
        System.out.println(Math.rint(a*Math.pow(10f,n))/Math.pow(10f,n));
    }
}