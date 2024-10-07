package dev.japetus.fos.mold.core

interface Repository {
    fun loadImage(path: String): Image
}
