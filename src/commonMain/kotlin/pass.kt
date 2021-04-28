import kotlinx.serialization.Serializable

enum class Shape { SQUARE, ROUNDED_SQUARE, CIRCLE, RECTANGLE }
@Serializable
data class Design(val image: String, val shape: Shape)
@Serializable
data class Price(val dollars: Int, val cents: Int) {
    init {
        if (dollars < 0 || cents < 0) {
            throw IllegalArgumentException("Price cannot be negative")
        }
    }
}
@Serializable
data class PassTemplate(val design: Design, val cost: Price)