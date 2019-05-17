package latihan.android.com.androidlatihananimasi.activitiesAnimation

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Context
import android.support.v4.content.ContextCompat
import latihan.android.com.androidlatihananimasi.R

class MaininBackground: BaseAnimationActivity() {
    override fun onStartAnimation() {
       val objAnimator = ObjectAnimator.ofObject(frameLayout, "backgroundColor", ArgbEvaluator(), ContextCompat.getColor(this, R.color.background_from),
           ContextCompat.getColor(this, R.color.background_to))
        objAnimator.repeatCount = 1
        objAnimator.repeatMode = ValueAnimator.REVERSE
        objAnimator.duration = DEFAULT_ANIM_DURATION
        objAnimator.start()
    }

}