class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        //T(C(N)==O(N)) and S(C(N)==O(N)) as it requires non contiguous memory space allication iteratively
        Queue<Integer> q =new LinkedList<>();//Queue Declare
        q.offer(0);//Inserting 0 at Queue's Initial indx
        for(int i=1;i<s.length();i++){//string's Length Iteration
            if(s.charAt(i)=='0'){//Inintializing string at 0th indx pos
                while(!q.isEmpty() && q.peek()<i-maxJump)//Dequeueing The Queue 's FrontMost Element 
                    q.poll();

                if(q.isEmpty())return false;//Printing False to the Non vacant queue
                int prev=q.peek();//Queue's Prev indx Pos Declare
                if(prev+maxJump>=i && prev+minJump<=i){//inserting Queue's CUrrent Indx Position at its previous MaxJump
                    q.offer(i);
                    if(i==s.length()-1)return true;}}}//Printing True to the Queue's Final Pos
                    return false;}}//Printing False to the Non Final Pos
