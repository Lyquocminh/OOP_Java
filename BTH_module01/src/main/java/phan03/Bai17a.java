/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 17: Viet chuong trinh nhap vao m va n, xuat ra cac hinh sau (dung cau truc lap)
 */

package phan03;
import java.util.Scanner;

public class Bai17a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        
        for (int i=1; i<=n; i++)
            for (int j=1; j<=i; j++)
                System.out.printf("*");
        System.out.printf("\n");
        
        for (int i=0; i<=n; i++)
            for (int j=n; j>=i; j--)
                System.out.printf("*");
        System.out.printf("\n");
    }
}
