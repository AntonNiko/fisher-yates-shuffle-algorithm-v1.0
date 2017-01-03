from shuffler import Yates

def main():
    yates = Yates()
    test1 = [0,-5,3,12,19,8,20]
    test2 = ["b","i","r","c","h","t","r","e","e"]
    print(yates.shuffle(test1))
    print(yates.shuffle(test2))
    
if __name__ == '__main__':
    main()
