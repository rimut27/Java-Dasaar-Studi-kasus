/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjavadasar;

/**
 *
 * @author RM
 */
public class switchexprresion {

    public static void main(String[] args) {
        String nilai = "D", ucapan;
        
        switch (nilai) {
            case "A" -> ucapan = "Waw, perpect";
            case "B", "C" -> ucapan ="Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan ="Anda salah pilih Jurusan";
        }
        System.out.println(ucapan );
    }

}
