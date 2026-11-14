
class Solution {
public:
    int minimumSumSubarray(vector<int>& nums, int l, int r) {
        int n = nums.size();
        vector<int> pre(n + 1, 0);

        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }

        int mini = INT_MAX;

        map<int, int> mpp;

        for (int i = l; i <= n; i++) {

            // Add valid starting prefix sum
            mpp[pre[i - l]]++;

            // Remove prefix sum which exceeds length r
            if (i - r - 1 >= 0) {
                int prevsum = pre[i - r - 1];
                mpp[prevsum]--;

                if (mpp[prevsum] == 0)
                    mpp.erase(prevsum);
            }

            // Find largest prefix sum strictly smaller than pre[i]
            auto it = mpp.lower_bound(pre[i]);

            if (it != mpp.begin()) {
                --it;
                mini = min(mini, pre[i] - it->first);
            }
        }

        return mini == INT_MAX ? -1 : mini;
    }
};
