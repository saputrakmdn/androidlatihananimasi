package latihan.android.com.androidlatihananimasi.activitiesAnimation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.view.View
import latihan.android.com.androidlatihananimasi.R

abstract class BaseAnimationActivity :AppCompatActivity(){
    protected lateinit var rocket: View
    protected lateinit var doge: View
    protected lateinit var frameLayout: View
    protected var sreenHeight = 0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_animation)
        rocket = findViewById(R.id.rocket)
        doge = findViewById(R.id.doge)
        frameLayout = findViewById(R.id.container)
        frameLayout.setOnClickListener { onStartAnimation() }
    }

    override fun onResume() {
        super.onResume()
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        sreenHeight = displayMetrics.heightPixels.toFloat()
    }
    protected abstract fun onStartAnimation()
    companion object {
        val DEFAULT_ANIM_DURATION = 2500L
    }
}