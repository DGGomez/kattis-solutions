tests = int(input())
for loops in range(tests):
    line1 = input().split(" ")
    m = line1[0]
    r = line1[1]
    line2 = input().split(" ")
    #make list
    list1 = "1"
    for i in range(2, int(m)+1):
        list1 = list1 + str(i)
    arr = ""
    # iterate through list
    for j in line2:
        valIndex = list1.index(j)
        arr= arr + str(valIndex)+ " "
        list1 = j+" "+list1[:valIndex] + list1[(valIndex+1):]

    print(arr.rstrip())