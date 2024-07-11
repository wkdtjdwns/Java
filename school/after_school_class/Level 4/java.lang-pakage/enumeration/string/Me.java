package enumeration.ex0;

public class DiscountService {

    private final String[] grades = { "BASIC", "GOLD", "DIAMOND" };

    public int discount(String grade, double price) {
        for (int i = 0; i < grades.length; i++) {
            if (grade.equals(grades[i])) {
                double p = (1 - 0.1 * (i + 1));
                return (int)(price * p);
            }
        }

        return (int)price;
    }
}
