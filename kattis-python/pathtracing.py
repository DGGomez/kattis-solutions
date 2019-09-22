import sys
up = 0
down = 0
left = 0
right = 0
s = [0,0]
e = [0,0]
matrix = [1,1]
listoflists = ['S']
# build internal
while True:
    input_ = sys.stdin.readline()
    if input_ == '':
        break
    else:
        if input_ == 'down':
            down= down+1
            matrix = adjustMatrix(down,up,right,left, matrix)
            # add lines
        if input_ == 'up':
            up = up+1
            matrix = adjustMatrix(down,up,right,left, matrix)
 
            # am I in the array
            # add lines
        if input_ == 'left':
            left = left +1
            # am I in the array
            # add lines
            matrix = adjustMatrix(down,up,right,left, matrix)

        if input_ == 'right':
            right = right+1
            matrix = adjustMatrix(down,up,right,left, matrix)

            # am I in the array
            # add lines
s = adjustS(down,up,right,left)
e = adjustE(down,up,right,left)
# build wall around it
# create line matrixY +2 long and matrixX +2 long
def adjustS (down,up, right, left):
    y = up-down
    x = left-right
    if y < 0: y = 0
    if x < 0: x = 0
    return [x,y]

def adjustE (down,up, right, left):
    y = down-up
    x = right-left
    if y < 0: y = 0
    if x < 0: x = 0
    return [x,y]

def adjustMatrix (down,up, right, left, arr):
    # take largest value of x and y
    if up > down:
        # check if array size changes on y
        if(arr[1] < up):
            arr[1] = up
    else:
        if(arr[1] < down):
            arr[1] = down
    if right > left:
        if(arr[0] < right):
            arr[0] = right
    else:
        if(arr[0] < left):
            arr[0] = left
    return arr

# append to listoflists
def adjustList (change, list):
    if change == 1:
        #up
        sub = [" "]* list[0].length
        list = sub + list
    elif change == 2:
        # down
        sub = [" "]* list[0].length
        list.append(sub)
    elif change == 3:
        # right
        for i in list:
            i.append(" ")
    else:
        # left
        for i in list:
            i = " "+i

    