//First TLE then on submitting it a second time, it passed

class MedianFinder {
    
    List<Integer> list;
    public MedianFinder() {
        this.list=new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        list.add(num);
    }
    
    public double findMedian() {
        Collections.sort(list);
        int length=list.size();
        if(length%2!=0){
            return (double) list.get(length/2);
        }
        else if(length<=1){
            return list.get(0);
        }
        else{
            return (double) (list.get(length/2)+list.get(length/2-1))/2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */