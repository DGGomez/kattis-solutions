import math
miles = float(input())
result = miles*1000 * (5280/4854)
if result % 1 >= 0.5:
    result = int(math.ceil(result))
else:
    result = int(math.floor(result)) 
print(result)