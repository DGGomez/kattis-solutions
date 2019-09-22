import sys
dict = {}
for line in sys.stdin:
    s = line
    line = line.split(" ")
    result = 0
    unk = 0
    state = ""
    if line[0] == "def":
        # define
        dict[line[1]] = int(line[2])
    elif line[0] == "calc":
        for i in range(1, len(line)):

            if i == 1:
                if dict.get(line[i]) == None:
                    unk=1
                    break
                result = dict.get(line[i])
            elif i % 2 == 0:
                state = line[i]
            else:
                if dict.get(line[i]) == None:
                    unk=1
                    break
                if state == "-":
                    result = result - int(dict.get(line[i]))
                else:
                    result = result + int(dict.get(line[i]))
        if unk == 1:
            print(s[5::].rstrip()+" unknown")
            unk=0
        else:           
            if result in dict.values():
                val = list(dict.keys())[list(dict.values()).index(result)]
                print(s[5::].rstrip()+" "+val) 
            else:
                print(s[5::].rstrip()+" unknown")

    else:
        dict.clear()  
    # calculate
    # loop through list and perform functions