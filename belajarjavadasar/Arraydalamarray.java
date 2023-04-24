/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjavadasar;

/**
 *
 * @author RM
 */
public class Arraydalamarray {
    public static void main(String[] args) {
        String[][] member = {
            {"Eko","Kurniawan","Khannedy"},
            {"Budi","Nugraha"},
            {"Joko","MOro"},
        };
        String[] member1 = member[0];
        System.out.println(member1[0]);
        
        System.out.println(member[1][1]);
        System.out.println(member[2][1]);

    }
   
}
