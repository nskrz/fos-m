package dev.japetus.fos.mold.adapters

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils
import dev.japetus.fos.mold.core.Image
import dev.japetus.fos.mold.core.Renderer

class GdxRenderer: Renderer {
    private val batch by lazy { SpriteBatch() }
    private val camera by lazy { OrthographicCamera() }

    override fun create() {
        camera.setToOrtho(true, Gdx.graphics.width.toFloat(), Gdx.graphics.height.toFloat())
    }

    override fun render(batchProcess: Renderer.() -> Unit) {
        camera.update()
        batch.projectionMatrix = camera.combined
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f)

        batch.begin()
        this.batchProcess()
        batch.end()
    }

    override fun <T : Number, U : Number> draw(image: Image, x: T, y: U) {
        if (image is GdxImage) {
            batch.draw(image.texture,
                x.toFloat(), y.toFloat(), image.texture.width.toFloat(), image.texture.height.toFloat(),
                0, 0, image.texture.width, image.texture.height,
                false, true)
        }
    }

    override fun dispose() {
        batch.dispose()
    }
}
