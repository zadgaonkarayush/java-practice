package tcs.Last7Days;

import java.util.Scanner;

public class agegrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String allGrade ="";
        int avaerage=0;
        int asciiSum=0;
        int femaleCnt=0;

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          String grade = sc.nextLine();
          int age =sc.nextInt();
          sc.nextLine();
           String GenderValue = sc.nextLine();
         String gender =sc.nextLine();



         if(age>20){
            allGrade+=grade + " ";
         }
         if(gender.equalsIgnoreCase("Female")){
           for(int j=0;j<GenderValue.length();j++){
            asciiSum += (int)GenderValue.charAt(j);
           }
           femaleCnt++;
         }
        }
              
System.out.println("Grades of students with age > 20: " + allGrade);

        if(femaleCnt > 0){
            double average = (double)asciiSum / femaleCnt;
            System.out.println("Average ASCII value of GenderValue for females: " + average);
        }
    } 
}
