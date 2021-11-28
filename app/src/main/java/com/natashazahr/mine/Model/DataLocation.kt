package com.natashazahr.mine.Model

import kotlin.collections.ArrayList

object DataLocation {
        // Popular Location
    val nameLocation = arrayOf(
        "Pesanggaran, Banyuwangi",
        "Genteng, Jawa Barat",
        "Sungai Martapura, Kalimantan Selatan",
        "Tangkuban Perahu, Bandung",
        "Pulau Derawan, Kalimantan Timur"
    )

    val categoryLocation = arrayOf(
        "Popular",
        "Popular",
        "Popular",
        "Popular",
        "Popular",

    )

    val descriptionLocation = arrayOf(
        "Terletak di Pesanggaran, Banyuwangi.Daerah ini sering dijadikan sebagai lokasi fotografi yang tepat. Dipagi hari matahari bersinar lembut.\n Jalan raya yang ditumbuhi rumput liar disisnya membuat pemandangan menjadi indah. Dikelilingi bukit bukit yang tinggi menjulang.\n Sesekali muncul hewan liar yang menggambarkan masih terawatnya daerah ini\n Lingkungan di daerah sini masih alami karena belum terlalu ramai dikunjungi wisatawan\n",
        "Perkebunan di daerah Genteng sangat asri. Ada kebun stroberi, brokoli, asparagus, teh, tomat,\n dan sayuran lainnya. Udaranya sejuk. Akses menuju ke sana jalannya berliku dan menanjak. Namun\n di sepanjang jalan, kita dapat melihat pohon-pohon dan perbukitan. Bila beruntung, kita bisa\n melihat monyet bergelantungan di pohon\n",
        "Sungai di dekat rumah tidak seindah dulu. Saat awal tahun 2000, masih ada sampan atau rakit yang dipakai menyebrang sungai. Airnya jernih. Orang-orang sering berwisata di pinggir sungai. Mulai dari memancing, bermain air, atau sekedar duduk-duduk menikmati sore hari. Kini kondisi sungai sudah berubah. Airnya berwarna coklat, banyak sampah, dan tidak ada lagi sampan atau rakit",
        "Tangkuban Parahu adalah sebuah gunung yang terdapat di perbatasan antara Kabupaten Suang dengan Kabupaten Bandung Barat. Gunung ini memiliki pemandangan alam yang indah serta sebuah kawahnya yang terkenal. Karena keindahannya dan sering dijadikan sebagai destinasi utama saat liburan, maka gunung Tangkuban Parahu ini menjadi salah satu tempat wiasata favorit di kawasan Jawa Barat. Banyak alasan yang menjadikan Gunung ini menjadi salah satu tujuan favorit para wisatawan . Selainpemandangan yang indah, susana yagg sejuk dan kawah yang cantik gunung ini juga terletak di jalan utama Bandung-Subang, akses jalannya  tidak terlalu jauh dari kota Bandung sekitar  25-30 km.\n Di gunung tangkuban Parahu ini sering diadakan sebuah festival bernama Festival Budaya dan Pariwisata Gunung Tangkuban Parahu. Yang selalu menarik perhatian wisatawan, para penggiat budaya, akademisi maupun masyarakat umum. Selain saat festival, hari-hari biasa juga Gunung Tangkuban Perahu tidak pernah sepi pengunjung bus-bus luar kota selalu terparkir di area parkirnya mengantar wisatawan menikmaai keindahan alam gunung tangkuban parahu. Puncak kunjungan wisatan akan terjadi saat hari-hari besar seperti Liburan maupun hari besar tahun baru dan idul fitri, jalanan akan macet karena kendaraan yang keluar masuk wilayah wisata.\n",
        "Pulau Derawan merupakan salah satu pulau yang ada di Provinsi Kalimantan Timur. Pulau ini merupakan salah satu pulau yang ada di kepulauan Derawan. Pulau ini mempunyai keindahan alam berupa pasir pantai putih yang membentang sepanjang pantai, serta pohon-pohon kelapa yang berjajar di pinggiran pantai. Lautnya yang berwarna biru indah juga tak luput memberi keindahan bagi pulau ini"

    )

    val photoPopular = arrayOf(
        "https://ibb.co/74jMcxW",
        "https://ibb.co/vwJ87gT",
        "https://ibb.co/Bn7Qtkj",
        "https://ibb.co/BZD47dD",
        "https://ibb.co/48zsJDb"

    )
    val dataLocation: ArrayList<Location>
        get() {
            val listLocation = arrayListOf<Location>()
            for (position in nameLocation.indices) {
                val location = Location(
                    name = nameLocation[position],
                    category = categoryLocation[position],
                    description = descriptionLocation[position],
                    pictures = photoPopular[position],
                )
                listLocation.add(location)
            }
            return listLocation
        }


}