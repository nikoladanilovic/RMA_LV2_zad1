package hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.Model

import java.io.Serializable

data class InspiringPerson (
    val name : String,
    val dateOfBirth : String,
    val dateOfDeath : String,
    val description : String,
    val cover : String,
    val quote : String
) : Serializable

// tu treba dodati jos jedan dio klase -> poznati citati tih osoba