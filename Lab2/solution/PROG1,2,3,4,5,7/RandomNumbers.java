
import java.util.*;

/**
 *  This class keeps hold of an instance of Random and guarantees
 *  that the same instance will be used over and over (so the cost
 *  of re-seeding the random number generator is avoided).
 *  Each time the getRandomInt() method is called, the next integer
 *  from this Random instance is returned.
 */
public class RandomNumbers {

   private static Random random;

    private RandomNumbers() {
        random = new Random();
    }


    /**
     *  Use this method to get a random integer, with a call like this:
     *     int myInt = RandomNumbers.getRandomInt();
     */
    public static int getRandomInt() {
        if(random == null) new RandomNumbers();
        return random.nextInt();
    }
    /**
     * Returns a random integer x satisfying
     * lower <= x <= upper. If lower > upper, returns 0.
     * @param minNumber
     * @param maxNumber
     * @return
     */
    public static int getRandomInt(int maxNumber, int minNumber) {
        if(minNumber > maxNumber) return 0;
        if(maxNumber == minNumber) return minNumber;
        int difference = maxNumber - minNumber;
        int temp = getRandomInt();

        //nonneg int in the range 0..difference - 1
        temp = Math.abs(temp) % (difference+1);

        temp += minNumber;
        return temp;
    }

    public static void main(String[] args){
        System.out.println(RandomNumbers.getRandomInt(7, 5));

    }


}