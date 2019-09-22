cases = int(input())
for i in range(cases):
    s = int(input())
    listSearch = []
    search = set()
    count = 0
    for j in range(s):
        listSearch.append(input())
    q = int(input())
    for k in range(q):
        value = input()
        if value in search:
            continue
        else:
            search.add(value)
        if len(search) == s:
            count = count + 1
            search.clear
    print("Case #"+str(i+1)+": "+str(count))
