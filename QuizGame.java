import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "a).What is full form of CRM?",
                "b).Working of cntrl+c ?",
                "c).Full form of Ram ?"
        };

        String[][] options = {
                {
                        "1.Customer Relationship Management",
                        "2.Client Resource Management",
                        "3.Central Record Module",
                        "4.Customer Record Mechanism"
                },
                {
                        "1.Copies selected content to clipboard",
                        "2.Closes current window",
                        "3.Creates new folder",
                        "4.Changes system color"
                },
                {
                        "1.Random Access Memory",
                        "2.Read Access Module",
                        "3.Rapid Application Memory",
                        "4.Run Access Memory"
                }
        };
        int total = 0;
        int guess;
        int[] answer = { 1, 1, 1 };

        System.out.println("**************** ");
        System.out.println("**************** ");
        System.out.println("Welcome to the Java quiz game");
        System.out.println("**************** ");
        System.out.println("**************** ");
        System.out.println("************ ");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Enter your guess:  ");
            guess = scanner.nextInt();

            if (guess == answer[1]) {
                System.out.println("######### ");
                System.out.println("Correct!");
                System.out.println("######## ");
                total++;
            } else {
                System.out.println("######### ");
                System.out.println("Incorrect!");
                System.out.println("######## ");
            }
        }
        System.out.println("Your total score is: " + total + " out of  " + questions.length);

        scanner.close();

    }
}
