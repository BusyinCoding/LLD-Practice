public class Main {
//    it alows us to add new functionality on a top of existing functionality without changing the existing code
//    margerita pizza can be decorated with extra toppings like cheese, olives, etc and in any other.
//    structural design pattern
    public static void main(String[] args) {
        BasePizza myPizza = new PaneerTopping(new CheeseTopping(new PlainPizza()));
        System.out.println("Description: " + myPizza.getDescription());
        System.out.println("Cost: " + myPizza.getCost());

    }
}