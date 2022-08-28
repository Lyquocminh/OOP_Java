package phan03;

import java.util.Scanner;
/**
 * 
 * @author Lý Quốc Minh
 * Viết chương trình cho nhập vào 1 mảng và kiểm tra xem có giá trị k nào đó hay không
 */
public class Bai_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int max = 100;
        int n, k;        
        int a[] = new int[max];
        
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        
        System.out.println("Nhap mang: ");
        for (int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        
        System.out.println("Mang vua nhap la: ");
        for (int i=0; i<n; i++) {
            System.out.printf("\na[%d] = %d", i, a[i]);
        }
        
        System.out.println();
        System.out.println("Nhap vao gia tri muon tim: ");
        k = scanner.nextInt();
        
        System.out.printf("\nGia tri muon tim nam o vi tri: %d", search(a, n, k));
    }
        
    public static int search (int[] a, int n, int k) {
        for (int i=0; i<n; i++)
           if (a[i] == k)
                return i;
        return -1;
    }
}