class Fibonacci:
    def fibonacci(self, n):
        #Base Cases
        if n==0:
            return 0
        elif n ==1:
            return 1
        
        a,b = 0,1
        for i in range (2,n+1): #range(start, stop) ; n+1 in this to include the nth number
            a = b
            b = a+b

        return b

print(Fibonacci().fibonacci(10))

#pretty much the same as the java version but in python syntax.
