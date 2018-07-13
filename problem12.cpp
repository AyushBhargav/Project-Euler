#include <iostream>
#include <cmath>
#include <vector>
using namespace std;


int main() {
	vector<int> primes;
	cout<<"Calculating primes\n";
	int prime[1000];
	for(int i = 0; i < 1000; i++) {
		prime[i] = 1;
	}
	for(int i = 2; i < 1000; i++) {
		if(prime[i] == 0) 
			continue;
		int index = 2;
		while((int)pow(i, index) < 1000) {
			int temp = (int)pow(i, index);
			prime[temp] = 0;
			index++;
		}
		primes.push_back(i);
	}
	int num = -1;
	int n = 2;
	int count = 1;
    do{
    	count = 1;
    	int N = ((n + 1) * n) / 2;
    	num = N;
    	for(vector<int>::iterator it=primes.begin(); it != primes.end(); ++it) {
    		int d_count = 1;
    		if(N == 0){
    			break;
			}
			while(N % (*it) == 0) {
				N /= *it;
				d_count++;
			}
			count*=d_count;
		}
		cout<<num<<"->"<<count<<"\n";
    	n++;
	}while(count <= 500);
	cout<<"Required number is: "<<count;
    return 0;
}
