package com.arief.audiophile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arief.audiophile.R
import kotlinx.android.synthetic.main.detail_item.*

class DetailItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_item)

        val actionbar = supportActionBar

        actionbar!!.title = "Detail Earphone"

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.kzn))
        textViewKetDetail.text = intent.getStringExtra("nama")
        textViewHargaDetail.text = intent.getStringExtra("harga")
        textViewKetDetail.text = intent.getStringExtra("deskripsi")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}