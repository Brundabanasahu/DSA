n = int(input())
arr = list(map(int, input().split()))
result = []
for i in range(n):
    if arr[i] == 0:
        result.append(0)

for i in range(n):
    if arr[i] != 0:
        result.append(arr[i])

print(*result)