for i in range(int(input())):
    input()
    armies = input().split(" ")
    armyG = input().split(" ")
    armyM = input().split(" ")
    armyG = [int(i) for i in armyG]
    armyG.sort()
    armyG = set(armyG)
    armyG = list(armyG)
    armyM = [int(i) for i in armyM]
    armyM.sort()
    armyM = set(armyM)
    armyM = list(armyM)
    while True:
        if len(armyG) == 0:
            print("MechaGodzilla")
            break
        if len(armyM) == 0:
            print("Godzilla")
            break
        if armyG[0] >= armyM[0]:
            del armyM[0]
        else:
            del armyG[0]
