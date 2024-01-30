import java.awt.Color

class Cercle() {

    var radi: Float = 0.0f
    var color: String = "blanc"

    constructor(radi: Float, color: String):this() {
        this.radi = radi
        this.color = color
    }

    constructor(radi: Float):this() {
        this.radi = radi
    }

    fun perimetre(): Float {
        return 2 * Math.PI.toFloat() * radi
    }

    fun area(): Float {
        return Math.PI.toFloat() * radi * radi
    }

    override fun toString(): String {
        return super.toString()
    }


}