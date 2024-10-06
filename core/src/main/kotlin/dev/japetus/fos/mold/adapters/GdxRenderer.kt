package dev.japetus.fos.mold.adapters

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils
import dev.japetus.fos.mold.core.Renderer

class GdxRenderer: Renderer {
    private val batch by lazy { SpriteBatch() }

    override fun render(batchProcess: (renderer: Renderer) -> Unit) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f)

        batch.begin()
        batchProcess(this)
        batch.end()
    }

    override fun draw(image: Texture, x: Float, y: Float) {
        batch.draw(image, x, y)
    }

    override fun dispose() {
        batch.dispose()
    }
}
