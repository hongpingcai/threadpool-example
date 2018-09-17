/**
 * The Job class which implements Runnable interface
 * 
 */
public class Job implements Runnable {
    
    private int jobNumber;//attribute job ID
    public Job (int jobNumber){
        this.jobNumber = jobNumber;
    }
    /**
     * 
     */
    public void run() {
        //undertake required work, her we will emulate it by sleeping for a period
        System.out.println("Job: " + jobNumber + " is being processed by thread: "
          + Thread.currentThread().getName());
        try {
            Thread.sleep((int)(1000));
        } catch (InterruptedException e) {
            //no catching as example shoule not experince interruptions
        }
        System.out.println("Job: " + jobNumber + " is ending in Thread "
            + Thread.currentThread().getName());
    }
}
    
    
