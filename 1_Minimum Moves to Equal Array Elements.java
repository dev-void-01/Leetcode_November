class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }

        return sum - (nums.length * min);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3 };
        int result = solution.minMoves(nums);
        System.out.println("Minimum moves to equal array elements: " + result);
    }
}