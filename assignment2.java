import java.util.Scanner;
public class KFC {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        // KFC myApp = new KFC();

        // KFC Order = new KFC();

        // // Non-static method call
        // myApp.showHelloJava();

        // // Non-static method call with parameter
        // myApp.showName("Elizer");

        // // Non-static method call with two parameters that returns an int
        // int sum = myApp.add(1, 1);
        // System.out.println(sum);


        myOrder();

    }

    // Non-static method
    void showHelloJava() {
        System.out.println("Hello Java! This is a non-static method.");
    }

    // Non-static method with a parameter
    void showName(String name) {
        System.out.println("My name is " + name);
    }

    // Non-static method with two parameters with a return type
    int add(int x, int y) {
        int z = x + y;
        return z;
    }

    static void myOrder() {
        System.out.println("Create your order");
        System.out.print("Enter your order 1: ");
        String order1 = scan.nextLine();
        System.out.print("Enter price: ");
        Double price1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter your order 2: ");
        String order2 = scan.nextLine();
        System.out.print("Enter price: ");
        Double price2 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter your order 3: ");
        String order3 = scan.nextLine();
        System.out.print("Enter price: ");
        Double price3 = scan.nextDouble();

        System.out.println(order1 + order2 + order3);
        Double total = price1 + price2 + price3;
        System.out.println(total);
    }

}
