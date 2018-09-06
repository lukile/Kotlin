import java.math.BigDecimal;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Object result;

        Integer randomNumber = new Random().nextInt(3);

        if (randomNumber == 1) {
            result = new BigDecimal(40);
        } else {
            result = "hello";
        }

        System.out.println("Result is " + result);

        if (result instanceof BigDecimal) {
            result = ((BigDecimal) result).add(new BigDecimal(77));
        } else {
            String tempResult = (String)result;
            result = tempResult.toUpperCase();
        }

        System.out.println("Result is " + result);

    }
}