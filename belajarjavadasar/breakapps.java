package belajarjavadasar;

/**
 *
 * @author RM
 */
public class breakapps {
    public static void main(String[] args) {
        int counter = 1;
        
        while(true){
            System.out.println("perulangan ke-"+counter);
            counter++;
            
            if(counter==10){
                break;
            }
            
        }
        
    }
    
}
