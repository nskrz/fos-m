package dev.japetus.fos.mold.core

class MainWorld(private val renderer: Renderer, private val repository: Repository) {
    private val image by lazy { repository.loadImage("libgdx.png") }

    fun create() {
    }

    fun update() {
    }

    fun render() {
        renderer.render {
            draw(image, 140, 210)
        }
    }

    fun dispose() {
        image.dispose()
    }
}
