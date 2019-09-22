def ssd(base, n):
    ans = 0
    while n:
        d = int(n%base)
        ans += d*d
        n = n/base
    return str(ans)

n = int(input())
for i in range(1,n+1):
    line = input().split(" ")
    base = int(line[1])
    n = int(line[2])
    print(str(i)+" "+ssd(base,n))
