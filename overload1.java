
public class overload1{
  
  void Sum(int a,int b){
    System.out.println(a+b);
  }
    void Sum(int a,int b,int c){
    System.out.println(a+b+c);
  }
    public static void main(String[] args) {
        overload1 find = new overload1();
        find.Sum(10,10);
        find.Sum(10,20,30);
    }
}
