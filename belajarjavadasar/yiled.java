/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjavadasar;

/**
 *
 * @author RM
 */
public class yiled {
    public static void main(String[] args) {
          String nilai = "E";
        String ucapan = switch (nilai) {
            case "A" :
                yield  "Waw, perpect";
            case "B", "C":
                yield"Anda Lulus";
            case "D" :
                yield  "Anda Tidak Lulus";
            default :
                yield "Anda salah pilih Jurusan";
        };
        System.out.println(ucapan);
    }
    
}
