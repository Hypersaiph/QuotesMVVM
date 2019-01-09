package ai.gvs.quotesmvvm.ui.quotes

import ai.gvs.quotesmvvm.data.Quote
import ai.gvs.quotesmvvm.data.QuoteRepository
import androidx.lifecycle.ViewModel

class QuotesViewModel (private val quoteRepository: QuoteRepository): ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}