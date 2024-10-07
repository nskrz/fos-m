package dev.japetus.fos.mold.core

class MainWorld(private val renderer: Renderer, private val repository: Repository) {
    private val image by lazy { repository.loadImage("libgdx.png") }

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
