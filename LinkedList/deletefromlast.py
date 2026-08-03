class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Delete the last node
def delete_last(head):
    # If the list is empty
    if head is None:
        return None

    # If there is only one node
    if head.next is None:
        del head
        return None

    temp = head

    # Traverse to the second-last node
    while temp.next.next:
        temp = temp.next

    # Delete the last node
    last = temp.next
    temp.next = None
    del last

    return head

# Print the linked list
def print_list(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")

# ---------------- Driver Code ----------------

# Create Linked List: 10 -> 20 -> 30 -> 40
head = Node(10)
head.next = Node(20)
head.next.next = Node(30)
head.next.next.next = Node(40)

print("Original Linked List:")
print_list(head)

# Delete the last node
head = delete_last(head)

print("Linked List after deleting the last node:")
print_list(head)