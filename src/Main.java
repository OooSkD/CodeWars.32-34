import task32.ObservedPin;
import task33.Kata;
import task34.PigLatin;


public class Main {
    public static void main(String[] args) {
        System.out.println(ObservedPin.getPINs("369").toString());
        System.out.println("2 = " + Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(PigLatin.pigIt("Pig latin is cool !"));
    }
}
