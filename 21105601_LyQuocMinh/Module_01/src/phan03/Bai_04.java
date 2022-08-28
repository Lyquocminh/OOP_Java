package phan03;

import java.util.Scanner;
/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình giải phương trình bậc 1
 */
public class Bai_04 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        try {
            double a, b;   
            System.out.println("Nhap a: ");
            a = scanner.nextDouble();
            System.out.println("Nhap b: ");
            b = scanner.nextDouble();     
            System.out.println("Phuong trinh vua nhap la: " + a + "x + " + b + " = 0");
            System.out.printf("\nPhuong trinh co nghiem la: %.2f", giaiPTBacNhat(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }
    static double giaiPTBacNhat (double a, double b) throws java.lang.Exception {
        double nghiem = 0;
        
        if (a == 0) {
            if (b == 0) {
                throw new Exception ("Phuong trinh co vo so nghiem");
            } else {
                throw new Exception ("Phuong trinh vo nghiem");
            }
        } else {
            nghiem = -b / a;
        }
        return nghiem;
    }
}

