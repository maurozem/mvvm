package ms.zem.mvvm

class NumberListUseCase(private val repository: RepositoryInterface) {

    fun getNumbers(): List<Int> {
        val numeros = repository.getNumbers().toMutableList()
        for (i in 1 .. numeros.size) {
            numeros[i-1] *= 100
        }
        return numeros
    }
}