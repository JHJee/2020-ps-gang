#include <iostream>
using namespace std;
void d(int n);

int self[10001] = { 0 }; // 0 : not checked yet // 1 : non self number

int main(void){
	int i;
	for (i = 1; i <= 10000; i++) {
		if (!self[i]) {
			d(i);
		}
	}
	for (i = 1; i <= 10000; i++) {
		if (!self[i]) {
			printf("%d\n", i);
		}
	}
}

void d(int n) {
	if (n > 10000) return;
	int sum = n;
	int num;
	for (num = n;num > 0;num = num/10) {
		sum += num % 10;
	}
	self[sum] = 1;
	d(sum);
}
