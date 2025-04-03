// import java.util.*;

// public class G5_job_sequencing {
//     static class Job{
//         int deadline;
//         int profit;
//         int id;

//         public Job(int i, int d, int p){
//             id = i;
//             deadline = d;
//             profit = p;
//         }
//     }
//     public static void main(String[] args) {
//         int jobinfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

//         ArrayList<Job> jobs = new ArrayList<>();
        
//         for (int i = 0; i < jobinfo.length; i++) {
//             jobs.add(new Job(i, jobinfo[i][0], jobinfo[i][1]));
//         }

//         Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);
//         //dwscending order of profit

//         ArrayList<Integer> seq = new ArrayList<>();
//         int time = 0;
//         for (int j = 0; j < jobs.size(); j++) {
//             Job curr = jobs.get(j);
//             if(curr.deadline > time){
//                 seq.add(curr.id);
//                 time++;
//             }
//         }

//         //print sequence
//         System.out.println("max jobs ="+seq.size());
//         for (int j2 = 0; j2 < seq.size(); j2++) {
//             System.out.println(seq.get(j2)+" ");
//         }
//         System.out.println();

//     }
// }














import java.util.Arrays;

// Job class to represent each job
class Job {
    String id; // Identifier for the job
    int deadline; // Deadline for completing the job
    int profit; // Profit earned by completing the job

    // Constructor to initialize job attributes
    public Job(String id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencingGreedy {

    // Function to find the best job sequence
    static void bestJob(Job[] jobs, int sizeOfJobs) {
        // Char array to store the sequence of jobs to do
        String[] jobsToDo = new String[sizeOfJobs];

        // Iterating through each job
        for (int i = 0; i < sizeOfJobs; i++) {
            int k = jobs[i].deadline - 1;

            // Searching backwards for the nearest empty date to the deadline
            while (k >= 0 && jobsToDo[k] != null) {
                k--;
            }

            // If an empty date is found, set the job
            if (k != -1)
                jobsToDo[k] = jobs[i].id;
        }

        // Output the final job sequence
        System.out.print("\nBest order and jobs to do is: ");
        for (String job : jobsToDo) {
            if (job != null)
                System.out.print(job + " ");
        }
    }

    // Function to display the jobs table
    static void display(Job[] jobs, int n) {
        System.out.println("Job Id: \t\t" + "Job Deadline: \t\t" + "Job Profit:");
        for (int i = 0; i < n; i++) {
            System.out.println(jobs[i].id + "\t\t\t" + jobs[i].deadline + "\t\t\t" + jobs[i].profit);
        }
    }

    public static void main(String[] args) {
        // Initialize the jobs
        Job[] jobs = {
                new Job("J1", 2, 20),
                new Job("J2", 2, 15),
                new Job("J3", 1, 10),
                new Job("J4", 3, 5),
                new Job("J5", 3, 1)
        };

        // Display the jobs data
        display(jobs, 5);

        // Sorting jobs[] w.r.t their profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find the best job sequence
        bestJob(jobs, 5);
    }
}
