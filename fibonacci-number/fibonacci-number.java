class Solution {
    public int fib(int N) {
        if(N < 2){
            return N;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        
        if(map.containsKey(N)){
            return map.get(N);
        }else{
            int sum = fib(N - 1) + fib(N - 2);
            map.put(N, sum);
            return sum;
        }
        
        
    }
}
