public class s {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 ="abc";
        String s3 = new String("efg");
        String s4 = new String("efg");

        System.out.println(s1 == s2);
        /*this is happening because of the normal way the JVM checks whether the new string created is 
        *already existing or not .but in the new string() method it stores as an individual values
        so the ouput is false*/
        System.out.println(s3 == s4);


    }

}
