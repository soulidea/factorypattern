package FactoryPattren.englishe;

public class DataBaseFactory implements CompanyFactory {
    @Override
    public Dateproduce factory() {
        Dateproduce dp=new DateBase();
        return dp;
    }
}
