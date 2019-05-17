package latihan.android.com.androidlatihananimasi.activitiesAnimation

import android.animation.ValueAnimator
import android.view.animation.AccelerateInterpolator
import android.view.animation.LinearInterpolator

class RocketTambahCepet: BaseAnimationActivity() {
    override fun onStartAnimation() {
        val valueAnimator=  ValueAnimator.ofFloat(0f, -sreenHeight)
        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
        }
        valueAnimator.interpolator = AccelerateInterpolator(2f)
        valueAnimator.duration = DEFAULT_ANIM_DURATION
        valueAnimator.start()
    }
}