package latihan.android.com.androidlatihananimasi.activitiesAnimation

import android.animation.AnimatorSet
import android.animation.ValueAnimator

class TerbangBareng: BaseAnimationActivity() {
    override fun onStartAnimation() {
        val positionAnimator = ValueAnimator.ofFloat(0f, -sreenHeight)
        positionAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }
        val  rotationAnimator = ValueAnimator.ofFloat(0f, 360f)
        rotationAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            doge.rotation = value
        }
        val animatorSet = AnimatorSet()
        animatorSet.play(positionAnimator).with(rotationAnimator)
        animatorSet.duration = DEFAULT_ANIM_DURATION
        animatorSet.start()
    }
}