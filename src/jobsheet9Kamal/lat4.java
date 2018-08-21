/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobshee9;

import java.util.Scanner;


public class lat4 {
    public static void main(String [] args){
        Integer jarak, waktu, kecepatan;
        
        Scanner program = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        jarak= program.nextInt();
        System.out.print("Masukkan Waktu tempuh: ");
        waktu= program.nextInt();
        
        kecepatan = jarak / waktu;
        System.out.print("Kecepatan : "+kecepatan +"km/jam");
    }
}
