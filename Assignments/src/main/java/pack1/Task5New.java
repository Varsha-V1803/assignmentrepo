package pack1;
public class Task5New {
    public static void main(String[] args) {
        Task5New obj = new Task5New();
        int[] prices = {1000, 2000, 3000, 4000, 5000};
        int result1 = obj.method1(prices); // Calculate total amount
        System.out.println("The total amount is: " + result1);

        int result2 = obj.method2(prices); // Calculate discount
        System.out.println("The discount amount is: " + result2);

        int final_amt = result1 - result2; // Final amount after discount
        System.out.println("The final amount is: " + final_amt);
    }

    // Method 1: Calculate total amount
    public int method1(int prices[]) {
        int total_amount = 0;
        //int[] prices = {1000, 2000, 3000, 4000, 5000};
        for (int i = 0; i < prices.length; i++) {
            total_amount += prices[i];
        }
        return total_amount;
    }

    // Method 2: Calculate discount
    public int method2(int prices[]) {
        int amt = method1(prices);
        if (amt > 5000) {
            int discount = (int) (amt * 0.2); // For calculating the 20% discount
            return discount;
        } else {
            return 0; // No discount if total amount <= 5000
        }
    }
}

