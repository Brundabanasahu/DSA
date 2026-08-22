def two_sum(arr, target):
    arr.sort()

    left = 0
    right = len(arr) - 1

    while left < right:
        total = arr[left] + arr[right]

        if total == target:
            return [arr[left], arr[right]]
        elif total < target:
            left += 1
        else:
            right -= 1

    return None

arr = [2, 7, 11, 15]
target = 16

print(two_sum(arr, target))