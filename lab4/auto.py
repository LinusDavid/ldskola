import subprocess
Sorted = open("output.txt", "r")
Facit = open("facit.txt", "r")
def compare():
    return (Sorted.read() == Facit.read())

    
print(compare())
