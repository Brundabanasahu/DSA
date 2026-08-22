def climbStairs(n):
        if n<=3:
            return n

        a,b=3,2
        for i in range(0,n-3):
            a=a+b
            b=a-b
                
        return a

print(climbStairs(2))