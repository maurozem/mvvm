package ms.zem.mvvm

class RepositoryMock : RepositoryInterface {

    override fun getNumbers(): List<Int> {
        return listOf( 1, 2, 3, 4, 5)
    }

}