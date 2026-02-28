package tcs.string;
import java.util.Scanner;
public class Kingdecrypt2{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);

int n = sc.nextInt();
int [] arr = new int[n];

for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}
sc.nextLine();

char key = sc.nextLine().trim().charAt(0);
int keyVal = key-'A'+1;
StringBuilder result = new StringBuilder();

for(int i=0;i<arr.length;i++){
    int value = arr[i]-keyVal;

    char ch = (char)(value+'A'-1);
    result.append(ch);
}
System.out.print(result.toString());
}
}