package FactoryPattren.曲线图;

public class demo {
    public static void main(String[] args) {
        factory factory;
        product product;
        factory=new factory1();
        product=factory.drawFactory();
        product.draw();
    }
}
