class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=prerequisites.length;
        int[] indegree=new int[numCourses];
        ArrayList<Integer>[] graph=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            graph[v].add(u); // due to print in reverse order we change v and u
            indegree[u]++;
        }
        int[] ans=new int[numCourses];
        Queue<Integer> que=new LinkedList<>();
        boolean[] visited=new boolean[numCourses];
        int idx=0;
        for(int i=0;i<numCourses;i++){
        if(indegree[i]==0){
            que.add(i);
        }
      }
      while(que.size()>0){
        int temp=que.poll();
        ans[idx++]=temp;
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
      if(idx==numCourses) return ans;
        return new int[0];
    }
}