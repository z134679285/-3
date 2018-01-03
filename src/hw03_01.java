
import java.util.Arrays;
import java.util.Scanner;

public class hw03_01 {
    //輸入最大值最小值
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1[]= new int[3];
        for(int i=0;i<3;i++){
            v1[i]=scn.nextInt();
        }
        Arrays.sort(v1);
        System.out.println(v1[2]);
        System.out.println(v1[0]);
    }
}