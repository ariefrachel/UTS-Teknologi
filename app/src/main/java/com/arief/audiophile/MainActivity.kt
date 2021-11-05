package com.arief.audiophile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arief.audiophile.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = ArrayList()

        data?.add(
            DataModel(
                R.drawable.kzn,"KZ ZSN Pro","Rp 285.000","KZ ZSN Pro" +
                "Bentuk earphone KZ ZSN Pro masih belum berubah dari tipe ZSN pendahulunya. Cangkangnya terbuat dari bahan resin dan memiliki plat alumunium sebagai penutup. Kemudian nozzle atau bagian corong yang dimasukkan ke telinga juga terbuat dari alumunium. " +
                "\n" +
                "Earphone ini juga dirancang memiliki kabel yang bisa dilepas. Pada ujung kabel tersebut terdapat 2-pin jack atau dikenal juga sebagai Para C plug yang mesti ditempelkan di area kontak di cangkang earphone." +
                "\n" +
                "Saat dipasang di telinga, in-ear monitor (IEM) ini melekat dengan baik, tidak mudah mental keluar. Rasanya pun nyaman, tidak menyakiti telinga. Ada 3 pilihan karet eartips yang bisa kamu gunakan di sini, yaitu ukuran S, M dan L. Kemudian di kabelnya, bagian paling dekat dengan cangkang earphone, memiliki lapisan kaku yang membuatnya bisa dipakai sebagai earhook agar earphone tidak mudah lepas.")
        )

        data?.add(
            DataModel(
                R.drawable.sony_mdr,"Sony MDR-XB50AP","Rp 465.800", "Sony MDR-XB50AP" +
                "Teknologi X-Bass memungkinkan produk ini untuk menghasilkan suara bas yang sangat menghentak dan dalam. Dipadukan dengan magnet neodimium, basnya menjadi semakin bertenaga dan sangat dominan. Untuk Anda para basshead atau ingin menikmati sensasi bas layaknya sedang party, produk ini adalah pilihan terbaik. " +
                "\n" +
                "Tenang saja, produk ini juga kompatibel dengan bermacam-macam smartphone, bukan hanya merek Sony saja. Selain itu, rentang frekuensi produk ini juga cukup besar. Nada mid-high yang dihasilkan oleh in-ear headphone ini sensasional sehingga Anda bisa bebas bergoyang di semua lagu!"+
                "\n" +
                "Tipe: Dinamik"+"Frekuensi: 4 Hz-24 kHz")
        )

        data?.add(
            DataModel(
                R.drawable.yoga,"Yoga X-02","Rp 2.000.000", "Yoga X-02 adalah salah satu headset terbaik di dunia. Bantalan headphone ini meng-cover seluruh bagian telinga sehingga audio yang disalurkan akan terdengar lebih jelas." +
                "Resolusi suara yang ditawarkan headphone ini terbilang bagus, sub-bass yang dihasilkan juga terdengar sangat dalam."+
                "\n" +
                "Yoga X-02 memiliki frekuensi respon 10 Hz – 24 kHz. Headphone yang menyediakan kabel sepanjang 1,3 meter ini kompatibel untuk dipakai bermain game atau mendengarkan musik favorit Anda.")
        )

        data?.add(
            DataModel(
                R.drawable.rog,"Asus ROG Delta","Rp 3.299.000", "Headset gaming ini dilengkapi konektor USB-C untuk dukungan berbagai platform, seperti PC, Mac, smartphone, dan PS4. " +
                "Kemasan ROG Delta terlihat garang yang mencerminkan bahwa ia siap digunakan untuk aneka macam gim: dari pertempuran sampai petualangan. Di dalam kemasan ini, Asus melampirkan beberapa aksesori, seperti adaptor Type-C to USB, dua pasang bantalan telinga, dan mikrofon yang berukuran sekitar 15 cm." +
                "\n" +
                "Di sisi driver sebelah kiri, ada tombol kontrol yang berguna untuk mengatur volume, akses mute mikrofon, dan tombol akses On/Off lampu LED RGB. Asus menggabungkan tombol mute dan tombol pengatur volume menjadi satu. Tombol ini menggunakan mekanisme pegas, sehingga ketika menggerakkannya ke arah atas untuk meningkatkan volume, tombol akan kembali ke tempat semula."+
                "\n" +
                "Material yang digunakan pada rangka ROG Delta secara keseluruhan adalah plastik. Seperti headset gaming premium lain, plastik yang digunakan tidak terasa murahan. Malahan, saya merasa ia kokoh ketika memegangnya. Ada sepasang engsel di rangka driver dan headband. Engsel ini berguna untuk mengikuti tulang pipi ketika dikenakan.")
        )

        data?.add(
            DataModel(
                R.drawable.samsung,"Galaxy Buds+","Rp 1.499.000"," Samsung Earbuds Plus ini adalah headphones yang memiliki true wireless stereo (TWS) sehingga saya tidak lagi memerlukan kabel ataupun jack 3,5 mm. \n" +
                "\n" +
                "Hal yang menjadikan produk ini spesial adalah adanya fitur active noise cancelling yang dapat meredam suara bising agar tidak terdengar telinga. " +
                "\n" +
                "Tidak hanya itu, fitur passive noise canceling dari produk ini juga sangat mantap, lho! Ditambah lagi, produk ini memiliki ear tips yang sangat lembut serta nyaman di kuping. Berkat hal ini, kuping saya tidak merasa lelah atau sakit meski telah menggunakannya dalam jangka waktu lama. " +
                "Daya tahan baterai dari produk ini juga sangat impresif karena ia mampu bertahan hingga sebelas jam. Jadi, kalian tidak perlu khawatir harus sering mengisi daya baterai produk ini saat bepergian. ")
        )

        data?.add(
            DataModel(
                R.drawable.airpods,"AirPods Pro","Rp 4.199.000", "AirPods Pro adalah satu-satunya headphone in-ear dengan Peredam Kebisingan Aktif yang terus beradaptasi dengan telinga Anda dan pas dikenakan — mencegah suara luar agar Anda dapat fokus pada apa yang sedang Anda dengarkan. " +
                "Mikrofon hadap luar mendeteksi suara dari luar. AirPods Pro menghalaunya dengan anti-bising equalizer, mencegah suara luar masuk ke dalam. Mikrofon hadap dalam mendengarkan suara yang tidak diinginkan di dalam telinga Anda, dan juga dihilangkan dengan anti-kebisingan. " +
                "Pencegahan kebisingan terus melakukan penyesuaian 200 kali per detik untuk menghadirkan suara yang benar-benar impresif, sehingga Anda dapat menikmati musik, podcast, dan panggilan dengan optimal.")
        )


        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener {
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailItem::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("deskripsi", item?.deskripsi)
                startActivity(intent)
            }
        })


    }
}