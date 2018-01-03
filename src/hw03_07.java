
import java.util.Scanner;
public class hw03_07 {
    //文字及字母出現次數
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count[] = new int[52];
        String str = scn.nextLine();
        String[] data = str.split(" ");
        int n = data.length;
        System.out.println(n);
        int leng = str.length();
        for (int i = 0; i < leng; i++) {
            int v1 = str.charAt(i) - 'a';
            if (v1 >= 0 && v1 < 26) {
                count[v1]++;
            } else {
                v1 = str.charAt(i) - 'A';
                if (v1 >= 0 && v1 < 26) {
                    count[26 + v1]++;
                }
            }
        }
        for (int i = 0; i < 52; i++) {
            if (count[i] > 0) {
                if (i < 26) {
                    System.out.println((char) (97 + i) + ":" + count[i]);
                } else {
                    System.out.println((char) (65 - 26 + i) + ":" + count[i]);
                }
            }
        }
    }
}