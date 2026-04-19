class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unq = new HashSet<>();
        Optional<Integer> val = Arrays.stream(nums).boxed().filter(num -> !unq.add(num)).findAny();
        return val.isPresent();
    }
}