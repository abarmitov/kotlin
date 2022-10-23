class Square(var a: Float, x: Int, y: Int): Figure(0, x, y) {
    init {
        sides = FloatArray(1)
        sides[0] = a
    }

    override fun area(): Float {
        return sides[0] * sides[0]
    }

    override val figureName: String
        get() = "Square"
}