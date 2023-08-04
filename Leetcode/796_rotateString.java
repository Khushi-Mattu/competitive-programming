class Solution {
    public boolean rotateString(String s, String goal) {
        String temp=s+s;
        if(temp.contains(goal) && goal.length()==s.length()){
            return true;
        }
        return false;
    }
}