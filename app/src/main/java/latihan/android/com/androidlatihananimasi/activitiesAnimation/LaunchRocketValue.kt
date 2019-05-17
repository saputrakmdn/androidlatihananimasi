package latihan.android.com.androidlatihananimasi.activitiesAnimation

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchRocketValue: BaseAnimationActivity() {
    override fun onStartAnimation() {
        val valueAnimator=  ValueAnimator.ofFloat(0f, -sreenHeight)
        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
        }
        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = DEFAULT_ANIM_DURATION
        valueAnimator.start()
    }
}