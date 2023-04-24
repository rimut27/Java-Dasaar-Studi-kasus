/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjavadasar;

/**
 *
 * @author RM
 */
public class Arrayttipedata {
    public static void main(String[] args) {
        String[] array;
        array = new String[3];
        array[0]= "Eko";
        array[1]= "Kurniawan";
        array[2]= "Khannedy";
        
        
        int[] arrayint = new int[]{
            1,2,3
        };
        long[] arraylong ={
            10,20,30,40
        };
        arraylong[0]= 100;
                
         System.out.println(arraylong[0]);
         System.out.println(arraylong[1]);
         System.out.println(arraylong.length);
    }
}
