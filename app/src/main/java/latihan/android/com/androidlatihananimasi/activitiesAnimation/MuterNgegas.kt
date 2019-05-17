package latihan.android.com.androidlatihananimasi.activitiesAnimation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator

class MuterNgegas: BaseAnimationActivity() {
    override fun onStartAnimation() {
        val positionAnimator = ValueAnimator.ofFloat(0f, -sreenHeight)
        positionAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
        }
        val rotationAnimator = ObjectAnimator.ofFloat(rocket, "rotation", 0f, 180f)
        val aninatorSet = AnimatorSet()
        aninatorSet.play(positionAnimator).with(rotationAnimator)
        aninatorSet.duration = DEFAULT_ANIM_DURATION
        aninatorSet.start()
    }
}