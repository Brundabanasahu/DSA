class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def delete_head(head):
    if head is None:
        return None

    temp = head
    head = head.next
    del temp
    return head

# Function to print the linked list
def print_list(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")


head = Node(10)
head.next = Node(20)
head.next.next = Node(30)
head.next.next.next = Node(40)

print("Original Linked List:")
print_list(head)

# Delete the head node
head = delete_head(head)

print("Linked List after deleting the head:")
print_list(head)