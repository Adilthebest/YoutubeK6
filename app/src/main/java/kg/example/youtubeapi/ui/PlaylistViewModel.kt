package kg.example.youtubeapi.ui

import androidx.lifecycle.MutableLiveData
import kg.example.youtubeapi.App
import kg.example.youtubeapi.core.ui.BaseViewModel
import kg.example.youtubeapi.data.remote.model.PlayLists
import kg.example.youtubeapi.repository.Repository
import kg.example.youtubeapi.result.Resource

class PlaylistViewModel(private val repository: Repository) : BaseViewModel() {

    fun getPlaylists(): MutableLiveData<Resource<PlayLists>> {
        return repository.getPlaylists()
    }
}