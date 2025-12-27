package dev.aurakai.auraframefx.ui.components.graph

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

// ConnectionType enum with default properties
enum class ConnectionType {
    DIRECT,
    BIDIRECTIONAL,
    DASHED;
    
    val defaultSize: Float get() = 3f
    val color: Color get() = Color.White
}

// Connection data class
data class Connection(
    val targetId: String,
    val type: ConnectionType = ConnectionType.DIRECT
)

// GraphNode data class
data class GraphNode(
    val id: String,
    val position: Offset,
    val label: String,
    val connections: List<Connection> = emptyList()
)

// Extension function for Offset compatibility
fun Offset.toCompose(): Offset = this
