package FactoryPattren.englishe;

public class TxtFactory implements CompanyFactory {
    @Override
    public Dateproduce factory() {
        Dateproduce dp=new Txt();
        return dp;
    }
}
