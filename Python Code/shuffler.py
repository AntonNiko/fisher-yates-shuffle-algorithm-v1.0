import random

class Yates():
    def __init__(self):
        pass

    def shuffle(self,data):
        ## Track shuffled elements here
        boundary = len(data)-1 # Last element index, starting from 0
        while boundary!=0:
            baseIndex = boundary
            newIndex = random.randint(0,boundary-1)
            ## Shuffle elements
            data = self._switchElements(data,baseIndex,newIndex)
            boundary-=1
            
        return data
        
    def _switchElements(self,data,baseIndex,newIndex):
        newIndexValue = data[baseIndex]

        data[baseIndex] = data[newIndex]
        data[newIndex] = newIndexValue
        return data 
        

        
