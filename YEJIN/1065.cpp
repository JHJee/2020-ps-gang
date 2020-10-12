#include <iostream>
using namespace std;

int main(void){
	int i;
	int num;
	int res = 0;
	cin >> num;
	if (num <= 99) {
		res = num;
	}
	else {
		res = 99;
		int hundred;
		int ten;
		int one;
		for (i = 100; i <= num; i++) {
			hundred = i / 100;
			ten = (i % 100) / 10;
			one = i % 10;
			//등차수열인 경우 res++
			//모든 자리수가 같은 숫자일 경우
			if (hundred == ten && ten == one) {
				res++;
			}
			//모든 자리수의 차이가 같을경우
			else if (hundred - ten == ten - one) {
				res++;
			}
		}
	}
	cout << res << endl;
}
