n=int(input())
arr=list(map(int,input().split()))
first=second=float('-inf')
for i in range(n):
    if first<arr[i]:
        second=first
        first=arr[i]
    elif second<arr[i] and arr[i]!=first:
        second=arr[i]
print(second)            