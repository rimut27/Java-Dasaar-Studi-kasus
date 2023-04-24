/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjavadasar;

/**
 *
 * @author RM
 */
public class ifstatement {
    public static void main(String[] args) {
        int absen = 70;
        int nilai = 70;
        
        if(absen >= 90 && nilai >= 90){
            System.out.println("nilai anda A");
        }else if (absen >= 80 && nilai >= 80){
            System.out.println("nilai anda B");
        }else if (absen >= 70 && nilai >= 70){
            System.out.println("nilai anda C");
        }else if (absen >= 60 && nilai >= 60){
            System.out.println("nilai anda D");
        }else {
            System.out.println("Anda tidak lulus");
        }
    }
    
}
