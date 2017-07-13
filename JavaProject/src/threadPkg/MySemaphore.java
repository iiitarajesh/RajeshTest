package threadPkg;

import java.util.concurrent.Semaphore;

/**
 * Created by IBM_ADMIN on 12/13/2016.
 */
public class MySemaphore {
    public static void main(String[] args) {
        final int maxlimit=3;
        Semaphore mySemaphore= new Semaphore(maxlimit);
    }
}
