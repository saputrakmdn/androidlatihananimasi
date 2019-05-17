package latihan.android.com.androidlatihananimasi.activitiesAnimation

import android.animation.ObjectAnimator

class LaunchRocketObject: BaseAnimationActivity() {
    override fun onStartAnimation() {
        val objAnimator = ObjectAnimator.ofFloat(rocket, "translationY", 0f, -sreenHeight)
        objAnimator.duration = DEFAULT_ANIM_DURATION
        objAnimator.start()
    }
}