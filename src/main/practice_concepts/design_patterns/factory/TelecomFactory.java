package practice_concepts.design_patterns.factory;

import static java.lang.System.*;

/**
 * Factory class
 * <p>
 * Accepts the Telecom name as input and returns the object.
 */
public class TelecomFactory {

    public Plan getPlan(String telecomName) throws NoSuchMethodException {
        if (telecomName == null)
            throw new NullPointerException("Given Telecom name is null ! ");
        else if (telecomName.equalsIgnoreCase("jio"))
            return new Jio();
        else if (telecomName.equalsIgnoreCase("airtel"))
            return new Airtel();
        else if (telecomName.equalsIgnoreCase("vi"))
            return new VI();
        throw new NoSuchMethodException(telecomName + " telecom name is not supported !");
    }
}
