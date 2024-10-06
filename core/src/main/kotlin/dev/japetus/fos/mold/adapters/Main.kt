package dev.japetus.fos.mold.adapters

import com.badlogic.gdx.ApplicationAdapter
import dev.japetus.fos.mold.core.MainWorld

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms. */
class Main : ApplicationAdapter() {
    private val mainWorld = MainWorld(GdxRenderer())

    override fun render() {
        mainWorld.update()
        mainWorld.render()
    }

    override fun dispose() {
        mainWorld.dispose()
    }
}
