#include <iostream>
using namespace std;

int main() {
	int c, i, n, j, temp;
	int sum = 0;
	int avg = 0;
	int total = 0;
	cin >> c;
	for (i = 0; i < c; i++) {
		cin >> n;
		sum = 0;
		int* arr = new int[n];
		for (j = 0; j < n; j++) {
			cin >> temp;
			arr[j] = temp;
			sum += temp;
		}
		avg = sum / n;
		total = 0;
		for (j = 0; j < n; j++) {
			if (arr[j] > avg)
				total++;
		}
		cout << fixed;
		cout.precision(3);
		cout << ((float)total / n) * 100 << "%" << endl;
		delete[] arr;
	}
}
