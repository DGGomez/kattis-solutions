vals = input().split(" ")
r = int(vals[0])
n = int(vals[1])
taken = set()
for i in range(n):
    taken.add(int(input()))
sorted(taken)
if len(taken) == r:
    print("too late")
else:
    for j in range(1,r+1):
        if j in taken:
            continue
        else:
            print(j)
            break
