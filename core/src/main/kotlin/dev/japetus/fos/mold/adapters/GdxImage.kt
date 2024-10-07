package dev.japetus.fos.mold.adapters

import com.badlogic.gdx.graphics.Texture
import dev.japetus.fos.mold.core.Image

class GdxImage(val texture: Texture) : Image {
    override fun dispose() {
        texture.dispose()
    }
}
