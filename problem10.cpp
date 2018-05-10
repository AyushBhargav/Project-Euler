#include<iostream>
#include<vector>

using namespace std;

int main() {
	vector<int> primes;
	int size = 2000000;
	// Vector initialization
	for(int i = 0; i < size; i++) {
		primes.push_back(1);
	}
	unsigned long long sum = 0;
	// Real computation
	for(int i = 2; i < primes.size(); i++) {
		if(primes[i] == 0) // If composite. 
			continue;
		if(primes[i] == 1)
			sum = sum + long(i);
		for(int j = 2; j * i < size; j++) {
			// Not a prime
			primes[j*i] = 0;
		}
	}
	cout<<sum;
}
