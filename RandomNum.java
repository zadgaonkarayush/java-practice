import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random random = new Random();

        // int number1 = random.nextInt(1,50);
        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads) {
            System.out.print("Heads");

        } else {
            System.out.print("Tails");

        }
    }
}
