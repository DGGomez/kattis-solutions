result = 0
for _ in range(int(input())):
    i = input().split()
    result = result + (float(i[0]) * float(i[1]))
print("%.3f" % round(result,3))