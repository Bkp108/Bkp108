import java.util.*;

public class G1_Activity_selection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //! WHEN I HAVE end time is SORTED:
/*
        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        //end time basic sorting
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();


        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }

        }

        System.out.println("max Activity = "+maxAct);
        for (int i = 0; i < ans.size(); i++){
            System.out.println("A"+ans.get(i));
        }
    }

*/

//! FIRST I HAVE TO SORT THEN USE
/*
        //sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        //end time basic sorting
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();


        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }

        }

        System.out.println("max Activity = "+maxAct);
        for (int i = 0; i < ans.size(); i++){
            System.out.println("A"+ans.get(i));
        }
        
        */
    }
}
