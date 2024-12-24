class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=prerequisites.length;
        ArrayList<Integer>[] graph=new ArrayList[numCourses];
        int[] indegree=new int[numCourses];
    
    for(int i=0;i<numCourses;i++){
        graph[i]=new ArrayList<>();
    }
    for(int i=0;i<n;i++){
        int u=prerequisites[i][0];
        int v=prerequisites[i][1];
        graph[u].add(v);
       // graph[v].add(u);
       indegree[v]++;
    }
    boolean[] visited=new boolean[numCourses];
    int count=0;
    Queue<Integer> que=new LinkedList<>();
    for(int i=0;i<numCourses;i++){
        if(indegree[i]==0)
        que.add(i);
    }
    while(que.size()>0){
        int temp=que.poll();
        count++;
        visited[temp]=true;
        for(int nbr:graph[temp]){
            if(visited[nbr]==false){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    que.add(nbr);
                }
            }

        }
       
    }
     if(count==numCourses) return true;
     

     return false;
 }
}