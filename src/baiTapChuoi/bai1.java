package baiTapChuoi;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scanner = new Scanner(System.in);
		        System.out.println("Nhập vào chuổi cần kiểm tra: ");
		       
				// nhập chuổi cần kiểm tra
		        String input = scanner.nextLine();
		        
		        // Hiển thị chuổi ban đầu
		        System.out.println("Chuỗi ban đầu: " + input);
		        input = input.replaceAll(" ", "");
		         
		        //hiển thị chuổi sau khi xóa 
		        System.out.println("---------------------------");
		        System.out.println("Chuỗi sau khi xóa khoản trắng: " + input);
		        
	}

}
