import java.util.*;
public class eg7{
  
  void even_odd(int num){
    if(num%2 == 0){
      System.out.println("Even number");
    }else{
      System.out.println("Odd number");
    }
  
 }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n1 = input.nextInt();
        eg7 find = new eg7();
        find.even_odd(n1);
      
    }
}
