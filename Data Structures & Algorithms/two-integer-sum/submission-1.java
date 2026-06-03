class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //reduces total hashmap lookups required each loop by utilizing Integer can be null
            Integer index = map.get(target - nums[i]);

            if (index != null) {
                return new int[]{index, i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}

