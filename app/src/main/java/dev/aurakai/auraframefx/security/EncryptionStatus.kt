package dev.aurakai.auraframefx.security

sealed class EncryptionStatus {
    object NOT_INITIALIZED : EncryptionStatus()
    object ACTIVE : EncryptionStatus()
    object ERROR : EncryptionStatus()
    data class EncryptionStatusImpl(val message: String) : EncryptionStatus()
}
