line = input().split()
g = int(line[0])
s = int(line[1])
c = int(line[2])
power = g*3 + s*2 + c
if power > 7:
    print('Province or Gold')
elif (power == 7):
    print('Duchy or Gold')        
elif (power == 6):
    print('Duchy or Gold')
elif (power == 5):
    print('Duchy or Silver')
elif (power == 4):
    print('Estate or Silver')
elif (power == 3):
    print('Estate or Silver')
elif (power == 2):
    print('Estate or Copper')
else:
    print('Copper')