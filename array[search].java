import java.util.Arrays;
public class s {
    public static void main(String[] args) {
        char vowels[] = {'e','u','a','o','i'};
        Arrays.sort(vowels);
        // char key = 'a';
        int found = Arrays.binarySearch(vowels,'a');
        System.out.println(Arrays.toString(vowels));  
        System.out.println(found);         
}

}
