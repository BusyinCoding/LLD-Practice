public class Main {
//creational design pattern
//    big constructor with many parameters
//    step by step object creation
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Director s1 = new Director(new EngineerBuilder());
        Director s2 = new Director(new CaBuilder());
        System.out.println(s1.constructStudent().toString());
        System.out.println(s2.constructStudent().toString());


    }
}