import java.util.*;

class Solution {
    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start-b.start;
        }
        }
    public List<Interval> merge(List<Interval> intervals){
        LinkedList<Interval> li = new LinkedList<>();
        intervals.sort(new IntervalComparator());
        for(Interval i: intervals){
            if(li.isEmpty())
                li.add(i);

            else if(li.getLast().end>=i.start || i.end<=li.getLast().end){
                Interval temp = li.removeLast();
                Interval k =new Interval(temp.start,temp.end>i.end?temp.end:i.end);
                li.add(k);
                }
            else
                li.add(i);
        }
        return li;


    }


    public static void main(String[] args) {
        Solution s = new Solution();
        Interval i = new Interval(2,6);
        List<Interval> li = new ArrayList<>();
        li.add(i);
        i = new Interval(1,3);
        li.add(i);
        i = new Interval(8,10);
        li.add(i);
        i = new Interval(15,16);
        li.add(i);
        i = new Interval(7,8);
        li.add(i);
        List<Interval> k = s.merge(li);
        for(Interval j : k)
            System.out.println(j.start+" "+ j.end);
    }
}