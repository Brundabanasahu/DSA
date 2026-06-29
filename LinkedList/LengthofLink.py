class Node:
    def __init__(self, value, next_node=None):
        self.data = value
        self.next = next_node


def arrToLink(arr):
    if len(arr) == 0:
        return None

    head = Node(arr[0])
    cur = head

    for i in range(1, len(arr)):
        temp = Node(arr[i])
        cur.next = temp
        cur = temp

    return head


def length(head):
    count = 0
    temp = head

    while temp is not None:
        count += 1
        temp = temp.next

    return count


n = int(input())
arr = []

if n > 0:
    arr = list(map(int, input().split()))

head = arrToLink(arr)
print(length(head))