package FactoryPattren.曲线图;

public class factory2 implements factory{
    @Override
    public product drawFactory() {
        product pro=new produce2();
        return pro;
    }
}
