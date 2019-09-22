
days = input()
sequence = input().split(" ")
sequence = [int(i) for i in sequence]
low = sequence[0] # need to start with some value
day = 0
count = 0
for i in sequence:
    if i < low:
        low = i
        day = count
    count= count + 1
print(day)