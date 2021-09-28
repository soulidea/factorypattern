package FactoryPattren.englishe;

public class Demo {
    public static void main(String[] args) {
        CompanyFactory cf;
        CompanyFactory dp;
        dp= (CompanyFactory) XMLUtil.getBean();
        dp.factory().get();
    }
}
