package FactoryPattren.曲线图;

public class factory1 implements factory{
    @Override
    public product drawFactory() {
        product pro=new produce();
        return pro;
    }
}
