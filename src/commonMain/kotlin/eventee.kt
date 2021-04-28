import kotlinx.serialization.Serializable

// eventees will attend events. They have a list of passes, which are unique to them.
data class Eventee(val username: String, val token: String, val passes: List<Pass>)

// passes are the unique instances of pass templates that eventees will be given.
@Serializable
data class Pass(val uniqueID: String, val passTemplate: PassTemplate)