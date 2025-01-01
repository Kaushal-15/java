public class garden{
    int apple_price =10;
    int apple_count =20;
  void farm(){
    
    System.out.println("The total apple in the garden is " +apple_count * apple_price);
 }
    public static void main(String[] args) {
        garden total = new garden();
        total.farm();
    }
}
