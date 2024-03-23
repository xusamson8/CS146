import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class lab6 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //graph , array of arraylists ; repersents nodes pointing to eahc otehr
        ArrayList[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        Queue queue = new LinkedList(); // when egenrics aren't specifice dit will hold objexts, which is hwy we dont use <Integer>
        int count = 0;

        for (int i = 0 ; i < numCourses; i++){
            graph[i] = new ArrayList(); //creates arrlist for each course in graph
        }

        for (int i = 0 ; i < prerequisites.length; i++){
            indegree[prerequisites[i][1]]++; //increment indegree of prereq
            graph[prerequisites[i][0]].add(prerequisites[i][1]); //?
        }

        for(int i = 0; i< indegree.length;i++ ){
            if (indegree[i] == 0){
                queue.add(i);
                count++;
            }
        }

        while(!queue.isEmpty()){
            //queue course
            int courseTake = (int)queue.poll();
            // decrease the indegrees of the courses that follow the course we jusr dequeued
            for(int i = 0; i<graph[courseTake].size(); i ++){
                int pointer = (int)graph[courseTake].get(i);
                indegree[pointer]--;
                // if courses after that procedure now have no indegrees, we add it to the queue
                if(indegree[pointer] == 0){
                    queue.add(pointer);
                    count++;
                }

            }

        }
        if(count == numCourses){
            return true;
        }
        else{
            return false;
        }

    }
}
