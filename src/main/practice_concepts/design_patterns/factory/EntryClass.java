package practice_concepts.design_patterns.factory;

import static java.lang.System.*;

public class EntryClass {
    static final double DURATION = 30;

    public static void main(String[] args) {
        TelecomFactory factory = new TelecomFactory();

        performOperation(factory, "jio");
        performOperation(factory, "vi");
        performOperation(factory, "airtel");
        performOperation(factory, "docomo");
        performOperation(factory, null);

    }

    private static void performOperation(TelecomFactory factory, String telecomPlanName) {
        try {
            Plan telecomPlan = factory.getPlan(telecomPlanName);
            out.println(telecomPlan.getClass());
            telecomPlan.getRates();
            telecomPlan.calculateRate(DURATION);
        } catch (Exception e) {
            err.println(e.getLocalizedMessage());
        }
    }
}
