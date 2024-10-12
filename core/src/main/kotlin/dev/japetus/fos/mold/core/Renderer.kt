package dev.japetus.fos.mold.core

interface Renderer {
    fun create()
    fun render(batchProcess: Renderer.() -> Unit)
    fun <T: Number, U: Number> draw(image: Image, x: T, y: U)
    fun dispose()
}
