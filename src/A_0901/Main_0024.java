package A_0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0024 {
    private final static int TOTAL_PRICE_UPPER_BOUND = 1000000000;
    private final static int ITEM_TYPE_UPPER_BOUND = 100;
    private final static int ITEM_PRICE_UPPER_BOUND = 1000000;
    private final static int ITEM_QUANTITY_UPPER_BOUND = 10;
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int totalPrice = getValidInput(reader, 1, TOTAL_PRICE_UPPER_BOUND);
            int itemTypes = getValidInput(reader, 1, ITEM_TYPE_UPPER_BOUND);

            int calculatedTotal = 0;
            for(int i = 0; i < itemTypes; i++){
                int[] itemData = getItemData(reader, 1, ITEM_PRICE_UPPER_BOUND, 1, ITEM_QUANTITY_UPPER_BOUND);
                calculatedTotal += itemData[0] * itemData[1];
            }

            if(totalPrice == calculatedTotal){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            System.out.println("Input error occurred.");
        }
    }

    private static int getValidInput(BufferedReader reader, int lowerBound, int upperBound) {
        int value  = 0;

        while (true) {
            try {
                value = Integer.parseInt(reader.readLine());
                if (isValid(value, lowerBound, upperBound)) {
                    break;
                } else {
                    System.out.println("Please enter a value between " + lowerBound + " and " + upperBound);
                }
            } catch (IOException e) {
                System.out.println("Input error occurred. Please try again.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return value;
    }

    private static int[] getItemData(BufferedReader reader, int priceLowerBound, int priceUpperBound, int quantityLowerBound, int quantityUpperBound) throws IOException {
        while (true) {
            try {
                String[] inputs = reader.readLine().split(" ");
                int itemPrice = Integer.parseInt(inputs[0]);
                int itemQuantity = Integer.parseInt(inputs[1]);

                if (isValid(itemPrice, priceLowerBound, priceUpperBound) && isValid(itemQuantity, quantityLowerBound, quantityUpperBound)) {
                    return new int[]{itemPrice, itemQuantity};
                } else {
                    System.out.println("Please enter valid values: " + priceLowerBound + "<=price<=" + priceUpperBound + " and " + quantityLowerBound + "<=quantity<=" + quantityUpperBound);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
            }
        }
    }
    
    private static boolean isValid(int value,int lowerBound, int upperBound) {

        return lowerBound <= value && value <= upperBound;
    }
}
