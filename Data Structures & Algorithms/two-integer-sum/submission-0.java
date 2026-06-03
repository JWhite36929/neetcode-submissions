class Solution {
    public int[] twoSum(int[] nums, int target) {
        //maps keys to indicies
        HashMap<Integer, Integer> visited = new HashMap<>();

        //visit each value and add it to the map if the map does not have the diff as a key
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if (visited.containsKey(diff)){
                return new int[] { visited.get(diff), i};
            }

            visited.put(num, i);
        }

        return new int[] {};
    }
}
