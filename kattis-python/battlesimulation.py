def combocheck(value):
    if "R" in value:
        if "B" in value:
            if "L" in value:
                return True
    return False
line = input()
result = ""
cc = ""
counter = 0
while counter < (len(line) + 1):
    if (counter + 3) < (len(line) +1):
        if(combocheck(line[counter:counter+3])):
            result= result+ "C"
            counter = counter + 3
            continue
    if line[counter:counter+1] == "R":
        result = result + "S"
    if line[counter:counter+1] == "B":
        result = result + "K"
    if line[counter:counter+1] == "L":
        result = result + "H"
    counter= counter +1
print(result)