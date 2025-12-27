package dev.aurakai.auraframefx.genesis.bridge

import dev.aurakai.auraframefx.models.Persona

data class AgentMemoryEntity(
    val id: String,
    val persona: Persona,
    val content: String,
    val contextTags: List<String>,
    val confidence: Float,
    val timestamp: Long = System.currentTimeMillis()
)
