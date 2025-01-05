import java.util.*;
public class fn1{
  
  void soap(int money){
    
    System.out.printf("soap purchased price is %d",money);
 }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mobile getSoap = new mobile();
        System.out.println("Enter the price of the soap:");
        int num = input.nextInt();
        getSoap.soap(num);
    }
}
