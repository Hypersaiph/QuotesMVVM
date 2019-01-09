package ai.gvs.quotesmvvm.ui.quotes

import ai.gvs.quotesmvvm.data.QuoteRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class QuotesViewModelFactory(private val quotesRepository: QuoteRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quotesRepository) as T
    }
}