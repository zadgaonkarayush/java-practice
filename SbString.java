import java.util.Scanner;
public class SbString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.print("Enter email : ");
        name = scanner.nextLine();

        if(name.contains("@")){
             int index = name.indexOf("@");

        String domain = name.substring(index+1);
        String username = name.substring(0,index);

        System.out.print("The Username is "+ username+ "  and domain is  "+ domain );
        }else{
            System.out.println("Invalid email. Email not contains @!");
        }
       
    }
}
