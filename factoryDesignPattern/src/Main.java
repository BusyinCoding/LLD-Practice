public class Main {
//   it is a creational design pattern
//    When we need object of a class we call a factory method instead of calling constructor directly
//    simple factory pattern(here selection and object creation is in the same we simply check and create circle object here only), factory method pattern
//    abstract factory pattern(factory of factory) If we have multiple factories to create related objects
//    like just like shapeFactory we have other factory and we have to choose one
//    we have luxury interior factory and normal interior factory and we have to choose one based on some condition
//    we have luxury exterior factory and normal exterior factory and we have to choose one based on some condition
//    in simple factory we have carInterior and careExterior interface inherit by above classes
//    in abstract we have carFactory interface which is inherited by luxuryCarFactory and normalCarFactory

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ShapeEnum shapeEnum = ShapeEnum.CIRCLE;
        ShapeEnum shapeEnum1 = ShapeEnum.SQUARE;
        Shape cicle = getInstance(shapeEnum);
        Shape square = getInstance(shapeEnum1);
       cicle.computeArea();
       square.computeArea();
       cicle.draw();
       square.draw();


    }

    public static Shape getInstance(ShapeEnum shapeEnum) {
        switch (shapeEnum) {
            case CIRCLE:
                CircleFactory circleFactory = new CircleFactory();
                return circleFactory.createShape();
            case SQUARE:
                ShapeFactory squareFactory = new SquareFactory();
                return squareFactory.createShape();
            default:
                return null;
        }
    }


}