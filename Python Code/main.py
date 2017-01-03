from shuffler import Yates

def main():
    yates = Yates()
    data = listGet()
    result = yates.shuffle(data)

    print("Shuffled list: {}".format(result))
    
def listGet():
    elements = int(input("Number of elements: "))
    data = []
    for i in range(elements):
        data.append(input("Index {}: ".format(i)))
    return data

if __name__ == '__main__':
    main()
