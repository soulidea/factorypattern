package FactoryPattren.englishe;

public class ExcelFactory implements CompanyFactory {
    @Override
    public Dateproduce factory() {
        Dateproduce dp=new Excel();
        return dp;
    }
}
