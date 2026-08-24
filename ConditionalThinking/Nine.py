num = int(input())

a = num // 100
b = (num // 10) % 10
c = num % 10

if a != b and b != c and a != c:
    print("All digits are distinct")
else:
    print("Digits are not distinct")