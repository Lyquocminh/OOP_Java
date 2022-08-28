package phan03;
/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình in ra những số lẻ từ 1 đến 99
 */
public class Bai_12 {
    public static void main(String[] args) {
        System.out.println("Nhung so le tu 1 den 99 la: ");
        
        for (int i=0; i<100; i++)
                if (isOddNumber(i)==1)
                    System.out.printf("\t%d", i);
    }
        
    public static int isOddNumber (int n) {
        if (n % 2 != 0)
            return 1;
        else
            return 0;
    }
}