package ms.zem.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NumberListViewModel(private val repository: Repository): ViewModel() {

    var numberList = MutableLiveData<List<Int>>()

    fun getNumbers(){
        numberList = repository.getNumbers()
    }

}