import java.util.*;
public class fn3{
  
  void logic(int num1,int num2){
    
    System.out.printf("The total is %d\n",num1+num2);
    System.out.printf("The difference is %d\n",num1-num2);
    System.out.printf("The Prodcut is %d\n",num1*num2);
    System.out.printf("The division is %d",num1/num2);
 }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        fn3 obj = new fn3();
        System.out.println("Enter the two numbers one by one:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        obj.logic(n1,n2);
    }
}
