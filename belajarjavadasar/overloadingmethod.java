package belajarjavadasar;
public class overloadingmethod {
static void say(){
    System.out.println("Haloo");
}    
static void say(String nama){
    System.out.println("Haloo " +nama);
}   
    public static void main(String[] args) {
        say();
        say("Riyadi");
        say("Riyadi");
    }
}
