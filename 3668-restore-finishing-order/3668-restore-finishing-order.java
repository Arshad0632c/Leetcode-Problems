class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> arr = new ArrayList<>();
        int ans[] = new int[friends.length];
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    arr.add(order[i]);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        return ans;
    }
}