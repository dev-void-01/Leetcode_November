class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        long moves = 0;
        for (int num : nums) {
            moves += Math.abs(num - median);
        }
        return (int) moves;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3 };
        int result = solution.minMoves2(nums);
        System.out.println("Minimum moves to equal array elements II: " + result);
    }
}