s1 = sum([pow(x,2) for x in range(1, 101)])
s2 = pow(sum(x for x in range(1, 101)), 2)

print(s2 - s1)
