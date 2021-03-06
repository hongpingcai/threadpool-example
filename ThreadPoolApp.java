import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
/**
 * Class ThreadPoolApp here.
 *
 * @author (Hongping Cai)
 * @version (17/09/2018)
 */
public class ThreadPoolApp
{
    /**
     * Send a message if the input is error
     *
     */
    public static void error()
    {
        // put your code here
        System.out.println("ThreadPoolApp must be run with two" +
        "positive valued integer arguments. The first detailing" +
        "the number of jobs, the second the number of processing" +
        "threads in the pool");
        System.exit(0); // exit program
    }
    /**
     * The main method for running the program
     * 
     * @param  args  two arguments are expected
     *               The 1st: number of jobs
     *               The 2nd: number of Threads
     */
    public static void main(String [] args)
    {
        // put your code here
        if (args.length < 2)
            ThreadPoolApp.error();
        try {
            int numberOfJobs = Integer.parseInt(args[0]);
            int numberOfThreads = Integer.parseInt(args[1]);
            if ((numberOfJobs<1) ||(numberOfThreads<1))
                ThreadPoolApp.error();
            ExecutorService pool = Executors.newFixedThreadPool(numberOfThreads);
            Job [] jobs = new Job[numberOfJobs];
            for (int i=0; i<numberOfJobs; i++){
                jobs[i] = new Job(i);
                pool.execute(jobs[i]);//executes the command at future time
            }
            pool.shutdown();//shutdown: previously submitted tasks are executed,
                            // but no new tasks will be accepted.
            System.out.println("Last line "+Thread.currentThread().getName());
        } catch (NumberFormatException e){
            ThreadPoolApp.error();
        }
    }
}
