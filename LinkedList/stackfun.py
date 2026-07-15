stack=[]

while True:
    print("1.Push")
    print("2.pop")
    print("3.display")
    print("4.peek")
    print("5.exit")


    choice=int(input("Enter your choice"))

    match(choice):
        case 1:
            ele=int(input("Enter the element to push"))
            stack.append(ele)
            print("Pushed successfully",ele)
            print("Stack elements are",stack)
            break
        case 2:
            if len(stack)==0:
                print("Stack is empty")
            else:
                ele=stack.pop()
                print("Popped successfully",ele)
                break
        case 3:
            if len(stack)==0:
                print("Stack is empty")
            else:
                print("Stack elements are",stack)
            break
        case 4:
            if len(stack)==0:
                print("Stack is empty")
            else:
                print("Top element is",stack[-1])
            break    
        case 5:
            print("Exiting...")
            break                
    