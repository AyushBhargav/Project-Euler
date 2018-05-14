start_time = time.time()
primes = [2,3,5,7,11,13,17,19]
factors = {str(num):0 for num in primes}
for num in range(2,21):
    for prime in primes:
        if prime > num:
            break
        powers = 0
        tmp = num
        while(tmp % prime == 0):
            tmp /= prime
            powers += 1
        if powers > factors[str(prime)]:
            factors[str(prime)] = powers
ans = 1
mul = [pow(int(n), p) for n, p in factors.items()]
for m in mul:
    ans *= m
diff_time = time.time() - start_time
print("{0} in {1} seconds".format(ans, diff_time))
