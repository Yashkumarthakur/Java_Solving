/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */

import java.io.PrintWriter;
import java.util.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the
   standard library */

/* Do not add a namespace declaration */

class ShoppingPrice {

    public static List<String> processData(ArrayList<String> inputData) {
        List<Data> dataObjs = new ArrayList<>();
        HashMap<String, Integer> productWithMax = new HashMap<>();

        for (String s : inputData) {
            String[] temp = s.split(",");
            int price = Integer.parseInt((temp[4]).substring(4).trim());
            String productName = temp[3];

            if (productWithMax.containsKey(productName)) {
                productWithMax.put(productName, productWithMax.get(productName) < price ? price : productWithMax.get(productName));
            } else {
                productWithMax.put(productName, price);
            }

            dataObjs.add(new Data(temp[0], temp[1], Integer.parseInt(temp[2].trim()), productName, price, temp[5]));
        }
        return getResult(dataObjs, productWithMax);
    }

    private static List<String> getResult(List<Data> allData, HashMap<String, Integer> productWithMax) {
        HashSet<String> result = new HashSet<>();
        HashSet<String> blockedList = new HashSet<>();
        for (Data d : allData) {
            int price = productWithMax.get(d.productName);
            if (d.price < price && !blockedList.contains(d.name)) {
                result.add(d.name);
            } else {
                blockedList.add(d.name);
                result.remove(d.name);
            }
        }
        return new ArrayList<>(result);
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
            inputData.add(in.nextLine());
        List<String> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(System.out);
        for(String str: retVal)
            output.println(str);
        output.close();
    }
    static class Data{
        String name;
        String location;
        int date;
        String productName;
        int price;
        String paymentMode;

        public Data(String name, String location, int date, String productName, int price, String paymentMode) {
            this.name = name;
            this.location = location;
            this.date = date;
            this.productName = productName;
            this.price = price;
            this.paymentMode = paymentMode;
        }
    }
}


/**
 *
 * Connected to the target VM, address: '127.0.0.1:63659', transport: 'socket'
 * Rajan Patil, Aundh, 1, Phone Cover, Rs 170, Cash
 * Mohit Gupta, Baner, 1, Samsung Battery, Rs 900, Credit Card
 * Rajan Patil, Aundh, 3, Samsung Battery, Rs 1000, Cash
 * Nina Kothari, Baner, 4, Earphones, Rs 500, Credit Card
 * T Sunitha, Shivajinagar, 5, Earphones, Rs 550, Credit Card
 * Rohan Gade, Aundh, 10, Motorola Battery, Rs 1000, Credit Card
 * Rajan Patil, Shivajinagar, 21, Earphones, Rs 550, Credit Card
 * Rajan Patil, Aundh, 22, USB Cable, Rs 150, UPI
 * Meena Kothari, Baner, 23, USB Cable, Rs 100, Cash
 * Nina Kothari, Baner, 24, USB Cable, Rs 200, UPI
 * Mohit Gupta, Baner, 25, USB Cable, Rs 150, UPI^D
 * Disconnected from the target VM, address: '127.0.0.1:63659', transport: 'socket'
 * Mohit Gupta
 * Meena Kothari
 *
 * Process finished with exit code 0
 *
 */
