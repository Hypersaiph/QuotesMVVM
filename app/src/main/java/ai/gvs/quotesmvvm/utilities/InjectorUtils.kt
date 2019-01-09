package ai.gvs.quotesmvvm.utilities

import ai.gvs.quotesmvvm.data.FakeDatabase
import ai.gvs.quotesmvvm.data.QuoteRepository
import ai.gvs.quotesmvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}