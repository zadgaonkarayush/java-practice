import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("What is your Name:");

        // String name = scanner.nextLine();

        // System.out.println("What is Your age:");

        // int age = scanner.nextInt();

        // System.out.println("What is Your gpa:");
        // double gpa = scanner.nextDouble();

        // System.out.println("User name is " + name);

        // System.out.println("User age is " + age);
        // System.out.println("User gpa is " + gpa);

        // Car car1 = new Car();
        // System.out.println(car1.name);
        // System.out.println(car1.isRunning);
        // car1.start();
        // System.out.println(car1.isRunning);
        // car1.stop();
        // System.out.println(car1.isRunning);

        // scanner.close();

        // contructor is special method to initialize a object . You can pass arguments
        // to a constructor,
        // and set up inital value
        // Student student1 = new Student("ayush",24);
        // Student student3 = new Student("raj",67);
        // System.out.println(student1.name);
        // System.out.println(student3.name);
        // student1.study();

        // Cat cat = new Cat();
        // Dog dog = new Dog();

        // dog.start();
        // cat.start();

        // Circle circle = new Circle(5);
        // Rectangle rect = new Rectangle();

        // circle.display();
        // rect.display();
        // System.out.println(circle.area());

        // String a ="Ayush";
        // String b ="Ayush";

        // System.out.println(a == b);
        // System.out.println(a.charAt(0));
        // System.out.println(a.equals(b));

        // Student s = new Student("Ayush", 23);

        // s.display();
        // String num ="74206";

        // for(int i=num.length()-1;i>=0;i--){
        // if((num.charAt(i)-'0')%2 ==1){
        // System.out.println(num.charAt(i));
        // System.out.println(num.substring(0,i+1));
        // // return;
        // }
        // }
        // System.out.println("");
        // String s="anagram";
        // String t="gramana";
        // int [] count = new int[26];

        // for(int i=0;i<s.length();i++){
        // count[s.charAt(i) - 'a']++;
        // count[t.charAt(i) - 'a']++;
        // }
        // for(int c:count){
        // System.out.println(c);
        // }
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       // int target = sc.nextInt();

        // int [] result = twoSum(arr, target);
        // for(int i=0;i<result.length;i++){
        // System.out.print(result[i] + " ");

        // }
        //    moveZero(arr);

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.print(pivotIndex(arr));
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];

            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void moveZero(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(i, j, arr);
                j++;
            }
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int majorityElemnt(int[] arr){

        int cnt=0;
        int candidate =0;

        for(int num :arr){
            if(cnt==0){
                candidate = num;
            }
            if(candidate == num){
                cnt++;
            }else{
                cnt--;
            }
        }
        return candidate;
    }
    public static int pivotIndex(int []arr){
        int sum=0;
        int leftsum=0;
        for(int num:arr){
            sum+=num;
        }

        for(int i=0;i<arr.length;i++){
            if(leftsum == sum-leftsum -arr[i] ){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}