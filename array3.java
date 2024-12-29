import java.util.*;
public class array3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the size of te array:");
       int size = input.nextInt();
       int[] mark = new int[size];
       for (int j=0;j<size;j++){
        System.out.println("Enter the element of the array"+j);
        mark[j]=input.nextInt();
       }


}

}
