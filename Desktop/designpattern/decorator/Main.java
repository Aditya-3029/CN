package decorator;
public class Main {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.description());
        System.out.println("Cost: " + coffee.cost());
    }
}