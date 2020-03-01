package ms.zem.mvvm

import androidx.lifecycle.ViewModel

sealed class CommandViewModel: ViewModel() {

    object OnClick : CommandViewModel()

}