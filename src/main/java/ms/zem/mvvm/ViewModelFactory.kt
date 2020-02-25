package ms.zem.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelFactory: ViewModelProvider.NewInstanceFactory() {

    private val repository = Repository()

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        with(modelClass) {
            when {
                isAssignableFrom(NumberListViewModel::class.java) ->
                    NumberListViewModel(repository)
                else ->
                    throw IllegalArgumentException("viewmodel desconhecida: ${modelClass.name}")
            }
        } as T

}