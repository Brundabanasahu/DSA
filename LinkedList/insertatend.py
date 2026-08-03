class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def insert_last(head, data):
    new_node = Node(data)

    if head is None:
        return new_node

    temp = head
    while temp.next:
        temp = temp.next

    temp.next = new_node
    return head

def print_list(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")

# Driver Code
head = Node(10)
head.next = Node(20)
head.next.next = Node(30)

print("Original Linked List:")
print_list(head)

head = insert_last(head, 40)

print("After inserting at last:")
print_list(head)