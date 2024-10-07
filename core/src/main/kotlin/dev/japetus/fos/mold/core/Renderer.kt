package dev.japetus.fos.mold.core

interface Renderer {
    fun render(batchProcess: Renderer.() -> Unit)
    fun draw(image: Image, x: Float, y: Float)
    fun dispose()
}
