package baiTapChuoi;

import java.util.Scanner;

public class bai3 {

	public static void nhapMang(char[] arr, int n) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập mãng:");
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập phần thử thứ: " + (i + 1) + " ");
			arr[i] = scan.next().charAt(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mãng");
		int n = scan.nextInt();
		char[] arr = new char[n];
		
		nhapMang(arr, n);
		String string = new String(arr);
		System.out.println("Mãng sau khi thay đổi " + string);
	}
}
