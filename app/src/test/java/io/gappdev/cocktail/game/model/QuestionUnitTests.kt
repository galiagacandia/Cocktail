package io.gappdev.cocktail.game.model

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class QuestionUnitTests {

    private lateinit var question: Question     // Variable que sera inicializada en los metodos posteriores, no puede ser un dato primitivo, no se puede colocar
                                                // con un inicializador no nulo en el constructor.

    @Before
    fun setup() {
        question = Question("CORRECT", "INCORRECT")
    }

    @Test
    fun whenCreatingQuestion_shouldNotHaveAnsweredOption() {
        //val question = Question("CORRECT", "INCORRECT")

        Assert.assertNull("Not have answered option", question.answeredOption)
    }

    @Test
    fun whenAnswering_shouldHaveAnsweredOption() {
        //val question = Question("CORRECT", "INCORRECT")
        question.answer("INCORRECT")

        Assert.assertEquals("", "INCORRECT", question.answeredOption)
    }

    @Test
    fun whenAnswering_withCorrectOption_shouldReturnTrue() {
        //val question = Question("CORRECT", "INCORRECT")
        val result = question.answer("CORRECT")

        Assert.assertTrue("Answer with correct option return true", result)
    }

    @Test
    fun whenAnswering_withIncorrectOption_shouldReturnFalse() {
        //val question = Question("CORRECT", "INCORRECT")
        val result = question.answer("INCORRECT")

        Assert.assertFalse("Answer with incorrect option return false", result)
    }

    @Test(expected = IllegalArgumentException::class)               // El test espera que se lanze una excepcion
    fun whenAnswering_withInvalidOption_shouldThrowException() {
        //val question = Question("CORRECT", "INCORRECT")

        question.answer("INVALID")
    }

}