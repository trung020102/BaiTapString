package baiTapChuoi;

import java.util.Scanner;

public class bai5 {
		
		static final int SIZE = 26;

		static void printCharWithFreq(String str)
{
			int n = str.length();

			int[] freq = new int[SIZE];

			for (int i = 0; i < n; i++)
				freq[str.charAt(i) - 'a']++;

			for (int i = 0; i < n; i++) {

				if (freq[str.charAt(i) - 'a'] != 0) {

					System.out.print(str.charAt(i));
					System.out.print(freq[str.charAt(i) - 'a'] + " ");

					freq[str.charAt(i) - 'a'] = 0;
				}
			}
		}
public static void main(String args[])
{
	  System.out.print("Nhap chuoi: ");
	  Scanner scanner = new Scanner(System.in);
	  String str = scanner.nextLine();
			printCharWithFreq(str);
}

}
	
