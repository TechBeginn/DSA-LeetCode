class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> current = new ArrayList<>();

       backtrack(0, nums, res, current);
       return res;
    }
    public void backtrack(int index, int[] nums, List<List<Integer>> res, List<Integer> current){
        if(nums.length == index){
            res.add(new ArrayList<>(current));
            return;
        }
        //TAKE
        current.add(nums[index]);
        backtrack(index+1, nums, res, current);

        //NOT TAKE
        current.remove(current.size()-1);
        backtrack(index+1, nums, res, current);
    }
}