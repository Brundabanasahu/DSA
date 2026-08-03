n = int(input())
arr = list(map(int, input().split()))

first = second = float('inf')

for i in range(n):
    if arr[i] < first:
        second = first
        first = arr[i]
    elif first < arr[i] < second:
        second = arr[i]

if second == float('inf'):
    print(-1)
else:
    print(second)