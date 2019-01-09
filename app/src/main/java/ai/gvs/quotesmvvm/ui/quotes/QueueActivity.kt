package ai.gvs.quotesmvvm.ui.quotes

import ai.gvs.quotesmvvm.R
import ai.gvs.quotesmvvm.data.Quote
import ai.gvs.quotesmvvm.utilities.InjectorUtils
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.quotes_activity.*
import kotlin.text.StringBuilder

class QueueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quotes_activity)
        initializeUI()
    }

    private fun initializeUI() {
        val factory = InjectorUtils.provideQuotesViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(QuotesViewModel::class.java)

        viewModel.getQuotes().observe(this, Observer { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach { quote ->
                stringBuilder.append("$quote\n\n")
            }
            quotesTV.text = stringBuilder.toString()
        })
        addQuoteBtn.setOnClickListener {
            val quote = Quote(quoteQuote.text.toString(), quoteAuthor.text.toString())
            viewModel.addQuote(quote)
            quoteQuote.setText("")
            quoteAuthor.setText("")
        }
    }
}
