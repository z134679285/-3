//equals是相等跟==類似
import java.util.Scanner;
public class hw03_04 {
    //迴文
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();
        String str2="";
        for(int i=0;i<str.length();i++){
            str2=str.charAt(i)+str2;
        }if(str.equals(str2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}