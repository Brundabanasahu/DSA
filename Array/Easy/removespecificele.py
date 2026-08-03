n = int(input())
arr = list(map(int, input().split()))
target = int(input())
i=0
for j in range(n):
    if arr[j]!=target:
        arr[i]=arr[j]
        i+=1
print(i)
print(arr[:i])       