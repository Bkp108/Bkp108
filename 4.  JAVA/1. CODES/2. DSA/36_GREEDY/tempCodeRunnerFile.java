



import java.util.Arrays;

// Job class to represent each job
class Job {
    char id; // Identifier for the job
    int deadline; // Deadline for completing the job
    int profit; // Profit earned by completing the job

    // Constructor to initialize job attributes
    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencingGreedy {

    // Function to find the best job sequence
    static void bestJob(Job[] jobs, int sizeOfJobs) {
        // Char array to store the sequence of jobs to do
        char[] jobsToDo = new char[sizeOfJobs];

        // Iterating through each job
        for (int i = 0; i < sizeOfJobs; i++) {
            int k = jobs[i].deadline - 1;

            // Searching backwards for the nearest empty date to the deadline
            while (k >= 0 && jobsToDo[k] != '\0') {
                k--;
            }

            // If an empty date is found, set the job
            if (k != -1)
                jobsToDo[k] = jobs[i].id;
        }

        // Output the final job sequence
        System.out.print("\nBest order and jobs to do is: ");
        for (char job : jobsToDo) {
            if (job != '\0')
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
                new Job('J', 2, 20),
                new Job('J', 2, 15),
                new Job('J', 1, 10),
                new Job('J', 3, 5),
                new Job('J', 3, 1)
        };

        // Display the jobs data
        display(jobs, 5);

        // Sorting jobs[] w.r.t their profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find the best job sequence
        bestJob(jobs, 5);
    }
}
