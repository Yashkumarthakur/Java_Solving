package gold_man_s;

/*
 * Decode the given string, if input is empty output will be "".
 *
 * Input  : GGGGGrrrrrrrrrrrt
 * Output : 5G11r1t
 *
 * */
public class DecodeString {
    public static void main(String[] args) {
        String input = "GGGGGrrrrrrrrrrrt";
        System.out.println("Decoded String : " + display(input));
    }

    public static String display(String input) {
        System.out.println("Given String : " + input);
        return decodeString(input);
    }

    private static String decodeString(String input) {
        if (input.isEmpty())
            return "";

        StringBuilder result = new StringBuilder();
        int count = 0;
        char[] sample = input.toCharArray();
        for (int i = 0; i < sample.length; i++) {
            if (i + 1 != sample.length) {
                count++;
                if (sample[i] != sample[i + 1]) {
                    result.append(count).append(sample[i]);
                    count = 0;
                }
            } else {
                count++;
                result.append(count).append(sample[i]);
                count = 0;
            }
        }
        return result.toString();
    }
}
