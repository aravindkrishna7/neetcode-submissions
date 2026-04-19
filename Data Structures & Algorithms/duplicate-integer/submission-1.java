class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unq = new HashSet<>();
        return Arrays.stream(nums).boxed().filter(num -> !unq.add(num)).findAny().isPresent();
    }
}