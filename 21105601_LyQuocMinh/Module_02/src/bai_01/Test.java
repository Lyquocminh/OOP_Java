package bai_01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ToaDo a = new ToaDo("Ten",(float) 3.4, (float) 5.5);
		System.out.println("Nhap vao ten: ");
		String c = sc.nextLine();
		a.setTen(c);
	}

}
