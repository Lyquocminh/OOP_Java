package phan03;
import java.util.Scanner;
/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi.
 */
public class Bai_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        
        System.out.printf("\nSo lan xuat hien cua ky tu 'a' trong chuoi la: %d", demKyTu(str, 'a'));
    }        
    public static int demKyTu (String str, char c) {
        int count = 0;
        for (int i=0; i<str.length(); i++)
            if (str.charAt(i)==c)
                count++;
        return count;
    }
}