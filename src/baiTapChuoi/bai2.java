package baiTapChuoi;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhập chuỗi kí tự: ");
	String input = scanner.nextLine();
	// Tách chuỗi lấy kí tự đầu tiên
	String first = input.substring(0, 1);
	// Tách lấy các kí tự còn lại
	String restString = input.substring(1, input.length());
	// Hàm upper dể in hoa chữ
	String inputUpper = first.toUpperCase();
	// ghép chuỗi
	input = inputUpper + restString;
	// in ra chuỗi kí tự
	System.out.print("Chuỗi ký tự sau thay đổi: " + input);
	}

}
