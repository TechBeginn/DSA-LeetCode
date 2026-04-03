class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            int[] freq = new int[26];

            // count characters
            for(char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            // convert freq array to string key
            StringBuilder keyBuilder = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                keyBuilder.append(freq[i]).append("#");
            }

            String key = keyBuilder.toString();

            // hashmap logic
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}