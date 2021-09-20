package co.ghostnotes.sample.multibackstacks.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.ghostnotes.sample.multibackstacks.di.IODispatcher
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    @IODispatcher private val ioDispatcher: CoroutineDispatcher
) : ViewModel() {

    private val _loading = MutableStateFlow(false)
    val loading: StateFlow<Boolean> = _loading

    private val _navigateToDetail = Channel<Boolean>()
    val navigateToDetail = _navigateToDetail.receiveAsFlow()

    fun onButtonClick() = viewModelScope.launch(ioDispatcher) {
        Timber.d("### onButtonClick")
        _loading.value = true

        try {
            delay(1000L) // dummy
            _navigateToDetail.send(true)
        } catch (e: Exception) {
            Timber.e(e)

            // TODO handle error
        } finally {
            _loading.value = false
        }
    }
}
