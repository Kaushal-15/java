public class class1{
    String Name = "";
    String proc ="";
    int Ram = 0;
    public static void main(String[] args) {
        laptop hp = new laptop();
        hp.Name="Legion";
        hp.proc = "i-9";
        hp.Ram = 32;
        laptop dell = new laptop();
         dell.Name="yoga";
        dell.proc = "i-9";
        
        System.out.println(hp.Name);
        System.out.println(dell.proc);
        System.out.println(dell.Ram);//here i did not declare any instance to the ram for dell though the default value will reflect
    }
}
