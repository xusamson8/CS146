class hw2:
    #You are given an API bool isBadVersion(version) which returns whether version is bad. 
    def firstBadVersion(self, n):
        low, high = 1, n
        while low <= high:
	        mid = low + (high-low) // 2
	        if isBadVersion(mid):
		        high = mid - 1
	        else:
		        low = mid +1
        return low

