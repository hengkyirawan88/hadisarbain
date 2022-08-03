package com.rival.detikcom.newsAdapter

import com.rival.detikcom.R

data class news(var title: String, var desc: String, var photo: Int)

object NewsModel {
    val newslist = listOf<news>(
        news(
            "Hadis 2 : Iman, Islam dan Ihsan",
            " بَيْنَمَا نَحْنُ جُلُوْسٌ عِنْدَ رَسُوْلِ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّم ذَاتَ يَوْمٍ إِذْ طَلَعَ عَلَيْنَا رَجُلٌ شَدِيْدُ بَيَاضِ الثِّيَابِ شَدِيْدُ سَوَادِ الشَّعْرِ, لاَ يُرَى عَلَيْهِ أَثَرُ السَّفَرِ وَلاَ يَعْرِفُهُ مِنَّا أَحَدٌ, حَتَّى جَلَسَ إِلَى النَّبِيِّ صَلَّى اللهُ عَلَيْهِ وَسَلَّم, فأَسْنَدَ رُكْبَتَيْهِ إِلَى رُكْبَتَيْهِ, وَوَضَعَ كَفَّيْهِ عَلَى فَخِذَيْهِ, وَ قَالَ : يَا مُحَمَّدُ أَخْبِرْنِيْ عَنِ الإِسْلاَمِ, فَقَالَ رَسُوْلُ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّم : اَلإِسْلاَمُ أَنْ تَشْهَدَ أَنْ لاَإِ لَهَ إِلاَّ اللهُ وَ أَنَّ مُحَمَّدًا رَسُوْلُ اللهِ, وَتُقِيْمُ الصَّلاَةَ, وَتُؤْتِيَ الزَّكَاةَ, وَتَصُوْمَ رَمَضَانَ, وَتَحُجَّ الْبَيْتَ إِنِ اسْتَطَعْتَ إِلَيْهِ سَبِيْلاً. قَالَ : صَدَقْتُ. فَعَجِبْنَا لَهُ يَسْئَلُهُ وَيُصَدِّقُهُ. قَالَ : فَأَخْبِرْنِيْ عَنِ الإِيْمَانِ, قَالَ : أَنْ تُؤْمِنَ بِاللهِ, وَمَلاَئِكَتِهِ, وَكُتُبِهِ, وَرُسُلِهِ, وَالْيَوْمِ الآخِرِ, وَ تُؤْمِنَ بِالْقَدْرِ خَيْرِهِ وَ شَرِّهِ. قَالَ : صَدَقْتَ. قَالَ : فَأَخْبِرْنِيْ عَنِ الإِحْسَانِ, قَالَ : أَنْ تَعْبُدَ اللهَ كَأَنَّكَ تَرَاهُ فَإِنْ لَمْ تَكُنْ تَرَاهُ فَإِنَّهُ يَرَاكَ. قَالَ : فَأَخْبِرْنِيْ عَنِ السَّاعَةِ قَالَ : مَا الْمَسْؤُوْلُ عَنْهَا بِأَعْلَمَ مِنَ السَّائِلِ. قَالَ : فَأَخْبِرْنِيْ عَنْ أَمَارَاتِهَا, قَالَ : أَنْ تَلِدَ الأَمَةُ رَبَّتَهَا, وَأَنْ تَرَى الْحُفَاةَ الْعُرَاةَ الْعَالَةَ رِعَاءَ الشَّاءِ يَتَطَاوَلُوْنَ فِيْ الْبُنْيَانِ, ثم اَنْطَلَقَ, فَلَبِثْتُ مَلِيًّا, ثُمَّ قَالَ : يَا عُمَرُ, أَتَدْرِيْ مَنِ السَّائِل؟ قُلْتُ : اللهُ وَ رَسُوْلُهُ أَعْلَمُ. قَالَ : فَإِنَّهُ جِبْرِيْلُ أَتَاكُمْ يُعَلِّمُكُمْ دِيْنَكُمْ. رَوَاهُ مُسْلِمٌ\n" +
                    "\n" +
                    "Dari Umar radhiyallahu `anhu juga dia berkata :\n" +
                    "Ketika kami duduk-duduk disisi Rasulullah\n" +
                    "shallahu`alaihi wa sallam suatu hari tiba-tiba\n" +
                    "datanglah seorang laki-laki yang mengenakan baju\n" +
                    "yang sangat putih dan berambut sangat hitam, tidak\n" +
                    "tampak padanya bekas-bekas perjalanan jauh dan\n" +
                    "tidak ada seorangpun di antara kami yang\n" +
                    "mengenalnya. Hingga kemudian dia duduk di hadapan\n" +
                    "Nabi lalu menempelkan kedua lututnya kepada kepada\n" +
                    "lututnya (Rasulullah shallahu`alaihi wa sallam) seraya\n" +
                    "berkata, “ Ya Muhammad, beritahukan aku tentang\n" +
                    "Islam ?”, Maka bersabdalah Rasulullah\n" +
                    " Hadits Arba'in Nawawy 11\n" +
                    "shallallahu`alaihi wa sallam: “ Islam adalah engkau\n" +
                    "bersaksi bahwa tidak ada ilah (tuhan yang disembah)\n" +
                    "selain Allah, dan bahwa Nabi Muhammad adalah\n" +
                    "utusan Allah, engkau mendirikan shalat, menunaikan\n" +
                    "zakat, puasa Ramadhan dan pergi haji jika mampu “,\n" +
                    "kemudian dia berkata, “ anda benar “. Kami semua\n" +
                    "heran, dia yang bertanya dia pula yang membenarkan.\n" +
                    "Kemudian dia bertanya lagi: “ Beritahukan aku tentang\n" +
                    "Iman “. Lalu beliau bersabda, “ Engkau beriman kepada\n" +
                    "Allah, malaikat-malaikat-Nya, kitab-kitab-Nya, rasulrasul-Nya dan hari akhir dan engkau beriman kepada\n" +
                    "takdir yang baik maupun yang buruk “, kemudia dia\n" +
                    "berkata, “ anda benar“. Kemudian dia berkata lagi: “\n" +
                    "Beritahukan aku tentang ihsan “. Lalu beliau bersabda,\n" +
                    "“ Ihsan adalah engkau beribadah kepada Allah seakanakan engkau melihatnya, jika engkau tidak melihatnya\n" +
                    "maka Dia melihat engkau” . Kemudian dia berkata, “\n" +
                    "Beritahukan aku tentang hari kiamat (kapan\n" +
                    "kejadiannya)”. Beliau bersabda,“ Yang ditanya tidak\n" +
                    "lebih tahu dari yang bertanya \". Dia berkata,“\n" +
                    "Beritahukan aku tentang tanda-tandanya “, beliau\n" +
                    "bersabda, “ Jika seorang hamba melahirkan tuannya\n" +
                    "dan jika engkau melihat seorang bertelanjang kaki dan\n" +
                    "dada, miskin lagi penggembala domba, (kemudian)\n" +
                    "berlomba-lomba meninggikan bangunannya “,\n" +
                    "kemudian orang itu berlalu dan aku berdiam sebentar.\n" +
                    "Kemudian beliau (Rasulullah shallahu`alaihi wa\n" +
                    "sallam) bertanya,“ Tahukah engkau siapa yang\n" +
                    "bertanya ?”. Aku berkata,“ Allah dan Rasul-Nya lebih\n" +
                    "mengetahui “. Beliau bersabda,“ Dia adalah Jibril yang\n" +
                    "datang kepada kalian (bermaksud) mengajarkan agama\n" +
                    "kalian “. (Riwayat Muslim) \n"+
            "\n" +
                    "Kandungan Hadist:\n" +
                    "1. Disunnahkan untuk memperhatikan kondisi\n" +
                    "pakaian, penampilan dan kebersihan, khususnya\n" +
                    "jika menghadapi ulama, orang-orang mulia dan\n" +
                    "penguasa.\n" +
                    "2. Siapa yang menghadiri majlis ilmu dan menangkap\n" +
                    "bahwa orang–orang yang hadir butuh untuk\n" +
                    "mengetahui suatu masalah dan tidak ada\n" +
                    "seorangpun yang bertanya, maka wajib baginya\n" +
                    "bertanya tentang hal tersebut meskipun dia\n" +
                    "mengetahuinya agar peserta yang hadir dapat\n" +
                    "mengambil manfaat darinya.\n" +
                    "3. Jika seseorang yang ditanya tentang sesuatu maka\n" +
                    "tidak ada cela baginya untuk berkata, “Saya tidak\n" +
                    "tahu“, dan hal tersebut tidak mengurangi\n" +
                    "kedudukannya.\n" +
                    "4. Kemungkinan malaikat tampil dalam wujud\n" +
                    "manusia. \n " +
                    "5. Termasuk tanda hari kiamat adalah banyaknya\n" +
                    "pembangkangan terhadap kedua orang tua.\n" +
                    "Sehingga anak-anak memperlakukan kedua orang\n" +
                    "tuanya sebagaimana seorang tuan memperlakukan\n" +
                    "hamba-sahayanya.\n" +
                    "6. Tidak disukainya mendirikan bangunan yang tinggi\n" +
                    "dan membaguskannya selama tidak dibutuhkan.\n" +
                    "7. Di dalamnya terdapat dalil bahwa perkara ghaib\n" +
                    "tidak ada yang mengetahuinya selain Allah ta’ala.\n" +
                    "8. Di dalamnya terdapat keterangan tentang adab dan\n" +
                    "cara duduk dalam majlis ilmu. \n" +
                    "",
            R.drawable.img_news1
        ),

        news(
            "Hadis 3 : Rukun Islam",
            "عَنْ أَبِي عَبْدِ الرَّحْمَنِ عَبْدِ اللهِ بْنِ عُمَرَ بْنِ الْخَطَّابِ رَضِيَ اللهُ عَنْهُمَا قَالَ : سَمِعْتُ رَسُوْلَ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ يَقُوْلُ : بُنِيَ اْلإِسْلاَمُ عَلَى خَمْسٍ : شَهَادَةِ أَنْ لاَ إِلَهَ إِلاَّ اللهُ وَأَنَّ مُحَمَّداً رَسُوْلُ اللهِ وَإِقَامِ الصَّلاَةِ وَإِيْتَاءِ الزَّكَاةِ وَحَجِّ الْبَيْتِ وَصَوْمِ رَمَضَانَ ” رَوَاهُ البُخَارِيُّ وَمُسْلِمٌ\n" +
                    "\n" +
                    "Dari Abu  ‘Abdurrahman ‘Abdullah bin ‘Umar bin Al-Khattab radhiyallahu ‘anhuma, ia mengatakan bahwa ia mendengar Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "\n" +
                    "“Islam dibangun di atas lima perkara: bersaksi bahwa tidak ada yang berhak disembah melainkan Allah dan Muhammad adalah utusan Allah; menunaikan shalat; menunaikan zakat; menunaikan haji (ke Baitullah); dan berpuasa Ramadhan.” (HR. Bukhari dan Muslim) [HR. Bukhari, no. 8; Muslim, no. 16]\n" +
                    "\n" +
                    "Kandungan hadis : \n" +
                    "Islam diibaratkan sebagai sebuah bangunan yang memiliki tiang pokok yang lima.\n" +
                    "Bersyahadat “laa ilaha illallah” berarti bersaksi dan mengakui bahwa tidak ada sesembahan yang berhak disembah selain Allah.\n" +
                    "Menegakkan shalat yang dimaksud adalah mengerjakan shalat dengan memenuhi rukun dan syaratnya.\n" +
                    "Menunaikan zakat artinya mengeluarkan dan memberikannya kepada yang berhak menerima.\n" +
                    "Seseorang tidak disebut berislam hingga ia mengimani lima rukun Islam yang ada. Siapa yang mengingkari salah satunya, ia kafir. Siapa yang meninggalkannya dalam rangka meremehkan, ia termasuk orang fajir.\n" +
                    "Shalat adalah amalan badaniyah (anggota badan), zakat adalah amalan maaliyah (terkait harta).\n" +
                    "Shalat adalah amalan anggota badan dengan bentuknya mengerjakan, sedangkan puasa adalah amalan anggota badan yang sifatnya menahan diri dan meninggalkan sesuatu.\n" +
                    "Haji adalah amalan badaniyah dan maaliyah bagi orang yang mampu melakukan perjalanan.\n" +
                    "Semua bentuk rukun Islam tidak lepas dari tiga hal: (1) badzlul mahbub (mengeluarkan sesuatu yang dicintai) seperti pada zakat; (2) al-kaffu ‘anil mahbub (menahan sesuatu yang dicintai) seperti pada puasa; (3) ijhadul badan (berjuang dengan badan) seperti pada puasa dan haji.\n" +
                    "Kenapa rukun Islam hanya disebut lima saja tidak ada lainnya? Jawabnya, karena hukum syari’at ini ada yang wajib dan ada yang sunnah. Perkara yang sunnah tentu tidak jadi bagian dari rukun. Sedangkan perkara yang wajib itu ada dua macam yaitu wajib kifayah dan wajib ‘ain. Contoh wajib kifayah adalah amar makruf nahi mungkar dan berdakwah. Sedangkan yang disebut dalam rukun Islam, ada kewajiban yang terkait harta seperti pada zakat, ada kewajiban yang terkait badan seperti mengerjakan shalat; ada kewajiban yang terkait badan dan harta seperti haji; dan ada kewajiban yang terkait lisan seperti syahadat. Rukun Islam ini masuk wajib ‘ain.",

            R.drawable.img_news2
        ),



        news(
            "Hadis 4 : Proses Diciptakannya Manusia di dalam Perut Seorang Ibu",
            "عَنْ أَبِي عَبْدِ الرَّحْمنِ عَبْدِ اللهِ بْنِ مَسْعُودٍ رَضِيَ اللهُ عَنْهُ, قَلَ : حَدَّثَنَا رَسُولُ اللهِ صلى الله عليه وسلم وَهُوَ الصَّادِقُ المَصْدُوْقُ : اِنَّ أَحَدُكُمْ يُجْمَعُ خَلْقُهُ في بَطْنِ أُمِّهِ أَرْبَعِينَ يَوْمًا نُطْفَةً ثُمَّ يَكُونُ عَلَقَةً مِثْلَ ذلك ثُمَّ يَكُوْنُ مُضْغَةً مِثْلَ ذلك, ثُمَّ يُرْسَلُ اِلَيْهِ المَلَكُ فَيَنْفُخُ فِيْهِ الرُّوْحَ وَيُؤْمَرُ بِأَرْبَعِ كَلِمَاتٍ: بِكَتْبِ رِزْقِهِ وَأَجَلِهِ وَعَمَلِهِ, وَشَقِيٌّ أَوْ سَعِيدٌ. فَوَالَّذِي لَا اله غَيْرُهُ, اِنَّ أَحَدَكُمْ لَيَعْمَلُ بِعَمَلِ أَهْلِ الجَنَّةِ حتّى مَا يَكُوْنُ بَيْنَهُ وَبَيْنَهَا اِلَّا ذِرَاعٌ فَيَسْبِقُ عَلَيْهِ الكِتَابُ فَيَعْمَلُ بِعَمَلِ أَهْلِ النَّارِ حتى مَا يَكُوْنُ بَيْنَهُ وَبَيْنَهَا اِلَّا ذِرَاعٌ فَيَسْبِقُ عَلَيْهِ الكِتَابُ فَيَعْمَلُ بِعَمَلِ الجَنَّةِ فَيَدخُلُهَا \n" +
                    "\n"+
                    "Dari Abu ‘Abdurrahman ‘Abdullah bin Mas’ud Radhiyallahu ‘Anhu, ia berkata, ‘Rasulullah Shallallahu ‘Alaihi wa Sallam menceritakan kepada kami, dan beliau adalah ash-Shadiq al-Mashduq (yang benar lagi dibenarkan perkataannya):\n" +
                    "‘Sesungguhnya seseorang dari kalian dikumpulkan penciptaannya dalam perut ibunya selama 40 hari dalam bentuk sperma, kemudian menjadi segumpal darah seperti (masa) itu, kemudian menjadi segumpal daging seperti itu pula.\n" +
                    "Kemudian seorang malaikat diutus kepadanya untuk meniupkan ruh di dalamnya, dan diperintahkan dengan empat kalimat: menuliskan rizkinya, ajalnya, amalnya, dan celaka atau bahagia.\n" +
                    "Demi Dzat yang tiada tuhan selain-Nya, sesungguhnya ada salah seorang dari kalian yang beramal dengan amalan ahli surga sehingga jarak antara dirinya dengan surga hanya tinggal satu hasta, tapi catatan (takdir) mendahuluinya, lalu ia beramal dengan amalan ahli neraka sehingga akhirnya dia masuk neraka. \n" +
                    "Dan sesungguhnya ada salah seorang dari kalian yang beramal dengan amalan ahli neraka sehingga jarak antara dirinya dengan neraka hanya tinggal satu hasta, tapi catatan (takdir) mendahuluinya, lalu ia beramal dengan amalan ahli surga sehingga akhirnya dia masuk surga’. \n"+
                    "\n"+
                    "Kandungan hadis :\n" +
                    "Penjelasan tentang proses penciptaan manusia di dalam perut ibunya terjadi dalam empat periodisasi, yaitu: Pertama, Nuthfah (dalam bentuk sperma), selama empat puluh hari; Kedua, ‘Alaqah (gumpalan darah), selama empat puluh hari; Ketiga, Mudghoh (gumpalan daging) selama 40 hari; Keempat, yaitu setelah ditiupnya ruh ke dalam tubuh janin. Janin mengalami proses perkembangan dalam perut ibunya dalam tahap perkembangan seperti ini.\n" +
                    "Sebelum berumur empat bulan, janin belum dapat dihukumi sebagai manusia yang hidup. Atas dasar ini, jika bayi itu keluar sebelum kandungan itu genap berumur empat bulan, maka ia tidak dimandikan, tidak dikafani, dan tidak pula disholatkan, karena ia belum dapat disebut seorang manusia.\n" +
                    "Setelah kandungan berusia empat bulan, ditiupkan ruh padanya. Maka (setelah itu), ia telah positif dihukumi sebagai manusia yang hidup. Jadi, jika setelah itu kandungan tersebut keluar, maka ia wajib dimandikan, dikafani, dan dishalatkan. Seperti halnya manusia biasa.\n" +
                    "Adanya malaikat yang diberi tugas untuk mengurusi rahim (kandungan). Berdasarkan sabda beliau shallallahu ‘alaihi wasallam, “Maka diutuslah malaikat kepadanya.” Yakni malaikat yang diberi tugas untuk mengurusi rahim.\n" +
                    "Keadaan manusia telah ditakdirkan ketika ia berada di dalam perut ibunya, yakni telah ditakdirkan rizqinya, amalannya, ajalnya, dan apakah dia celaka ataukah bahagia.\n" +
                    "Penjelasan tentang hikmah Allah, bahwa segala sesuatu di sisinya telah ditetapkan dengan batas waktu tertentu dengan takdir yang tidak dapat didahulukan dan diakhirkan.\n" +
                    "Setiap orang wajib merasa takut dan cemas karena Rasulullah shallallahu ‘alaihi wasallam telah mengabarkan, “Bahwa seseorang beramal dengan amalan ahli surga hingga jarak antara dirinya dan surga hanya sehasta, lalu ia didahului oleh kitab (takdir), sehingga ia beramal dengan amalan ahli neraka, sehingga ia memasukinya.”\n" +
                    "Seorang manusia tidak sepantasnya berputus asa, karena bisa jadi seseorang melakukan kemaksiatan dalam waktu yang lama kemudian Allah memberikan hidayah kepadanya, sehingga ia bisa mendapatkan petunjuk di akhir hayatnya.",
            R.drawable.img_news4
        ),

        news(
            "Hadis 5 : Bahaya Bid'ah",
            "عَنْ أُمِّ المُؤْمِنِيْنَ أُمِّ عَبْدِ اللهِ عَائِشَةَ رَضِيَ اللهُ عَنْهَا، قَالَتْ: قَالَ رَسُوْلُ اللهِ ﷺ: «مَنْ أَحْدَثَ فِي أَمْرِنَا هَذَا مَا لَيْسَ مِنْهُ فَهُوَ رَدٌّ» رَوَاهُ البُخَارِيُّ وَمُسْلِمٌ.\n" +
                    "وَفِي رِوَايَةٍ لِمُسْلِمٍ: «مَنْ عَمِلَ عَمَلاً لَيْسَ عَلَيْهِ أَمْرُنَا فَهُوَ رَدٌّ \n"+
                    "\n"+
                    "Dari Ummul Mukminin Ummu Abdillah ‘Aisyah Radhiyallahu ‘Anha, ia berkata: Rasulullah Shallallahu ‘Alaihi wa Sallam bersabda, “Barangsiapa yang mengada-ngada dalam urusan kami ini yang bukan bagian darinya, maka ia tertolak \n"+
                    "\n"+
                    "Kandungan hadis :\n"+
                    "Pertama: Syarat diterimanya amalan itu ada dua yaitu ikhlas dan ittiba’ (mengikuti tuntunan). Syarat ikhlas ini yang dibahas dalam hadits pertama dalam Al-Arba’in An-Nawawiyah “innamal a’maalu bin niyaat”. Sedangkan ittiba’ ini yang dibahas dalam hadits kali ini. Hadits “innamal a’maalu bin niyaat” adalah timbangan untuk amalan batin, sedangkan hadits nomor lima kali ini adalah timbangan untuk amalan lahiriyah.\n" +
                    "\n" +
                    "Kedua: Mengamalkan amalan yang tidak ada tuntunannya, maka amalan tersebut mardudun (tertolak), tidak diterima di sisi Allah.\n" +
                    "\n" +
                    "Ketiga: Kalimat “man ahdatsa” berarti mengadakan amalan yang baru dalam agama. Kalimat “fii amrinaa” bermakna dalam agama.\n" +
                    "\n" +
                    "Keempat: Dari dalil ini dapat disimpulkan bahwa semua bid’ah itu madzmumah (tercela), tidak diterima di sisi Allah. Sehingga pembagian bid’ah menjadi bid’ah hasanah dan bid’ah sayyi’ah atau membaginya menjadi lima sesuai dengan hukum taklif (wajib, sunnah, haram, makruh, dan mubah) tidaklah tepat. Ditambah lagi dalam hadits disebutkan celaan pada setiap macam bid’ah di mana disebut “kullu bid’atin dholalah”, setiap bid’ah itu sesat. Kata “kullu” di sini maknanya umum, artinya semua bid’ah itu tercela.\n" +
                    "\n" +
                    "Kelima: Amalan bid’ah itu ada beberapa macam:\n" +
                    "\n" +
                    "ada yang bid’ahnya pada pokok amalan artinya ia mengamalkan amalan yang asalnya tidak ada tuntunan, maka amalan tersebut tidak diterima;\n" +
                    "ada yang bid’ahnya pada tambahan namun amalan pokoknya tetap disyari’atkan, maka amalan tambahan ini tertolak, adapun amalan pokoknya diterima jika memang tidak dirusak dengan amalan tambahan;\n" +
                    "pokok amalan asalnya ada tuntunan, namun seseorang mengerjakannya menyelisihi ketentuan syari’at, amalan tersebut tidak diterima; seperti berpuasa dari berbicara, maka tidak ada tuntunan;\n" +
                    "sudah sesuai dengan ketentuan pokok syari’at dan caranya, namun jumlahnya yang berbeda dengan ketentuan; seperti mengamalkan dzikir pagi petang dibaca seribu kali untuk bacaan istighfar, maka ini menyelisihi ketentuan;\n" +
                    "amalannya disyari’atkan namun menyelisihi dalam hal mengistimewakan hari dan tempat, seperti berpuasa pada hari Selasa karena dianggap sebagai hari lahirnya, maka amalan tersebut tidak diterima.\n" +
                    "Keenam: Jika ada yang melakukan ibadah dengan cara yang terlarang yang tidak disyari’atkan apakah amalan tersebut diterima ataukah tidak, perlu dirinci:\n" +
                    "\n" +
                    "jika larangan yang dilakukan di luar dari ibadah seperti berhaji dengan harta haram atau berwudhu dari bejana yang terbuat dari emas, ibadahnya sah, namun berdosa karena melakukan yang haram;\n" +
                    "jika larangan tersebut mausk dalam ibadah, misalnya shalat di rumah hasil rampasan, maka yang dilakukan adalah perbuatan yang haram dan pelakunya berdosa. Namun jumhur ulama menyatakan tetap mendapatkan pahala. Sedangkan Imam Ahmad menganggap shalatnya tidaklah sah.",
            R.drawable.img_news3
        ),

        news(
            "Hadis 6 : Syubhat dan Jaga hati",
            "عَنْ أَبِي عَبْدِ اللهِ النُّعْمَان بْنِ بَشِيْرٍ رَضِيَ اللهُ عَنْهُمَا قَالَ : سَمِعْتُ رَسُوْلَ اللهِ صَلَّى اللهُ عَلَيْهِ وَآلِهِ وَسَلَّمَ يَقُوْلُ : إِنَّ الحَلاَلَ بَيِّنٌ وَإِنَّ الَحرَامَ بَيِّنٌ وَبَيْنَهُمَا أُمُوْرٌ مُشْتَبِهَاتٌ لاَ يَعْلَمُهُنَّ كَثِيْرٌ مِنَ النَّاسِ فَمَنِ اتَّقَى الشُّبُهَاتِ فَقَدِ اسْتَبْرَأَ لِدِيْنِهِ وَعِرْضِهِ وَمَنْ وَقَعَ فِي الشُّبُهَاتِ وَقَعَ فِي الحَرَامِ كَالرَّاعِي يَرْعَى حَوْلَ الحِمَى يُوْشِكُ أَنْ يَرْتَعَ فِيْهِ أَلاَّ وِإِنَّ لِكُلِّ مَلِكٍ حِمًى أَلاَ وَإِنَّ حِمَى اللهِ مَحَارِمُهُ أَلَا وَإِنَّ فِي الجَسَدِ مُضْغَةً إِذَا صَلُحَتْ صَلُحَ الجَسَدُ كُلُّهُ وَإِذَا فَسَدَتْ فَسَدَ الجَسَدُ كُلُّهُ أَلَا وَهِيَ القَلْبُ – رَوَاهُ البُخَارِي وَمُسْلِمٌ\n" +
                    "\n" +
                    "Dari Abu ‘Abdillah An-Nu’man bin Basyir radhiyallahu ‘anhuma, ia berkata bahwa ia mendengar Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "\n" +
                    "“Sesungguhnya yang halal itu jelas, sebagaimana yang haram pun jelas. Di antara keduanya terdapat perkara syubhat–yang masih samar–yang tidak diketahui oleh kebanyakan orang. Barangsiapa yang menghindarkan diri dari perkara syubhat, maka ia telah menyelamatkan agama dan kehormatannya. Barangsiapa yang terjerumus ke dalam perkara syubhat, maka ia bisa terjatuh pada perkara haram. Sebagaimana ada penggembala yang menggembalakan ternaknya di sekitar tanah larangan yang hampir menjerumuskannya. Ketahuilah, setiap raja memiliki tanah larangan dan tanah larangan Allah di bumi ini adalah perkara-perkara yang diharamkan-Nya. Ingatlah di dalam jasad itu ada segumpal daging. Jika ia baik, maka seluruh jasad akan ikut baik. Jika ia rusak, maka seluruh jasad akan ikut rusak. Ingatlah segumpal daging itu adalah hati (jantung)\n" +
                    "\n" +
                    "Kandungan hadis : \n"+
                    "Pertama: Ada tiga hukum yang disebutkan dalam hadits di atas, yaitu (1) halal, (2) haram, dan (3) syubhat.\n" +
                    "Ibnu Hajar Al-Asqalani rahimahullah mengatakan, “Hukum itu dibagi menjadi tiga macam dan pembagian seperti ini benar. Karena sesuatu bisa jadi ada dalil tegas yang menunjukkan adanya perintah dan ancaman keras jika ditinggalkan. Ada juga sesuatu yang terdapat dalil untuk meninggalkan dan terdapat ancaman jika dilakukan. Ada juga sesuatu yang tidak ada dalil tegas apakah halal atau haram. Yang pertama adalah perkara halal yang telah jelas dalilnya. Yang kedua adalah perkara haram yang telah jelas dalilnya. Makna dari bagian hadits “halal itu jelas”, yang dimaksud adalah tidak butuh banyak penjelasan dan setiap orang sudah memahaminya. Yang ketiga adalah perkara syubhat yang tidak diketahui apakah halal atau haram.” (Fath Al-Bari, 4: 291).\n" +
                    "Sedangkan masalah (problem) dibagi menjadi empat macam:\n" +
                    "Yang memiliki dalil bolehnya, maka boleh diamalkan dalil bolehnya.\n" +
                    "Yang memiliki dalil pengharaman, maka dijauhi demi mengamalkan dalil larangan.\n" +
                    "Yang terdapat dalil boleh dan haramnya sekaligus. Maka inilah masalah mutasyabih (yang masih samar). Menurut mayoritas ulama, yang dimenangkan adalah pengharamannya.\n" +
                    "Yang tidak terdapat dalil boleh, juga tidak terdapat dalil larangan, maka ini kembali ke kaedah hukum asal. Hukum asal ibadah adalah haram. Sedangkan dalam masalah adat dan muamalah adalah halal dan boleh. (Lihat Syarh Al-Arba’in An-Nawawiyyah Al-Mukhtashar karya Syaikh Sa’ad bin Nashir Asy-Syatsri, hlm. 64)\n" +
                    "Kedua: Kebanyakan orang tidak mengetahui perkara syubhat karena Nabi shallallahu ‘alaihi wa sallam menyebutkan ‘kebanyakan orang tidak mengetahui perkara tersebut’.  Perkaran syubhat ini sering ditemukan oleh para ulama dalam bab jual beli karena perkara tersebut dalam jual beli amatlah banyak. Perkara ini juga ada sangkut pautnya dengan nikah, buruan, penyembelihan, makanan, minuman dan selain itu. Sebagian ulama sampai-sampai melarang penggunaan kata halal dan haram secara mutlak kecuali pada perkara yang benar-benar ada dalil tegas yang tidak butuh penafsiran lagi. Jika dikatakan kebanyakan orang tidak mengetahuinya, maka ini menunjukkan bahwa sebagian dari mereka ada yang tahu. Demikian kami ringkaskan dari perkataan Ibnu Hajar dalam Fath Al-Bari, 4:291.\n" +
                    "Syaikh Dr. Sa’ad bin Nashir Asy Syatsri hafizahullah mengatakan, “Perkara yang syubhat (samar) itu muncul karena beberapa sebab, bisa jadi karena kebodohan, atau tidak adanya penelusuran lebih jauh mengenai dalil syar’i, begitu pula bisa jadi karena tidak mau merujuk pada perkataan ulama yang kokoh ilmunya.” (Syarh Al-Arba’in An-Nawawiyyah Al-Mukhtashar, hlm. 63)\n" +
                    "Ketiga: Kesamaran (perkara syubhat) bisa saja terjadi pada perselisihan ulama. Hal ini ditinjau dari keadaan orang awam. Namun kaedah syar’iyah yang wajib bagi orang awam untuk mengamalkannya ketika menghadapi perselisihan para ulama setelah ia meneliti dan mengkaji adalah ia kuatkan pendapat-pendapat yang ada sesuai dengan ilmu dan kewara’an, juga ia bisa memilih pendapat yang dipilih oleh mayoritas ulama. Karena pendapat kebanyakan ulama itu lebih dekat karena seperti syari’at. Dan perkataan orang yang lebih berilmu itu lebih dekat pada kebenaran karena bisa dinilai sebagai syari’at. Begitu pula perkataan ulama yang lebih wara’ (mempunyai sikap kehati-hatian), itu lebih baik diikuti karena serupa dengan syari’at.“ Lihat penjelasan beliau dalam Syarh Al-Arba’in An-Nawawiyyah Al-Mukhtashar karya Syaikh Sa’ad bin Nashir Asy-Syatsri, hal. 65.\n" +
                    "Intinya, kalau orang awam tidak bisa menguatkan pendapat ketika menghadapi perselisihan ulama, maka hendaknya ia tinggalkan perkara yang masih samar tersebut. Jika ia sudah yakin setelah menimbang-nimbang dan melihat dalil, maka ia pilih pendapat yang ia yakini.\n" +
                    "Keempat: Ada dua manfaat meninggalkan perkara syubhat. Disebutkan dalam hadits, “Barangsiapa yang menghindarkan diri dari perkara syubhat, maka ia telah menyelamatkan agama dan kehormatannya.” Dari dua faedah ini, Syaikh Shalih Al-Fauzan hafizahullah mengatakan, “Dari sini menunjukkan bahwa janganlah kita tergesa-gesa sampai jelas suatu perkara.” Lihat Al-Minhah Ar-Rabbaniyah fii Syarh Al-Arba’in An-Nawawiyyah, hlm. 106.\n" +
                    "Kelima: Hadits ini menunjukkan bahwa jika seseorang bermudah-mudahan dan seenaknya saja memilih yang ia suka padahal perkara tersebut masih samar hukumnya, maka ia bisa jadi terjerumus dalam keharaman.\n" +
                    "Ibnu Daqiq Al-‘Ied mengatakan bahwa orang yang terjerumus dalam syubhat bisa terjatuh pada yang haram dilihat dari dua sisi: (1) barangsiapa yang tidak bertakwa pada Allah lalu ia mudah-mudahan memilih suatu yang masih syubhat (samar), itu bisa mengantarkannya pada yang haram, (2) kebanyakan orang yang terjatuh dalam syubhat, gelaplah hatinya karena hilang dari dirinya cahaya ilmu dan cahaya sifat wara’, jadinya ia terjatuh dalam keharaman dalam keadaan ia tidak tahu. Bisa jadi ia berdosa karena sikapnya yang selalu meremehkan. Lihat Syarh Al-Arba’in An-Nawawiyyah, penjelasan Ibnu Daqiq Al ‘Ied, hlm. 49.\n" +
                    "Namun catatan yang perlu diperhatikan, sebagian orang mengatakan bahwa selama masih ada khilaf (perselisihan ulama), maka engkau boleh memilih pendapat mana saja yang engkau suka. Kami katakan, “Tidak demikian”. Khilaf ulama tidak menjadikan kita seenaknya saja memilih pendapat yang kita suka. Namun hendaknya kita pilih mana yang halal atau haram yang kita yakini. Karena jika sikap kita semacam tadi, dapat membuat kita terjatuh dalam keharaman. Lihat Al-Minhah Ar-Rabbaniyah fii Syarh Al-Arba’in An-Nawawiyyah, hlm. 107.\n" +
                    "Keenam: Jika perkaranya syubhat (samar), maka sepatutnya ditinggalkan. Karena jika seandainya kenyataan bahwa perkara tersebut itu haram, maka ia berarti telah berlepas diri. Jika ternyata halal, maka ia telah diberi ganjaran karena meninggalkannya untuk maksud semacam itu. Karena asalnya, perkara tersebut ada sisi bahaya dan sisi bolehnya.” (Fath Al-Bari, 4:291)\n" +
                    "Ketujuh: Para ulama katakan bahwa hati adalah malikul a’dhoo (rajanya anggota badan), sedangkan anggota badan adalah junuduhu (tentaranya). Lihat Jaami’ Al-‘Ulum wa Al-Hikam, 1:210.\n" +
                    "",
            R.drawable.img_news5
        ),

        news(
            "Hadis 7 : Agama adalah nasehat",
            "عَنْ أَبِي رُقَيَّةَ تَمِيْمٍ بْنِ أَوْسٍ الدَّارِي رَضِيَ اللهُ تَعَالَى عَنْهُ أَنَّ النَّبِيَّ صَلَّى اللهُ عَلَيْهِ وَآلِهِ وَسَلَّمَ قَالَ الدِّيْنُ النَّصِيْحَةُ قُلْنَا : لِمَنْ ؟ قَالَ للهِ وَلِكِتَابِهِ وَلِرَسُوْلِهِ وَلِأَئِمَّةِ المُسْلِمِيْنَ وَعَامَّتِهِمْ – رَوَاهُ مُسْلِمٌ\n" +
                    "\n" +
                    "Dari Abu Ruqayyah Tamim bin Aus Ad-Daari radhiyallahu ‘anhu, ia berkata bahwa Nabi shallallahu ‘alaihi wa sallam bersabda, “Agama adalah nasihat.” Kami bertanya, “Untuk siapa?” Beliau menjawab, “Bagi Allah, bagi kitab-Nya, bagi rasul-Nya, bagi pemimpin-pemimpin kaum muslimin, serta bagi umat Islam umumnya.” (HR. Muslim) [HR. Muslim, no. 55]\n" +
                    "\n" +
                    "Kandungan hadis : \n" +
                    "Pertama: Ad-diin dalam hadits maksudnya adalah diin dengan artian agama. Sedangkan ad-diin lainnya bermakna al-jazaa’ (pembalasan) seperti pada ayat ‘maaliki yaumiddiin’ (Yang Menguasai Hari Pembalasan).\n" +
                    "Kedua: Nasihat itu begitu penting karena Nabi shallallahu ‘alaihi wa sallam menjadikannya bagian dari agama.\n" +
                    "Ketiga: Bagusnya pengajaran Rasul shallallahu ‘alaihi wa sallam, beliau menyampaikan sesuatu secara umum (global) terlebih dahulu, lalu menyebutkan rinciannya.\n" +
                    "Keempat: Para sahabat haus akan ilmu, apa yang butuh dipahami dengan baik, mereka selalu menanyakannya agar jelas.\n" +
                    "Kelima: Nabi shallallahu ‘alaihi wa sallam memulai penyebutan dengan hal terpenting lalu yang penting lainnya karena beliau menyebutkan nasihat bagi Allah, lalu kitab-Nya, lalu rasul-Nya, lalu kepada imam kaum muslimin, lalu kepada kaum muslimin secara umum. Sedangkan kitab Allah didahulukan daripada Rasul, karena kitab itu langgeng, sedangkan Rasul telah tiada. Namun nasihat kepada keduanya saling terkait.\n" +
                    "Keenam: Nasihat bagi Allah mencakup dua hal yaitu:\n" +
                    "Mengikhlaskan ibadah hanya kepada Allah.\n" +
                    "Bersaksi bahwa Allah itu Esa dalam rububiyah, uluhiyyah, juga dalam nama dan sifat-Nya.\n" +
                    "Ketujuh: Nasihat bagi kitab Allah mencakup:\n" +
                    "Membela Al-Qur’an dari yang menyelewengkan dan mengubah maknanya.\n" +
                    "Membenarkan setiap yang dikabarkan tanpa ada keraguan.\n" +
                    "Menjalankan setiap perintah dalam Al-Qur’an.\n" +
                    "Menjauhi setiap larangan dalam Al-Qur’an.\n" +
                    "Mengimani bahwa hukum yang ada adalah sebaik-baik hukum, tidak ada hukum yang sebaik Al-Qur’an.\n" +
                    "Mengimani bahwa Al-Qur’an itu kalamullah (firman Allah) secara huruf dan makna, bukan makhluk.\n" +
                    "",
            R.drawable.img_news6
        ),

        news(
            "Hadis 8 : Prinsip dalam perang",
            "أُمِرْتُ أَنْ أُقَاتِلَ النَّاسَ حَتَّى يَشْهَدُوا أَنْ لاَ إِلَهَ إِلاَّ اللهُ وَأَنَّ مُحَمَّدَاً رَسُوْلُ اللهِ وَيُقِيْمُوْا الصَّلاةَ وَيُؤْتُوا الزَّكَاةَ فَإِذَا فَعَلُوا ذَلِكَ عَصَمُوا مِنِّي دِمَاءهَمْ وَأَمْوَالَهُمْ إِلاَّ بِحَقِّ الإِسْلامِ وَحِسَابُهُمْ عَلَى اللهِ تَعَالَى \n"+
                    "Aku diperintah untuk memerangin manusia hingga mereka bersaksi bahwa tiada Tuhan yang berhak disembah selain Allah dan Muhammad adalah Rasulullah, serta menegakkan shalat dan menunaikan zakat. Lalu jika mereka telah melakukan itu, maka darah dan hartanya terlindungi dariku, kecuali dengan hak Islam dan hisab (perhitungan) mereka pada Allah Ta’ala \n"+
                    "Kandungan hadis : \n"+
                    "Peertama, Nabi SAW adalah seorang hamba yang mendapat mandat perintah dari Allah. Jadi, dia bertindak bukan atas hawa nafsu pribadi.\n" +
                    "Kedua, boleh tidak menerangkan sesuatu ketika sudah maklum. Sebagaimana dalam hadits ini, Allah yang memerintahkan Nabi untuk berperang tidak disebut karena sudah maklum.\n" +
                    "Ketiga, dalam kondisi perang, wajib umat Islam berpartisipasi berperang hingga pihak yang diperangi melakukan beberapa hal yang tersebut dalam hadits.\n" +
                    "Keempat, syahadat wajib dengan hati dan lisan. Jika, sudah melafalkan dengan lisan, dan tidak diketahui sebenarnya dalam hati, maka diberlakukan sesuai lahiriahnya.\n" +
                    "Kelima, dalam syahadat wajib meyakini bahwa tidak ada sesembahan lain yang berhak disembah selain Allah.\n" +
                    "Keenam, perang disudahi ketika sudah ada pengakuan syahadat dari pihak yang diperangi.\n" +
                    "Ketujuh, wajib menegakkan shalat. Kedelapan, wajib menunaikan zakat. Kesembilan, bolehnya mengungkapkan ucapan lisan sebagai perbuatan. Karena, perkataan adalah perbuatan lisan.\n" +
                    "Kesepuluh, dalam konteks perang darah dan harta orang kafir halal.\n" +
                    "Sebagai penutup, hadits ini sekali lagi harus dipahami dalam konteks perang yang syarat-syaratnya sangat ketat. Tidak berlaku dalam kondisi damai. Pada kesempatan lain, insya Allah akan dibahas tentang syarat-syarat berlakunya perang dalam Islam. ",
            R.drawable.img_news7
        ),

        news(
            "Hadis 9 : Kerjakan Perintah Semampunya",
            "سَمِعْتُ رَسُوْلَ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ يَقُوْلُ: مَا نَهَيْتُكُمْ عَنْهُ فَاجْتَنِبُوْهُ، وَمَا أَمَرْتُكُمْ بِهِ فَأْتُوا مِنْهُ مَا اسْتَطَعْتُمْ، فَإِنَّمَا أَهْلَكَ الَّذِيْنَ مَنْ قَبْلَكُمْ كَثْرَةُ مَسَائِلِهِمْ وَاخْتِلاَفُهُمْ عَلَى أَنْبِيَائِهِمْ . رَوَاهُ البُخَارِيُّ وَمُسْلِمٌ \n" +
                    "Saya telah mendengar Rasulullah Shallallahu ‘Alaihi wa Sallam bersabda: apa-apa yang aku larang hendaknya kalian menjauhinya dan apa-apa yang aku perintahkan kepada kalian hendaknya kalian melakukannya semampu kalian. Karena sesungguhnya orang-orang sebelum kalian telah binasa karena banyaknya pertanyaan mereka dan perselisihan mereka kepada Nabi-Nabi mereka.” (HR. Al-Bukhari dan Muslim) \n"+
                    "\n"+
                    "Kandungan hadis :\n" +
                    "Pertama: Kaedah dari ulama ushul, jika ada suatu perintah tidaklah menunjukkan bahwa perintah tersebut mesti diulang. Hukum asalnya, suatu perintah dalam dalil tidak menunjukkan adanya pengulangan kecuali ada dalil yang menunjukkan harus dirutinkan atau diulang.\n" +
                    "Kedua: Sebagian ulama berpandangan bahwa Nabi shallallahu ‘alaihi wa sallamboleh berijtihad dalam hal hukum dan tidak disyaratkan semua hukum mesti dengan wahyu. Ini diambil dari hadits “Seandainya aku mengatakan iya (tiap tahun), tentu jadi wajiblah.” Inilah yang jadi pendapat madzhab Syafi’iyah sebagaimana disebutkan oleh Imam Nawawi rahimahullah.\n" +
                    "Ketiga: Secara hukum asal, kita tidak diberi beban kewajiban. Artinya, tidak ada hukum sampai datang dalil. Pendukung dari hukum asal ini adalah firman Allah Ta’ala,\n" +
                    "وَمَا كُنَّا مُعَذِّبِينَ حَتَّىٰ نَبْعَثَ رَسُولًا\n" +
                    "“Dan Kami tidak akan mengazab sebelum Kami mengutus seorang rasul.” (QS. Al-Isra’: 15)\n" +
                    "Keempat: Ada kaedah ushul fikih dari hadits ini yang dipakai oleh para ulama “tidak ada kewajiban ketika tidak mampu”.\n" +
                    "Syaikh As-Sa’di rahimahullah berkata dalam bait syair kaedah fikih yang beliau susun,\n" +
                    "وَ لَيْسَ وَاجِبٌ بِلاَ اقْتِدَارٍ\n" +
                    "“Tidak ada kewajiban ketika tidak mampu.”\n" +
                    "Artinya, kewajiban bisa gugur jika tidak punya kemampuan saat sebelum dan ketika kewajiban tersebut berlangsung. Sedangkan yang dimaksud kewajiban adalah yang dituntut oleh syari’at dengan perintah yang wajib. Perkara sunnah tidak termasuk dalam hal ini.\n" +
                    "Beberapa dalil yang mendukung hal ini, di antaranya adalah firman Allah Ta’ala,\n" +
                    "فَاتَّقُوا اللَّهَ مَا اسْتَطَعْتُمْ\n" +
                    "“Bertakwalah pada Allah semampu kalian.” (QS. At-Taghabun: 16)\n" +
                    "Ayat di atas sebagai tafsiran dari ayat,\n" +
                    "يَا أَيُّهَا الَّذِينَ آمَنُوا اتَّقُوا اللَّهَ حَقَّ تُقَاتِهِ\n" +
                    "“Hai orang-orang yang beriman, bertakwalah kepada Allah sebenar-benar takwa kepada-Nya.” (QS. Ali Imran: 102). Inilah pendapat Imam Nawawi rahimahullah. Beliau menyatakan bahwa perintah bertakwa kepada Allah dengan sebenar-benarnya takwa ditafsirkan dengan ayat “Bertakwalah pada Allah semampu kalian”. Artinya kita diperintahkan mengerjakan suatu perintah dan menjauhi suatu larangan, Allah tidaklah memerintahkan kecuali sesuai kemampuan kita. Lihat Syarh Shahih Muslim, 9:91.\n" +
                    "Begitu juga ayat yang mendukung kaedah di atas,\n" +
                    "لَا يُكَلِّفُ اللَّهُ نَفْسًا إِلَّا وُسْعَهَا\n" +
                    "“Allah tidak membebani seseorang melainkan sesuai dengan kesanggupannya.” (QS. Al-Baqarah: 286)\n" +
                    "وَمَا جَعَلَ عَلَيْكُمْ فِي الدِّينِ مِنْ حَرَجٍ\n" +
                    "“Dan Dia sekali-kali tidak menjadikan untuk kamu dalam agama suatu kesempitan.” (QS. Al-Hajj: 78)\n" +
                    "Kelima: Wajib menahan diri dari setiap apa yang dilarang oleh Nabi shallallahu ‘alaihi wa sallam.\n" +
                    "Keenam: Menahan diri dari yang terlarang ini mencakup larangan yang sedikit maupun yang banyak. Contoh, riba yang sedikit dan banyak sama-sama dijauhi.\n" +
                    "Allah Ta’ala berfirman,\n" +
                    "يَا أَيُّهَا الَّذِينَ آَمَنُوا لَا تَأْكُلُوا الرِّبَا أَضْعَافًا مُضَاعَفَةً وَاتَّقُوا اللَّهَ لَعَلَّكُمْ تُفْلِحُونَ\n" +
                    "“Hai orang-orang yang beriman, janganlah kamu memakan riba dengan berlipat ganda dan bertakwalah kamu kepada Allah supaya kamu mendapat keberuntungan.” (QS. Ali Imran: 130)\n" +
                    "Imam Asy-Syaukani rahimahullah menjelaskan bahwa adapun kalimat memakan riba yang berlipat ganda, yang dimaksudkan adalah larangan memakan riba setiap saat. Di sini penyebutan banyak (berlipat), bukanlah maksud larangan. Namun riba tetap dilarang baik dalam keadaan banyak maupun sedikit.\n" +
                    "Adapun diibaratkan dengan ungkapan berlipat ganda untuk menunjukkan bahwa riba yang terjadi itu karena adanya penundaan pembayaran hingga waktu tertentu. Kalau ada penundaan, maka ada tambahan pembayaran utang, tambahan tersebut sesuai kesepakatan. Adanya tambahan pembayaran tersebutlah yang membuat penundaan pembayaran itu ada. Sehingga akhirnya rentenir mengambil keuntungan berlipat-lipat dibanding dengan utang yang pertama. …\n" +
                    "Adapun sampai disebutkan memakan riba yang berlipat ganda untuk maksud semakin menjelekkan perbuatan riba. Lihat Fath Al-Qadir, 1:622.\n" +
                    "Ketujuh: Menahan diri dari sesuatu lebih mudah dilakukan daripada mengerjakan sesuatu.\n" +
                    "Kedelapan: Mengerjakan suatu perintah itu sesuai kemampuan.\n" +
                    "Kesembilan: Manusia itu memiliki kemampuan. Berbeda hal ini dengan keyakinan Jabariyyah yang menyatakan manusia itu dipaksa oleh takdir untuk berbuat dan tidak punya pilihan.\n" +
                    "Kesepuluh: Jika seseorang tidak mampu melakukan kewajiban secara utuh, maka diperintahkan untuk melakukan semampunya.\n" +
                    "",
            R.drawable.img_news8
        ),

        news(
            "Hadis 1 : Amalan Bergantung pada Niat",
            "عَنْ أَمِيرِ المُؤمِنينَ أَبي حَفْصٍ عُمَرَ بْنِ الخَطَّابِ رَضيَ اللهُ عنْهُ قَالَ: سَمِعْتُ رَسُولَ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ يَقُوْلُ: (( إِنَّمَا الأَعْمَالُ بِالنِّيَّاتِ، وَإِنَّمَا لِكُلِّ امْرِئٍ مَا نَوَى، فَمَنْ كَانَتْ هِجْرَتُهُ إِلَِى اللهِ وَرَسُوْلِهِ فَهِجْرَتُهُ إِلَى اللهِ وَرَسُوْلِهِ، وَمَنْ كَانَتْ هِجْرَتُهُ لِدُنْيَا يُصِيْبُهَا، أَوْ امْرَأَةٍ يَنْكِحُهَا، فَهِجْرَتُهُ إِلَى مَا هَاجَرَ إِلَيْهِ )). رَوَاهُ إِمَامَا الْمُحَدِّثِيْنَ أَبُوْ عَبْدِ اللهِ مُحَمَّدُ بْنُ إِسْمَاعِيْلَ بْنِ إِبْرَاهِيْمَ بْنِ الْمُغِيْرَةِ بْنِ بَرْدِزْبَهْ الْبُخَارِيُّ، وَأَبُوْ الْحُسَيْنِ مُسْلِمُ بْنُ الْحَجَّاجِ بْنِ مُسْلِمٍ الْقُشَيْرِيّ النَّيْسَابُوْرِيّ، فِيْ صَحِيْحَيْهِمَا اللَّذَيْنِ هُمَا أَصَحُّ الْكُتُبِ اْلمُصَنَّفَةِ.\n" +
                    "\n" +
                    "Dari Amirul Mukminin Abu Hafsh Umar bin Al Khaththab adia berkata: ‘Aku mendengar Rasulullah shalallahu alaihi wasalam bersabda: “Amalan-amalan itu hanyalah tergantung pada niatnya. Dan setiap orang itu hanyalah akan dibalas berdasarkan apa yang ia niatkan. Maka barang siapa yang hijrahnya kepada Allah dan Rasul-Nya, maka hijrahnya keapda Allah dan Rasul-Nya. Namun barang siapa yang hijrahnya untuk mendapatkan dunia atau seorang wanita yang ingin ia nikahi, maka hijrahnya kepada apa yang ia niatkan tersebut.” (Diriwayatkan oleh dua Imamnya para ahli hadits, Abu Abdillah Muhammad bin Isma’il bin Ibrahim bin Al Mughirah bin Bardizbah Al Bukhari dan Abul Husain Muslim bin Al Hajjaj  bin Muslim Al Qusyairi An Naisaburi dalam dua kitab shahih mereka, yang keduanya merupakan kitab yang paling shahih diantara kitab-kitab yang ada.). \n" +
                    "\n" +
                    "Kandungan Hadist:\n" +
                    "1. Niat merupakan syarat layak/diterima atau\n" +
                    "tidaknya amal perbuatan, dan amal ibadah tidak\n" +
                    "akan menghasilkankan pahala kecuali berdasarkan\n" +
                    "niat (karena Allah ta’ala).\n" +
                    "2. Waktu pelaksanaan niat dilakukan pada awal\n" +
                    "ibadah dan tempatnya di hati.\n" +
                    "3. Ikhlas dan membebaskan niat semata-mata karena\n" +
                    "Allah ta’ala dituntut pada semua amal shaleh dan\n" +
                    "ibadah.\n" +
                    "4. Seorang mu’min akan diberi ganjaran pahala\n" +
                    "berdasarkan kadar niatnya.\n" +
                    "5. Semua perbuatan yang bermanfaat dan mubah\n" +
                    "(boleh) jika diiringi niat karena mencari keridhaan\n" +
                    "Allah maka dia akan bernilai ibadah.\n" +
                    "6. Yang membedakan antara ibadah dan adat\n" +
                    "(kebiasaan/rutinitas) adalah niat.\n" +
                    "7. Hadits di atas menunjukkan bahwa niat\n" +
                    "merupakan bagian dari iman karena dia\n" +
                    "merupakan pekerjaan hati, dan iman menurut\n" +
                    "pemahaman Ahli Sunnah Wal Jamaah adalah\n" +
                    "membenarkan dalam hati, diucapkan dengan lisan\n" +
                    "dan diamalkan dengan perbuatan. ",
            R.drawable.img_news10
        )
    )
}