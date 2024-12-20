public class type_conversion {

    public static void main(String[] args) {
        //Implicit is happening below the conversion of smaller datatype to  larger one
        int number1 =5;
        double number2 =number1;
        System.out.println(number2);

        //explicit is conversion larger datatype to smaller one here we have specify the datatype to the compiler
        double number3 = 5.8;
        int number4 = (int)number3; //the datatype specification is done here(int).
        System.out.println(number4);

        //in java during explicit there would be some data loss .as we can see that there are 8 parts loss in the above conversion.
        
        
    }
}
