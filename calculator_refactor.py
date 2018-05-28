#!/usr/bin/python
import sys
import argparse
import math

class Shape:
    def __init__(self, type):
        self.type = type

    def area(self):
        raise Exception('area is not implemented.')

    def typename(self):
        return self.type


class Rectangle(Shape):
    def __init__(self, width, height):
        super(Rectangle, self).__init__("rectangle")
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height


class Circle(Shape):
    def __init__(self, radius):
        super(Circle, self).__init__("circle")
        self.radius = radius

    def area(self):
        return math.pow(self.radius,2) * math.pi
        

class Triangle(Shape):
    def __init__(self, base, height):
        super(Triangle, self).__init__("triangle")
        self.base = base
        self.height = height

    def area(self):
        return ((0.5 * self.base) * self.height)
        
        
class Parallelogram(Shape):
    def __init__(self, base, height):
        super(Parallelogram, self).__init__("parallelogram")
        self.base = base
        self.height = height

    def area(self):
        return (self.base * self.height)


def parseArgs(argv):
    descriptionStr = """ 
        [Calculate Triangle]
        calculator.py -s triangle -b [BASE] -i [HEIGHT]
        \r\n\r\n
        [Calculate Rectangle]
        calculatory.py -s rectangle -w [WIDTH] -i [HEIGHT]
        \r\n\r\n
        [Calculate Parallelogram]
        calculator.py -s parallelogram -b [BASE] -i [HEIGHT]
        \r\n\r\n
        [Calculate Circle]
        calculator.py -s circle -r [RADIUS] """
    
    parser = argparse.ArgumentParser(description=descriptionStr)
    parser.add_argument('-s','--shape', help = 'Shape to calculate', required=True)
    parser.add_argument('-b','--base', type = float, help = 'Base of a shape', required=False)
    parser.add_argument('-w','--width', type = float, help = 'Width of a shape', required=False)
    parser.add_argument('-i','--height', type = float, help = 'Height of a shape', required=False)
    parser.add_argument('-r','--radius', type = float, help = 'Radius of a shape', required=False)
    parser.add_argument('-d','--diameter', type = float, help = 'Diameter of a shape', required=False)
    
    args = parser.parse_args(argv[1:])
    
    supportedShapes = ["rectangle", "circle", "triangle", "parallelogram"]
    if args.shape not in supportedShapes:
        raise Exception("The specified shape is not supported.")
        
    if args.shape == supportedShapes[0]:
        if args.width is None:
           raise Exception(displayArgRequired(args.shape, "width"))
           
        if args.height is None:
           raise Exception(displayArgRequired(args.shape, "height"))
 
    if args.shape == supportedShapes[1]:
        if args.radius is None:
            if args.diameter is None:
                raise Exception("To compute area of circle, either raidus or diameter argument is required.")
           
    if (args.shape == supportedShapes[2]) or (args.shape == supportedShapes[3]):
        if args.base is None:
            raise Exception(displayArgRequired(args.shape, "base"))
           
        if args.height is None:
            raise Exception(displayArgRequired(args.shape, "height"))
 
    return args

    
def displayResult(name, area):
    print("Area of a %s is [%s]" % (name, area))
    

def displayArgRequired(name, arg):
    return("To compute area of %s, %s argument is required." % (name, arg))
    
def main():
    try:
        args = parseArgs(sys.argv)
        
        if args.shape == "rectangle":
            shape = Rectangle(args.width, args.height)
            
        if args.shape == "circle":
            if args.radius == None:
                shape = Circle(args.diameter / 2)
            else:
                shape = Circle(args.radius)
            
        if args.shape == "triangle":
            shape = Triangle(args.base, args.height)
            
        if args.shape == "parallelogram":
            shape = Parallelogram(args.base, args.height)
            
        area = shape.area()
        displayResult(shape.typename() , shape.area())
        
    except Exception as err:
        print('Error:', err.args[0])
        return
     

if __name__ == "__main__":
    main()