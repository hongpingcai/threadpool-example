public class Job impleents Runnable {
    private int jobNumber;
    Job (int jobNumber){
        this.jobNumber = jobNumber;
    }
    
    public void run() {
        //undertake required work, her we will emulate it by sleeping for a period
        System.out.println("Job: " + jobNumber + " is being processed by thread: "
          + Thread.currentThread().getName());
        try {
            Thread.sleep((int)(1000));
        } catch (InterruptedExeption e) {
            //no catching as example shoule not experince interruptions
        }
        System.out.println("Job: " + jobNumber + " is ending in Thread "
            + Thread.currentThread().getName());
    }
}
    
    
