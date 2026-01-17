public class FarmeHousePizza implements BasePizza{

    @Override
    public String getDescription(){
        return "FarmeHouse Pizza";
    }

    @Override
    public double getCost(){
        return 500;
    }
}
