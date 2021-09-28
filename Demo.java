package FactoryPattren.tupianduquqi;

public class Demo {
    public static void main(String[] args) {
        produce pro;
        factory fact;
        fact=new ImageFactory();
        pro=fact.gif();
        pro.Read();

    }
}
