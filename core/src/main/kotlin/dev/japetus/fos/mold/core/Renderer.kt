package dev.japetus.fos.mold.core

interface Renderer {
    fun render(batchProcess: (renderer: Renderer) -> Unit)
    fun draw(image: Image, x: Float, y: Float)
    fun dispose()
}
