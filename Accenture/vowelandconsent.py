def check_char(ch):
    if ch.lower() in "aeiou":
        print("Vowel")
    elif ch.isalpha():
        print("Consonant")
    else:
        print("Not an alphabet")


ch = input("Enter a character: ")

check_char(ch)