package ru.skillbranch.devintensive.models

import java.util.*

class User (
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
) {
    companion object Factory {
        fun makeUser(fullName : String?) : User {
            val parts: List<String>? = fullName?.split(" ")
            return User(firstName = parts?.getOrNull(0), lastName = parts?.getOrNull(1), id = "1", avatar = null)
        }
    }
}