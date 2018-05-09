primes = []
num = 2
prime_count = 0
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
        print(num)
        break
    num += 1
