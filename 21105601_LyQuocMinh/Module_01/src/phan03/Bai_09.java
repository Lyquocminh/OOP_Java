package phan03;
import java.util.Scanner;
/**
 * 
 * @author Lý Quốc Minh
 * Viết hàm tách chuỗi gốc thành chuỗi con.
 */
public class Bai_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
                
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        
        System.out.println("Ket qua sau khi tach chuoi la: ");
        String[] kq = str.split("\\s");
        for (String kyTu: kq)
            System.out.println(kyTu);  
    }
}