package practice_concepts.design_patterns.factory;

import static java.lang.System.*;

/**
 * Abstract class.
 */
abstract class Plan {
    protected double rates;

    abstract void getRates();

    public void calculateRate(double units) {
        out.println(units * rates);
    }
}
