class Circle (private var r: Float, x: Int, y: Int) : Figure(0, x, y) {

    init {
        sides = FloatArray(1)
        sides[0] = r
    }

    override fun area(): Float {
        return Math.PI.toFloat() * sides[0] * sides[0]
    }

    override fun printSides() {
        println("Circle has no sides")
    }

    override fun printSidesCount() {
        println(0)
    }

    override val figureName: String
        get() = "Circle"
}