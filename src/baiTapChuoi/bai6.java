
package baiTapChuoi;

import java.lang.*;
import java.io.*;
import java.util.*;
public class bai6 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Nhap chuoi : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.print("Nhap 1 tu : ");
        String k = scanner.nextLine();
        int dem=0;
            if(str.contains(k)) {
                dem+=1;
            }
        System.out.println("counter=" + dem);
    }

}