abstract class Figure(val id: Int, var x: Int, var y: Int): Transforming, Movable, FigureInterface {
    protected lateinit var sides: FloatArray

    override fun printSidesCount() {
        if (!this::sides.isInitialized) return
        println("Count sides of ${figureName}: ${sides.size}")
    }

    override fun printSides() {
        if (!this::sides.isInitialized) return
        print("Sides of ${figureName}: ")
        for (i in sides.indices) {
            print(sides[i])
            print(" ")
        }
        println()
    }

    override fun resize(zoom: Int) {
        for (i in sides.indices) {
            sides[i] = sides[i] * zoom
        }
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        if (direction == RotateDirection.Clockwise) {
            x = centerX + y - centerY
            y = centerY - x + centerX
        }
        else {
            x = centerX - y + centerY
            y = centerY + x - centerX
        }
        if (sides.size > 1) {
            val t = sides[0]
            sides[0] = sides[1]
            sides[1] = t
        }
    }

    override fun move(dx: Int, dy: Int) {
        x = dx
        y = dy
    }

    fun printCenter() {
        println("$x $y")
    }

    abstract fun area(): Float
}

interface FigureInterface {
    val figureName: String

    fun printSidesCount()
    fun printSides()
}