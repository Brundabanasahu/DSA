class Node:
    def __init__(self,value,next_node):
        self.data=value
        self.next=next_node

def arrToLink(arr):
    temp=head
    cur=temp
    for i in range(1,len(arr)):
        temp=Node(arr[i])
        cur.next=temp
        cur=cur.next
    return head    

n=int(input())
if n>0:
    arr=list(map(int,input().split()))

arrToLink(arr)    