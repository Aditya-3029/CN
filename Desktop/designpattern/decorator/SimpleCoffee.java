package decorator;

public class SimpleCoffee implements Coffee{
    public int cost(){
        return 50;
    }
    public String description(){
        return "Simple Coffee";
    }
}

