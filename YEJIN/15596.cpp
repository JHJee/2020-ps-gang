#include <vector>
long long sum(std::vector<int> &a) {
	long long ans = 0;
    int n, i;
    n = a.size();
    for(i = 0; i < n; i++){
        ans += a[i];
    }
	return ans;
}
