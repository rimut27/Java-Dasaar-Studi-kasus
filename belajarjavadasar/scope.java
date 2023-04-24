package belajarjavadasar;

public class scope {
    public static void main(String[] args) {
    }
    static void say(String nama) {
        String hello = "Hallo"+nama;
        if(nama.isBlank()){
            String hi = "hi";
            System.out.println(hi);
        }
        // error
/*
ini merupakan scope 
variable
pada bahasa 
java
*/
System.out.println(hello);

    }
    
    
}
