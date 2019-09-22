import math
line = int(input())
for i in range(line):
    values = input().split(" ")
    f = float(values[0])
    R = float(values[1])
    t = float(values[2])
    r = float(values[3])
    g = float(values[4])
    innerR = R-t
    # chance of escape
    innerArea = math.pi * innerR * innerR
    # absolute chance of hitting
    outerArea = (math.pi * R * R) - innerArea
    # size of spaces
    spaceArea = g * g
    # fly area
    flyArea = math.pi * f * f
    