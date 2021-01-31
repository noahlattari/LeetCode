class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        Queue<Character> pq = new PriorityQueue<>((a,b) -> (map.get(b) - map.get(a)));
        for(char ch: map.keySet()){
            pq.add(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.peek();
            int count = map.get(pq.poll());
            while(count > 0){
                sb.append(ch);
                count--;
            }
        }
        
        return sb.toString();
        
        
    }
}