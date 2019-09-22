values = input().split(" ")
while 
def collatz(x):
    if x > 1:
        steps = 0
        while x != 1:
            if x % 2 != 0:
                newx = 3 * x + 1
            else:
                newx = x // 2 
            x = newx
            steps += 1
