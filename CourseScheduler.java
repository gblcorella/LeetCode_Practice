/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */


import java.util.*;
public class CourseScheduler {
    
    // Course Scheduler LeetCode (Cycle detection in a DAG) look at familiar ones to get a better grasb;
    
    
    public boolean canFinish(int numCourses, int[][] prerequisites){
       // Error and false input checking  

       if(numCourses < 0 || prerequisites.length == 0) return false; // ??
       
       // create the array lists to represent the courses
        List<List<Integer>> courses = new ArrayList();
        for(int i = 0; i < numCourses; i++){
            courses.add(new ArrayList());
        }
        
        // create the dependency graph
        for(int i = 0; i < prerequisites.length; i++){
            courses.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] visited = new int[numCourses];
        
        for(int i = 0; i < numCourses; i++){
            if(!dfs(i, courses, visited)) return false;
        }
        
        
        return true;
    }
    
    
    private boolean dfs(int course, List<List<Integer>> courses, int[] visited){
        visited[course] = 1; // Mark it as visited
        List<Integer> eligibleCourses = courses.get(course); // get Children
        
        
        // Dfs its children
        for(int i = 0; i < eligibleCourses.size(); i++){
            int eligibleCourse = eligibleCourses.get(i).intValue();
            if(visited[eligibleCourse] == 1) return false; // If already visited, return false;
            if(visited[eligibleCourse] == 0){ // if unvisited, continue, dfs
                if(!dfs(eligibleCourse, courses, visited)) return false;
            }
        }
        visited[course] = 2;
        return true;
    }
}
