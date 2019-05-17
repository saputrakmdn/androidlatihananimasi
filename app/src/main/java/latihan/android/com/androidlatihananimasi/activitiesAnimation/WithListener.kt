package latihan.android.com.androidlatihananimasi.activitiesAnimation

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.Toast

class WithListener: BaseAnimationActivity() {
    override fun onStartAnimation() {
        val animator = ValueAnimator.ofFloat(0f, -sreenHeight)
        animator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }
        animator.addListener(object : Animator.AnimatorListener{
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                Toast.makeText(applicationContext, "DOGE Jatuh", Toast.LENGTH_SHORT).show()
                finish()
            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationStart(animation: Animator?) {
                Toast.makeText(applicationContext, "DOGE GAS", Toast.LENGTH_SHORT).show()
            }

        })
        animator.duration = 5000L
        animator.start()
    }
}