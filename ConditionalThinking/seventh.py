hour = int(input())

if hour < 12:
    print("Good Morning")
elif hour < 17:
    print("Good Afternoon")
elif hour < 21:
    print("Good Evening")
else:
    print("Good Night")