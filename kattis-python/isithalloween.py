#! /usr/bin/python3

import sys
 
for line in sys.stdin:
    ab = line.split()
    if ab[0] == 'OCT':
        if ab[1] == '31':
            print("yup")
        else:
            print("nope")
    elif ab[0] == 'DEC':
        if ab[1]=='25':
            print("yup")
        else:
            print("nope")
    else:
        print("nope")
