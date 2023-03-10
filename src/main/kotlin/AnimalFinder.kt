val animals = Animals()

class AnimalFinder {
    fun findByNumber(input: String) {
        val animalNumber = input.toIntOrNull()
        if (animalNumber == null || animalNumber !in animals.getRange()) {
            println("Please enter a number of a habitat that exist!")
        } else {
            println(animals.getAnimal(animalNumber))
        }

        println()
        println("---------------------")
        println()

        return
    }
}