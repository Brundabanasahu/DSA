x = int(input())
y = int(input())

if x == 0 and y == 0:
    print("Origin")
elif y == 0:
    print("X-axis")
elif x == 0:
    print("Y-axis")
else:
    print("Neither")