package me.emmano.androidmva.comics.mvvm

import me.emmano.adapt.Identity

data class ComicModel(val title: String, val description: String, val imageUrl: String) : Identity<ComicModel> {
    override fun isSame(other: ComicModel) = title == other.title
}
