package io.gappdev.cocktail.game.model

class Question(
    val correctOption: String,
    val incorrectOption: String) {

    var answeredOption: String? = null  // Se declara la variable como nullable es decir que puede tener un valor nulo
        private set

    val isAnsweredCorrectly: Boolean        // Esta variable tiene un get personalizado que evalua si la opcion correcta es igual a la respondida
        get() = correctOption == answeredOption

    fun answer(option: String): Boolean {
        if(option != correctOption && option != incorrectOption) {
            throw IllegalArgumentException("Not a valid option")        // Lanzamos una excepcion de Kotlin, hay otra igual de Java pero es mejor utilizar la de Kotlin
        }
        answeredOption = option

        return isAnsweredCorrectly
    }
}