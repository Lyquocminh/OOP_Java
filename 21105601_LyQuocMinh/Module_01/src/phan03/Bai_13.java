package phan03;
/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình in ra tổng của 10 số chẵn đầu tiên
 */
public class Bai_13 {
    public static void main(String[] args) {
        System.out.printf("\nTong cua 10 so chan dau tien la: %d", sumEvenNumbers(10));
    }
    
    public static int isEvenNumber (int n) {
        if (n % 2 == 0)
            return 1;
        else
            return 0;
    }
    
    public static int sumEvenNumbers (int n) {
        int sum = 0;
        
        for (int i=0; i<=n; i++)
            if (isEvenNumber(i)==1)
                sum += i;
        
        return sum;
    }
}