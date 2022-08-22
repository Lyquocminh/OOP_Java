/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lan Anh
 * BAI 9: Viet ham tach chuoi goc thanh chuoi con (dung StringTokenizer)
 */

package phan03;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai09a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
                
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        StringTokenizer kq = new StringTokenizer(str, " ");
        
        while (kq.hasMoreTokens())
            System.out.println(kq.nextToken());
    }
}
