n = int(input())
arr = list(map(int, input().split()))
count=0
result=None
for num in arr:
    if count==0:
        print(num)
    if num==result:
        count+=1
    else:
        count-=1


#solve using moore's voting algorithm