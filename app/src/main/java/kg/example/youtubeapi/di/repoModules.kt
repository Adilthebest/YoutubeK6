package kg.example.youtubeapi.di

import kg.example.youtubeapi.repository.Repository
import org.koin.dsl.module

val  repoModules = module {
    single { Repository() }
    }