package phan03;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình nhập vào số nguyên n và thực hiện: Xuất ra màn hình n số đầu tiên của chuỗi
Fibonaci (có hai giá trị đầu là 1 và 1).
 */
public class Bai_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int n;
            System.out.println("Nhap n: ");
            n = scanner.nextInt();

            System.out.printf("\n%d so dau dau tien cua chuoi Fibonacci la: ", n);
            for (int i=0; i<n; i++)
                System.out.printf("\t%d", Fibonacci(i));
        } catch (InputMismatchException e) {
            System.out.println("Nhap vao so nguyen");
        }
    }
        
    public static int Fibonacci (int n) {
        if (n < 0)
            return -1;
        else if (n == 0 || n == 1)
            return 1;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }
}