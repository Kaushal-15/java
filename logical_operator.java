public class logical_operator {

    public static void main(String[] args) {
        int age = 25;
// and logical operator is true only when both the operands are true
        System.out.println(age >= 18 && age <= 40);
    
//OR logical operator is true if any one of the operand is true and false in only when both the operands are false
//here i have cahnged the logic to the age is greater than 40 so it is false but the first condition is true so the ouyput will be true
        System.out.println(age >= 18 || age >= 40);

//not operator is also knowwn as inverter because it iverts the output to true to false or false to true and it is used only in single operands
        boolean isboolean = true;
        System.out.println(!isboolean);
    }
}
