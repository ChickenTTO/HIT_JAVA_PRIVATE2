
package KiemTra;

import java.util.Scanner;


public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }


        long[] aaa = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            aaa[i] = aaa[i - 1] + arr[i];
        }


        int q = sc.nextInt();
        StringBuilder bbb = new StringBuilder();


        for (int i = 0; i < q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            long sum = aaa[R] - aaa[L - 1];
            bbb.append(sum).append(" ");
        }


        System.out.print(bbb.toString());
    }
}

