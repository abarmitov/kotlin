// сочетание определения класса и конструктора одновременно объявляет переменные и задаёт их значения
class Rect(var a: Float, var b: Float, x: Int, y: Int): Figure(0, x, y) {
    init {
        sides = FloatArray(2)
        sides[0] = a
        sides[1] = b
    }

    override fun area(): Float {
        return sides[0] * sides[1]
    }

    override val figureName: String
        get() = "Rect"

}