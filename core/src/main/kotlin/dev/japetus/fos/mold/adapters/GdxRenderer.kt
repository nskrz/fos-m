package dev.japetus.fos.mold.adapters

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils
import dev.japetus.fos.mold.core.Image
import dev.japetus.fos.mold.core.Renderer

class GdxRenderer: Renderer {
    private val batch by lazy { SpriteBatch() }

    override fun render(batchProcess: (renderer: Renderer) -> Unit) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f)

        batch.begin()
        batchProcess(this)
        batch.end()
    }

    override fun draw(image: Image, x: Float, y: Float) {
        if (image is GdxImage) {
            batch.draw(image.texture, x, y)
        }
    }

    override fun dispose() {
        batch.dispose()
    }
}
