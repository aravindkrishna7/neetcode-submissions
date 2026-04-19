class Solution {
    public boolean isAnagram(String s, String t) {
        String[] arr1 = s.split("");
        String[] arr2 = t.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return String.join("", arr1).equals(String.join("", arr2));
    }
}
