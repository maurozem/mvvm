package ms.zem.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NumberListViewModel(private val useCase: NumberListUseCase): ViewModel() {

    private var mutableNumberList = MutableLiveData<List<Int>>()
    var numberList: LiveData<List<Int>> = mutableNumberList

    fun getNumbers(){
        mutableNumberList.value = MutableLiveData(useCase.getNumbers()).value
    }

    fun commando(command: CommandViewModel){
        when (command) {
            is CommandViewModel.OnClick -> getNumbers()
        }
    }

}