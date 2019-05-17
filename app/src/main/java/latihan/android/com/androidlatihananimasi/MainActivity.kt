package latihan.android.com.androidlatihananimasi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import latihan.android.com.androidlatihananimasi.activitiesAnimation.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val items = ArrayList<RocketAnimationItem>()
        items.add(RocketAnimationItem("Lepas Landas", Intent(this, LaunchRocketValue::class.java)))
        items.add(RocketAnimationItem("ROcket Muter", Intent(this, RocketMuter::class.java)))
        items.add(RocketAnimationItem("Tambah Cepet", Intent(this, RocketTambahCepet::class.java)))
        items.add(RocketAnimationItem("Object lepas landas", Intent(this, LaunchRocketObject::class.java)))
        items.add(RocketAnimationItem("Main Background", Intent(this, MaininBackground::class.java)))
        items.add(RocketAnimationItem("Muter Ngegas", Intent(this, MuterNgegas::class.java)))
        items.add(RocketAnimationItem("Ngegas V2", Intent(this, MuterNgegasV2::class.java)))
        items.add(RocketAnimationItem("terbang bareng", Intent(this, TerbangBareng::class.java)))
        items.add(RocketAnimationItem("GAs Toast", Intent(this, WithListener::class.java)))
        items.add(RocketAnimationItem("Maju Mundur", Intent(this, MajuMundur::class.java)))
        items.add(RocketAnimationItem("Dengan Xml", Intent(this, MenggunakanXml::class.java)))
        recyclerView.adapter = RocketAdapter(this, items)
    }
}
