package belajarjavadasar;

public class methodargument {
    static void say(String nama , int... nilai){
        int total =0;
        for(var value : nilai){
            total += value;
        }
        int finalniali = total/nilai.length;
        
        if(finalniali >=70 ){
            System.out.println("Selamat anda"+nama+" lulus, dengan nilai "+finalniali);
        }
        else {
            System.out.println("Silahkan coba lagi");
        }
    }
    public static void main(String[] args) {
        say("Riyadi Nuttaqin", 91,80,81);
    }
}
