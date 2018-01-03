
import java.util.Scanner;
//
public class hw03_05 {
    //圈圈叉叉
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data[][]= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                data[i][j]=scn.nextInt();
            }
        }
        boolean b= false;
        for(int i=0;i<3;i++){
            if(data[0][i]==data[1][i] && data[0][i]==data[2][i]){
                b=true;
                break;
            }
            if(data[i][0]==data[i][1] && data[i][0]==data[i][2]){
                b=true;
                break;
            }
        }
        if(data[0][0]==data[1][1] && data[0][0]==data[2][2]){
            b=true;
        }
        if(data[0][2]==data[1][1] && data[0][2]==data[2][0]){
            b=true;
        }
        if(b){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}