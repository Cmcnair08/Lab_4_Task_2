public class Main {
    public static void main(String[] args) {
        System.out.println("Enter maintenance costs for each season:");

        System.out.print("Spring: $");
        double springCost = 200;

        System.out.print("Summer: $");
        double summerCost = 250;

        System.out.print("Autumn: $");
        double autumnCost = 300;

        System.out.print("Winter: $");
        double winterCost = 400;

        double totalCost = springCost + summerCost + autumnCost + winterCost;

        System.out.println("Seasonal Maintenance Costs:");
        System.out.println("Spring: $" + springCost);
        System.out.println("Summer: $" + summerCost);
        System.out.println("Autumn: $" + autumnCost);
        System.out.println("Winter: $" + winterCost);
        System.out.println("Total Annual Cost: $" + totalCost);
    }

}

