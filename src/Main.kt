fun main() {
    println("SQUARE")
    val square = Square(2.5F, 1, 5)
    print("Center of the square: ")
    square.printCenter()
    square.rotate(RotateDirection.CounterClockwise, 2, 3)
    print("Center of the square after CounterClockWise rotation: ")
    square.printCenter()
    println()
    println("Area of the square: ${square.area()}")
    square.resize(5)
    println("Area of the square after zooming in 5 times: ${square.area()}")

    println()

    println("RECTANGLE")
    val rectangle = Rect(2.5F, 5.0F, 1, 5)
    print("The center of the rectangle: ")
    rectangle.printCenter()
    rectangle.rotate(RotateDirection.Clockwise, 2, 3)
    print("The center of the rectangle after ClockWise rotation: ")
    rectangle.printCenter()
    println()
    println("Area of the rectangle: ${rectangle.area()}")
    rectangle.resize(5)
    println("Area of the rectangle after zooming in 5 times: ${rectangle.area()}")

    println()

    println("CIRCLE")
    val circle = Circle(5.0F, 3, -1)
    print("Center of the circle: ")
    circle.printCenter()
    circle.rotate(RotateDirection.CounterClockwise, 2, 3)
    print("Center of the circle after CounterClockWise rotation: ")
    circle.printCenter()
    println()
    println("Area of the circle: ${circle.area()}")
    circle.resize(7)
    println("Area of the circle after zooming in 7 times: ${circle.area()}")


}