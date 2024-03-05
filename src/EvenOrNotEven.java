import java.util.Random;

public class EvenOrNotEven {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Generated random number: " + randomNumber);
        if (randomNumber % 2 == 0) {
            System.out.println(randomNumber + " is an even number.");
        } else { // В противном случае
            System.out.println(randomNumber + " is an odd number.");
        }
    }
}