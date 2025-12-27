package dev.aurakai.auraframefx.cascade

object DataveinConstructor {
    fun construct(data: Any): String = data.toString()
}

object GenKitMaster {
    fun generate(prompt: String): String = "Generated: $prompt"
}
