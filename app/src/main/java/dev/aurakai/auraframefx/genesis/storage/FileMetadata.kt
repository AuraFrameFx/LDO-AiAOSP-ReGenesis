package dev.aurakai.auraframefx.genesis.storage

import kotlinx.serialization.Serializable

@Serializable
data class FileMetadata(
    val fileId: String,
    val fileName: String,
    val size: Long,
    val mimeType: String,
    val createdAt: Long = System.currentTimeMillis(),
    val modifiedAt: Long = System.currentTimeMillis(),
    val tags: List<String> = emptyList(),
    val encrypted: Boolean = false
)
