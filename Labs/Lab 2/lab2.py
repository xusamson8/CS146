class lab2:
    def isAnagram(self, s, t):
        return sorted(s) == sorted(t)
    
s1= "caps"
t1 = "c4ps"
print(lab2().isAnagram(s1,t1))
print(lab2().isAnagram("",""))
print(lab2().isAnagram("call","calll"))
print(lab2().isAnagram("tips","spit"))
print(lab2().isAnagram("@s","@s"))
print(lab2().isAnagram("cab1","abc1"))