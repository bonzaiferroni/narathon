package ponder.narrathon.model.data

import kotlinx.serialization.Serializable

@Serializable
data class NewExample(
    val label: String,
)