/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjavadasar;

/**
 *
 * @author RM
 */
public class contineapp {
    public static void main(String[] args) {
        for(var a = 1;a<=10;a++){
            if (a  % 2 ==1) {
                continue;
            }
            System.out.println("ini adalah bilangan genap "+a);
        }
    }
    
}
