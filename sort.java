import java.util.Scanner;
class sort{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String names[]=new String[10];
        System.out.println("Enter 10 student names:");
        for(int i=0;i<names.length;i++)
        {
        System.out.print("Name"+(i+1)+":");
        names[i]=input.nextLine();
        }
        for (int i=0;i<names.length-1;i++)
        {
        for(int j=0;j<names.length-1-i;j++)
        {
        if(names[j].compareTo(names[j+1])>0)
        {
        String temp=names[j];
        names[j]=names[j+1];
        names[j+1]=temp;
        }
        }
        }
        System.out.println("Student names in alphabetical order:");
        for(int i=0;i<names.length;i++)
        {
        System.out.println(names[i]);
                // input.close();
            }
    }
        }
