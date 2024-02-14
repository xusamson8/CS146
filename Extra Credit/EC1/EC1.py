class ec1:
    def fibonacci(self, n):
        #Base Cases
        if n==0:
            return 0
        elif n == 1:
            return 1
        
        a,b = 0,1
        for i in range (2,n+1): #range(start, stop) ; n+1 in this to include the nth number
            a,b=b , a+b # if we perform it seperately it will result in vastly different sums, in a two linera would already be b, making b basically b+b

        return b

print(ec1().fibonacci(5))
print(ec1().fibonacci(2))
print(ec1().fibonacci(1))
print(ec1().fibonacci(0))
print(ec1().fibonacci(9))
print(ec1().fibonacci(10))
#pretty much the same as the java version but in python syntax.
