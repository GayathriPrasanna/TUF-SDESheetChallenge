class Solution {
    public int majorityElement(int[] nums){
       int n = nums.length/2;
       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i : nums){
        hm.put(i,hm.getOrDefault(i,0)+1);
       }
       int ans = -1;
       for(int Boom: hm.keySet()){
        if(hm.get(Boom)>n){
            ans = Boom;
            break;
        }
       }
       return ans;
    }
}