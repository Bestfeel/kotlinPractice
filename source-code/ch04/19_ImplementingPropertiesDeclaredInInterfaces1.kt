package ch04.ImplementingPropertiesDeclaredInInterfaces1

interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}
