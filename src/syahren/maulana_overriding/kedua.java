/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syahren.maulana_overriding;

import java.util.Scanner;

/**
 *
 * @author Syahren Maulana
 */
public class kedua {
    int panjang, lebar, luas, keliling;
    public void Evos(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Panjang :");
        panjang = input.nextInt();
        System.out.println("Lebar :");
        lebar = input.nextInt();
        luas = panjang * lebar;
    }
    public void RRQ(){
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("Luas :"+luas);
    }
}
