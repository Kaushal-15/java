
public class overload{
  
  void dispaly(){
    System.out.println("one");
  }
    void dispaly(int a){
    System.out.println("Two");
  }
    public static void main(String[] args) {
        overload find = new overload();
        find.dispaly();
    }
}
