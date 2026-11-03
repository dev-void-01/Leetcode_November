class Solution {
    public int minMoves(int[] nums) {
        int mx = nums[0];
        for (int x : nums) if (x > mx) mx = x;
        int ans = 0;
        for (int x : nums) ans += mx - x;
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(sol.minMoves(nums));
    }
}
