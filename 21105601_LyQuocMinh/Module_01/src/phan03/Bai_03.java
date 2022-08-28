package phan03;

import java.util.Scanner;

/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình in ra tổng 1+3+5+…+n nếu n là số lẻ, 2+4+6+…+n nếu n là số chẵn.
 */
public class Bai_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = sc.nextInt();
		System.out.println("Tong = "+ tinhTong(n));
	}
	static int tinhTong (int n) {
		int sum=0;
		if(n%2==0) {
			for(int i=2;i<=n;i+=2) {
				sum+=i;
			}
		}
		else {
			for(int i=1; i<=n; i+=2) {
				sum+=i;
			}
		}
		return sum;
	}
}

