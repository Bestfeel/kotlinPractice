package ch08.Employee

data class Employee(val name: String, val age: Int,
                    val city: City, val team: Team)

enum class City { MUNICH, PRAGUE, SPB, MOSCOW /*etc.*/ }

enum class Team { INTELLIJ_IDEA, HUB, KOTLIN /*etc.*/ }
