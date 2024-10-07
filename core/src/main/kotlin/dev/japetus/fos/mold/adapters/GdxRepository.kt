package dev.japetus.fos.mold.adapters

import com.badlogic.gdx.graphics.Texture
import dev.japetus.fos.mold.core.Image
import dev.japetus.fos.mold.core.Repository

class GdxRepository: Repository {
    override fun loadImage(path: String): Image = GdxImage(Texture(path))
}
