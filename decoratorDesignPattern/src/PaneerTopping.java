public class PaneerTopping extends ToppingDecorator{

    PaneerTopping(BasePizza basePizza)
    {
        super(basePizza);
    }

    @Override
    public String getDescription(){
        return basePizza.getDescription() + ", Paneer Topping";
    }
    @Override
    public double getCost(){
        return basePizza.getCost() + 200;
    }

}
