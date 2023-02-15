// bir class birden fazla interface alabilir.
public class MySqlCustomerDal implements ICustomerDal,IRepository {

    @Override
    public void Add() {
        System.out.println(" My sql eklendi. ");
    }
}
