password =input()

has_digit = False

for ch in password:
    if ch.isdigit():
        has_digit = True
        break

if len(password) >= 8 and has_digit:
    print("Valid Password")
else:
    print("Invalid Password")