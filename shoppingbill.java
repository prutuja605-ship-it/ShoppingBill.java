class ShoppingBill {

    // Calculate Electronics bill with 18% GST
    public static double calculateElectronicsGST(double a, double b) {
        double amount = a + b;
        return amount + (amount * 18 / 100);
    }

    // Calculate Fashion bill with 13% GST
    public static double calculateFashionGST(double c, double d) {
        double amount = c + d;
        return amount + (amount * 13 / 100);
    }

    // Calculate Food bill with 7% GST
    public static double calculateFoodGST(double e) {
        return e + (e * 7 / 100);
    }

    // Calculate total bill after GST
    public static double totalBill(double a, double b, double c,
                                   double d, double e) {
        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);

        return electronics + fashion + food;
    }

    // Calculate final bill after 20% discount
    public static double calculateDiscountedBill(double a, double b,
                                                  double c, double d,
                                                  double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;

        return total - discount;
    }

    public static void main(String[] args) {

        double a = 100, b = 100, c = 100, d = 100, e = 100;

        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);
        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;
        double finalAmount = calculateDiscountedBill(a, b, c, d, e);

        System.out.printf("Electronics Bill: %.2f%n", electronics);
        System.out.printf("Fashion Bill: %.2f%n", fashion);
        System.out.printf("Food Bill: %.2f%n", food);
        System.out.printf("Total after GST: %.2f%n", total);
        System.out.printf("Discount (20%%): %.2f%n", discount);
        System.out.printf("Final Payable Amount: %.2f%n", finalAmount);
    }
}