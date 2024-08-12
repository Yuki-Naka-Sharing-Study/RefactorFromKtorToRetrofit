package mende273.ktorandroidclient.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import mende273.ktorandroidclient.data.model.Drink
import mende273.ktorandroidclient.data.repository.RemoteRepository

class MainViewModel(private val remoteRepository: RemoteRepository) : ViewModel() {
    private val _items: MutableStateFlow<List<Drink>> = MutableStateFlow(emptyList())
    val items: StateFlow<List<Drink>> = _items

    fun loadItems() {
        viewModelScope.launch {
            remoteRepository.getDrinks().fold(
                onSuccess = { drinks ->
                    _items.update { drinks }
                },
                onFailure = {
                    // handle error
                }
            )
        }
    }
}