class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();
        String[] temp = null;
        for (String str : strs) {
            temp = str.split("");
            Arrays.sort(temp);
            String res = String.join("", temp);
            if (resultMap.containsKey(res)) {
                List<String> values = resultMap.get(res);
                values.add(str);
                resultMap.put(res, values);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                resultMap.put(res, list);
            }
        }
        return resultMap.values().stream().collect(Collectors.toList());
    }
}
