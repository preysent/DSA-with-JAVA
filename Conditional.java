  
  import java.util.*;

public class Conditional{
    public static void main(String args[]){

        if(5>6){
            System.out.println("6 is greater");
        }
        else if(4==4){
            System.out.println("both are equal");
        }
        else
           System.out.println("6 is not greater");


    
    // Incomtex_calculator
 
    Scanner sc= new Scanner(System.in);
    
      int income=sc.nextInt();

    if(income<500000){
        System.out.println("tex : 0%");
    }
      
    else if(income>500000 && income<1000000){
        System.out.println("tex : 20%");
    }

    else{
        System.out.println("tex : 30%");
    }




    // calculator

  
    System.out.println("calculator \n enter two number's:");
    int a=sc.nextInt(); 
    int b=sc.nextInt();
    




        
    } 
}