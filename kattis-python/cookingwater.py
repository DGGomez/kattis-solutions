times = int(input())
start = []
end = []
for i in range(times):
    line = input().split(" ")
    start.append(line[0])
    end.append(line[1])

for i in range(times):
    for j in range(i,times):
        if( start[i] > start[j] ):