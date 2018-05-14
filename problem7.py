from timeit import default_timer as timer
start_time = timer()
primes = []
num = 2
prime_count = 0
ans = -1
while True:
    flag = True
    for prime in primes:
        if num % prime == 0:
            flag = False
            break
    if flag:
        prime_count += 1
        primes.append(num)
    if prime_count == 10001:
        ans = num
        break
    num += 1

diff_time = timer()
# 104743 in 26.408278233 seconds
print("{0} in {1} seconds".format(ans, diff_time))
