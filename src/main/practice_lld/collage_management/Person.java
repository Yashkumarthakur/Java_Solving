package practice_lld.collage_management;

import java.util.Date;

public class Person {
    Prefix prefix;
    String name;
    Date dob;
    Gender gender;
    String address;

}
enum Prefix{
    MR, MISS, MIS, DOC;
}
enum Gender{
    MALE, FEMALE, NA;
}