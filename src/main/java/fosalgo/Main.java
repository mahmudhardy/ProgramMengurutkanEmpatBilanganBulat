package fosalgo;

import java.util.Scanner;

/**
 *
 * @author Sugiarto Cokrowibowo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        
        //TULISKAN KODEMU DIBAWAH INI

        int[] angka = {x1, x2, x3, x4};
        int n = angka.length;
        int temp = 0;
        for (int i=0; i < n; i++) {
            for (int j=i + 1; j < 4; j++) {
                if (angka[j-1] < angka[j]) {
                    temp = angka[i];
                    angka[i] = angka[j];
                    angka[j] = temp;
                }
            }
        }
        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            System.out.print(angka[i] + "\n");
        }
    } 
}
