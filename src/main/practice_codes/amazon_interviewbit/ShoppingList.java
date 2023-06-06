package practice_codes.amazon_interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

/**
 * 4 5 6
 * 2
 * 2 3
 * 1 4
 *
 */
public class ShoppingList {
    public static void main(String[] args) {
        List<Integer> priceOfShoes = new ArrayList<>(Arrays.asList(2, 3, 5));
        List<Integer> priceOfShirt = new ArrayList<>(Arrays.asList(2));
        List<Integer> priceOfPant = new ArrayList<>(Arrays.asList(3, 5));
        List<Integer> priceOfTop = new ArrayList<>(Arrays.asList(4, 3, 5));
        Integer budgetAmount = 15;

        calculateResultCall(priceOfPant, priceOfShoes, priceOfShirt, priceOfTop, budgetAmount);

    }

    private static void calculateResultCall(List<Integer> priceOfPant, List<Integer> priceOfShoes, List<Integer> priceOfShirt, List<Integer> priceOfTop, Integer budgetAmount) {
        out.println("Price of Pants are : " + priceOfPant);
        out.println("Price of Shoes are : " + priceOfShoes);
        out.println("Price of Shirt are : " + priceOfShirt);
        out.println("Price of Top are : " + priceOfTop);
        out.println("Budget amount is  : " + budgetAmount);

        int possibleSetOfProduct = calculateResult(priceOfPant, priceOfShoes, priceOfShirt, priceOfTop, budgetAmount);
        out.println("Possible set of products : " + possibleSetOfProduct);

    }

    private static int calculateResult(List<Integer> priceOfPant, List<Integer> priceOfShoes, List<Integer> priceOfShirt, List<Integer> priceOfTop, Integer budgetAmount) {
        List<Integer> priceOfPantsShoes = new ArrayList<>();
        int combination = 0;
        for (int shoePrice : priceOfShoes) {
            for (int pantPrice : priceOfPant) {
                priceOfPantsShoes.add(shoePrice + pantPrice);
            }
        }

        for (int shirtPrice : priceOfShirt) {
            for (int topPrice : priceOfTop) {
            }
        }


        return combination;
    }
}
