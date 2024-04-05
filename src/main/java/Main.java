public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        // Task 3: Call method with two integer parameters
        int result1 = p.product(2, 3);
        System.out.println("Product of 2 and 3 is: " + result1);

        // Task 4: Call method with three integer parameters
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4 is: " + result2);

        // Task 5: Call method with two double parameters
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5 is: " + result3);
    }
}

class Product {
    // Task 3: Method with two integer parameters
    public int product(int x, int y) {
        return x * y;
    }

    // Task 4: Overloaded method with three integer parameters
    public int product(int x, int y, int z) {
        return x * y * z;
    }

    // Task 5: Overloaded method with two double parameters
    public double product(double x, double y) {
        return x * y;
    }
}

