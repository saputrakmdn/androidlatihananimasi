package latihan.android.com.androidlatihananimasi.activitiesAnimation

class MuterNgegasV2: BaseAnimationActivity() {
    override fun onStartAnimation() {
        rocket.animate().translationY(-sreenHeight).rotationBy(360f).setDuration(DEFAULT_ANIM_DURATION).start()
    }
}