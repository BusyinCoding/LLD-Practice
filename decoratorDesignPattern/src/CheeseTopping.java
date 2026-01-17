public class CheeseTopping extends  ToppingDecorator{

    CheeseTopping(BasePizza basePizza)
    {
        super(basePizza);
    }

    @Override
    public String getDescription(){
        return basePizza.getDescription() + ", Cheese Topping";
    }
    @Override
    public double getCost(){
        return basePizza.getCost() + 100;
    }

}
