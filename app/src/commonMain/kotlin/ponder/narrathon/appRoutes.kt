package ponder.narrathon

import kotlinx.serialization.Serializable
import pondui.ui.nav.AppRoute
import pondui.ui.nav.matchLongIdRoute
import pondui.ui.nav.matchStringIdRoute

@Serializable
object StartRoute : AppRoute("Start")

@Serializable
object HelloRoute : AppRoute("Hello")

@Serializable
object ExampleListRoute : AppRoute("Examples")

@Serializable
object DispatchRoute : AppRoute("Dispatch")

@Serializable
object LibraryRoute : AppRoute("Library")

@Serializable
data class ExampleProfileRoute(val exampleId: Long) : AppRoute(TITLE) {
    companion object {
        const val TITLE = "Example"
        fun matchRoute(path: String) = matchLongIdRoute(path, TITLE) { ExampleProfileRoute(it) }
    }
}