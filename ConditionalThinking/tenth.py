x = int(input("Enter the x-coordinate: "))
y = int(input("Enter the y-coordinate: "))

if x > 0 and y > 0:
    print("Quadrant 1")
elif x < 0 and y > 0:
    print("Quadrant 2")
elif x < 0 and y < 0:
    print("Quadrant 3")
elif x > 0 and y < 0:
    print("Quadrant 4")
else:
    print("Point lies on axis")