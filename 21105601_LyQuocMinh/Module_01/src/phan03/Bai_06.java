package phan03;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình kiểm tra số nhập vào có phải là số nguyên tố hay không
 */
public class Bai_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int n;
            System.out.println("Nhap n: ");
            n = scanner.nextInt();

            if (kiemTraSNT(n) == true)
                System.out.printf("\n%d la so nguyen to", n);
            else
                System.out.printf("\n%d khong phai la so nguyen to", n);
        } catch (InputMismatchException e) {
            System.out.println("Nhap vao so nguyen");
        }
    }
    
    static boolean kiemTraSNT (int n) {
        if (n < 2)
            return false;
        int canBacHai = (int) Math.sqrt(n);
        for (int i=2; i<= canBacHai; i++)
            if (n%i==0)
                return false;
        return true;
    }
}
