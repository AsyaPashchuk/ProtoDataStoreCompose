package com.protodatastorecompose

import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.serialization.Serializable

@Serializable
data class AppSettings(
    val language: Language = Language.ENGLISH,
    //We use PersistentList from kotlinx-collections-immutable library to prevent bugs
    //with mutable instance of the List, just use persistentListOf().mutate {  }
    val knownLocations: PersistentList<Location> = persistentListOf()
)

@Serializable
data class Location(
    val lat: Double,
    val lon: Double
)

enum class Language {
    ENGLISH, SPANISH, UKRAINIAN
}
