package phan03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        try {
            int a, b;
            System.out.println("Nhap a: ");
            a = scanner.nextInt();
            System.out.println("Nhap b: ");
            b = scanner.nextInt();
            System.out.printf("\nUCLN cua %d va %d la: %d", a, b, timUCLN(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Nhap vao so nguyen");
        }
    }
    static int timUCLN (int a, int b) {
    	if (b == 0) return a;
        if (a % b == 0) return b;
        return timUCLN(b, a%b);
    }
}