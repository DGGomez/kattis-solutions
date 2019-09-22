import sys

lh = 0
lm = 0
ls = 0
h = 0
m = 0
s = 0
speed = 0
start = 0
distance = 0
for line in sys.stdin:
    line = line.split(" ")
    time = line[0].split(":")
    h = int(time[0])
    m = int(time[1])
    s = int(time[2])
    if len(line) > 1:
        if start == 0:
            start = 1
            lh = h
            lm = m
            ls = s
        else:
            # take last time and speed
            distance = distance + (h-lh) * speed + ((m-lm) * speed / 60) + ((s-ls) * speed / 3600)
            lh = h
            lm = m
            ls = s
        speed = int(line[1])

    else:
        distance = distance + (h-lh) * speed + ((m-lm) * speed / 60) + ((s-ls) * speed / 3600)
        lh = h
        lm = m
        ls = s
        print(time[0]+":"+time[1]+":"+time[2].rstrip()+" %.2f" %round(distance,2)+" km")
