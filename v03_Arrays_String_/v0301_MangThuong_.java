package v03_Arrays_String_;

import java.util.Scanner;

public class v0301_MangThuong_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]= sc.nextInt();

        for (int i : arr) {
            System.out.println(i);
        }

        sc.close();
    }
}
