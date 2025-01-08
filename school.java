import java.util.*;
public class school{
  
  String passorfail(int result){
    if(result>35){
      return "Pass";
    }else{
      return "Fail";
    }
  }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Mark:");
        int n1 = input.nextInt();
        school find = new school();
        String Result = find.passorfail(n1);
        System.out.println(Result);
    }
}
