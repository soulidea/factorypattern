package FactoryPattren.曲线图;

public class produce implements product{
    @Override
    public void draw() {
        System.out.println("绘制曲线图");
    }
}
