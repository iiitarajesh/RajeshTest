package threadPkg;

import java.util.concurrent.Semaphore;

/**
 * Created by IBM_ADMIN on 12/13/2016.
 */
public class Restaurant {
    private Semaphore tables;
    public Restaurant(int tableCount){
        this.tables= new Semaphore(tableCount,true);
    }
    public void getTables(int customerId){
        try{
            System.out.println("Customer =#" +customerId +"trying to get table");
            tables.acquire();
            System.out.println("Customer=#"+customerId+"got a tables");
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
    public void returnTable(int customerId){
        System.out.println("Customer #"+customerId+"returned a table");
        tables.release();
    }
}
