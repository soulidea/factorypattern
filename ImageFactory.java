package FactoryPattren.tupianduquqi;

public class ImageFactory implements factory{
    @Override
    public produce gif() {
        produce pro=new ImageReader();
        return pro;
    }
}
