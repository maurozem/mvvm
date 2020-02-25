package ms.zem.mvvm

import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

class Repository {

    fun getNumbers(): MutableLiveData<List<Int>> {
        val numeros = ArrayList<Int>()
        for (i in 1..5) {
            numeros.add(Random.nextInt(10, 99))
        }
        return MutableLiveData(numeros)
    }

}