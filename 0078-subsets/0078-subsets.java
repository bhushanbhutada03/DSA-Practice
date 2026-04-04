/*
LC 78 - Subsets (NO backtracking approach)

~ Idea:
- Har recursive call me NEW temp list banate hai
- Isliye shared state nahi hota
- Isliye remove() / backtracking ki koi need nahi

~ Kaise kaam karta hai:
- Har index pe 2 choice:
    1. include nums[i]
    2. exclude nums[i]
- Include ke case me:
    new list bana → element add karo → pass karo
- Exclude me:
    same temp pass karo (kyuki usme change nahi kiya)

~ Important:
- Har branch ka apna separate list hota hai
- Isliye koi undo (backtracking) required nahi

~ Tradeoff:
- Easy to understand 
- Extra memory use hota hai ❌ (har call me new list banti hai)
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void func(int i, int[] nums, List<Integer> temp, List<List<Integer>> ans) {
            if (i == nums.length) {
                ans.add(new ArrayList<>(temp));
                return;
        }

        // INCLUDE (new list bana ke)
        List<Integer> newTemp = new ArrayList<>(temp);
        newTemp.add(nums[i]);
        func(i + 1, nums, newTemp, ans);

        // EXCLUDE (same temp, kyuki change nahi kiya)
        func(i + 1, nums, temp, ans);
    }
}