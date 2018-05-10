arr = list(range(1, 1001))
for a in arr:
    flag = False
    for b in arr:
        c = math.sqrt(a**2 + b**2)
        if math.floor(c) == c and a+b+c == 1000:     
            flag = True
            print("{0}*{1}*{2}->{3}".format(a,b,c,a*b*c))
            break
    if flag:
        break
