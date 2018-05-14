#include<iostream>
#include<vector>
#include<ctime>

using namespace std;

int main() {
	time_t begin;
	time(&begin);
	vector<int> primes;
	int count = 0;
	int i;
	for(i = 2; count < 10001; i++) {
		bool flag = true;
		for(vector<int>::iterator it = primes.begin(); it != primes.end(); it++) {
			if(i % *it == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			primes.push_back(i);
			count++;
		}
	}
	time_t end;
	time(&end);
	double diff = difftime(end, begin);
	// 104743 in 5 seconds.
	cout<<--i<<" in "<<diff<<" seconds."; // Removing increment.
}
