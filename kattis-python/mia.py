line = input().split(" ")
line = [int(i) for i in line]
player1 = [line[0], line[1]]
player1.sort(reverse=True)
player2 = [line[2], line[3]]
player2.sort(reverse=True)
while line[0] != 0:
    if( player1 == player2):
        print("Tie.")
    # check 21 or 12
    elif (player1[0] == 2 and player1[1] == 1):
        print("Player 1 wins.")
    elif (player2[0] == 2 and player2[1] == 1):
        print("Player 2 wins.")
    
    # check 11 or 22 
    elif (player1[0] == player1[1]) and (player2[0]==player2[1]):
        if(player1[0] > player2[0]):
            print("Player 1 wins.")
        elif(player1[0] < player2[0]):
            print("Player 2 wins.")
    elif (player1[0] == player1[1]):
        print("Player 1 wins.")
    elif (player2[0] == player2[1]):
        print("Player 2 wins.")

    # singles
    #check first number
    elif player1[0] > player2[0]:
        print("Player 1 wins.")
    elif player1[0] < player2[0]:
        print("Player 2 wins.")

    # check second number
    elif(player1[0] == player2[0]):
        if player1[1] > player2[1]:
            print("Player 1 wins.")
        elif player1[1] < player2[1]:
            print("Player 2 wins.")

    line = input().split(" ")
    line = [int(i) for i in line]
    player1 = [line[0], line[1]]
    player1.sort(reverse=True)
    player2 = [line[2], line[3]]
    player2.sort(reverse=True)