package kg.example.youtubeapi.di

import kg.example.youtubeapi.ui.PlaylistViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModules = module {
    viewModel { PlaylistViewModel(get()) }
}