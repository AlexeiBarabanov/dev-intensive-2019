package ru.skillbranch.devintensive.utils

class Utils {
    companion object Parser{
        fun parseFullName(fullName : String?) : Pair<String?, String?> {
            val parts: List<String>? = if (fullName?.trim()?.isEmpty() == true) null else fullName?.split(" ")
            val firstName = parts?.getOrNull(0)
            val lastName = parts?.getOrNull(1)
            return Pair(firstName, lastName)
        }
    }
}