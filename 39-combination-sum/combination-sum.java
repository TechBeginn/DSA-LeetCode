class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
        helper(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void helper(int index, int[] candidates, int target, 
        List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index == candidates.length) {
            return;
        }
        current.add(candidates[index]);
        helper(index, candidates, target - candidates[index], current, result);

        current.remove(current.size() - 1);
        helper(index + 1, candidates, target, current, result);
    }

}