public abstract class ToppingDecorator implements  BasePizza{

    BasePizza basePizza;
    ToppingDecorator(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }



}
