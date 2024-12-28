import java.util.*;
public class eg5 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Colour of the traffic Signal(red,yellow,green)");
       String colour = input.nextLine();
    
       if(colour.equals("red")){
        System.out.println("Stop");
       }else if(colour.equals("yellow")){
        System.out.println("Get ready");
       }else if (colour.equals("green")){
        System.out.println("Go");
       }else{
        System.out.println("Enter valid colour");
       }
   
        input.close();
}

}
