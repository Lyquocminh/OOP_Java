package phan03;
import java.util.Scanner;
/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ bàn phím
 */
public class Bai_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        
        System.out.printf("\nSo luong ky tu la so co trong chuoi s la: %d", demKyTuSo(str));
    }
        
    public static int demKyTuSo (String str) {
        int dem = 0;
        
        for (int i=0; i<str.length(); i++)
            if (Character.isDigit(str.charAt(i)))
                dem++;       
        return dem;
    }
}