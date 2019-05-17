package latihan.android.com.androidlatihananimasi.activitiesAnimation

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import latihan.android.com.androidlatihananimasi.R

class MenggunakanXml: BaseAnimationActivity() {
    override fun onStartAnimation() {
        val rocketAnim = AnimatorInflater.loadAnimator(this,R.animator.jump_and_blink) as AnimatorSet
        rocketAnim.setTarget(rocket)
        val dogeAnim = AnimatorInflater.loadAnimator(this, R.animator.jump_and_blink) as AnimatorSet
        dogeAnim.setTarget(doge)
        val bothAnimSet = AnimatorSet()
        bothAnimSet.playTogether(rocketAnim, dogeAnim)
        bothAnimSet.duration = DEFAULT_ANIM_DURATION
        bothAnimSet.start()
    }
}