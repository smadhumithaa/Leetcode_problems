//Biweekly contest 84
import java.lang.*;
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ll=new ArrayList<List<Integer>>();
        TreeMap<Integer,Integer> tree=new TreeMap<>();
        for(var i:items1)
            tree.put(i[0],i[1]);
        for(var i: items2){
            tree.putIfAbsent(i[0],0);
            tree.put(i[0],tree.get(i[0])+i[1]);
        }
        for (var item : tree.keySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(item);
            list.add(tree.get(item));
            ll.add(list);
        }
        return ll;
    }
}
