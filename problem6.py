import time
from timeit import default_timer as timer
start_time = timer()
s1 = sum([pow(x,2) for x in range(1, 101)])
s2 = pow(sum(x for x in range(1, 101)), 2)

ans = s2 - s1
diff_time = timer()
# 25164150 in 0.000145922666342 seconds
print("{0} in {1} seconds".format(ans, diff_time))
