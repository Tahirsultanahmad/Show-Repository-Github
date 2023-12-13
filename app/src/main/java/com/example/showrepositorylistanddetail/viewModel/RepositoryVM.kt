package com.example.showrepositorylistanddetail.viewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.showrepositorylistanddetail.data.ItemDTO
import com.example.showrepositorylistanddetail.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class RepositoryVM  ()
    :ViewModel()
{
//    val tweets : StateFlow<List<TweetListItem>>
//        get() = repository.tweets
    init {
//        val category = savedStateHandle.get<String>("repository")?: "Default"
//        viewModelScope.launch { repository.getTweets(category) }
    }
    val list = listOf<String>("attendance","leave","roster","notification","salary")
}