val = int(input())
factors = 0
factor = 2

while factor*factor <= val:
    if val%factor == 0:
        val /= factor
        factors = factors + 1
    else:
        factor = factor + 1
print(factors+1)