public class function1{
    //we can use static keyword to directly call our function wihtout using object instance
    //because it can only be static to static (or) non-staitc to non -static
    //traditional method is non-static to static
    static void iphone(){
    System.out.println("iphone");
   }
   static void samsung(){
    System.out.println("Samsung");
   }
    public static void main(String[] args) {
        samsung();
        iphone();
    }
}
