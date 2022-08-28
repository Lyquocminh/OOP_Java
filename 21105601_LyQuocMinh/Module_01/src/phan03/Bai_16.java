package phan03;
import java.util.Scanner;
/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình cho nhập vào mảng các chuỗi, kiểm tra xem có chuỗi nào đó trong mảng không
 */
public class Bai_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s, str;
        
        System.out.println("Nhap vao str: ");
        str = scanner.nextLine();
        
        System.out.println("Nhap vao s: ");
        s = scanner.nextLine();
        
        System.out.println(str.contains(s));
    }
}