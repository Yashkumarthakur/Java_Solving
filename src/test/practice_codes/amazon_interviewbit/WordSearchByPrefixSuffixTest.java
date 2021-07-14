package practice_codes.amazon_interviewbit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WordSearchByPrefixSuffixTest {

    @Test
    void bestCase() {
        List<String> input = new ArrayList<>(Arrays.asList("jar", "plane", "perform", "scattered", "believe", "old-fashioned", "fragile", "accept", "arithmetic", "foregoing", "ship", "icky", "capable", "rabid", "blow", "pink", "needless", "industrious", "many", "honorable", "play", "puzzling", "warm", "fruit", "cross", "recognise", "enjoy", "boy", "reflective", "advise", "inexpensive", "hop", "telephone", "mixed", "tour", "rich", "tap", "excited", "dashing", "acoustics", "motionless", "bear", "unite", "glossy", "complex", "creepy", "chess", "time", "terrible", "smelly"));

        Assertions.assertEquals("perform", WordSearchByPrefixSuffix.getResult("p", "m", input));
        Assertions.assertEquals("old-fashioned", WordSearchByPrefixSuffix.getResult("old-", "ed", input));
        Assertions.assertEquals("old-fashioned", WordSearchByPrefixSuffix.getResult("o", "d", input));
    }

    @Test
    void cornerCase() {
        List<String> input = new ArrayList<>(Arrays.asList("avowable", "amygdale", "amygdule", "amicable", "asparkle", "afebrile", "arvicole", "abatable", "abusable", "amenable", "amusable", "arbuscle", "assemble", "atremble", "adorable", "aedicule", "agitable", "anethole", "arguable", "arsehole"));

        Assertions.assertEquals("arsehole", WordSearchByPrefixSuffix.getResult("ar", "ole", input));
        Assertions.assertEquals("avowable", WordSearchByPrefixSuffix.getResult("avowable", "avowable", input));
        Assertions.assertEquals("avowable", WordSearchByPrefixSuffix.getResult("", "avowable", input));
        Assertions.assertEquals("arsehole", WordSearchByPrefixSuffix.getResult("arsehOle", "", input));
        Assertions.assertEquals("", WordSearchByPrefixSuffix.getResult("", "", input));
        Assertions.assertEquals("", WordSearchByPrefixSuffix.getResult("123", "   ", input));
    }


}