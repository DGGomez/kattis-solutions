line = input().split(" ")
line = [int(i) for i in line]
line.sort()
print(line[0]*line[2])