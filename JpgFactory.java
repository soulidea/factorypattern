package FactoryPattren.tupianduquqi;

public class JpgFactory implements factory{
    @Override
    public produce gif() {
        produce pro=new JpgReead();
        return pro;
    }
}
