package ai.gvs.quotesmvvm

import android.os.Bundle
import ai.gvs.quotesmvvm.ui.main.MainFragment
import androidx.appcompat.app.AppCompatActivity

class QueueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quotes_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
