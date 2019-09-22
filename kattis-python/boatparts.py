val = input().split(" ")
p = int(val[0])
n = int(val[1])
success = 0
parts = set()
for i in range(n):
    part = input()
    parts.add(part)
    if(len(parts) == p):
        print(i+1)
        success = 1
        break
if success != 1:
    print("paradox avoided")
    