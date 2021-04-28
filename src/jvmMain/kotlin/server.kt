import io.ktor.application.*
import io.ktor.features.*
import io.ktor.html.respondHtml
import io.ktor.http.HttpStatusCode
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.routing.*
import io.ktor.serialization.*
import kotlinx.html.*

fun HTML.index() {
    head {
        title("Pass Platform")
    }
    body {
        div {
            +"Hello from Ktor"
        }
        div {
            id = "root"
        }
        script(src = "/static/output.js") {}
    }
}

// TODO modularize this using https://ktor.io/docs/creating-http-apis.html#dependencies ?
fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        routing {
            get("/") {
                call.respondHtml(HttpStatusCode.OK, HTML::index)
            }
            static("/static") {
                resources()
            }
            route("/api") {

            }
        }
        install(CORS) {
            anyHost()
        }
        install(ContentNegotiation) {
            json()
        }
    }.start(wait = true)
}