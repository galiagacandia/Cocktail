package io.gappdev.cocktail.game.model

class Game(highest: Int = 0) {  // Aqui va el constructor primario

    var currentScore: Int = 0
        private set         // Implementacion por defecto de set pero con acceso privado

    var highestScore: Int = highest   // Indicamos que el valor inicial de esta propiedad esta dado por el constructor
        private set

    fun incrementScore() {
        currentScore++
        if (currentScore > highestScore) {
            highestScore = currentScore
        }
    }
}