class Node:
    def __init__(self,value,next_node):
        self.data=value
        self.next=next_node

def arrToLink(arr):
    if len(arr)==0:
        return None
    head=Node(arr[0],None)
    cur=head
    for i in range(1,len(arr)):
        temp=Node(arr[i],None)
        cur.next=temp
        cur=cur.next
    return head    

n=int(input())
arr=[]
if n>0:
    arr=list(map(int,input().split()))

head = arrToLink(arr)

temp = head
while temp:
    print(temp.data, end=" ")
    temp = temp.next   