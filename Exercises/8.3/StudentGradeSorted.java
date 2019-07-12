import java.util.*;

public class StudentGradeSorted {

    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

        // Key to the questions
        char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

       int[][] result= new int[answers.length][2];
       for(int i=0; i<answers.length;i++){
           int correctCount = 0;
           for(int j=0; j<answers[i].length;j++){
               if(answers[i][j]==keys[j]){
                   correctCount++;
               }
           }
           result[i][0]=i;
           result[i][1]=correctCount;
       }
       sortGrade(result);
       for (int k = 0; k < result.length; k++) {
        System.out.println("Student " + result[k][0] + "'s correct count is " +
          result[k][1]);
       }
    }
    
    
            
    public static void  sortGrade(int [][] result){
        for(int i=0; i<result.length-1; i++){
            int currentMin= result[i][1];
            int currentMinIndex=i;
            for(int j=i+1; j<result.length; j++){
                if(currentMin>result[j][1]){
                    currentMin=result[j][1];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex!=i){
                result[currentMinIndex][1]= result[i][1];
                result[i][1]=currentMin;
                result[currentMinIndex][0]=result[i][0];
                result[i][0]=currentMinIndex;
            }

        }

    }
}