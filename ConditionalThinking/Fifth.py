a = int(input())
b = int(input())
c = int(input())

if a <= 0 or b <= 0 or c <= 0 or a + b <= c or a + c <= b or b + c <= a:
    print("Invalid Triangle")

elif a == b == c:
    print("Equilateral Triangle")

elif a == b or b == c or a == c:
    print("Isosceles Triangle")

else:
    print("Scalene Triangle")