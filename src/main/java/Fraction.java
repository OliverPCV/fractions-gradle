public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {

        return numerator;
    }

    @Override
    public Integer getDenominator() {

        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int jmenovatel;
        int citatel;

        if(getDenominator() == other.getDenominator()) {
            citatel = getNumerator() + other.getNumerator();
            jmenovatel = getDenominator();
        } else {
            jmenovatel = getDenominator() * other.getDenominator();
            citatel = ( jmenovatel / getDenominator() * getNumerator() + jmenovatel / other.getDenominator() * other.getNumerator());
        }

        return createNormalised(citatel, jmenovatel);

    }

    @Override
    public IFraction minus(IFraction other) {
        int jmenovatel;
        int citatel;

        if(getDenominator() == other.getDenominator()) {
            citatel = getNumerator() + other.getNumerator();
            jmenovatel = getDenominator();
        } else {
            jmenovatel = getDenominator() * other.getDenominator();
            citatel = ( jmenovatel / getDenominator() * getNumerator() - jmenovatel / other.getDenominator() * other.getNumerator());
        }

        return createNormalised(citatel, jmenovatel);

        //int jmenovatel = getDenominator() * other.getDenominator();
        //int citatel = (getNumerator() * other.getDenominator()) - (getDenominator() * other.getNumerator());
        //return new Fraction(jmenovatel, citatel);

+    }

    @Override
    public IFraction times(IFraction other) {

        int citatel = getNumerator() * other.getNumerator();
        int jmenovatel = getDenominator() * other.getDenominator();
        return createNormalised(citatel, jmenovatel);

    }

    @Override
    public IFraction dividedBy(IFraction other) {

        int citatel = getNumerator() * other.getDenominator();
        int jmenovatel = getDenominator() * other.getNumerator();
        return createNormalised(citatel, jmenovatel);

    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {
        int kraceni = 1;
        int jmenovatel;
        int citatel;
        for (int i = 1; i <= numerator && i <= denominator; i++){
            if(numerator % i == 0 && denominator % i == 0){
                kraceni = i;
            }
            citatel = numerator / kraceni;
            jmenovatel = denominator / kraceni;
        }
        return new Fraction(citatel, jmenovatel);
    }

    @Override
    public String toString() {

        return "Fraction " + numerator + "|" + denominator;
    }
}
