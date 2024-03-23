class lab6:
    def canFinish(numCourses, prerequisites):
  #Your code here
        #crateas and empty list of prerequisite for every course we got
        # code means for every course we map it to an empty list
        preMap = { i:[] for i in range(numCourses)}
        #for each course and prereq  pair in the list, this also creates those inline
        for crs, pre in prerequisites: 
            #we append them in the map
          preMap[crs].append(pre)

        # visitSet , all courses along the current DFS path
        # tracking courses visited
          visitSet = set()
          def dfs(crs): #nested function, so we wont have to pass new paremeters again
              if crs in visitSet: # if we are visiting  a course twice aka loop
                  return False
              if preMap[crs] == []:  # if prereq in this course is an empty list we know its true 
                  return True
                
              visitSet.add(crs) #if neither are met , we are currently visitng and we have to run dfs through tit
              for pre in preMap[crs]: #loop through prereq of course run dfs
                  if not dfs(pre): 
                        #if it returns false we return false, if it doesnt execute it s acourse that can be taken then return treu
                      return False
                    #remove from visitSet, we've finished visitng it
                  visitSet.remove(crs)
                    #we know it is removed, we can make an empty list so this condition is immediately if we have to run dfs again
                  preMap[crs] = []
                  return True
          for crs in range(numCourses): # have to do it for everything in cas egraph isnt connected
              if not dfs(crs): return False # if something returns false, we return false immediately
          return True
                    
                    
               
        