public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

 //   @Override
    public Integer getNumerator() {
        return numerator;
    }

 //   @Override
    public Integer getDenominator() {
        return denominator;
    }

 //   @Override
    public IFraction plus(IFraction other) {
        int num1 = getNumerator();
        int den1 = getDenominator();
        int num2 = other.getNumerator();
        int den2 = other.getDenominator();

        int denF = den1 * den2;
        int numF = num2 * den1 + num1 * den2;


        return other;
    }

  //  @Override
    public IFraction minus(IFraction other) {
        throw new UnsupportedOperationException();
    }

  //  @Override
    public IFraction times(IFraction other) {
        throw new UnsupportedOperationException();
    }

 //   @Override
    public IFraction dividedBy(IFraction other) {
        throw new UnsupportedOperationException();
    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {
        throw new UnsupportedOperationException();
    }

    /**
     * @link https://www.baeldung.com/java-greatest-common-divisor
     */
    private static Integer findGreatestCommonDenominator(Integer i1, Integer i2) {
        if (i1 < i2) return findGreatestCommonDenominator(i2, i1);
        if (i2 == 0) return i1;
        return findGreatestCommonDenominator(i2, i1 % i2);
    }

    private static Integer findLowestCommonMultiple(Integer i1, Integer i2) {
        if (i1 == 0 || i2 == 0) return 0;
        else {
            int gcd = findGreatestCommonDenominator(i1, i2);
            return Math.abs(i1 * i2) / gcd;
        }
    }

 //   @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}
