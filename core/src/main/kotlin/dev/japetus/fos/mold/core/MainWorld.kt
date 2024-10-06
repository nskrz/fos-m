package dev.japetus.fos.mold.core

import com.badlogic.gdx.graphics.Texture

class MainWorld(private val renderer: Renderer) {
    private val image by lazy { Texture("libgdx.png") }

    fun create() {
    }

    fun update() {
    }

    fun render() {
        renderer.render {
            it.draw(image, 140f, 210f)
        }
    }

    fun dispose() {
        image.dispose()
    }
}
