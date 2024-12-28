public class for3 {
    public static void main(String[] args) {
        int even_count = 0;
        int odd_count = 0;
       for (int i = 0; i <10; i++) {
            if(i%2==0){
                even_count=even_count+1;
            }else{
                odd_count=odd_count+1;
                
            }

       }
        System.out.println(even_count);
        System.out.println(odd_count);
    }
}
