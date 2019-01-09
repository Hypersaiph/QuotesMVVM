package ai.gvs.quotesmvvm.ui.quotes

import ai.gvs.quotesmvvm.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class QueueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quotes_activity)
        if (savedInstanceState == null) {
            /*supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()*/
        }
    }

}
