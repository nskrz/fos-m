package dev.japetus.fos.mold.core

import com.badlogic.gdx.graphics.Texture

interface Renderer {
    fun render(batchProcess: (renderer: Renderer) -> Unit)
    fun draw(image: Texture, x: Float, y: Float)
    fun dispose()
}
