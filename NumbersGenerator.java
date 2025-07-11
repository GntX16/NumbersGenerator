import java.util.Random;

public class NumbersGenerator {
    public static void generate() {
        Random random = new Random(); 
        System.out.print("The generated random number is: ");

        for (int i = 0; i < 1; i++) {
            int number = random.nextInt(100); /* Depending on the given bound, 
            you may put 10 or 100 etc. the generator will pick a number */
            System.out.println(number);
        }
    }

//Main-Method   
    public static void main(String[] args) {
        generate(); // Aufruf der Methode
    }
}