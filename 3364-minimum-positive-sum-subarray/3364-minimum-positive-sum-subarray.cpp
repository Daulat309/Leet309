class Solution {
public:
    int minimumSumSubarray(vector<int>& nums, int l, int r) {
        int n = nums.size();
        vector<int> pre(n+1,0);
        int sum = 0;
        for(int i=0;i<n;i++){
            pre[i+1] = pre[i] + nums[i];
        }   

        int mini = INT_MAX;

        map<int,int> mpp; // {sum , cnt of how many times some has appeared}

        for(int i=l;i<=n;i++){
            //  i-r to i-r 

            if(i-l>=0){
                mpp[pre[i-l]]++;
            }

            if(i-r-1>=0){
                mpp[pre[i-r-1]]--;
                if(mpp[pre[i-r-1]]==0) mpp.erase(pre[i-r-1]);
            }

            auto it = mpp.lower_bound(pre[i]);
            // pre[i] - value --> to minimize 
            // 
            if(it!=mpp.begin()){
                it--;
                mini = min(mini,pre[i] - it->first);
            }

        }

        if(mini==INT_MAX) return -1;

        return mini;

    }
};