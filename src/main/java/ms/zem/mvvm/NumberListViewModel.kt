package ms.zem.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NumberListViewModel(private val repository: Repository): ViewModel() {

    private var mutableNumberList = MutableLiveData<List<Int>>()
    var numberList: LiveData<List<Int>> = mutableNumberList

    fun getNumbers(){
        mutableNumberList.value = repository.getNumbers().value
    }

}