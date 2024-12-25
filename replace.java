
public class s {
    public static void main(String[] args) {
     String sentence = "The sky is blue";
     String updatedsentence = sentence.replace("blue","red");
     //The above line of code is used to replace the text in a string(string method)//
     System.out.println(updatedsentence);
     //if it is used in print method then it will only altered in the print statement,the actual string would not be changed
     System.out.println(sentence.replace("blue","red"));
    } 

}
