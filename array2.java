import java.util.*;
public class array2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] num = new int[5];
        for(int i=0;i<5;i++){
            num[i]=input.nextInt();
        }
        System.out.println("***************************");
        for(int j=0;j<5;j++){
             System.out.println(num[j]);
        }
       
       input.close();


}

}
