package FactoryPattren.tupianduquqi;

public class Giffactory implements factory{
    @Override
    public produce gif() {
        produce pro=new GifReader();
        return pro;
    }
}
