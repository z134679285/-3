import java.util.Scanner;

public class hw03_06 {
//撲克牌
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        for (int i=0 ; i<n ; i++){
            String str = scn.nextLine();
            String[] data = str.split(" ");
            int leng = data.length;
            int vals[] = new int[leng];
            for (int j=0 ; j<leng ; j++){
                if (data[j].charAt(0) == 'C'){
                    vals[j] = 0;
                }
                else if (data[j].charAt(0) == 'D'){
                    vals[j] = 13;
                }
                else if (data[j].charAt(0) == 'H'){
                    vals[j] = 26;
                }
                else if (data[j].charAt(0) == 'S'){
                    vals[j] = 39;
                }
                vals[j] = vals[j] + Integer.parseInt(data[j].substring(1));
            }
            for (int j=0 ; j<leng ; j++){
                for (int k=j+1 ; k<leng ; k++) {
                    if (vals[j] < vals[k]) {
                        int all = vals[j];
                        vals[j] = vals[k];
                        vals[k] = all;
                        String allstr = data[j];
                        data[j] = data[k];
                        data[k] = allstr;
                    }
                }
                System.out.print(data[j] + "\t");
            }
            System.out.println();
        }
    }
}