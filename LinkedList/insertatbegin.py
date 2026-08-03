class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def insert_first(head, data):
    new_node = Node(data)
    new_node.next = head
    head = new_node
    return head

def print_list(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")

# Driver Code
head = Node(20)
head.next = Node(30)
head.next.next = Node(40)

print("Original Linked List:")
print_list(head)

head = insert_first(head, 10)

print("After inserting at first:")
print_list(head)