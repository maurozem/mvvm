package ms.zem.mvvm

import kotlin.random.Random

class Repository : RepositoryInterface {

    override fun getNumbers(): List<Int> {
        val numeros = ArrayList<Int>()
        for (i in 1..5) {
            numeros.add(Random.nextInt(10, 99))
        }
        return numeros
    }

}