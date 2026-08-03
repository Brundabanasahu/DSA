class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def insert_position(head, data, pos):
    new_node = Node(data)

    # Insert at first position
    if pos == 1:
        new_node.next = head
        return new_node

    temp = head

    # Move to (pos-1)th node
    for i in range(pos - 2):
        if temp is None:
            print("Invalid Position")
            return head
        temp = temp.next

    if temp is None:
        print("Invalid Position")
        return head

    new_node.next = temp.next
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
head.next.next = Node(40)

print("Original Linked List:")
print_list(head)

head = insert_position(head, 30, 3)

print("After inserting at position 3:")
print_list(head)