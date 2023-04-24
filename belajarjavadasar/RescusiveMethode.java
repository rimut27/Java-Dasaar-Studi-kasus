package belajarjavadasar;

public class RescusiveMethode {
    
    static int faktor(int value){
        var result =1 ; 
        for (int i= 1 ; i < value;i++ ){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(faktor(10));
        System.out.println(faktorcuerive(10));
    }
    static int faktorcuerive(int a){
          if (a ==1){
              return 1;
          }else{
              return a * faktorcuerive(a  - 1);
          }
    }
}
