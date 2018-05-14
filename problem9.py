from timeit import default_timer as timer
start_time = timer()
arr = list(range(1, 1001))
ans = -1
for a in arr:
    flag = False
    for b in arr:
        c = math.sqrt(a**2 + b**2)
        if math.floor(c) == c and a+b+c == 1000:     
            flag = True
            ans = c
            break
    if flag:
        break

diff_time = timer()
# 425.0 in 0.614862781375 seconds
print("{0} in {1} seconds".format(ans, diff_time))
