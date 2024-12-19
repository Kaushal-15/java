public class variable_swap {
    public static void main(String[] args) {
        String X ="Water";
        String Y ="Strawberry essence";
        String temp;
        temp=X;
        X=Y;
        Y=temp;

        System.out.println(X);
        System.out.println(Y);
    }
}
