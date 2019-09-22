import sys
polls = int(input())
costumes = {}
min = sys.maxsize
for i in range(polls):
    costume = input()
    if costume in costumes:
       costumes[costume] = costumes[costume] + 1
    else:
        costumes[costume] = 1
for key in costumes:
    checkMin = costumes.get(key)
    if  checkMin < min:
        min = checkMin
sorted(costumes)
for key in costumes:
    checkMin = costumes.get(key)
    if checkMin == min:
        print(key)
