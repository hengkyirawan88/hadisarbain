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
            R.drawable.img_news2
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

            R.drawable.img_news3
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
            R.drawable.img_news5
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
            R.drawable.img_news6
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
            R.drawable.img_news7
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
            R.drawable.img_news8
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
            R.drawable.img_news9
        ),

        news(
            "Hadis 10 : Halal Berpengaruh pada Doa Kita",
            "عَنْ أَبِي هُرَيْرَةَ رَضِيَ اللهُ عَنْهُ قَالَ: قَالَ رَسُوْلُ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ: إِنَّ اللهَ طَيِّبٌ لاَ يَقْبَلُ إِلاَّ طَيِّباً، وَإِنَّ اللهَ أَمَرَ المُؤْمِنِيْنَ بِمَا أَمَرَ بِهِ المُرْسَلِيْنَ فَقَالَ {يَا أَيُّهَا الرُّسُلُ كُلُوْا مِنَ الطَّيِّبَاتِ وَاعْمَلُوا صَالِحًا} وَقَالَ تَعَالَى {يَا أَيُّهَا الذِّيْنَ آمَنُوا كُلُوا مِنْ طَيِّبَاتِ مَا رَزَقْنَاكُمْ} ثُمَّ ذَكَرَ الرَّجُلَ يُطِيْلُ السَّفَرَ أَشْعَثَ أَغْبَرَ يَمُدُّ يَدَيْهِ إِلَى السَّمَاءِ: يَا رَبِّ يَا رَبِّ، وَمَطْعَمُهُ حَرَامٌ ومشربه حرام وَمَلْبَسُهُ حَرَامٌ وَغُذِيَ\n" +
                    "Dari Abu Hurairah radhiyallahu ‘anhu, ia berkata, “Rasulullah shallallahu ‘alaihi wa sallam bersabda, ‘Sesungguhnya Allah Ta’ala itu baik (thayyib), tidak menerima kecuali yang baik (thayyib). Dan sesungguhnya Allah memerintahkan kepada kaum mukminin seperti apa yang diperintahkan kepada para Rasul. Allah Ta’ala berfirman, ‘Wahai para rasul, makanlah dari makanan yang baik-baik, dan kerjakanlah amal shalih.’ (QS. Al-Mu’minun: 51). Dan Allah Ta’ala berfirman, ‘Wahai orang-orang yang beriman! Makanlah dari rezeki yang baik yang Kami berikan kepadamu.’ (QS. Al-Baqarah: 172). Kemudian Rasulullah shallallahu ‘alaihi wa sallam menyebutkan seseorang yang lama bepergian; rambutnya kusut, berdebu, dan menengadahkan kedua tangannya ke langit, lantas berkata, ‘Wahai Rabbku, wahai Rabbku.’ Padahal makanannya haram, minumannya haram, pakaiannya haram, dan ia dikenyangkan dari yang haram, bagaimana mungkin doanya bisa terkabul.” (HR. Muslim) [HR. Muslim, no. 1015]\n" +
                    "\n"+
                    "Kandungan hadis :\n" +
                    "Pertama : Di antara nama Allah adalah thayyib. Maksudnya adalah Allah itu terlepas dari sifat-sifat kekurangan.\n" +
                    "Kedua : Allah itu sempurna dalam dzat, sifat, perbuatan, dan keputusan-Nya.\n" +
                    "Ketiga : Allah itu Mahakaya sehingga tidak membutuhkan apa pun dari makhluk-Nya, karenanya Allah hanya menerima yang baik (thayyib) saja.\n" +
                    "Keempat : Amal perbuatan seseorang bisa diterima atau ditolak.\n" +
                    "Kelima : Para rasul shallallahu ‘alaihi wa sallam juga diperintah dan dilarang. Kaum mukiminin juga diperintah dan dilarang.\n" +
                    "Keenam : Boleh menggunakan suatu metode untuk memotivasi yang lain untuk beramal. Seperti dalam hadits ini, diajak orang beriman untuk beramal dengan menyebutkan contoh para rasul.\n" +
                    "Ketujuh : Wajibnya mensyukuri nikmat Allah dengan beramal shalih.\n" +
                    "Kedelapan : Khabits (yang buruk) dilarang, dan penilaian khabits berdasarkan penilaian syari’at.\n" +
                    "Kesembilan : Dari hadits ini, kita didorong untuk berinfak dengan yang halal dan dilarang berinfak dengan yang haram.\n" +
                    "Kesepuluh : Hendaknya makanan, minuman, dan pakaian berasal dari yang halal, tidak boleh dari yang syubhat.\n" +
                    "Kesebelas : Setiap yang hendak berdoa hendaklah memperhatikan makanan, minuman, dan pakaiannya daripada yang lainnya.\n" +
                    "Keduabelas : Yang dimaksud safar yang mustajab doanya adalah safar dengan melakukan perjalanan jauh untuk melakukan suatu ketaatan seperti berhaji, ziarah yang disunnahkan, dan silaturahim. Demikian menurut Imam Nawawi ketika menjelaskan hadits ini.\n" +
                    "Ketigabelas : Karena makanan, minuman, pakaian, serta pekerjaan yang haram membuat doa sulit terkabul.\n" +
                    "",
            R.drawable.img_news10
        ),

        news(
            "Hadis 11 : Tinggalkan yang meragukanmu",
            "عَنْ أَبِي مُحَمَّدٍ الحَسَنِ بْنِ عَلِيٍّ بْنِ أَبِي طَالِبٍ سِبْطِ رَسُوْلِ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ وَرَيْحَانَتِهِ رَضِيَ اللهُ عَنْهُمَا قَالَ: حَفِظْتُ مِنْ رَسُوْلِ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ دَعْ مَا يَرِيْبُكَ إِلَى مَا لاَ يَرِيْبُكَ.\n" +
                    "رَوَاهُ التِّرْمِذِيُّ وَالنَّسَائِيُّ، وَقاَلَ التِّرْمِذِيُّ: حَدِيْثٌ حَسَنٌ صَحِيْحٌ.\n" +
                    "\n" +
                    "Dari Abu Muhammad Al-Hasan bin ‘Ali bin Abi Thalib, cucu Rasulullah shallallahu ‘alaihi wa sallam dan kesayangannya radhiyallahu ‘anhuma, ia berkata, “Aku hafal (sebuah hadits) dari Rasulullah shallallahu ‘alaihi wa sallam, ‘Tinggalkanlah yang meragukanmu lalu ambillah yang tidak meragukanmu.’” (HR. Tirmidzi, An-Nasa’i. Tirmidzi mengatakan bahwa hadits ini hasan shahih) [HR. Tirmidzi, no. 2518; An-Nasa’i, no. 5714. Al-Hafizh Abu Thahir mengatakan bahwa sanad hadits ini shahih]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "- Agama Islam tidak menghendaki umatnya memiliki perasaan ragu dan bimbang.\n" +
                    "- Jika Anda menginginkan ketenangan dan ketentraman, tinggalkanlah keraguan dan buang jauh-jauh, terutama setelah selesai melaksanakan suatu ibadah sehingga engkau tidak merasa gelisah.\n" +
                    "- Nabi shallallahu ‘alaihi wa sallam menyampaikan sesuatu dengan singkat, namun begitu luas maknanya. Kata Syaikh Muhammad bin Shalih Al-‘Utsaimin rahimahullah, “Seandainya seseorang membuat penafsiran atau penjelasan mengenai hadits ini dalam satu jilid buku yang sangat tebal, niscaya kandungan dua kalimat ini akan melebihinya.”\n" +
                    "- Syari’at Islam itu membawa kemudahan.\n" +
                    "- Hadits ini mengandung pelajaran agar kita diam terhadap perkara syubhat dan meninggalkannya. Kalau sesuatu yang halal tentu akan mendatangkan ketenangan, sedangkan sesuatu yang syubhat mendatangkan keragu-raguan. Lihat Jami’ Al-‘Ulum wa Al-Hikam, 1:280.\n" +
                    "- Bentuk wara’ adalah meninggalkan sesuatu yang ragu-ragu lalu mengambil yang tidak meragukan. Hal ini dikatakan oleh Abu ‘Abdirrahman Al-‘Umari, seorang yang terkenal zuhud. Hal ini dikatakan pula oleh Al-Fudhail, Hasan bin Abi Sinan. Lihat Jami’ Al-‘Ulum wa Al-Hikam, 1:280.\n" +
                    "- Dari sekelompok sahabat seperti Umar, Ibnu ‘Umar, Abu Ad-Darda’, dan Ibnu Mas’ud mengatakan, “Apa yang engkau inginkan dari hal yang masih meragukan padahal di sekelilingmu ada 4.000 hal yang tidak meragukan.” (Jami’ Al-‘Ulum wa Al-Hikam, 1:280)\n" +
                    "- Sebagian ulama berdalil dengan hadits ini bahwa keluar dari perselisihan ulama itu lebih afdal. Lihat Jami’ Al-‘Ulum wa Al-Hikam, 1:282.\n" +
                    "- Meninggal dusta dan terus menjaga kejujuran akan membawa ketenangan, sedangkan dusta selalu membawa pada keragu-raguan. Lihat Syarh Al-Arba’in An-Nawawiyah Al-Mukhtashar, hlm. 97.\n" +
                    "",
            R.drawable.img_news11
        ),

        news(
            "Hadis 12 : Meninggalkan yang tidak bermanfaat",
            "مِنْ حُسْنِ إِسْلَامِ المَرْءِ تَرْكُهُ مَا لَا يَعْنِيهِ \n" +
                    "\n" +
                    "Di antara yang termasuk bagusnya keislaman seseorang adalah ia meninggalkan apa yang tak berguna (bermanfaat) baginya.\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "- Agama Islam tidak menghendaki umatnya memiliki perasaan ragu dan bimbang.\n" +
                    "- Jika Anda menginginkan ketenangan dan ketentraman, tinggalkanlah keraguan dan buang jauh-jauh, terutama setelah selesai melaksanakan suatu ibadah sehingga engkau tidak merasa gelisah.\n" +
                    "- Nabi shallallahu ‘alaihi wa sallam menyampaikan sesuatu dengan singkat, namun begitu luas maknanya. Kata Syaikh Muhammad bin Shalih Al-‘Utsaimin rahimahullah, “Seandainya seseorang membuat penafsiran atau penjelasan mengenai hadits ini dalam satu jilid buku yang sangat tebal, niscaya kandungan dua kalimat ini akan melebihinya.”\n" +
                    "- Syari’at Islam itu membawa kemudahan.\n" +
                    "- Hadits ini mengandung pelajaran agar kita diam terhadap perkara syubhat dan meninggalkannya. Kalau sesuatu yang halal tentu akan mendatangkan ketenangan, sedangkan sesuatu yang syubhat mendatangkan keragu-raguan. Lihat Jami’ Al-‘Ulum wa Al-Hikam, 1:280.\n" +
                    "- Bentuk wara’ adalah meninggalkan sesuatu yang ragu-ragu lalu mengambil yang tidak meragukan. Hal ini dikatakan oleh Abu ‘Abdirrahman Al-‘Umari, seorang yang terkenal zuhud. Hal ini dikatakan pula oleh Al-Fudhail, Hasan bin Abi Sinan. Lihat Jami’ Al-‘Ulum wa Al-Hikam, 1:280.\n" +
                    "- Dari sekelompok sahabat seperti Umar, Ibnu ‘Umar, Abu Ad-Darda’, dan Ibnu Mas’ud mengatakan, “Apa yang engkau inginkan dari hal yang masih meragukan padahal di sekelilingmu ada 4.000 hal yang tidak meragukan.” (Jami’ Al-‘Ulum wa Al-Hikam, 1:280)\n" +
                    "- Sebagian ulama berdalil dengan hadits ini bahwa keluar dari perselisihan ulama itu lebih afdal. Lihat Jami’ Al-‘Ulum wa Al-Hikam, 1:282.\n" +
                    "\n" +
                    "",
            R.drawable.img_news12
        ),

        news(
            "Hadis 13 : Mencintainya Seperti Mencintai Diri Sendiri",
            "عَنْ أَبِي حَمْزَةَ أَنَسٍ بْنِ مَالِكٍ رَضِيَ اللهُ عَنْهُ – خَادِمِ رَسُوْلِ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ – عَنِ النَّبِيِّ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ قَالَ: ” لاَ يُؤْمِنُ أَحَدُكُمْ حَتَّى يُحِبَّ لِأَخِيْهِ مَا يُحِبُّ لِنَفْسِهِ ” رَوَاهُ البُخَارِيُّ وَمُسْلِمٌ\n" +
                    "Dari Abu Hamzah Anas bin Malik radhiyallahu ‘anhu, pembantu Rasulullah shallallahu ‘alaihi wa sallam, dari Nabi shallallahu ‘alaihi wa sallam bersabda, “Salah seorang di antara kalian tidaklah beriman (dengan iman sempurna) sampai ia mencintai saudaranya sebagaimana ia mencintai dirinya sendiri.” (HR. Bukhari dan Muslim)\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Yang dimaksud dalam hadits adalah tidak sempurnanya iman.\n" +
                    "Kedua: Wajib mencintai saudara kita sebagaimana mencintai saudara sendiri. Di sini dikatakan wajib karena ada kalimat penafian umum.\n" +
                    "Ketiga: Wajib meninggalkan hasad karena orang yang hasad pada saudaranya berarti tidak mencintai saudaranya seperti yang ia cintai pada dirinya sendiri. Bahkan orang yang hasad itu berangan-angan nikmat orang lain itu hilang.\n" +
                    "Sedangkan pengertian hasad menurut Syaikhul Islam Ibnu Taimiyah yaitu,\n" +
                    "الْحَسَدَ هُوَ الْبُغْضُ وَالْكَرَاهَةُ لِمَا يَرَاهُ مِنْ حُسْنِ حَالِ الْمَحْسُودِ\n" +
                    "“Hasad adalah membenci dan tidak suka terhadap keadaan baik yang ada pada orang yang dihasad.” (Majmu’ah Al-Fatawa, 10:111).\n" +
                    "\n" +
                    "",
            R.drawable.img_news13
        ),

        news(
            "Hadis 14 : Tidak Halal Darah Seorang Muslim",
            "عَنِ ابْنِ مَسْعُوْدٍ رَضِيَ اللهُ عَنْهُ قَالَ: قَالَ رَسُوْلُ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ لاَ يَحِلُّ دَمُّ امْرِئٍ مُسْلِمٍ إِلاَّ بِإِحْدَى ثَلاَثٍ: الثَّيِّبُ الزَّانِي، وَالنَّفْسُ بِالنَّفْسِ، وَالتَّارِكُ لِدِيْنِهِ المُفَارِقُ لِلْجَمَاعَةِ\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Terhormatnya darah seorang muslim.\n" +
                    "Kedua: Halalnya darah seorang muslim karena tiga sebab sebagaimana disebutkan dalam hadits ini:\n" +
                    "Yang sudah menikah lantas berzina dihukumi rajam sampai mati.\n" +
                    "Jika seorang muslim membunuh muslim lainnya dan telah terpenuhi syarat qishash.\n" +
                    "Murtad keluar dari Islam.\n" +
                    "Ketiga: Para ulama berselisih pendapat mengenai hukuman bagi pezina yang sudah menikah apakah dihukum dengan cambuk terlebih dahulu lalu rajam ataukah rajam saja. Kebanyakan ulama memilih hanya dikenakan hukuman rajam saja.\n" +
                    "Keempat: Ats-tsayyib az-zaani dikenakan hukuman rajam jika terbukti dengan empat orang saksi atau ia mengakuinya sendiri.\n" +
                    "Kelima: Meninggalkan jamaah yang dimaksud dalam hadits adalah (1) meninggalkan agama yang benar, (2) memberontak pada pemerintahan yang sah.\n" +
                    "Keenam: Yang boleh menjalankan eksekusi mati ini adalah imam kaum muslimin, tidak bisa dijalankan serampangan oleh lainnya.\n" +
                    "",
            R.drawable.img_news14
        ),

        news(
            "Hadis 15 : Berkata yang Baik, Memuliakan Tamu dan Tetangga",
            "عَنْ أَبِي هُرَيْرَةَ رَضِيَ اللهُ تَعَالَى عَنْهُ أَنَّ رَسُوْلَ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ قَالَ: مَنْ كَانَ يُؤْمِنُ بِاللهِ وَاليَوْمِ الآخِرِ فَلْيَقُلْ خَيْراً أَوْ لِيَصْمُتْ، وَمَنْ كَانَ يُؤْمِنُ بِاللهِ وَاليَوْمِ الآخِرِ فَلْيُكْرِمْ جَارَهُ، وَمَنْ كَانَ يُؤْمِنُ بِاللهِ وَاليَوْمِ الآخِرِ فَلْيُكْرِمْ ضَيْفَهُ.\n" +
                    "Dari Abu Hurairah radhiyallahu ‘anhu, Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Siapa saja yang beriman kepada Allah dan hari akhir, hendaklah ia berkata baik atau diam. Siapa saja yang beriman kepada Allah dan hari akhir, hendaklah ia memuliakan tetangganya. Siapa saja yang beriman kepada Allah dan hari akhir, hendaklah ia memuliakan tamunya.”\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Hadits ini menunjukkan adab yang sangat mulia sama dengan hadits keduabelas sebelumnya, “Di antara kebaikan islam seseorang adalah meninggalkan hal yang tidak bermanfaat.” Hadits keduabelas dari Arbain An-Nawawiyyah mengajarkan adab yang sifatnya umum. Sedangkan hadits mengajarkan tiga adab khusus yaitu berkata baik, memuliakan tetangga, dan memuliakan tamu.\n" +
                    "Kedua: Hadits ini menunjukkan bahwa kewajiban itu ada dua macam: (1) kewajiban kepada Allah dan (2) kewajiban kepada sesama. Kewajiban yang terkait dengan hak Allah adalah menjaga lisan. Artinya kalau kita beriman dengan benar kepada Allah dan hari akhir, maka disuruh untuk menjaga lisan. Bentuknya adalah (1) berkata yang baik, atau jika tidak bisa (2) diperintahkan untuk diam.\n" +
                    "Dalam ayat disebutkan,\n" +
                    "لَا خَيْرَ فِي كَثِيرٍ مِنْ نَجْوَاهُمْ إِلَّا مَنْ أَمَرَ بِصَدَقَةٍ أَوْ مَعْرُوفٍ أَوْ إِصْلَاحٍ بَيْنَ النَّاسِ\n" +
                    "“Tidak ada kebaikan pada kebanyakan bisikan-bisikan mereka, kecuali bisikan-bisikan dari orang yang menyuruh (manusia) memberi sedekah, atau berbuat ma’ruf, atau mengadakan perdamaian di antara manusia.” (QS. An-Nisaa’: 114)\n" +
                    "Dari Sahl bin Sa’ad radhiyallahu ‘anhu, Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "مَنْ يَضْمَنْ لِى مَا بَيْنَ لَحْيَيْهِ وَمَا بَيْنَ رِجْلَيْهِ أَضْمَنْ لَهُ الْجَنَّةَ\n" +
                    "“Siapa yang menjamin (menjaga) di antara dua janggutnya (lisannya) dan di antara dua kakinya (kemaluannya), maka aku akan jaminkan baginya surga.” (HR. Bukhari, no. 6474).\n" +
                    "Artinya diperintahkan untuk menjaga lisan, tidak berkata jelek yang nanti dicatat oleh malaikat pencatat amal jelek. Juga tidak menggunakan kemaluan untuk sesuatu yang diharamkan. Hadits ini menunjukkan bahwa berbagai maksiat itu terjadi karena lisan dan kemaluan. Siapa yang selamat dari kejelekan keduanya, maka ia akan selamat dari kejelekan yang besar. Demikian dijelaskan oleh Ibnu Batthol dalam Syarh Al-Bukhari.\n" +
                    "Ketiga: Ikram dalam hadits yang dimaksudkan adalah memuliakan dengan sebaik-baiknya, yaitu memuliakan dengan sempurna pada tetangga dan tamu.\n" +
                    "Keempat: Memuliakan tetangga bisa melakukan sebagaimana saran dari Imam Al-Ghazali berikut ini.\n" +
                    "Memulai mengucapkan salam pada tetangga.\n" +
                    "Menjenguk tetangga yang sakit.\n" +
                    "Melayat (ta’ziyah) ketika tetangga mendapatkan musibah.\n" +
                    "Mengucapkan selamat pada tetangga jika mereka mendapati kebahagiaan.\n" +
                    "Berserikat dengan mereka dalam kebahagiaan dan saat mendapatkan nikmat.\n" +
                    "Meminta maaf jika berbuat salah.\n" +
                    "Berusaha menundukkan pandangan untuk tidak memandangi istri tetangga yang bukan mahram.\n" +
                    "Menjaga rumah tetangga jika ia pergi.\n" +
                    "Berusaha bersikap baik dan lemah lembut pada anak tetangga.\n" +
                    "Berusaha mengajarkan perkara agama atau dunia yang tetangga tidak ketahui.\n",
            R.drawable.img_news15
        ),

        news(
            "Hadis 16 : Jangan Marah!",
            "عَنْ أَبِي هُرَيْرَةَ رَضِيَ اللَّهُ عَنْهُ أَنَّ رَجُلًا قَالَ لِلنَّبِيِّ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ أَوْصِنِي قَالَ لَا تَغْضَبْ فَرَدَّدَ مِرَارًا قَالَ لَا تَغْضَبْ\n" +
                    "Dari Abu Hurairah radhiyallahu ‘anhu berkata, seorang lelaki berkata kepada Nabi shallallahu ‘alaihi wa sallam, “Berilah aku wasiat.” Beliau menjawab, “Janganlah engkau marah.” Lelaki itu mengulang-ulang permintaannya, (namun) Nabi shallallahu ‘alaihi wa sallam (selalu) menjawab, “Janganlah engkau marah.” (HR. Bukhari) [HR. Bukhari, no. 6116]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Semangatnya para sahabat, mereka mencari ilmu untuk diamalkan.\n" +
                    "Nasihat bisa disesuaikan dengan kondisi orang yang dinasihati.\n" +
                    "Larangan marah sampai diwasiatkan Nabi shallallahu ‘alaihi wa sallam dikarenakan marah itu punya mafsadat yang besar. Ada yang sampai marah hingga mentalak istrinya. Ada yang sampai marah hingga berjanji tidak mau lagi berbicara, lalu akhirnya ia menyesalinya.\n" +
                    "Islam melarang dari akhlak yang jelek.\n" +
                    "Islam juga melarang hal-hal yang dapat menimbulkan marah dan berbagai dampak jeleknya.\n" +
                    "Nabi shallallahu ‘alaihi wa sallam mengulangi wasiat “jangan marah” menunjukkan pentingnya wasiat ini.\n",
            R.drawable.img_news16
        ),

        news(
            "Hadis 17 : Berbuat Ihsan pada Segala Sesuatu\n",
            "إِنَّ اللَّهَ كَتَبَ الإِحْسَانَ عَلَى كُلِّ شَىْءٍ فَإِذَا قَتَلْتُمْ فَأَحْسِنُوا الْقِتْلَةَ وَإِذَا ذَبَحْتُمْ فَأَحْسِنُوا الذَّبْحَةَ وَلْيُحِدَّ أَحَدُكُمْ شَفْرَتَهُ وَلْيُرِحْ ذَبِيحَتَهُ\n" +
                    "“Sesungguhnya Allah memerintahkan berbuat baik terhadap segala sesuatu. Jika kalian hendak membunuh, maka bunuhlah dengan cara yang baik. Jika kalian hendak menyembelih, maka sembelihlah dengan cara yang baik. Hendaklah kalian menajamkan pisaunya dan senangkanlah hewan yang akan disembelih.”  (HR. Muslim) [HR. Muslim, no. 1955, Bab “Perintah untuk berbuat baik ketika menyembelih dan membunuh dan perintah untuk menajamkan pisau”]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "1- Hadits ini menjelaskan bahwa Allah sangat menyayangi hamba-Nya yaitu Allah menetapkan berbuat baik pada sesama. Contoh dalam hal ini adalah memberi petunjuk jalan pada orang yang tersesat, juga memberi makan pada orang yang butuh makan.\n" +
                    "2- Hadits ini menunjukkan dorongan untuk berbuat ihsan pada segala sesuatu.\n" +
                    "3- Dalam membunuh atau menyembelih diperintahkan dengan cara yang baik, yaitu dengan mengikuti tuntunan syari’at.\n" +
                    "4- Dalam hadits ini digunakan kata kataba atau kitabah yaitu menetapkan. Sedangkan kitabah itu dijelaskan oleh para ulama ada dua macam yaitu kitabah qadariyyah dan kitabah syar’iyyah. Kitabah qadariyyah adalah ketetapan yang pasti terjadi. Sedangkan kitabah syar’iyyah adalah ketetapan yang kadang manusia kerjakan dan kadang tidak dikerjakan.\n" +
                    "Contoh kitabah qadariyyah seperti dalam ayat,\n" +
                    "وَلَقَدْ كَتَبْنَا فِي الزَّبُورِ مِنْ بَعْدِ الذِّكْرِ أَنَّ الْأَرْضَ يَرِثُهَا عِبَادِيَ الصَّالِحُونَ\n" +
                    "“Dan sungguh telah Kami tulis di dalam Zabur sesudah (Kami tulis dalam) Lauh Mahfuzh, bahwasanya bumi ini dipusakai hamba-hambaKu yang saleh.” (QS. Al-Anbiya’: 105)\n" +
                    "Contoh kitabah syar’iyyah seperti dalam ayat,\n" +
                    "يَا أَيُّهَا الَّذِينَ آَمَنُوا كُتِبَ عَلَيْكُمُ الصِّيَامُ كَمَا كُتِبَ عَلَى الَّذِينَ مِنْ قَبْلِكُمْ لَعَلَّكُمْ تَتَّقُونَ\n" +
                    "“Hai orang-orang yang beriman, diwajibkan atas kamu berpuasa sebagaimana diwajibkan atas orang-orang sebelum kamu agar kamu bertakwa.” (QS. Al-Baqarah: 183)\n" +
                    "5- Wajib berbuat ihsan pada segala sesuatu dan bentuknya bermacam-macam, bisa pada amalan seperti:\n" +
                    "Dalam hal yang wajib yaitu menjalankan kewajiban secara sempurna sebagaimana yang dituntut. Sedangkan berbuat ihsan dalam hal menyempurnakan yang sunnah tidaklah wajib.\n" +
                    "Meninggalkan yang haram.\n" +
                    "Sabar terhadap takdir yang tidak menyenangkan, tanpa menggerutu atau mengeluh pada takdir.\n" +
                    "Berbuat baik dalam muamalah dengan manusia lainnya.\n" +
                    "Berbuat baik ketika membunuh sesuatu yang dibolehkan untuk dibunuh.\n" +
                    "6- Nabi shallallahu ‘alaihi wa sallam biasa memberikan contoh dalam menjelaskan sesuatu. Dalam hadits ini disebutkan contoh ihsan yaitu dalam hal menyembelih.\n" +
                    "7- Bagaimana cara berbuat baik ketika menyembelih? Caranya adalah dengan mengikuti tuntunan syari’at Islam saat menyembelih.\n",
            R.drawable.img_news17
        ),

        news(
            "Hadis 18 : Takwa, Mengikutkan Kejelekan dengan Kebaikan, dan Berakhlak Mulia\n",
            "عَنْ أَبِيْ ذَرٍّ جُنْدُبِ بنِ جُنَادَةَ وَأَبِي عَبْدِ الرَّحْمَنِ مُعَاذِ بْنِ جَبَلٍ رَضِيَ اللهُ عَنْهُمَا عَنْ رَسُولِ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ قَالَ: (اتَّقِ اللهَ حَيْثُمَا كُنْتَ، وَأَتْبِعِ السَّيِّئَةَ الحَسَنَةَ تَمْحُهَا، وَخَالِقِ النَّاسَ بِخُلُقٍ حَسَنٍ) رَوَاهُ التِّرْمِذِي وَقَالَ: حَدِيْثٌ حَسَنٌ. وَفِي بَعْضِ النُّسَخِ: حَسَنٌ صَحِيْحٌ.\n" +
                    "Dari Abu Dzarr Jundub bin Junadah dan Abu ‘Abdirrahman Mu’adz bin Jabal radhiyallahu ‘anhuma, dari Rasulullah shallallahu ‘alaihi wa sallam, beliau bersabda, “Bertakwalah kepada Allah di mana pun engkau berada; iringilah perbuatan buruk dengan perbuatan baik, maka kebaikan akan menghapuskan keburukan itu; dan pergaulilah manusia dengan akhlak yang baik.” (HR. Tirmidzi, ia mengatakan haditsnya itu hasan dalam sebagian naskah disebutkan bahwa hadits ini hasan shahih) [HR. Tirmidzi, no. 1987 dan Ahmad, 5:153. Al-Hafizh Abu Thahir mengatakan bahwa hadits ini hasan]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Wajib bertakwa kepada Allah di mana saja kita berada dengan menjalankan perintah dan menjauhi larangan, baik ketika saat di keramaian dan ketika saat di kesepian.\n" +
                    "Bahkan ada peringatan bagi yang tidak takut kepada Allah hingga berbuat maksiat di kesepian. Dalam hadits dalam salah satu kitab sunan disebutkan,\n" +
                    "عَنْ ثَوْبَانَ عَنِ النَّبِىِّ -صلى الله عليه وسلم- أَنَّهُ قَالَ : « لأَعْلَمَنَّ أَقْوَامًا مِنْ أُمَّتِى يَأْتُونَ يَوْمَ الْقِيَامَةِ بِحَسَنَاتٍ أَمْثَالِ جِبَالِ تِهَامَةَ بِيضًا فَيَجْعَلُهَا اللَّهُ عَزَّ وَجَلَّ هَبَاءً مَنْثُورًا ». قَالَ ثَوْبَانُ : يَا رَسُولَ اللَّهِ صِفْهُمْ لَنَا جَلِّهِمْ لَنَا أَنْ لاَ نَكُونَ مِنْهُمْ وَنَحْنُ لاَ نَعْلَمُ. قَالَ : « أَمَا إِنَّهُمْ إِخْوَانُكُمْ وَمِنْ جِلْدَتِكُمْ وَيَأْخُذُونَ مِنَ اللَّيْلِ كَمَا تَأْخُذُونَ وَلَكِنَّهُمْ أَقْوَامٌ إِذَا خَلَوْا بِمَحَارِمِ اللَّهِ انْتَهَكُوهَا»\n" +
                    "Dari Tsauban, dari Nabi shallallahu ‘alaihi wa sallam, ia berkata, “Sungguh aku mengetahui suatu kaum dari umatku datang pada hari kiamat dengan banyak kebaikan semisal Gunung Tihamah. Namun Allah menjadikan kebaikan tersebut menjadi debu yang bertebaran.” Tsauban berkata, “Wahai Rasulullah, coba sebutkan sifat-sifat mereka pada kami supaya kami tidak menjadi seperti mereka sedangkan kami tidak mengetahuinya.”\n" +
                    "Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Adapun mereka adalah saudara kalian. Kulit mereka sama dengan kulit kalian. Mereka menghidupkan malam (dengan ibadah) seperti kalian. Akan tetapi mereka adalah kaum yang jika bersepian mereka merobek tirai untuk bisa bermaksiat pada Allah.” (HR. Ibnu Majah, no. 4245. Al-Hafizh Abu Thahir mengatakan bahwa sanad hadits ini hasan). Ibnu Majah membawakan hadits di atas dalam Bab “Mengingat Dosa”.\n" +
                    "Hadits di atas semakna dengan ayat,\n" +
                    "يَسْتَخْفُونَ مِنَ النَّاسِ وَلَا يَسْتَخْفُونَ مِنَ اللَّهِ وَهُوَ مَعَهُمْ إِذْ يُبَيِّتُونَ مَا لَا يَرْضَى مِنَ الْقَوْلِ وَكَانَ اللَّهُ بِمَا يَعْمَلُونَ مُحِيطًا\n" +
                    "“Mereka bersembunyi dari manusia, tetapi mereka tidak bersembunyi dari Allah, padahal Allah beserta mereka, ketika pada suatu malam mereka menetapkan keputusan rahasia yang Allah tidak ridhai. Dan adalah Allah Maha Meliputi (ilmu-Nya) terhadap apa yang mereka kerjakan.” (QS. An-Nisa’: 108). Walaupun dalam ayat tidak disebutkan tentang hancurnya amalan.\n" +
                    " \n" +
                    "Kedua: Amalan kebaikan akan menghapus kejelekan. Bisa jadi yang dimaksud dengan kebaikan adalah taubat, bisa pula yang dimaksud adalah amal shalih lainnya.\n" +
                    " \n" +
                    "Ketiga: Kita diperintahkan untuk berakhlak mulia terhadap sesama. Namun hal ini tidak menafikan pada suatu keadaan kita bersikap keras dan tegas.\n" +
                    "Contoh dari Nabi shallallahu ‘alaihi wa sallam seperti terlihat dalam riwayat dari Anas bin Malik radhiyallahu ‘anhu, ia berkata, “Ada seorang Yahudi melewati Rasulullah shallallahu ‘alaihi wa sallam, lalu ia mengucapkan ‘as-saamu ‘alaik’ (celaka engkau).” Rasulullah shallallahu ‘alaihi wa sallam lantas membalas ‘wa ‘alaik’ (engkau yang celaka). Rasulullah shallallahu ‘alaihi wa sallam lantas bersabda, “Apakah kalian mengetahui bahwa Yahudi tadi mengucapkan ‘assaamu ‘alaik’ (celaka engkau)?” Para sahabat lantas berkata, “Wahai Rasulullah, bagaimana jika kami membunuhnya saja?” Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Jangan. Jika mereka mengucapkan salam pada kalian, maka ucapkanlah ‘wa ‘alaikum’.” (HR. Bukhari, no. 6926)\n" +
                    "Namun kalau ada dua keadaan yaitu perintah bersikap lemah lembut ataukah keras, kita tetap memilih lemah lembut. Nabi shallallahu ‘alaihi wa sallam pernah mengatakan kepada Aisyah,\n" +
                    "يَا عَائِشَةُ إِنَّ اللَّهَ رَفِيقٌ يُحِبُّ الرِّفْقَ وَيُعْطِى عَلَى الرِّفْقِ مَا لاَ يُعْطِى عَلَى الْعُنْفِ وَمَا لاَ يُعْطِى عَلَى مَا سِوَاهُ\n" +
                    "“Wahai Aisyah, sesungguhnya Allah itu lemah lembut dan menyukai kelemah lembutan. Allah memberi kepada kelembutan suatu kebaikan yang tidak diberi pada sikap keras dan tidak diberi pada lainnya.” (HR. Bukhari, no. 6024 dan Muslim, no. 2593. Lafazhnya adalah lafazh Muslim)\n",
            R.drawable.img_news18
        ),

        news(
            "Hadis 19 : Menjaga Hak Allah dan Memahami Takdir",
            "عَنْ أَبِي العَبَّاسِ عَبْدِ اللهِ بْنِ عَبَّاسٍ رَضِيَ اللهُ تَعَالَى عَنْهُمَا قَالَ كُنْتُ: خَلْفَ النَّبِيِّ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ يَوْماً فَقَالَ لِي: (( يَا غُلاَمُ! إِنِّي أُعَلِّمُكَ كَلِمَاتٍ: احْفَظِ اللهَ يَحْفَظْكَ، اِحْفَظِ اللهَ تَجِدْهُ تُجَاهَكَ، إِذَا سَأَلْتَ فَاسْأَلِ اللهَ، وَإِذَا اسْتَعَنْتَ فَاسْتَعِنْ باِللهِ، وَاعْلَمْ أَنَّ الأُمَّةَ لَوِ اجْتَمَعَتْ عَلَى أَنْ يَنْفَعُوْكَ بِشَيْءٍ لَمْ يَنْفَعُوْكَ إِلاَّ بِشَيْءٍ قَدْ كَتَبَهُ اللهُ لَكَ، وَإِنِ اجْتَمَعُوا عَلَى أَنْ يَضُرُّوْكَ بِشَيْءٍ لَمْ يَضُرُّوْكَ إِلاَّ بِشَيْءٍ قَدْ كَتَبَهُ اللهُ عَلَيْكَ، رُفِعَتِ الأَقْلاَمُ وَجَفَّتِ الصُّحُفُ )) رَوَاهُ التِّرْمِذِي وَقَالَ: (( حَدِيْثٌ حَسَنٌ صَحِيْحٌ ))، وَفِي رِوَايَةِ غَيْرِ التِّرْمِذِيِّ: (( اِحْفَظِ اللهَ تَجِدْهُ أَمَامَكَ، تَعَرَّفْ إِلَى اللهِ فِي الرَّخَاءِ يَعْرِفْكَ فِي الشِّدَّةِ، وَاعْلَمْ أَنَّ مَا أَخْطَأَكَ لَمْ يَكُنْ لِيُصِيْبَكَ، وَمَا أَصَابَكَ لَم يَكُنْ لِيُخْطِئَكَ، وَاعْلَمْ أَنَّ النَّصْرَ مَعَ الصَّبْرِ، وَأَنَّ الفَرَجَ مَعَ الكَرْبِ، وَأَنَّ مَعَ العُسْرِ يُسْراً ).\n" +
                    "Dari Abul ‘Abbas ‘Abdullah bin ‘Abbas radhiyallahu ‘anhuma, ia berkata, “Pada suatu hari aku pernah berada di belakang Nabi shallallahu ‘alaihi wa sallam, lalu beliau bersabda, ‘Wahai anak muda! Sesungguhnya aku akan mengajarkan beberapa kalimat kepadamu. Jagalah Allah, niscaya Allah akan menjagamu. Jagalah Allah, niscaya engkau akan mendapati-Nya di hadapanmu. Jika engkau mau meminta, mintalah kepada Allah. Jika engkau mau meminta pertolongan, mintalah kepada Allah. Ketahuilah apabila semua umat berkumpul untuk mendatangkan manfaat kepadamu dengan sesuatu, maka mereka tidak bisa memberikan manfaat kepadamu kecuali dengan sesuatu yang telah Allah tetapkan untukmu. Dan seandainya mereka pun berkumpul untuk menimpakan bahaya kepadamu dengan sesuatu, maka mereka tidak dapat membahayakanmu kecuali dengan sesuatu yang telah Allah tetapkan bagimu. Pena-pena (pencatat takdir) telah diangkat dan lembaran-lembaran (catatan takdir) telah kering.’” (HR. Tirmidzi, dan ia berkata bahwa hadits ini hasan shahih).\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Siapa yang menjaga batasan Allah, maka Allah akan menjaga dunia dan agamanya.\n" +
                    "Kedua: Siapa saja yang tidak memperhatikan batasan dan aturan Allah, maka ia tidak mendapatkan penjagaan dari Allah, sebagaimana dalam ayat disebutkan,\n" +
                    "نَسُوا اللَّهَ فَنَسِيَهُمْ\n" +
                    "“Mereka telah lupa kepada Allah, maka Allah melupakan (artinya: meninggalkan) mereka.” (QS. At-Taubah: 67)\n" +
                    "Ketiga: Al-jazaa’ min jinsil ‘amal, balasan itu sesuai dengan amal perbuatan. Artinya, amalan menjaga hak Allah, dibalas pula dengan penjagaan dari Allah.\n" +
                    "Keempat: Hamba hendaklah mengkhususkan ibadah dan isti’anah (meminta pertolongan) hanya kepada Allah.\n" +
                    "Kelima: Hadits ini mengajarkan bagaimanakah mengimani takdir.\n" +
                    "Keenam: Hamba atau makhluk tidak bisa memberi manfaat dan tidak bisa mendatangkan mudarat kecuali manfaat dan mudarat tadi ditetapkan oleh Allah.\n" +
                    "Ketujuh: Apa yang Allah kehendaki pasti terjadi, yang tidak Allah kehendaki tidak akan terjadi, maa sya-a Allah kaana, wa maa lam yasya’ lam yakun.\n" +
                    "Allah Ta’ala berfirman,\n" +
                    "وَمَا تَشَاءُونَ إِلَّا أَنْ يَشَاءَ اللَّهُ ۚإِنَّ اللَّهَ كَانَ عَلِيمًا حَكِيمًا\n" +
                    "“Dan kamu tidak mampu (menempuh jalan itu), kecuali bila dikehendaki Allah. Sesungguhnya Allah adalah Maha Mengetahui lagi Maha Bijaksana.” (QS. Al-Insan: 30)\n" +
                    "Kedelapan: Akibat dari sabar adalah datang kemenangan.\n" +
                    "Kesembilan: Di balik kesulitan ada kelapangan dan kemudahan.\n" +
                    "Allah Ta’ala berfirman,\n" +
                    "فَإِنَّ مَعَ الْعُسْرِ يُسْرًا (5) إِنَّ مَعَ الْعُسْرِ يُسْرًا (6)\n" +
                    "“Karena sesungguhnya sesudah kesulitan itu ada kemudahan. sesungguhnya sesudah kesulitan itu ada kemudahan.” (QS. Asy-Syarh: 5-6)\n" +
                    "Para ulama mengatakan,\n" +
                    "لَوْ جَاءَ العُسْرُ فَدَخَلَ هَذَا الحُجْرَ لَجَاءَ اليُسْرُ حَتَّى يَدْخُلَ عَلَيْهِ فَيُخْرِجُهُ\n" +
                    "“Seandainya kesulitan itu datang dan masuk dalam lubang ini, maka akan datang kemudahan dan ia turut masuk ke dalam lubang tersebut sampai ia mengeluarkan kesulitan tadi.” (Tafsir Al-Qur’an Al-‘Azhim, 7:597)\n" +
                    "Kesepuluh: Hadits ini menunjukkan bagaimanakah tawadhu’ (rendah hati) Rasulullah shallallahu ‘alaihi wa sallam karena mau bergaul dengan anak muda, juga hadits ini menunjukkan sikap baik beliau pada Ibnu ‘Abbas yang masih muda.\n" +
                    "Kesebelas: Yang disampaikan adalah suatu yang penting karenanya di awal hadits disebutkan kepada Ibnu ‘Abbas “Sesungguhnya aku akan mengajarkan beberapa kalimat kepadamu”.\n",
            R.drawable.img_news19
        ),

        news(
            "Hadis 20 : Keutamaan Memiliki Sifat Malu",
            "عَنْ أَبِي مَسْعُوْدٍ عُقْبَةَ بْنِ عَمْرٍو الأَنْصَارِي البَدْرِي – رَضِيَ اللهُ عَنْهُ – قَالَ: قَالَ رَسُوْلُ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ: “إِنَّ مِمَّا أَدْرَكَ النَّاسُ مِنْ كَلاَمِ النُّبُوَّةِ الأُوْلَى: إِذَا لَمْ تَسْتَحْيِ فَاصْنَعْ مَا شِئْتَ” رَوَاهُ البُخَارِي.\n" +
                    "Dari Abu Mas’ud ‘Uqbah bin ‘Amr Al-Anshari Al-Badri radhiyallahu ‘anhu, ia berkata, “Rasulullah shallallahu ‘alaihi wa sallambersabda, ‘Sesungguhnya di antara perkataan kenabian terdahulu yang diketahui manusia ialah jika engkau tidak malu, maka berbuatlah sesukamu!’”\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Sifat malu adalah warisan para nabi terdahulu.\n" +
                    "Ibnu Rajab Al-Hambali rahimahullah mengatakan mengenai perkataan dalam hadits tersebut “Sesungguhnya perkataan yang diwarisi oleh orang-orang dari perkataan nabi-nabi terdahulu.”\n" +
                    "“Hadits ini menunjukkan bahwa sifat malu adalah sisa (atsar) dari ajaran Nabi terdahulu. Kemudian manusia menyebarkan dan mewariskan dari para Nabi tersebut pada setiap zaman. Maka hal ini menunjukkan bahwa kenabian terdahulu biasa menyampaikan perkataan ini sehingga tersebarlah di antara orang-orang hingga perkataan ini juga akhirnya sampai pada umat Islam.” (Jami’ Al-‘ulum wa Al-Hikam, 1:497)\n" +
                    "Yang dimaksudkan dengan (النُّبُوَّةِ الأُوْلَى) adalah kenabian terdahulu yaitu (mulai dari) awal Rasul dan Nabi: Nuh, Ibrahim dan lain-lain. Lihat Syarh Al-Arba’in An-Nawawiyyah karya Syaikh Shalih Alu Syaikh, hlm. 112.\n" +
                    "Perkataan umat terdahulu bisa saja dinukil melalui jalan wahyu yaitu Al-Qur’an, As-Sunnah (hadits Nabi shallallahu ‘alaihi wa sallam) atau dinukil dari perkataan orang-orang terdahulu. Lihat Syarh Al-Arba’in An-Nawawiyyah karya Syaikh Shalih Alu Syaikh, hlm. 207.\n" +
                    "Karena hal ini adalah perkataan Nabi terdahulu maka hal ini menunjukkan bahwa perkataan ini memiliki faedah yang besar sehingga sangat penting sekali untuk diperhatikan.\n" +
                    " \n" +
                    "Kedua: Ada pelajaran penting yang patut dipahami. Syariat sebelum Islam atau syariat yang dibawa oleh nabi sebelum Nabi Muhammad shallallahu ‘alaihi wa sallam terbagi menjadi tiga:\n" +
                    "Ajaran yang dibenarkan oleh syariat Islam, maka ajaran ini shahih dan diterima.\n" +
                    "Ajaran yang dibatalkan oleh syariat Islam, maka ajaran ini bathil dan tertolak.\n" +
                    "Ajaran yang tidak diketahui dibenarkan atau disalahkan oleh syariat Islam, maka sikap kita adalah tawaqquf (berdiam diri, tidak berkomentar apa-apa). Namun, apabila perkataan semacam ini ingin disampaikan kepada manusia dalam rangka sebagai nasihat dan semacamnya maka hal ini tidaklah mengapa, dengan syarat tidak dianggap bahwa perkataan itu multak benar. (Lihat Syarh Al-Arba’in An-Nawawiyyah karya Syaikh Muhammad bin Shalih Al-‘Utsaimin, hlm. 231-232)\n" +
                    "Keterangan lainnya diberikan oleh Syaikh Sa’ad bin Nashir bin ‘Abdil ‘Aziz Asy-Syatsri bahwa syar’un man qablanaa (syariat sebelum kita) ada dua macam:\n" +
                    "Pertama: Syariat yang disebutkan oleh umat sebelum kita, semisal ini tidak dijadikan hukum karena tidak terpercayanya pembawa berita.\n" +
                    "Kedua:  Syariat yang disebutkan oleh syariat kita dalam Al-Qur’an dan As-Sunnah, hal ini dibagi tiga:\n" +
                    "Jika dihapus oleh syariat kita, maka tidak bisa dijadikan hukum. Seperti disebutkan dalam hadits bahwa Nabi shallallahu ‘alaihi wa sallam dihalalkan ghanimah (harta rampasan perang) dan tidak dihalalkan pada orang sebelum nabi.\n" +
                    "Jika disetujui oleh syariat kita, maka dijadikan hukum. Seperti syariat puasa diwajibkan bagi kita sebagaimana diwajibkan pula pada orang sebelum kita.\n" +
                    "Jika tidak diketahui dihapus oleh syariat kita ataukah disetujui, inilah yang terjadi perselisihan pendapat di antara para ulama. Madzhab Malikiyah dan Hambali menyatakan bisa dijadikan hukum, hal ini berbeda dengan madzhab Hanafiyah dan Syafi’iyah. Lihat Syarh Al-Arba’in An-Nawawiyyah Al-Mukhtashar, hlm. 153.\n" +
                    " \n" +
                    "Ketiga: Rasa malu merupakan bentuk keimanan. Rasulullah shallallahu ’alaihi wa sallam bersabda,\n" +
                    "الْحَيَاءُ شُعْبَةٌ مِنَ الإِيمَانِ\n" +
                    "”Malu merupakan bagian dari keimanan.” (HR. Muslim, no. 161)\n" +
                    "Rasa malu ini juga dipuji oleh Allah.\n" +
                    "Rasulullah shallallahu ’alaihi wa sallam bersabda,\n" +
                    "إِنَّ اللَّهَ عَزَّ وَجَلَّ حَيِىٌّ سِتِّيرٌ يُحِبُّ الْحَيَاءَ وَالسَّتْرَ فَإِذَا اغْتَسَلَ أَحَدُكُمْ فَلْيَسْتَتِرْ\n" +
                    "”Sesungguhnya Allah itu Mahamalu dan Maha Menutupi, Allah cinta kepada sifat malu dan tertutup, maka jika salah seorang di antara kalian itu mandi maka hendaklah menutupi diri.” (HR. Abu Daud, no. 4014, dikatakan shahih oleh Syaikh Al-Albani).\n" +
                    " \n" +
                    "Keempat: Malu ada dua macam yang berkaitan dengan hak Allah dan berkaitan dengan hak sesama.\n" +
                    "Pertama, malu yang berkaitan dengan hak Allah. Seseorang harus memiliki rasa malu ini, dia harus mengetahui bahwa Allah mengetahui dan melihat setiap perbuatan yang dia lakukan, baik larangan yang diterjangnya maupun perintah yang dilakukannya.\n" +
                    "Kedua, malu yang berkaitan dengan hak manusia. Seseorang juga harus memiliki rasa malu ini, agar ketika berinteraksi dengan sesama, ia tidak berperilaku yang tidak pantas (menyelisihi al-muru’ah) dan berakhlak jelek.\n" +
                    "Syaikh Ibnu Utsaimin rahimahullah memberi contoh, dalam majelis ilmu, jika seseorang berada di shaf pertama, lalu dia menjulurkan kakinya, maka dia dinilai tidak memiliki rasa malu karena dia tidak menjaga al-muru’ah (kewibawaan). Jika dia duduk di antara teman-temannya, kemudian dia menjulurkan kaki, maka ini tidaklah meniadakan al-muru’ah. Namun, lebih baik lagi jika dia meminta izin pada temannya, “Bolehkah saya menjulurkan kaki?”. (Lihat Syarh Al-Arba’in An-Nawawiyyah karya Syaikh Muhammad bin Shalih Al-‘Utsaimin, hlm. 233-234).\n" +
                    " \n" +
                    "Kelima: Malu juga ada yang merupakan bawaan, dan ada malu yang mesti diusahakan.\n" +
                    "Sebagian manusia telah diberi kelebihan oleh Allah Ta’ala rasa malu. Ketika dia masih kecil saja sudah memiliki sifat demikian. Dia malu berbicara kecuali jika ada urusan mendesak atau tidak mau melakukan sesuatu kecuali jika terpaksa, karena dia adalah pemalu.\n" +
                    "Sedangkan malu jenis kedua adalah malu karena hasil dilatih. Orang seperti ini biasa cekatan dalam berbicara, berbuat. Kemudian ia berteman dengan orang-orang yang memiliki sifat malu dan dia tertular sifat ini dari mereka. Rasa malu yang pertama di atas lebih utama dari yang kedua ini. (Lihat Syarh Al-Arba’in An-Nawawiyyah karya Syaikh Muhammad bin Shalih Al-‘Utsaimin, hlm. 234)\n",
            R.drawable.img_news20
        ),

        news(
            "Hadis 21 : Beriman kepada Alloh dan istiqomah",
            "عَنْ أَبِيْ عَمْرٍو، وَقِيْلَ، أَبِيْ عَمْرَةَ سُفْيَانَ بْنِ عَبْدِ اللهِ رَضِيَ اللهُ عَنْهُ قَالَ: قُلْتُ يَارَسُوْلَ اللهِ قُلْ لِيْ فِي الإِسْلامِ قَوْلاً لاَ أَسْأَلُ عَنْهُ أَحَدَاً غَيْرَكَ؟ قَالَ: “قُلْ آمَنْتُ باللهِ ثُمَّ استَقِمْ” رَوَاهُ مُسْلِمٌ" +
                    "\n" +
                    "\n" +
                    "Dari Abu ‘Amr—ada yang menyebut pula Abu ‘Amrah—Sufyan bin ‘Abdillah radhiyallahu ‘anhu, ia berkata, “Aku berkata: Wahai Rasulullah katakanlah kepadaku suatu perkataan dalam Islam yang aku tidak perlu bertanya tentangnya kepada seorang pun selainmu.” Beliau bersabda, “Katakanlah: aku beriman kepada Allah, kemudian istiqamahlah.” (HR. Muslim) [HR. Muslim, no. 38]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Para sahabat sangat semangat dalam mencari ilmu. Hal ini dibuktikan dengan semangatnya mereka dalam bertanya.\n" +
                    "Sufyan bin ‘Abdillah Ats-Tsaqafi menanyakan perkara yang penting karena sudah cukup tanpa perlu ditanyakan kepada selain Nabi shallallahu ‘alaihi wa sallam.\n" +
                    "Sufyan bin ‘Abdillah Ats-Tsaqafi mungkin saja bertanya kepada sahabat lainnya dalam masalah ilmu, dan ada di antara mereka yang bisa berfatwa. Namun karena begitu pentingnya masalah ini, hanyalah Rasul shallallahu ‘alaihi wa sallam yang diharapkan menjawabnya.\n" +
                    "Nabi shallallahu ‘alaihi wa sallam dikaruniakan jawaami’ul kalim, yaitu kalimat yang ringkas namun sarat makna. Dan ini tercakup dalam dua kalimat dalam hadits ini yaitu “aku beriman kepada Allah, kemudian istiqamahlah”.\n" +
                    "Allah Ta’ala berfirman,\n" +
                    "إِنَّ الَّذِينَ قَالُوا رَبُّنَا اللَّهُ ثُمَّ اسْتَقَامُوا فَلَا خَوْفٌ عَلَيْهِمْ وَلَا هُمْ يَحْزَنُونَ\n" +
                    "“Sesungguhnya orang-orang yang mengatakan: “Tuhan kami ialah Allah”, kemudian mereka tetap istiqamah maka tidak ada kekhawatiran terhadap mereka dan mereka tiada (pula) berduka cita.” (QS. Al-Ahqaf: 13)\n" +
                    "إِنَّ الَّذِينَ قَالُوا رَبُّنَا اللَّهُ ثُمَّ اسْتَقَامُوا تَتَنَزَّلُ عَلَيْهِمُ الْمَلَائِكَةُ أَلَّا تَخَافُوا وَلَا تَحْزَنُوا وَأَبْشِرُوا بِالْجَنَّةِ الَّتِي كُنْتُمْ تُوعَدُونَ\n" +
                    "“Sesungguhnya orang-orang yang mengatakan: “Rabb kami ialah Allah” kemudian mereka meneguhkan pendirian mereka, maka malaikat akan turun kepada mereka dengan mengatakan: “Janganlah kamu takut dan janganlah merasa sedih; dan gembirakanlah mereka dengan jannah yang telah dijanjikan Allah kepadamu“.” (QS. Fushshilat: 30)\n" +
                    "فَاسْتَقِمْ كَمَا أُمِرْتَ وَمَنْ تَابَ مَعَكَ وَلَا تَطْغَوْاۚإِنَّهُ بِمَا تَعْمَلُونَ بَصِيرٌ\n" +
                    "“Maka tetaplah kamu pada jalan yang benar, sebagaimana diperintahkan kepadamu dan (juga) orang yang telah taubat beserta kamu dan janganlah kamu melampaui batas. Sesungguhnya Dia Maha Melihat apa yang kamu kerjakan.” (QS. Hud: 112)\n" +
                    "Istilah istiqamah lebih tepat dibanding dengan iltizam. Sehingga orang yang istiqamah disebut mustaqim, bukan multazim.\n" +
                    "Siapa saja yang kurang dalam melakukan yang wajib, berarti ia tidak istiqamah, dalam dirinya terdapat penyimpangan. Ia semakin dikatakan menyimpang sekadar dengan hal wajib yang ditinggalkan dan keharaman yang dikerjakan.\n" +
                    "Sekarang tinggal kita koreksi diri, apakah kita benar-benar istiqamah ataukah tidak. Jika benar-benar istiqamah, maka bersyukurlah kepada Allah. Jika tidak istiqamah, maka wajib baginya kembali kepada jalan Allah.\n" +
                    "Istiqamah itu mencakup segala macam amal. Siapa yang mengakhirkan shalat hingga keluar waktunya, maka ia tidak istiqamah. Siapa yang enggan bayar zakat, maka ia tidak istiqamah. Siapa yang menjatuhkan kehormatan orang lain, ia juga tidak istiqamah. Siapa yang menipu dan mengelabui dalam jual beli, juga dalam sewa-menyewa, maka ia tidak disebut istiqamah.\n",
            R.drawable.img_news21
        ),

        news(
            "Hadis 22 : Sholat, puasa, menghalalkan yang halal dan mengharamkan yang haram",
            "عَنْ أَبيْ عَبْدِ اللهِ جَابِرِ بنِ عَبْدِ اللهِ الأَنْصَارِيِّ رَضِيَ اللهُ عَنْهُ أَنَّ رَجُلاً سَأَلَ النَّبِيَّ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ فَقَالَ: “أَرَأَيْتَ إِذا صَلَّيْتُ المَكْتُوبَاتِ، وَصُمْتُ رَمَضَانَ، وَأَحْلَلْتُ الحَلاَلَ، وَحَرَّمْتُ الحَرَامَ، وَلَمْ أَزِدْ عَلى ذَلِكَ شَيئاً أَدْخُلُ الجَنَّةَ؟ قَالَ: نَعَمْ”رَوَاهُ مُسْلِمٌ\n" +
                    "\n" +
                    "Dari Abu ‘Abdillah Jarir bin ‘Abdillah Al-Anshari radhiyallahu ‘anhu, bahwa seorang laki-laki bertanya kepada Rasulullah shallallahu ‘alaihi wa sallam, ia berkata, “Bagaimana pendapat Anda (kabarkan padaku), apabila aku mengerjakan shalat-shalat fardhu, puasa di bulan Ramadhan, menghalalkan yang halal, mengharamkan yang haram, dan aku tidak menambahnya sedikit pun dari itu, apakah aku akan masuk surga?” Nabi shallallahu ‘alaihi wa sallam menjawab, “Ya.” (HR. Muslim). [HR. Muslim, no. 15]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "1. Para sahabat semangat dalam bertanya.\n" +
                    "2. Tujuan para sahabat radhiyallahu ‘anhum adalah masuk surga, itu tujuan utamanya. Tujuan utama mereka hidup bukanlah untuk memperbanyak harta, memiliki banyak anak, tidak untuk bermegah-megahan dalam hal dunia.\n" +
                    "3. Dalam hadits ini disebutkan empat macam ibadah yaitu shalat lima waktu, puasa Ramadhan, menghalalkan yang halal, dan mengharamkan yang haram.\n" +
                    "4. Manusia jika mencukupkan dengan shalat lima waktu, maka ia dimudahkan masuk surga.\n" +
                    "5. Shalat lima waktu dan puasa merupakan sebab masuk surga. Ada hadits yang menyebutkan bahwa siapa yang berpuasa Ramadhan karena iman dan ihtisaban (berharap pahala dari Allah), maka dosa-dosanya yang telah lalu akan diampuni.\n" +
                    "6. Pengertian masuk surga karena sebagian amalan yang dikerjakan punya dua kemungkinan makna: (1) ia masuk surga selama terpenuhinya syarat dan tercegah dari penghalang; (2) ia masuk surga selama bertauhid karena tauhidlah yang membuat shalat, zakat, puasa, serta amalan lain diterima.\n" +
                    "7. Pengertian masuk surga juga ada dua makna–menurut Syaikh Shalih Alu Syaikh hafizhahullah–yaitu masuk surga untuk pertama kali, atau yang penting masuk surga walaupun tertunda.\n" +
                    "8. Tidak boleh mencegah seseorang dari yang halal.\n" +
                    "9. Definisi Imam Nawawi rahimahullah, mengharamkan yang haram adalah menjauhi yang haram. Yang tepat adalah meyakini haramnya dan menjauhinya. Karena kalau tidak diyakini keharamannya berarti tidak meyakini hukum syar’i. Begitu pula menghalalkan yang halal adalah meyakini halalnya dan melakukan yang halal tersebut. Berarti pengertian dari Imam Nawawi ada kekurangan.\n" +
                    "10. Zakat dan haji tidak disebutkan dalam hadits ini dan ia beramal hanya terbatas pada empat amalan saja membuatnya masuk surga. Ada dua alasan untuk menjawab hal ini: (1) zakat dan haji jika tidak dikerjakan sudah masuk dalam kalimat “mengharamkan yang haram”; (2) yang dimaksud masuk surga adalah jika terpenuhi syarat dan terlepas dari penghalang, atau masuk surganya tertunda.\n" +
                    "\n",
            R.drawable.img_news22
        ),

        news(
            "Hadis 23 : Keutamaan bersuci, sholat, sedekah, sabar dan shohibul Quran",
            "عَنْ أَبِي مَالِكٍ الحَارِثِ بْنِ عَاصِمٍ الأَشْعَرِيِّ رَضِيَ اللهُ عَنْهُ قَالَ: قَالَ رَسُولُ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ:) الطُّهُورُ شَطْرُ الإِيْمَانِ، وَالحَمْدُ للهِ تَمْلأُ المِيْزَانَ، وَسُبْحَانَ اللهِ والحَمْدُ للهِ تَمْلآنِ – أَو تَمْلأُ – مَا بَيْنَ السَّمَاءِ وَالأَرْضِ، وَالصَّلاةُ نُورٌ، والصَّدَقَةُ بُرْهَانٌ، وَالصَّبْرُ ضِيَاءٌ، وَالقُرْآنُ حُجَّةٌ لَكَ أَوْ عَلَيْكَ، كُلُّ النَّاسِ يَغْدُو فَبَائِعٌ نَفْسَهُ فَمُعْتِقُهَا أَو مُوْبِقُهَا رَوَاهُ مُسْلِمٌ.\n" +
                    "\n" +
                    "Dari Abu Malik Al-Harits bin ‘Ashim Al-Asy’ari radhiyallahu ‘anhu, ia berkata, “Rasulullah shallallahu ‘alaihi wa sallam bersabda, ‘Bersuci itu sebagian dari iman, ucapan alhamdulillah (segala puji bagi Allah) itu memenuhi timbangan. Ucapan subhanallah (Mahasuci Allah) dan alhamdulillah (segala puji bagi Allah), keduanya memenuhi antara langit dan bumi. Shalat adalah cahaya, sedekah adalah bukti nyata, kesabaran adalah sinar, Al-Qur’an adalah hujjah yang membelamu atau hujjah yang menuntutmu. Setiap manusia berbuat, seakan-akan ia menjual dirinya, ada yang memerdekakan dirinya sendiri, ada juga yang membinasakan dirinya sendiri.’” (HR. Muslim) [HR. Muslim, no. 223]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "1. Hadits ini menunjukkan keutamaan bersuci.\n" +
                    "2. Hadits ini menunjukkan keutamaan tahmid (ucapan alhamdulillah) dan tasbih (subhanallah).\n" +
                    "3. Adanya mizan (timbangan) pada hari kiamat, dan amalan akan ditimbang.\n" +
                    "4. Hadits ini menunjukkan keutamaan shalat, shalat adalah cahaya di dunia dan akhirat.\n" +
                    "5. Hadits ini menunjukkan keutamaan sedekah, yaitu jadi bukti benarnya iman seseorang.\n" +
                    "6. Hadits ini menunjukkan keutamaan sabar karena akan jadi cahaya bagi pemiliknya.\n" +
                    "7. Kita dimotivasi untuk perhatian pada Al-Qur’an dengan cara belajar, merenungkannya (tadabbur), dan mengamalkannya, supaya Al-Qur’an bisa mendukung kita pada hari kiamat.\n" +
                    "8. Kita diingatkan agar tidak lalai dari memperhatikan Al-Qur’an karena Al-Qur’an bisa menuntut kita pada hari kiamat.\n" +
                    "9. Setiap amal saleh akan membebaskan jiwa seseorang dari kesulitan dunia dan akhirat.\n" +
                    "10. Setiap amal kejelekan akan menjadikan seseorang sebagai wali setan dan mengantarkannya pada neraka.\n" +
                    "\n",
            R.drawable.img_news23
        ),

        news(
            "Hadis 24 : Alloh haramkan kezaliman",
            "عَنْ أَبِى ذَرٍّ الغِفَارِي رَضِيَ اللهُ عَنْهُ عَنِ النَّبِيِّ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَفِيْمَا يَرْوِيْهِ عَنْ رَبِّهِ عَزَّ وَجَلَّ أَنَّهُ قَالَ: يَا عِبَادِى إِنِّى حَرَّمْتُ الظُّلْمَ عَلَى نَفْسِى وَجَعَلْتُهُ بَيْنَكُمْ مُحَرَّمًا فَلاَ تَظَالَمُوا يَا عِبَادِى كُلُّكُمْ ضَالٌّ إِلاَّ مَنْ هَدَيْتُهُ فَاسْتَهْدُونِى أَهْدِكُمْ يَا عِبَادِى كُلُّكُمْ جَائِعٌ إِلاَّ مَنْ أَطْعَمْتُهُ فَاسْتَطْعِمُونِى أُطْعِمْكُمْ يَا عِبَادِى كُلُّكُمْ عَارٍ إِلاَّ مَنْ كَسَوْتُهُ فَاسْتَكْسُونِى أَكْسُكُمْ يَا عِبَادِى إِنَّكُمْ تُخْطِئُونَ بِاللَّيْلِ وَالنَّهَارِ وَأَنَا أَغْفِرُ الذُّنُوبَ جَمِيعًا فَاسْتَغْفِرُونِى أَغْفِرْ لَكُمْ يَا عِبَادِى إِنَّكُمْ لَنْ تَبْلُغُوا ضَرِّى فَتَضُرُّونِى وَلَنْ تَبْلُغُوا نَفْعِى فَتَنْفَعُونِى يَا عِبَادِى لَوْ أَنَّ أَوَّلَكُمْ وَآخِرَكُمْ وَإِنْسَكُمْ وَجِنَّكُمْ كَانُوا عَلَى أَتْقَى قَلْبِ رَجُلٍ وَاحِدٍ مِنْكُمْ مَا زَادَ ذَلِكَ فِى مُلْكِى شَيْئًا يَا عِبَادِى لَوْ أَنَّ أَوَّلَكُمْ وَآخِرَكُمْ وَإِنْسَكُمْ وَجِنَّكُمْ كَانُوا عَلَى أَفْجَرِ قَلْبِ رَجُلٍ وَاحِدٍ مَا نَقَصَ ذَلِكَ مِنْ مُلْكِى شَيْئًا يَا عِبَادِى لَوْ أَنَّ أَوَّلَكُمْ وَآخِرَكُمْ وَإِنْسَكُمْ وَجِنَّكُمْ قَامُوا فِى صَعِيدٍ وَاحِدٍ فَسَأَلُونِى فَأَعْطَيْتُ كُلَّ إِنْسَانٍ مَسْأَلَتَهُ مَا نَقَصَ ذَلِكَ مِمَّا عِنْدِى إِلاَّ كَمَا يَنْقُصُ الْمِخْيَطُ إِذَا أُدْخِلَ الْبَحْرَ يَا عِبَادِى إِنَّمَا هِىَ أَعْمَالُكُمْ أُحْصِيهَا لَكُمْ ثُمَّ أُوَفِّيكُمْ إِيَّاهَا فَمَنْ وَجَدَ خَيْرًا فَلْيَحْمَدِ اللَّهَ وَمَنْ وَجَدَ غَيْرَ ذَلِكَ فَلاَ يَلُومَنَّ إِلاَّ نَفْسَهُ رَوَاهُ مُسْلِمٌ\n" +
                    "\n" +
                    "Dari Abu Dzar Al-Ghifari radhiyallahu anhu, dari Nabi shallallahu ‘alaihi wa sallam, beliau meriwayatkan dari Allah ‘azza wa Jalla, sesungguhnya Allah telah berfirman:\n" +
                    "Wahai hamba-Ku, sesungguhnya Aku mengharamkan kezaliman atas diri-Ku dan Aku menjadikan kezaliman itu haram di antara kalian, maka janganlah kalian saling menzalimi. Wahai hamba-Ku, kalian semua sesat kecuali orang yang telah Kami beri petunjuk, maka hendaklah kalian minta petunjuk kepada-Ku, pasti Aku memberinya.\n" +
                    "Wahai hamba-Ku, kalian semua adalah orang yang lapar, kecuali orang yang Aku beri makan, maka hendaklah kalian minta makan kepada-Ku, pasti Aku memberinya. Wahai hamba-Ku, kalian semua asalnya telanjang, kecuali yang telah Aku beri pakaian, maka hendaklah kalian minta pakaian kepada-Ku, pasti Aku memberinya.\n" +
                    "Wahai hamba-Ku, sesungguhnya kalian berbuat dosa pada waktu malam dan siang, dan Aku mengampuni dosa-dosa itu semuanya, maka mintalah ampun kepada-Ku, pasti Aku mengampuni kalian.\n" +
                    "Wahai hamba-Ku, sesungguhnya kalian tidak akan dapat membinasakan-Ku dan kalian tak akan dapat memberikan manfaat kepada-Ku. Wahai hamba-Ku, kalau orang-orang terdahulu dan yang terakhir di antara kalian, sekalian manusia dan jin, mereka itu bertakwa seperti orang yang paling bertakwa di antara kalian, tidak akan menambah kekuasaan-Ku sedikit pun. Jika orang-orang yang terdahulu dan yang terakhir di antara kalian, sekalian manusia dan jin, mereka itu berhati jahat seperti orang yang paling jahat di antara kalian, tidak akan mengurangi kekuasaan-Ku sedikit pun juga.\n" +
                    "Wahai hamba-Ku, jika orang-orang terdahulu dan yang terakhir di antara kalian, sekalian manusia dan jin yang tinggal di bumi ini meminta kepada-Ku, lalu Aku memenuhi seluruh permintaan mereka, tidaklah hal itu mengurangi apa yang ada pada-Ku, kecuali sebagaimana sebatang jarum yang dimasukkan ke laut.\n" +
                    "Wahai hamba-Ku, sesungguhnya inilah amal perbuatan kalian. Aku catat semuanya untuk kalian, kemudian Kami akan membalasnya.\n" +
                    "Maka barang siapa yang mendapatkan kebaikan, hendaklah bersyukur kepada Allah dan barang siapa mendapatkan selain dari itu, maka janganlah sekali-kali ia menyalahkan kecuali dirinya sendiri.” (HR. Muslim) [HR. Muslim, no. 6737]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Riwayat Nabi shallallahu ‘alaihi wa sallam dari Rabb-nya memiliki tingkatan sanad yang paling tinggi. Sebab puncak sanad bisa kepada Allah Ta’ala dan ini yang disebut dengan hadits Qudsi.\n" +
                    "Kedua: Hadits qudsi adalah hadits yang diriwayatkan dari Nabi shallallahu ‘alaihi wa sallam dari Rabb-nya.\n" +
                    "Ketiga: Allah memiliki sifat kalam (berbicara).\n" +
                    "Keempat: Allah mampu untuk berbuat zalim (bersikap sewenang-wenang). Akan tetapi Allah telah mengharamkan atas diri-Nya untuk berbuat zalim disebabkan keadilan-Nya yang sempurna.\n" +
                    "Kelima: Ada sifat Allah yang berupa peniadaan, misal peniadaan Allah dari sifat zalim.\n" +
                    "Keenam: Hak Allah untuk mengharamkan atas diri-Nya apa pun yang dikehendaki-Nya, sebab segala hukum kembali pada-Nya. Sementara kita tidak bisa mengharamkan atas Allah Ta’ala, Allah-lah yang mengharamkan atas diri-Nya, sebagaimana ia telah mewajibkan atas diri-Nya sekehendak-Nya.\n" +
                    "Ketujuh: Dilarang berbuat zalim pada orang lain, itulah zalim yang dimaksudkan dalam hadits.\n" +
                    "Kedelapan: Manusia itu tersesat kecuali yang Allah berikan petunjuk padanya. Dari faedah ini kita menyimpulkan bahwa kita wajib untuk senantiasa memohon hidayah kepada-Nya supaya tidak tersesat.\n" +
                    "Kesembilan: Karena kita dikatakan semuanya sesat, maka kita diperintahkan untuk menuntut ilmu.\n" +
                    "Kesepuluh: Hidayah tidaklah diminta kecuali dari Allah Ta’ala.\n" +
                    "Kesebelas: Pada dasarnya manusia dalam keadaan lapar, sebab mereka sama sekali tidak memiliki kemampuan untuk membuat sesuatu yang bisa menahan jasad mereka tetap hidup.\n" +
                    "Kedua belas: Maksud kalimat “mintalah makan kepada-Ku” yaitu meminta makanan, berusaha mencari rezeki, dan mengharap keutamaan-Nya. Tentu saja hal ini diperoleh dengan disertai usaha.\n" +
                    "Ketiga belas: Manusia pada dasarnya berada dalam keadaan telanjang, hingga Allah memberinya pakaian. Bisa jadi manusia itu telanjang secara fisik, bisa jadi pula telanjang secara maknawi (tidak ada ruh).\n" +
                    "Keempat belas: Kemurahan Allah yang telah menjelaskan kepada hamba-Nya tentang keadaan dan kebutuhan mereka kepada-Nya, kemudian Allah mengajak mereka untuk memohon kepada-Nya supaya keadaan mereka yang diliputi oleh kekurangan dan kebutuhan itu hilang.\n" +
                    "Kelima belas: Setiap manusia banyak kesalahannya.\n" +
                    "Keenam belas: Betapa pun banyak dosa dan kesalahan, Allah Ta’ala akan mengampuninya, akan tetapi Allah menuntutnya untuk beristighfar.\n" +
                    "Ketujuh belas: Beristighfar bisa dilakukan dengan dua acara yaitu (1) memohon ampunan dengan ucapan seperti ucapan ‘astaghfirullah’; (2) memohon ampun dengan amal saleh yang menjadi sebab tercapainya ampunan Allah.\n" +
                    "Kedelapan belas: Allah akan menghapuskan seluruh dosa bagi yang meminta ampun kepada-Nya. Adapun yang tidak mengucapkan istighfar, dosa kecil akan terhapus dengan amal saleh. Sedangkan dosa besar harus disertai taubatan nasuha, tidak bisa dihapuskan oleh amal saleh (menurut jumhur ulama). Adapun masalah kufur, harus disertai taubatan nasuha, berdasarkan ijmak para ulama.\n" +
                    "Kesembilan belas: Sempurnanya kekuasaan Allah dan Dia tidak butuh pada hamba-Nya.\n" +
                    "Kedua puluh: Tempat ketakwaan dan kejahatan adalah hati.\n" +
                    "Kedua puluh satu: Sempurnanya dan luasnya kekayaan Allah.\n" +
                    "Kedua puluh dua: Manusia berkumpul pada satu tempat lebih dekat pada dikabulkannya doa daripada manusia dalam keadaan berpecah belah.\n" +
                    "Kedua puluh tiga: Allah Ta’ala menghitung amalan hamba, artinya menetapkan dengan bilangannya, sehingga tidak ada seorang pun yang dikurangi haknya sedikit pun. Yang beramal sebesar dzarrah akan dibalas.\n" +
                    "Kedua puluh empat: Siapa saja yang beramal niscaya akan dibalas oleh Allah, tanpa Allah berbuat zalim sedikit pun.\n" +
                    "Kedua puluh lima: Wajib memuji Allah bagi yang mendapatkan kebaikan, hal itu dikarenakan dua hal: (1) Allah memudahkannya untuk beramal; (2) Allah membalasnya dengan pahala.\n" +
                    "Kedua puluh enam: Siapa yang telat dalam beramal saleh dan ia tidak mendapatkan kebaikan, maka celaannya kepada dirinya sendiri.\n" +
                    "\n",
            R.drawable.img_news24
        ),

        news(
            "Hadis 25 : Sedekah dari Orang Miskin",
            "عَنْ أَبِى ذَرٍّ رَضِيَ اللهُ عَنْهُ أَيْضًا أَنَّ نَاسًا مِنْ أَصْحَابِ رَسُوْلِ اللهِ -صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ- قَالُوا لِلنَّبِىِّ -صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ- يَا رَسُولَ اللَّهِ ذَهَبَ أَهْلُ الدُّثُورِ بِالأُجُورِ يُصَلُّونَ كَمَا نُصَلِّى وَيَصُومُونَ كَمَا نَصُومُ وَيَتَصَدَّقُونَ بِفُضُولِ أَمْوَالِهِمْ. قَالَ « أَوَلَيْسَ قَدْ جَعَلَ اللَّهُ لَكُمْ مَا تَصَّدَّقُونَ إِنَّ بِكُلِّ تَسْبِيحَةٍ صَدَقَةً وَكُلِّ تَكْبِيرَةٍ صَدَقَةً وَكُلِّ تَحْمِيدَةٍ صَدَقَةً وَكُلِّ تَهْلِيلَةٍ صَدَقَةً وَأَمْرٌ بِالْمَعْرُوفِ صَدَقَةٌ وَنَهْىٌ عَنْ مُنْكَرٍ صَدَقَةٌ وَفِى بُضْعِ أَحَدِكُمْ صَدَقَةٌ ». قَالُوا يَا رَسُولَ اللَّهِ أَيَأْتِى أَحَدُنَا شَهْوَتَهُ وَيَكُونُ لَهُ فِيهَا أَجْرٌ قَالَ « أَرَأَيْتُمْ لَوْ وَضَعَهَا فِى حَرَامٍ أَكَانَ عَلَيْهِ فِيهَا وِزْرٌ فَكَذَلِكَ إِذَا وَضَعَهَا فِى الْحَلاَلِ كَانَ لَهُ أَجْرٌ » رَوَاهُ مُسْلِمٌ\n" +
                    "\n" +
                    "Dari Abu Dzarr radhiyallahu ‘anhu, ia berkata bahwa ada sejumlah orang sahabat Rasulullah shallallahu ‘alaihi wa sallam berkata kepada beliau, “Wahai Rasulullah, orang-orang kaya telah pergi dengan membawa pahala yang banyak, mereka shalat sebagaimana kami shalat, mereka berpuasa sebagaimana kami berpuasa, dan mereka bersedekah dengan kelebihan harta mereka.” Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Bukankah Allah telah menjadikan bagi kalian jalan untuk bersedekah? Sesungguhnya setiap tasbih merupakan sedekah, setiap takbir merupakan sedekah, setiap tahmid merupakan sedekah, setiap tahlil merupakan sedekah, mengajak pada kebaikan (makruf) adalah sedekah, melarang dari kemungkaran adalah sedekah, dan berhubungan intim dengan istri kalian adalah sedekah.” Mereka bertanya, “Wahai Rasulullah, bagaimana bisa salah seorang di antara kami melampiaskan syahwatnya lalu mendapatkan pahala di dalamnya? Beliau bersabda, “Bagaimana pendapat kalian seandainya hal tersebut disalurkan di jalan yang haram, bukankah akan mendapatkan dosa? Demikianlah halnya jiak hal tersebut diletakkan pada jalan yang halal, maka ia mendapatkan pahala.” (HR. Muslim) [HR. Muslim, no. 1006]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Para sahabat memiliki sifat saling berlomba dalam kebaikan.\n" +
                    "\n" +
                    "Kedua: Para sahabat menggunakan harta mereka dalam hal kebaikan di dunia dan di akhirat, yaitu dengan bersedekah.\n" +
                    "\n" +
                    "Ketiga: Dalam amal badaniyyah (yang dilakukan anggota tubuh), baik yang kaya maupun yang miskin sama-sama bisa melakukannya seperti pada amalan shalat dan puasa. Kadang yang miskin melakukan ibadah lebih bagus dan sempurna daripada yang kaya.\n" +
                    "\n" +
                    "Keempat: Rasulullah shallallahu ‘alaihi wa sallam telah membuka pintu kebaikan bagi orang-orang fakir. Pintu kebaikan tersebut selain dengan shalat dan puasa adalah dengan dzikir, amar makruf nahi mungkar, hingga hubungan intim dengan pasangan yang halal.\n" +
                    "\n" +
                    "Kelima: Boleh pembicara mengajukan yang tidak mungkin diingkari seperti dalam ucapan Nabi shallallahu ‘alaihi wa sallam, “Bukankah Allah telah menjadikan bagi kalian jalan untuk bersedekah?”. Sebab dengan mengajukan pertanyaan semacam ini sudah menjadi pertanyaan yang telak tak terbantahkan.\n" +
                    "\n" +
                    "Keenam: Semua amalan yang disebutkan dalam hadits yaitu dzikir, amar makruf nahi mungkar, hingga hubungan intim termasuk sedekah. Akan tetapi sedekah di sini ada yang bernilai wajib dan ada yang bernilai sunnah. Sedekah tersebut ada yang bernilai manfaat kepada orang banyak (muta’addi) dan ada yang kemanfaatannya hanya pada diri sendiri (qashir). Contoh yang bernilai qashir, bacaan tasbih (subhanallah), tahmid (alhamdulillah), takbir (Allahu akbar), tahlil (laa ilaha illallah). Bacaan dzikir ini ada yang wajib dan ada yang sunnah. Contoh ada bacaan takbir yang wajib yaitu bacaan takbiratul ihram “Allahu Akbar”. Sedangkan dzikir tasbih, tahmid, dan takbir pada dzikir bakda shalat dihukumi sunnah. Contoh amalan yang muta’addi adalah amar makruf nahi mungkar.\n" +
                    "\n" +
                    "Berarti sedekah yang dilakukan oleh orang yang tidak mampu ada dua: (1) sedekah yang manfaatnya untuk dirinya sendiri; (2) sedekah yang manfaatnya untuk orang lain.\n" +
                    "\n" +
                    "Ketujuh: Sedekah bukanlah terbatas pada sedekah dengan harta saja. Namun hukum asalnya adalah bersedekah dengan harta.\n" +
                    "\n" +
                    "Kedelapan: Amar makruf nahi mungkar kadang dihukumi:\n" +
                    "wajib ‘ain (wajib pada tiap individu), untuk mengajak yang makruf bagi yang mampu dan tidak didapatkan pengganti.\n" +
                    "mustahab (sunnah), ketika mengajak pada perkara mustahab (sunnah), atau melarang kemungkaran yang sifatnya makruh, atau ada perkara yang bisa dimutlakkan sebagai kemungkaran.\n" +
                    "wajib kifayah (wajib bagi sebagian dan sudah mencukupi), berlaku bagi yang mampu, namun masih bisa diwakilkan pada yang lain.\n" +
                    "\n" +
                    "Kesembilan: Syarat amar makruf (menyuruh pada kebaikan) adalah (1) sudah punya ilmu mengenai hal yang makruf yang didakwahkan; (2) mengetahui kalau orang yang didakwahi telah meninggalkan yang makruf.\n" +
                    "Dalilnya kenapa ada syarat kedua adalah hadits di mana ada seseorang pada waktu shalat Jumat masuk masjid sedangkan Nabi shallallahu ‘alaihi wa sallam sedang berkhutbah, ia langsung duduk, lalu Nabi shallallahu ‘alaihi wa sallam bertanya padanya, “Apakah Anda sudah shalat?” Ia menjawab, “Belum.” Barulah Nabi shallallahu ‘alaihi wa sallam berkata padanya, “Bangun dan shalatlah dua rakaat dan persingkatlah.” (HR. Bukhari, no. 931 dan Muslim, no. 875). Lihatlah Nabi shallallahu ‘alaihi wa sallam tidak langsung menyuruhnya untuk mengerjakan shalat dua rakaat, namun bertanya dulu apakah ia sudah melakukan shalat tersebut ataukah belum.\n" +
                    "\n" +
                    "Kesepuluh: Syarat nahi mungkar (melarang dari kemungkaran) adalah (1) mengetahui sesuatu yang dilarang adalah kemungkaran berdasarkan dalil syar’i, bukan berdasarkan perasaan, kebiasaan, cemburu, atau sekilas penglihatan; (2) orang yang ingin dilarang telah diketahui terjerumus dalam kemungkaran; (3) kemungkaran yang diingkari tidak akan berubah menjadi kemungkaran yang lebih parah.\n" +
                    "\n",
            R.drawable.img_news25
        ),

        news(
            "Hadis 26 : Tiap hari mesti bersedekah",
            "عَنْ أَبي هُرَيرةَ – رَضِيَ اللهُ عَنْهُ – ، قَالَ : قَالَ رَسُوْلُ اللهِ – صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ – : (( كُلُّ سُلامَى مِنَ النَّاسِ عَلَيْهِ صَدَقةٌ ، كُلَّ يَوْمٍ تَطلُعُ فِيْهِ الشَّمْسُ : تَعدِلُ بَينَ الاِثْنَيْنِ صَدَقَةٌ ، وَتُعِيْنُ الرَّجُلَ فِي دَابَّتِهِ، فَتَحْمِلُهُ عَلَيْهَا ، أَوْ تَرْفَعُ لَهُ عَلَيْهَا مَتَاعَهُ صَدَقةٌ ، والكَلِمَةُ الطَّيِّبَةُ صَدَقةٌ ، وبِكُلِّ خُطْوَةٍ تَمشِيْهَا إِلَى الصَّلاَةِ صَدَقةٌ ، وتُمِيْطُ الأَذَى عَنِ الطَّرِيْقِ صَدَقَةٌ )) . رَوَاهُ البُخَارِيُّ وَمُسْلِمٌ.\n" +
                    "\n" +
                    "Dari Abu Hurairah radhiyallahu ‘anhu, ia berkata, Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Setiap persendian manusia diwajibkan untuk bersedakah setiap harinya mulai matahari terbit. Memisahkan (menyelesaikan perkara) antara dua orang (yang berselisih) adalah sedekah. Menolong seseorang naik ke atas kendaraannya atau mengangkat barang-barangnya ke atas kendaraannya adalah sedekah. Berkata yang baik juga termasuk sedekah. Begitu pula setiap langkah berjalan untuk menunaikan shalat adalah sedekah. Serta menyingkirkan suatu rintangan dari jalan adalah sedekah.” (HR. Bukhari dan Muslim) [HR. Bukhari, no. 2989 dan Muslim, no. 1009]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Wajibnya sedekah bagi setiap orang dengan setiap anggota badan pada setiap harinya mulai dari matahari terbit. Karena perkataan Nabi shallallahu ‘alaihi wa sallam “’alaihi shodaqoh” menunjukkan wajibnya. Bentuk dari hal ini adalah setiap orang bersyukur kepada Allah setiap paginya atas keselamatan pada dirinya baik keselamatan pada tangannya, kakinya, dan anggota tubuh lainnya. Maka dia bersyukur kepada Allah karena nikmat ini.\n" +
                    "Nabi telah memberikan ganti untuk hal tersebut yaitu untuk mengganti tiga ratus enam puluh persendirian sedekah dari persendian yang ada. Penggantinya adalah dengan mengerjakan shalat sunnah Dhuha sebanyak dua rakaat. Dari Abu Dzar radhiyallahu ‘anhu, Nabi shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "« يُصْبِحُ عَلَى كُلِّ سُلاَمَى مِنْ أَحَدِكُمْ صَدَقَةٌ فَكُلُّ تَسْبِيحَةٍ صَدَقَةٌ وَكُلُّ تَحْمِيدَةٍ صَدَقَةٌ وَكُلُّ تَهْلِيلَةٍ صَدَقَةٌ وَكُلُّ تَكْبِيرَةٍ صَدَقَةٌ وَأَمْرٌ بِالْمَعْرُوفِ صَدَقَةٌ وَنَهْىٌ عَنِ الْمُنْكَرِ صَدَقَةٌ وَيُجْزِئُ مِنْ ذَلِكَ رَكْعَتَانِ يَرْكَعُهُمَا مِنَ الضُّحَى»\n" +
                    "“Pada pagi hari diwajibkan bagi seluruh persendian di antara kalian untuk bersedekah. Maka setiap bacaan tasbih adalah sedekah, setiap bacaan tahmid adalah sedekah, setiap bacaan tahlil adalah sedekah, dan setiap bacaan takbir adalah sedekah. Begitu juga amar makruf (memerintahkan kepada ketaatan) dan nahi mungkar (melarang dari kemungkaran) adalah sedekah. Ini semua bisa dicukupi (diganti) dengan melaksanakan shalat Dhuha sebanyak dua rakaat.” (HR. Muslim, no. 1704)\n" +
                    "\n" +
                    "Kedua: Ibnu Rajab Al-Hambali rahimahullah mengatakan, “Susunan tubuh dan selamatnya anggota badan merupakan nikmat Allah bagi hamba-Nya. Maka semua tulang dari tubuh ini punya bagian bersedekah sebagai bentuk syukur atas nikmat-nikmat yang diberikan.” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:74-75).\n" +
                    "\n" +
                    "Ketiga: Hadits ini menunjukkan keutamaan berbuat adil di antara dua orang yang berselisih. Dan Allah Ta’ala telah mendorong kita agar berbuat islah (perdamaian) sebagaimana dalam firman-Nya,\n" +
                    "وَإِنِ امْرَأَةٌ خَافَتْ مِنْ بَعْلِهَا نُشُوزًا أَوْ إِعْرَاضًا فَلَا جُنَاحَ عَلَيْهِمَا أَنْ يُصْلِحَا بَيْنَهُمَا صُلْحًا وَالصُّلْحُ خَيْرٌ وَأُحْضِرَتِ الْأَنْفُسُ الشُّحَّ\n" +
                    "“Dan jika seorang wanita khawatir akan nusyuz atau sikap tidak acuh dari suaminya, maka tidak mengapa bagi keduanya mengadakan perdamaian yang sebenar-benarnya, dan perdamaian itu lebih baik (bagi mereka) walaupun manusia itu menurut tabiatnya kikir.” (QS. An-Nisaa’: 128)\n" +
                    "\n" +
                    "Keempat: Dalam hadits ini terdapat dorongan untuk menolong saudara kita, karena melakukan seperti ini termasuk sedekah. Baik dalam contoh yang diberikan oleh Rasul shallallahu ‘alaihi wa sallam dalam hadits ini atau perbuatan lainnya.\n" +
                    "\n" +
                    "Kelima: Hadits ini memberi motivasi untuk berkata dengan perkataan yang baik. Hal itu bisa berupa dzikir, membaca, taklim, berdakwah dan lain sebagainya. Dan keutamaan berdakwah telah ditunjukkan dalam hadits,\n" +
                    "مَنْ دَلَّ عَلَى خَيْرٍ فَلَهُ مِثْلُ أَجْرِ فَاعِلِهِ\n" +
                    "“Barangsiapa menunjukkan (orang lain) kepada kebaikan, maka baginya pahala seperti orang yang mengerjakannya.” (HR. Muslim no. 5007)\n" +
                    "\n" +
                    "Keenam: Dalam hadits ini juga ditunjukkan mengenai keutamaan berjalan ke masjid. Dan berjalan pulang dari masjid juga akan dicatat sebagaimana perginya.\n" +
                    "Dari Ubay bin Ka’ab radhiyallahu ‘anhu berkata, “Dulu ada seseorang yang tidak aku ketahui siapa lagi yang jauh rumahnya dari masjid selain dia. Dan dia tidak pernah luput dari shalat. Kemudian ada yang berkata padanya atau aku sendiri yang berkata padanya, ‘Bagaimana kalau kamu membeli unta untuk dikendarai ketika gelap dan ketika tanah dalam keadaan panas.’ Kemudian orang tadi mengatakan, ‘Aku tidaklah senang jika rumahku di samping masjid. Aku ingin dicatat bagiku langkah kakiku menuju masjid dan langkahku ketika pulang kembali ke keluargaku.’ Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "قَدْ جَمَعَ اللَّهُ لَكَ ذَلِكَ كُلَّهُ\n" +
                    "“Sungguh Allah telah mencatat bagimu seluruhnya.” (HR. Muslim, no. 1546)\n" +
                    "\n" +
                    "Ketujuh: Dalam hadits ini terdapat keutamaan menyingkirkan gangguan dari jalanan. Dan juga ini termasuk cabang keimanan sebagaimana disebutkan dalam hadits lainnya.\n" +
                    "Dari Abu Hurairah radhiyallahu ‘anhu, Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "الإِيمَانُ بِضْعٌ وَسَبْعُونَ أَوْ بِضْعٌ وَسِتُّونَ شُعْبَةً فَأَفْضَلُهَا قَوْلُ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَدْنَاهَا إِمَاطَةُ الأَذَى عَنِ الطَّرِيقِ وَالْحَيَاءُ شُعْبَةٌ مِنَ الإِيمَانِ\n" +
                    "“Iman itu ada tujuh puluh atau enam puluh sekian cabang. Yang paling utama adalah kalimat laa ilaha illallah. Yang paling rendah adalah menyingkirkan duri dari jalanan. Dan malu termasuk bagian dari iman.” (HR. Muslim, no. 162)\n" +
                    "\n" +
                    "Kedelapan: Syaikh ‘Abdul Muhsin bin Hamad Al-‘Abbad Al-Badr hafizhahullah menyatakan bahwa amalan-amalan yang disebutkan dalam hadits ini ada yang berupa ucapan, dan ada yang berupa perbuatan. Juga ada amalan yang qaashir (manfaat untuk diri sendiri) dan muta’addi (manfaat untuk orang lain). Semuanya termasuk sedekah. Amalan yang dicontohkan dalam hadits bukanlah pembatasan. Contoh yang berupa ucapan muta’addi adalah mendamaikan yang berselisih. Contoh yang berupada perbuatan muta’addi adalah membantu menaikkan orang lain atau barangnya ke atas kendaraannya. Adapun kalimat yang baik bisa berupa dzikir, doa, membaca Al-Qur’an, mengajarkan ilmu, amar makruf nahi mungkar, ada yang termasuk ucapan yang qaashir dan muta’addi. Adapun langkah kaki ke masjid termasuk perbuatan yang qaashir. Sedangkan menyingkirkan gangguan dari jalan termasuk perbuatan muta’addi.\n" +
                    "\n" +
                    "\n",
            R.drawable.img_news26
        ),

        news(
            "Hadis 27 : Minta fatwa pada hati tentang kebaikan dan dosa",
            "عَنِ النَّواسِ بنِ سَمعانِ – رَضِيَ اللهُ عَنْهُ – ، عَنِ النَّبيِّ – صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ – ، قَالَ : (( البِرُّ حُسْنُ الخُلُقِ ، والإثْمُ : ما حَاكَ في نَفْسِكَ ، وكَرِهْتَ أنْ يَطَّلِعَ عليهِ النَّاسُ )) . رواهُ مسلمٌ\n" +
                    "\n" +
                    "وَعَنْ وَابِصَةَ بْنِ مَعْبَدٍ قَالَ : أَتَيْتُ رَسُولَ اللهِ – صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ – ، فَقَالَ : (( جِئْتَ تَسْأَلُ عَنِ البِرِّ وَالإِثْمِ ؟ )) قُلْتُ : نعَمْ ، قَالَ : (( اِسْتَفْتِ قَلْبَكَ ، الِبرُّ مَا اطْمَأَنَّتْ إِلَيْهِ النَّفْسُ ، وَاطْمَأَنَّ إِلَيْهِ القَلْبُ ، وَالإِثْمُ مَا حَاكَ فِي النَّفْسِ ، وَتَردَّدَ فِي الصَّدْرِ ، وَإِنْ أَفْتَاكَ النَّاسُ وَأَفْتَوْكَ ))حَدِيْثٌ حَسَنٌ رَوَيْنَاهُ فِي ” مُسْنَدَي ” الإِمَامَيْنِ أَحْمَدَ وَالدَّارميِّ بِإسْنَادٍ حَسَنٍ\n" +
                    "\n" +
                    "Dari An-Nawwas bin Sam’an radhiyallahu ‘anhu, dari Nabi shallallahu ‘alaihi wa sallam bersabda, “Al-birr adalah husnul khuluq (akhlak yang baik). Sedangkan al-itsm adalah apa yang menggelisahkan dalam dirimu. Engkau tidak suka jika hal itu nampak di hadapan orang lain.” (HR. Muslim) [HR. Muslim, no. 2553]\n" +
                    "\n" +
                    "Dari Wabishah bin Ma’bad radhiyallahu ‘anhu, ia berkata, “Aku mendatangi Rasulullah shallallahu ‘alaihi wa sallam, lalu beliau bersabda, ‘Apakah engkau datang untuk bertanya tentang kebajikan dan dosa?’ Aku menjawab, ‘Ya.’ Nabi shallallahu ‘alaihi wa sallam bersabda, ‘Mintalah fatwa kepada hatimu. Kebajikan itu adalah apa saja yang jiwa merasa tenang dengannya dan hati merasa tentram kepadanya, sedangkan dosa itu adalah apa saja yang mengganjal dalam hatimu dan membuatmu ragu, meskipun manusia memberi fatwa kepadamu.’” (Hadits hasan. Kami meriwayatkannya dalam dua kitab Musnad dua orang imam: Ahmad bin Hambal dan Ad-Darimi dengan sanad hasan)\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Kata para ulama, al-birr bisa bermakna silaturahim (menjalin hubungan dengan kerabat). Kadang juga bisa bermakna cara bergaul yang baik. Juga al-birr bisa bermakna ketaatan. Semua ini termasuk bagian dari husnul khuluq (akhlak yang mulia). Demikian penjelasan Imam Nawawi dalam Syarh Shahih Muslim, 16:101.\n" +
                    "\n" +
                    "Kedua: Akhlak yang mulia adalah bentuk kebaikan yang paling utama.\n" +
                    "\n" +
                    "Ketiga: Akhlak yang mulia (husnul khulq) adalah berakhlak dengan akhlak yang sesuai syari’at dan beradab dengan adab yang diajarkan oleh Allah kepada hamba-Nya.\n" +
                    "\n" +
                    "Keempat: Al-birr (kebaikan) dimutlakkan untuk setiap perbuatan ketaatan yang lahir maupun yang batin. Ibnu Taimiyyah dalam Majmu’ah Al-Fatawa (7:165) menyebutkan bahwa al-birr adalah segala bentuk perintah Allah.\n" +
                    "\n" +
                    "Kelima: Al-birr juga bisa dimaknakan dengan lawan dari ‘uquq (durhaka). Sehingga ada istilah birul walidain, berbuat baik kepada kedua orang tua. Al-birr dalam istilah bermakna berbuat baik dan menyambung hubungan dengan kedua orang tua.\n" +
                    "\n" +
                    "Keenam: Al-birr juga kadang dikaitkan dengan takwa. Pada saat ini, al-birr berarti menjalankan konsekuensi keimanan dan berakhlak mulia. Sedangkan takwa berarti menjauhi segala yang Allah larang berupa kekufuran, kefasikan, dan maksiat.\n" +
                    "\n" +
                    "Ketujuh: Husnul khuluq (berakhlak baik) bisa jadi kepada manusia dan bisa jadi kepada Allah. Berakhlak kepada Allah mencakup menjalankan kewajiban, menjalankan hal sunnah, meninggalkan keharaman, juga meninggalkan yang makruh.\n" +
                    "\n" +
                    "Kedelapan: Itsm atau dosa yang dimaksud dalam hadits adalah semua dosa.\n" +
                    "\n" +
                    "Kesembilan: Yang dimaksud engkau tidak suka jika dosa itu nampak di sisi manusia. Manusia yang dimaksudkan di sini adalah orang berilmu dan paham agama. Kalau yang melihatnya sama-sama juga ahli maksiat, maka tidak akan punya rasa seperti itu.\n" +
                    "\n" +
                    "Kesepuluh: Hadits ini menunjukkan dorongan untuk berakhlak mulia.\n" +
                    "\n" +
                    "Kesebelas: Dari hadits, dosa itu punya dua tanda: (1) tanda internal, yaitu jiwa merasa tidak tenang ketika melakukannya; (2) tanda eksternal, yaitu tidak senang dilihat oleh orang lain dan takut mendapatkan celaan mereka.\n" +
                    "\n" +
                    "Kedua belas: Hadits ini menunjukkan bagaimanakah motivasi sahabat dalam mengenal halal dan haram, serta mengenal al-birr dan al-itsm.\n" +
                    "\n" +
                    "Ketiga belas: Orang yang punya fitrah yang baik, malu untuk berbuat dosa dan malu untuk menampakkannya.\n" +
                    "\n" +
                    "Keempat belas: Hendaknya seorang muslim mendahulukan dalam urusan agamanya hal-hal yang jelas halalnya dibanding yang syubhat.\n" +
                    "\n" +
                    "Kelima belas: Orang mukmin yang takut kepada Allah tidaklah melakukan sesuatu yang tidak menenangkan jiwanya walau ada fatwa yang membenarkannya dari luar selama itu bukan perkara yang jelas dalam syariat seperti berbagai rukhsah (keringanan).\n" +
                    "\n" +
                    "Keenam belas: Boleh merujuk pada hati dengan syarat hati yang dirujuk adalah hati dari orang yang istiqamah dalam agama. Karena Allah akan menguatkan orang yang berilmu dengan niatnya yang lurus.\n" +
                    "\n" +
                    "\n",
            R.drawable.img_news27
        ),

        news(
            "Hadis 28 : Ikutilah sunnah, tinggalkanlah bid'ah, taatlah pemimpin",
            "عَنْ أَبِي نَجِيْحٍ العِرْبَاضِ بْنِ سَارِيَةَ رَضِيَ اللهُ تَعَالَى عَنْهُ قاَلَ : وَعَظَنَا رَسُوْلُ اللهِ صَلَّى اللهُ عَلَيْهِ وَآلِهِ وَسَلَّمَ مَوْعِظًةً وَجِلَتْ مِنْهَا القُلُوْبُ وَذَرَفَتْ مِنْهَا العُيُوْنُ فَقُلْنَا : يَا رَسُوْلَ اللهِ كَأَنَّهَا مَوْعِظَةً مُوَدِّعٍ فَأَوْصِنَا قَالَ أُوْصِيْكُمْ بِتَقْوَى اللهِ عَزَّ وَ جَلَّ وَالسَّمْعِ وَالطَّاعَةِ وَإِنْ تَأَمَّرَ عَلَيْكُمْ عَبْدٌ فَإِنَّهُ مَنْ يَعِشْ مِنْكُمْ فَسَيَرَي اخْتِلاَفًا كَثِيْرًا فَعَلَيْكُمْ بِسُنَّتِي وَسُنَّةِ الخُلَفَاءِ الرَّاشِدِيْنَ المَهْدِيِّيْنَ عَضُّوا عَلَيْهَا بِالنَّوَاجِذِ وَإِيَّاكُمْ وَمُحْدَثَاتِ الأُمُوْرِ فَإِنَّ كُلَّ بِدْعَةٍ ضَلاَلَةٌ رَوَاهُ أَبُوْ دَاوُدَ وَالتِّرْمِذِيُّ وَقَالَ : حَدِيْثٌ حَسَنٌ صَحِيْحٌ\n" +
                    "\n" +
                    "Dari Abu Najih Al-‘Irbadh bin Sariyah radhiyallahu ‘anhu, ia berkata, “Rasulullah shallallahu ‘alaihi wa sallam memberikan nasihat kepada kami dengan nasihat yang membuat hati menjadi bergetar dan mata menangis, maka kami berkata, ‘Wahai Rasulullah! Sepertinya ini adalah wasiat dari orang yang akan berpisah, maka berikanlah wasiat kepada kami.’ Nabi shallallahu ‘alaihi wa sallam bersabda, ‘Aku berwasiat kepada kalian agar bertakwa kepada Allah, mendengar dan taat meskipun kalian dipimpin seorang budak. Sungguh, orang yang hidup di antara kalian sepeninggalku, ia akan melihat perselisihan yang banyak. Oleh karena itu, wajib atas kalian berpegang teguh pada sunnahku dan Sunnah khulafaur rosyidin al-mahdiyyin (yang mendapatkan petunjuk dalam ilmu dan amal). Gigitlah sunnah tersebut dengan gigi geraham kalian, serta jauhilah setiap perkara yang diada-adakan, karena setiap bidah adalah sesat.” (HR. Abu Daud dan Tirmidzi, ia berkata bahwa hadits ini hasan sahih). [HR. Abu Daud, no. 4607 dan Tirmidzi, no. 2676. Al-Hafizh Abu Thahir mengatakan bahwa sanad hadits ini sahih].\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Sahabat Nabi shallallahu ‘alaihi wa sallam begitu semangat dalam meraih kebaikan.\n" +
                    "\n" +
                    "Kedua: Disyariatkan memberi nasihat (maw’izhah), diberikan pada tempatnya, dan sifat nasihat tersebut membekas. Syaikh ‘Abdul Muhsin menyatakan, “Maw’izhah (nasihat) dari Nabi shallallahu ‘alaihi wa sallam punya tiga sifat yaitu: al-balaaghah (bahasanya menyentuh dan jelas), hati bergetar, dan bisa membuat mata menangis.” (Fath Al-Qawi Al-Matin, hlm. 95).\n" +
                    "\n" +
                    "Ketiga: Wasiat perpisahan itu lebih membekas dalam hati.\n" +
                    "\n" +
                    "Keempat: Hati yang dalam keadaan takut, bisa membuat air mata menangis. Jika hati dalam keadaan gelap (penuh maksiat), maka air mata tidaklah menangis, karena tidak dalam keadaan takut pada Allah. Hal ini yang disebutkan oleh Syaikh Ibnu ‘Utsaimin rahimahullah dan Syaikh ‘Abdullah Al-Farih.\n" +
                    "\n" +
                    "Kelima: Disyariatkan meminta nasihat dari yang lain, lebih-lebih lagi yang dimintai nasihat adalah orang yang punya keutamaan dalam ilmu.\n" +
                    "\n" +
                    "Keenam: Wasiat yang paling penting untuk seorang hamba adalah bertakwa kepada Allah, karena wasiat tersebut merupakan wasiat orang yang terdahulu dan belakangan.\n" +
                    "\n" +
                    "Ketujuh: Syaikh ‘Abdul Muhsin berkata, “Takwa adalah sebab memperoleh segala kebaikan dan kemenangan di dunia dan akhirat. Banyak ayat yang menyebutkan perintah untuk bertakwa kepada Allah. Seringnya adalah ayat tersebut didahului dengan kalimat ‘Yaa ayyuhalladzina aamanuu (wahai orang-orang yang beriman). Begitu pula takwa ini menjadi wasiat Rasulullah shallallahu ‘alaihi wa sallam pada para sahabatnya.” (Fath Al-Qawi Al-Matin, hlm. 96)\n" +
                    "\n" +
                    "Kedelapan: Termasuk wasiat paling penting adalah menaati penguasa kaum muslimin dalam selain maksiat, juga berpegang pada ajaran Nabi shallallahu ‘alaihi wa sallam dan khulafaur rosyidin.\n" +
                    "\n" +
                    "Kesembilan: Patuh dan taat kepada penguasa adalah selama bukan dalam perkara maksiat walaupun penguasa tersebut adalah seorang budak. Para ulama telah sepakat bahwa seorang budak tidaklah pantas untuk menjadi khalifah. Hadits ini berarti perintah untuk menaati penguasa, walau ia penguasa yang tidak pantas.\n" +
                    "\n" +
                    "Kesepuluh: Syaikh ‘Abdul Muhsin mengatakan, “Wasiat yang paling penting adalah taat dan patuh pada penguasa kaum muslimin karena di dalamnya terdapat manfaat dunia dan akhirat untuk kaum muslimin.” (Fath Al-Qawi Al-Matin, hlm. 100)\n" +
                    "\n" +
                    "\n",
            R.drawable.img_news28
        ),

        news(
            "Hadis 29 : Mulianya perkara sholat dan menjaga lisan",
            "عَنْ مُعَاذِ بْنِ جَبَلٍ رَضِيَ اللهُ عَنْهُ قَالَ : قُلْتُ يَا رَسُوْلَ اللهِ أَخْبِرْنِي بِعَمَلٍ يُدْخِلُنِي الجَنَّةَ وَيُبَاعِدُنِي عَنِ النَّارِ قَالَ : لَقَدْ سَأَلْتَ عَنْ عَظِيمٍ وَإِنَّهُ لَيَسِيرٌ عَلَى مَنْ يَسَّرَهُ اللَّهُ عَلَيْهِ تَعْبُدُ اللَّهَ لاَ تُشْرِكُ بِهِ شَيْئًا وَتُقِيمُ الصَّلاَةَ وَتُؤْتِى الزَّكَاةَ وَتَصُومُ رَمَضَانَ وَتَحُجُّ الْبَيْتَ ثُمَّ قَالَ « أَلاَ أَدُلُّكَ عَلَى أَبْوَابِ الْخَيْرِ الصَّوْمُ جُنَّةٌ وَالصَّدَقَةُ تُطْفِئُ الْخَطِيئَةَ كَمَا يُطْفِئُ الْمَاءُ النَّارَ وَصَلاَةُ الرَّجُلِ فِي جَوْفِ اللَّيْلِ ». ثُمَّ تَلاَ : { تَتَجَافَى جُنُوْبُهُمْ عَنِ المَضَاجِعِ } { حَتَّى إِذَا بَلَغَ } { يَعْمَلُوْنَ }\n" +
                    "\n" +
                    "ثُمَّ قَالَ « أَلاَ أُخْبِرُكَ بِرَأْسِ الأَمْرِ وَعَمُودِهِ وَذِرْوَةِ سَنَامِهِ ». قُلْتُ بَلَى يَا رَسُولَ اللَّهِ.\n" +
                    "\n" +
                    "قَالَ « رَأْسُ الأَمْرِ الإِسْلاَمُ وَعَمُودُهُ الصَّلاَةُ وَذِرْوَةُ سَنَامِهِ الْجِهَادُ ». ثُمَّ قَالَ « أَلاَ أُخْبِرُكَ بِمَلاَكِ ذَلِكَ كُلِّهِ ». قُلْتُ بَلَى يَا رَسُوْلَ اللَّهِ قَالَ فَأَخَذَ بِلِسَانِهِ قَالَ « كُفَّ عَلَيْكَ هَذَا ». فَقُلْتُ يَا نَبِىَّ اللَّهِ وَإِنَّا لَمُؤَاخَذُونَ بِمَا نَتَكَلَّمُ بِهِ فَقَالَ « ثَكِلَتْكَ أُمُّكَ وَهَلْ يَكُبُّ النَّاسَ فِى النَّارِ عَلَى وُجُوهِهِمْ أَوْ قاَلَ عَلَى مَنَاخِرِهِمْ إِلاَّ حَصَائِدُ أَلْسِنَتِهِمْ ». رَوَاهُ التِّرْمِذِيُّ وَقَالَ : حَدِيْثٌ حَسَنٌ صَحِيْحٌ\n" +
                    "\n" +
                    "Dari Mu’adz bin Jabal radhiyallahu ‘anhu, ia berkata, “Aku berkata, ‘Wahai Rasulullah! Beritahukanlah kepadaku amal perbuatan yang dapat memasukkanku ke surga dan menjauhkanku dari neraka.’ Nabi shallallahu ‘alaihi wa sallam bersabda, ‘Sungguh, engkau bertanya tentang perkara yang besar, tetapi sesungguhnya hal itu adalah mudah bagi orang yang Allah mudahkan atasnya: Engkau beribadah kepada Allah dan jangan mempersekutukan-Nya dengan sesuatu apa pun, mendirikan shalat, membayar zakat, berpuasa di bulan Ramadhan, dan pergi haji ke Baitullah.’ Kemudian Nabi shallallahu ‘alaihi wa sallam bersabda, ‘Maukah engkau aku tunjukkan pintu-pintu kebaikan? Puasa adalah perisai, sedekah itu memadamkan kesalahan sebagaimana air memadamkan api, dan shalatnya seseorang di pertengahan malam.’ Kemudian Nabi shallallahu ‘alaihi wa sallam membaca firman Allah, ‘Lambung mereka jauh dari tempat tidurnya’, sampai pada firman Allah ‘yang mereka kerjakan.’ (QS. As-Sajdah: 16-17). Kemudian Nabi shallallahu ‘alaihi wa sallam bersabda, ‘Maukah engkau aku jelaskan tentang pokok segala perkara, tiang-tiangnya, dan puncaknya?’ Aku katakan, ‘Mau, wahai Rasulullah!’ Nabi shallallahu ‘alaihi wa sallam bersabda, ‘Pokok segala perkara adalah Islam, tiang-tiangnya adalah shalat, dan puncaknya adalah jihad.’ Kemudian Nabi shallallahu ‘alaihi wa sallam bersabda, ‘Maukah kujelaskan kepadamu tentang hal yang menjaga itu semua?’ Aku menjawab, ‘Mau, wahai Rasulullah!’ Beliau shallallahu ‘alaihi wa sallam menjawab lalu memegang lidah beliau dan bersabda, ‘Jagalah ini (lisan)!’ Kutanyakan, ‘Wahai Nabi Allah, apakah kita akan disiksa dengan sebab perkataan kita?’ Nabi shallallahu ‘alaihi wa sallam menjawab, ‘Semoga ibumu kehilanganmu! (kalimat ini maksudnya adalah untuk memperhatikan ucapan selanjutnya). Tidaklah manusia tersungkur di neraka di atas wajah atau di atas hidung mereka melainkan dengan sebab lisan mereka.’” (HR. Tirmidzi, ia mengatakan bahwa hadits ini hasan sahih). [HR. Tirmidzi, no. 2616 dan Ibnu Majah, no. 3973. Al-Hafizh Abu Thahir mengatakan hadits ini hasan].\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Cita-cita para sahabat begitu tinggi, mereka ingin masuk surga. Itulah yang selalu jadi harapan mereka, bukan hanya ingin dapatkan sepuluh, dua puluh, tiga puluh, dari keuntungan dunia. Masuk surga dan selamat dari neraka adalah kesuksesan dan kebahagiaan sejati sebagaimana disebutkan dalam ayat,\n" +
                    "كُلُّ نَفْسٍ ذَائِقَةُ الْمَوْتِ ۗ وَإِنَّمَا تُوَفَّوْنَ أُجُورَكُمْ يَوْمَ الْقِيَامَةِ ۖ فَمَنْ زُحْزِحَ عَنِ النَّارِ وَأُدْخِلَ الْجَنَّةَ فَقَدْ فَازَ ۗ وَمَا الْحَيَاةُ الدُّنْيَا إِلَّا مَتَاعُ الْغُرُورِ\n" +
                    "“Tiap-tiap yang berjiwa akan merasakan mati. Dan sesungguhnya pada hari kiamat sajalah disempurnakan pahalamu. Barangsiapa dijauhkan dari neraka dan dimasukkan ke dalam surga, maka sungguh ia telah beruntung. Kehidupan dunia itu tidak lain hanyalah kesenangan yang memperdayakan.” (QS. Ali Imran: 185)\n" +
                    "Kedua: Agama ini mudah namun bagi siapa yang Allah mudahkan untuknya. Dalam ayat disebutkan bahwa ajaran Islam itu mudah,\n" +
                    "يُرِيدُ اللَّهُ بِكُمُ الْيُسْرَ وَلَا يُرِيدُ بِكُمُ الْعُسْرَ\n" +
                    "“Allah menghendaki kemudahan bagimu, dan tidak menghendaki kesukaran bagimu.” (QS. Al-Baqarah: 185)\n" +
                    "Ketiga: Syaikh Ibnu Utsaimin rahimahullah berkata, “Jangan beribadah kepada Allah, sedangkan Anda merasa berjasa pada agama Allah. Allah telah menyinggung hal ini dalam perkataannya,\n" +
                    "يَمُنُّونَ عَلَيْكَ أَنْ أَسْلَمُوا ۖ قُلْ لَا تَمُنُّوا عَلَيَّ إِسْلَامَكُمْ ۖ بَلِ اللَّهُ يَمُنُّ عَلَيْكُمْ أَنْ هَدَاكُمْ لِلْإِيمَانِ إِنْ كُنْتُمْ صَادِقِينَ\n" +
                    "“Mereka merasa telah memberi nikmat kepadamu dengan keislaman mereka. Katakanlah: ‘Janganlah kamu merasa telah memberi nikmat kepadaku dengan keislamanmu, sebenarnya Allah, Dialah yang melimpahkan nikmat kepadamu dengan menunjuki kamu kepada keimanan jika kamu adalah orang-orang yang benar.’” (QS. Al-Hujurat: 17)\n" +
                    "Dalam ayat ini mereka tidak merasa berjasa kepada Allah, akan tetapi mereka merasa berjasa kepada Rasulullah shallallahu ‘alaihi wa sallam. [Maka terlebih lagi apabila merasa berjasa kepada agama Allah]. Sembahlah Allah Ta’ala dengan perasaan tunduk, cinta, dan pengagungan. Dengan perasaan cinta akan mudah melaksanakan berbagai macam ketaatan, dan dengan pengagungan akan selalu meninggalkan larangan Allah.” (Syarh Al-Arba’in An-Nawawiyyah, hlm. 319)\n" +
                    "Keempat: Amalan saleh jadi sebab masuk surga. Masuk surga ini dengan menjalankan rukun Islam yang lima.\n" +
                    "Dalam hadits disebutkan,\n" +
                    "أَنَّ أَبَا هُرَيْرَةَ قَالَ سَمِعْتُ رَسُولَ اللَّهِ – صلى الله عليه وسلم – يَقُولُ « لَنْ يُدْخِلَ أَحَدًا عَمَلُهُ الْجَنَّةَ » . قَالُوا وَلاَ أَنْتَ يَا رَسُولَ اللَّهِ قَالَ « لاَ ، وَلاَ أَنَا إِلاَّ أَنْ يَتَغَمَّدَنِى اللَّهُ بِفَضْلٍ وَرَحْمَةٍ\n" +
                    "Sesungguhnya Abu Hurairah berkata, ia mendengar Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Amal seseorang tidak akan memasukkan seseorang ke dalam surga.” “Engkau juga tidak wahai Rasulullah?”, tanya beberapa sahabat. Beliau menjawab, “Aku pun tidak. Itu semua hanyalah karena karunia dan rahmat Allah.” (HR. Bukhari no. 5673 dan Muslim no. 2816)\n" +
                    "Sedangkan firman Allah Ta’ala,\n" +
                    "سَابِقُوا إِلَى مَغْفِرَةٍ مِنْ رَبِّكُمْ وَجَنَّةٍ عَرْضُهَا كَعَرْضِ السَّمَاءِ وَالْأَرْضِ أُعِدَّتْ لِلَّذِينَ آَمَنُوا بِاللَّهِ وَرُسُلِهِ ذَلِكَ فَضْلُ اللَّهِ يُؤْتِيهِ مَنْ يَشَاءُ وَاللَّهُ ذُو الْفَضْلِ الْعَظِيمِ\n" +
                    "“Berlomba-lombalah kamu kepada (mendapatkan) ampunan dari Rabbmu dan surga yang lebarnya selebar langit dan bumi, yang disediakan bagi orang-orang yang beriman kepada Allah dan rasul-rasul-Nya. Itulah karunia Allah, diberikan-Nya kepada siapa yang dikehendaki-Nya. Dan Allah mempunyai karunia yang besar.” (QS. Al-Hadiid: 21). Dalam ayat ini dinyatakan bahwa surga itu disediakan bagi orang beriman kepada Allah dan Rasul-Nya. Berarti ada amalan.\n" +
                    "Begitu pula dalam ayat,\n" +
                    "ادْخُلُوا الْجَنَّةَ بِمَا كُنْتُمْ تَعْمَلُونَ\n" +
                    "“Masuklah kamu ke dalam surga itu disebabkan apa yang telah kamu kerjakan.” (QS. An-Nahl: 32)\n" +
                    "وَتِلْكَ الْجَنَّةُ الَّتِي أُورِثْتُمُوهَا بِمَا كُنْتُمْ تَعْمَلُونَ\n" +
                    "“Dan itulah surga yang diwariskan kepada kamu disebabkan amal-amal yang dahulu kamu kerjakan.” (QS. Az-Zukhruf: 72)\n" +
                    "Imam Nawawi rahimahullah memberikan keterangan yang sangat bagus, “Ayat-ayat Al-Qur’an yang ada menunjukkan bahwa amalan bisa memasukkan orang dalam surga. Maka tidak bertentangan dengan hadits-hadits yang ada. Bahkan makna ayat adalah masuk surga itu disebabkan karena amalan. Namun di situ ada taufik dari Allah untuk beramal. Ada hidayah untuk ikhlas pula dalam beramal. Maka diterimanya amal memang karena rahmat dan karunia Allah. Karenanya, amalan semata tidak memasukkan seseorang ke dalam surga. Itulah yang dimaksudkan dalam hadits. Kesimpulannya, bisa saja kita katakan bahwa sebab masuk surga adalah karena ada amalan. Amalan itu ada karena rahmat Allah. Wallahu a’lam.” (Syarh Shahih Muslim, 14: 145)\n" +
                    "Kelima: Syaikh ‘Abdul Muhsin hafizhahullah berkata, “Jalan menuju surga itu berat. Semuanya bisa mudah jika Allah mudahkan.” (Fath Al-Qawi Al-Matin, hlm. 107). Syaikh Ibnu ‘Utsaimin rahimahullah berkata, “Sudah sepatutnya setiap orang meminta kepada Allah kemudahan untuk urusan agama dan dunianya. Karena siapa saja yang tidak Allah mudahkan, maka sulit untuk menjalani segala sesuatu.” (Syarh Al-Arba’in An-Nawawiyyah, hlm. 325)\n" +
                    "Keenam: Pintu kebaikan itu begitu banyak. Hadits ini menunjukkan keutamaan puasa dapat melindungi dari neraka, sedekah dapat menghapus dosa. Hadits ini juga menerangkan tentang keutamaan qiyamul lail (shalat malam), shalat secara umum, dan doa.\n" +
                    "Ketujuh: Syaikh Ibnu ‘Utsaimin rahimahullah mengatakan, “Dosa itu sifatnya panas. Karena orang yang berdosa disiksa di neraka. Sedangkan sedekah di dalamnya ada sifat dingin. Oleh karenanya Nabi shallallahu ‘alaihi wa sallam sifatkan sedekah dengan air yang dapat memadamkan api.” (Syarh Al-Arba’in An-Nawawiyyah, hlm. 328)\n" +
                    "Kedelapan: Ibadah barulah teranggap jika dibangun di atas dua kalimat syahadat dan keduanya saling berkaitan. Amal barulah diterima jika ikhlas karena Allah dan bersesuaian dengan syariat Rasulullah shallallahu ‘alaihi wa sallam. Lihat Fath Al-Qawi Al-Matin, hlm. 107.\n" +
                    "\n",
            R.drawable.img_news29
        ),

        news(
            "Hadis 30 : Wajib, haram dan yang Alloh diamkan",
            "عَنْ أَبِي ثَعْلَبَةَ الخُشَنِيِّ جُرثُومِ بْنِ نَاشِرٍ رَضِيَ اللهُ عَنْهُ، عَنْ رَسُولِ اللهِ ﷺ قَالَ: «إِنَّ اللهَ فَرَضَ فَرَائِضَ فَلَا تُضَيِّعُوهَا، وَحَدَّ حُدُوْداً فَلَا تَعْتَدُوهَا وَحَرَّمَ أَشْيَاءَ فَلَا تَنْتَهِكُوهَا، وَسَكَتَ عَنْ أَشْيَاءَ رَحْمَةً لَكُمْ غَيْرَ نِسْيَانٍ فَلَا تَبْحَثُوا عَنْهَا» حِدِيْثٌ حَسَنٌ رَوَاهُ الدَّارَقُطْنِيُّ وَغَيْرُهُ.\n" +
                    "\n" +
                    "Dari Abu Tsa’labah Al-Khusyanni Jurtsum bin Nasyir radhiyallahu ‘anhu, dari Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Sesungguhnya Allah telah menetapkan beberapa kewajiban maka janganlah engkau menyepelekannya, dan Dia telah menentukan batasan-batasan maka janganlah engkau melanggarnya, dan Dia telah pula mengharamkan beberapa hal maka janganlah engkau jatuh ke dalamnya. Dia juga mendiamkan beberapa hal–karena kasih sayangnya kepada kalian bukannya lupa–, maka janganlah engkau membahasnya.” (Hadits hasan, HR. Ad-Daruquthni no. 4316 dan selainnya) [Hadits ini dikomentari oleh Syaikh ‘Abdul Muhsin, hadits ini sanadnya terputus. Namun hadits ini kata Ibnu Rajab punya penguat].\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "1. Hadits ini jadi dalil bahwa Allah mewajibkan sesuatu pada hamba. Setiap perintah adalah di tangan Allah.\n" +
                    "2. Syariat terbagi menjadi: faraidh (wajib), muharromaat (yang diharamkan), hudud (batasan), dan maskuut ‘anha (yang didiamkan).\n" +
                    "3. Allah menjadikan yang wajib itu jelas, yang haram itu jelas, batasan Allah juga jelas.\n" +
                    "4. Kita tidak boleh melampaui batasan Allah.\n" +
                    "5. Tidak boleh melampaui batas dalam masalah hukuman. Misalnya, pezina yang masih gadis dikenakan seratus kali cambukan, tidak boleh ditambah lebih daripada itu.\n" +
                    "6. Allah disifatkan dengan diam. Hal ini berarti Allah itu berbicara sekehendak Allah, dan tidak berbicara juga sekehendak-Nya.\n" +
                    "7. Allah mengharamkan sesuatu menunjukkan bahwa yang haram ini tidak boleh didekati. Kita bisa mengetahui sesuatu itu diharamkan dari dalil larangan, dalil yang tegas melarang, penyebutan hukuman di dalam dalil.\n" +
                    "8. Apa saja yang didiamkan oleh syariat, tidak diwajibkan, tidak disebutkan batasan, tidak dilarang, maka termasuk halal. Ini pembicaraannya dalam perkara non ibadah. Sedangkan untuk perkara ibadah tidak boleh membuat syariat selain yang Allah izinkan.\n" +
                    "9. Allah mendiamkan sesuatu dan itu bentuk rahmat bagi hamba.\n" +
                    "10. Ditetapkan sifat rahmat bagi Allah.\n" +
                    "11. Dinafikan sifat kekurangan bagi Allah seperti lupa (nisyan).\n" +
                    "12. Bagusnya penjelasan Nabi shallallahu ‘alaihi wa sallam dengan keterangan yang jelas dan pembagian yang mudah.\n" +
                    "\n",
            R.drawable.img_news30
        ),

        news(
            "Hadis 31 : Belajar menjadi orang zuhud",
            "عَنْ سَهْلٍ بْنِ سَعْدٍ السَّاعِدِيِّ رَضِيَ اللهُ عَنْهُ، قَالَ: جَاءَ رَجُلٌ إِلَى النَّبِيِّ ﷺ فَقَالَ: يَا رَسُولَ اللهِ: دُلَّنِي عَلَى عَمَلٍ إِذَا عَمِلْتُهُ أَحَبَّنِيَ اللهُ وَأَحَبَّنِيَ النَّاسُ؟ فَقَالَ: «اِزْهَدْ فِي الدُّنْيَا يُحِبَّكَ اللهُ، وَازْهَدْ فِيْمَا عِنْدَ النَّاسِ يُحِبَّكَ النَّاسُ» حَدِيْثٌ حَسَنٌ رَوَاهُ ابْنُ مَاجَهْ وَغَيْرُهُ بِأَسَانِيْدَ حَسَنَةٍ.\n" +
                    "\n" +
                    "Dari Sahl bin Sa’ad As-Sa’idi radhiyallahu ‘anhu berkata, “Ada seseorang datang kepada Nabi shallallahu ‘alaihi wa sallam lalu berkata, “Wahai Rasulullah, tunjukkanlah kepadaku suatu amal yang apabila aku lakukan, Allah mencintaiku dan manusia juga mencintaiku.” Beliau menjawab, “Zuhudlah di dunia, maka Allah akan mencintaimu. Begitu pula, zuhudlah dari apa yang ada di tangan manusia, maka manusia akan mencintaimu.” (Hadits hasan, diriwayatkan oleh Ibnu Majah dan selainnya dengan sanad hasan) [HR. Ibnu Majah, no. 4102. Syaikh Al-Albani dalam Silsilah Al-Ahadits Ash-Shahihah, no. 944 mengatakan bahwa hadits ini hasan].\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama:\n" +
                    "Sahabat Rasulullah shallallahu ‘alaihi wa sallam sangat tamak dalam melakukan setiap kebaikan. Mereka adalah manusia yang terdepan dalam melaksanakan kebaikan daripada yang lainnya. Para sahabat betul-betul ingin mengetahui suatu amalan yang dapat menyebabkan mereka mendapatkan kecintaan Allah dan kecintaan manusia. Oleh karena itu, mereka menanyakan hal ini kepada Rasulullah shallallahu ‘alaihi wa sallam.\n" +
                    "\n" +
                    "Kedua:\n" +
                    "Sabda Nabi shallallahu ‘alaihi wa sallam “Zuhudlah terhadap dunia, niscaya Allah akan mencintaimu” menunjukkan bahwa kecintaan Allah diperoleh dengan zuhud terhadap dunia. Definisi yang paling bagus, ‘zuhud terhadap dunia’ adalah seseorang meninggalkan sesuatu yang dapat melalaikannya dari mengingat Allah.\n" +
                    "Abu Sulaiman Ad-Daaraniy mengatakan, “Para ulama di Irak berselisih pendapat mengenai pengertian zuhud. Di antara mereka ada yang mengatakan bahwa zuhud adalah menjauh dari manusia. Ada pula yang mengatakan bahwa zuhud adalah meninggalkan berbagai nafsu syahwat. Ada juga yang mengatakan bahwa zuhud adalah tidak pernah kenyang. Semua definisi ini memiliki maksud yang sama.”\n" +
                    "Ad-Daaraniy cenderung pada pendapat, zuhud adalah meninggalkan sesuatu yang dapat melalaikan dari mengingat Allah ‘azza wa jalla. Definisi beliau ini sangatlah bagus. Karena definisi yang beliau ajukan telah mencakup makna dan macam-macam zuhud. Lihat Jaami’ Al-‘Ulum wa Al-Hikam, 2:186.\n" +
                    "\n" +
                    "Ketiga:\n" +
                    "Nabi shallallahu ‘alaihi wa sallam juga bersabda, “Zuhudlah pula terhadap apa yang ada pada manusia, niscaya manusia mencintaimu”. Manusia dikenal begitu tamak terhadap harta dan berbagai kesenangan di kehidupan dunia. Kebanyakan manusia sangat kikir untuk mengeluarkan hartanya dan enggan untuk berderma. Padahal Allah Ta’alaberfirman,\n" +
                    "فَاتَّقُوا اللَّهَ مَا اسْتَطَعْتُمْ وَاسْمَعُوا وَأَطِيعُوا وَأَنفِقُوا خَيْراً لِّأَنفُسِكُمْ وَمَن يُوقَ شُحَّ نَفْسِهِ فَأُوْلَئِكَ هُمُ الْمُفْلِحُونَ\n" +
                    "“Maka bertakwalah kamu kepada Allah menurut kesanggupanmu dan dengarlah serta ta’atlah dan nafkahkanlah nafkah yang baik untuk dirimu. Dan barangsiapa yang dipelihara dari kekikiran dirinya, maka mereka itulah orang-orang yang beruntung.” (QS. At-Taghaabun: 16)\n" +
                    "Seharusnya seseorang tidak terkagum-kagum dengan orang yang sangat tamak terhadap dunia dan menampakkan padanya. Jika seseorang merasa cukup dengan apa yang ada pada manusia, dia akan memperoleh kecintaan mereka dan manusia pun akan mencintainya. Jika sudah demikian, maka dia akan selamat dari kejelekan mereka.\n" +
                    "\n",
            R.drawable.img_news31
        ),

        news(
            "Hadis 32 : Tidak boleh memberikan mudarat baik sengaja atau tidak",
            "عَنْ أَبِي سَعِيْدٍ سَعْدِ بْنِ مَالِكِ بْنِ سِنَانٍ الخُدْرِيِّ رَضِيَ اللهُ عَنْهُ أَنَّ رَسُوْلَ اللهِ ﷺقَالَ: «لاَ ضَرَرَ وَلاَ ضِرَارَ»حَدِيْثٌ حَسَنٌ. رَوَاهُ ابْنُ مَاجَهْ وَالدَّارَقُطْنِيُّ وَغَيْرُهُمَا مُسْنَدًا، وَرَوَاهُ مَالِكٌ فِي المُوَطَّأِ مُرْسَلاً عَنْ عَمْرِو بْنِ يَحْيَى عَنْ أَبِيْهِ عَنِ النَّبِيِّ ﷺفَأَسْقَطَ أَبَا سَعِيْدٍ، وَلَهُ طُرُقٌ يُقَوِّي بَعْضُهَا بَعْضًا.\n" +
                    "\n" +
                    "Dari Abu Sa’id Sa’ad bin Malik bin Sinan Al-Khudri radhiyallahu ‘anhu bahwa Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Tidak boleh memberikan mudarat tanpa disengaja atau pun disengaja.” (Hadits hasan, HR. Ibnu Majah, no. 2340; Ad-Daraquthni no. 4540, dan selain keduanya dengan sanadnya, serta diriwayatkan pula oleh Malik dalam Al-Muwaththa’ no. 31 secara mursal dari Amr bin Yahya dari ayahnya dari Nabi shallallahu ‘alaihi wa sallam tanpa menyebutkan Abu Sa’id, tetapi ia memiliki banyak jalan periwayatan yang saling menguatkan satu sama lain) [Hadits ini disahihkan oleh Syaikh Al-Albani dalam Silsilah Al-Ahadits Ash-Shahihah, no. 250]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama:\n" +
                    "\n" +
                    "Islam mendorong untuk mengangkat mudarat dan dilarang memberikan mudarat pada orang lain. Mudarat bisa diberikan pada badan, harta, anak, hewan ternak, dan lainnya.\n" +
                    "\n" +
                    "Kedua:\n" +
                    "\n" +
                    "Hadits ini berisi kaedah syariat yaitu mengangkat dharar dan dhirar. Kalimat dalam hadits adalah dalam bentuk khabar nanti bermakna an-nahyu (larangan).\n" +
                    "\n" +
                    "Ketiga:\n" +
                    "Dharar dan dhirar ada yang berpendapat maknanya sama. Ada pendapat lain yang menyatakan maknanya berbeda.\n" +
                    "Dharar: memberi bahaya tanpa niatan, tanpa disengaja.\n" +
                    "Dhirar: memberi bahaya dengan niatan, disengaja.\n" +
                    "Kalau dharar saja dilarang, lebih-lebih lagi dhirar.\n" +
                    "\n" +
                    "Keempat:\n" +
                    "\n" +
                    "Hadits ini jadi rujukan dalam banyak bab, lebih-lebih dalam bahasan muamalah, seperti jual beli, gadai. Begitu juga hadits ini jadi dipakai dalam bab nikah di mana seorang suami tidak boleh memberikan mudarat pada istrinya. Juga dalam bab wasiat, seseorang tidak boleh memberikan yang nantinya memudaratkan ahli waris.\n" +
                    "\n" +
                    "Kelima:\n" +
                    "\n" +
                    "Dari hadits ini Syaikh Ibnu ‘Utsaimin rahimahullah memberikan kaedah:\n" +
                    "مَتَى ثَبَتَ الضَّرَرُ وَجَبَ رَفْعُهُ وَمَتَى ثَبَتَ الإِضْرَارُ وَجَبَ رَفْعُهُ مَعَ عُقُوْبَةِ قَاصِدِ الإِضْرَارِ\n" +
                    "“Jika ada dharar kapan pun itu, wajib dihilangkan. Kapan juga adanya dhirar (bahaya yang disengaja), wajib pula dihilangkan disertai adanya hukuman karena mudarat yang diberikan dengan sengaja.” (Syarh Al-Arba’in An-Nawawiyyah, hlm. 354)\n" +
                    "\n",
            R.drawable.img_news32
        ),

        news(
            "Hadis 33 : Yang menuduh harus datangkan bukti",
            "عَنِ ابْنِ عَبَّاسٍ رَضِيَ اللهُ عَنْهُمَا، أَنَّ رَسُولَ اللهِ ﷺ قَالَ: «لَوْ يُعْطَى النَّاسُ بِدَعْوَاهُمْ، لَادَّعَى رِجَالٌ أَمْوَالَ قَوْمٍ وَدِمَاءَهُمْ، وَلَكِنِ البَيِّنَةُ عَلَى المُدَّعِي، وَاليَمِيْنُ عَلَى مَنْ أَنْكَرَ» حَدِيْثٌ حَسَنٌ رَوَاهُ البَيْهَقِيُّ هَكَذَا، بَعْضُهُ فِي الصَّحِيْحَيْنِ.\n" +
                    "\n" +
                    "Dari Ibnu ‘Abbas radhiyallahu ‘anhuma bahwa Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Seandainya setiap manusia dipenuhi tuntutannya, niscaya orang-orang akan menuntut harta dan darah suatu kaum. Namun, penuntut wajib datangkan bukti dan yang mengingkari dituntut bersumpah.” (Hadits hasan, diriwayatkan oleh Al-Baihaqi seperti ini dan sebagiannya ada dalam Bukhari dan Muslim) [HR. Al-Baihaqi, no. 21201 dalam Al-Kubro seperti ini, sebagiannya diriwayatkan dalam Shahihain, yaitu Bukhari, no. 4552 dan Muslim, no. 1711].\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "1. Tidak boleh menghukumi orang lain dengan sekadar tuduhan karena bisa jadi kita mengambil harta dan darah orang lain tanpa jalan yang benar.\n" +
                    "2. Syariat melindungi harta dan darah dari tuntutan yang dusta, di mana syariat menyuruh untuk mendatangkan bukti bagi yang menuduh dan sumpah bagi yang mengingkari.\n" +
                    "3. Di antara bayyinaat (bukti) adalah adanya saksi, atau adanya indikasi, atau yang dituduh mengaku.\n" +
                    "4. Jika tidak ada bukti, yang tertuduh bersumpah agar terlepas dari hukuman. Jika yang tertuduh enggan bersumpah, ia berarti penakut dan ingin menghindarkan diri sehingga ia dihukum.\n" +
                    "5. Hadits ini bermanfaat sekali untuk masalah qadha’ (pemutusan hukum) dan untuk mendamaikan dua orang yang berselisih.\n" +
                    "\n",
            R.drawable.img_news33
        ),

        news(
            "Hadis 34 : Mengubah kemungkaran",
            "عَنْ أَبِي سَعِيْدٍ الخُدْرِيِّ رَضِيَ اللهُ عَنْهُ، قَالَ: سَمِعْتُ رَسُولَ اللهِ ﷺ يَقُوْلُ: «مَنْ رَأَى مِنْكُمْ مُنْكَراً فَلْيُغَيِّرْهُ بِيَدِهِ، فَإِنْ لَمْ يَستَطِعْ فَبِلِسَانِهِ، فَإِنْ لَمْ يَستَطِعْ فَبِقَلْبِهِ وَذَلِكَ أَضْعَفُ الإِيْمَانِ» رَوَاهُ مُسْلِمٌ.\n" +
                    "\n" +
                    "Dari Abu Sa’id Al-Khudri radhiyallahu ‘anhu, ia berkata, “Aku mendengar Rasulullah shallallahu ‘alaihi wa sallam bersabda, ‘Barangsiapa dari kalian melihat kemungkaran, ubahlah dengan tangannya. Jika tidak bisa, ubahlah dengan lisannya. Jika tidak bisa, ingkarilah dengan hatinya, dan itu merupakan selemah-lemahnya iman.” (HR. Muslim) [HR. Muslim, no. 49]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Pertama: Nabi shallallahu ‘alaihi wa sallam perintahkan siapa saja yang melihat kemungkaran untuk mengubahnya sesuai kemampuan.\n" +
                    "Ibnu Rajab Al-Hambali rahimahullah berkata, “Pengingkaran dengan lisan dan tangan wajib dilakukan dengan melihat pada kemampuan.” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:245)\n" +
                    "\n" +
                    "Kedua: Tidak boleh melarang kemungkaran sampai diyakini hal itu kemungkaran, di mana dilihat dari dua tinjauan:\n" +
                    "(1) perbuatan yang dilakukan diyakini mungkar,\n" +
                    "(2) perbuatan tersebut dianggap sebagai kemungkaran oleh pelaku. Karena ada sesuatu termasuk kemungkaran, namun pelaku tidak memasukkannya sebagai kemungkaran.\n" +
                    "Contoh: Makan dan minum siang hari bulan Ramadhan adalah kemungkaran. Namun ada orang yang sakit boleh saja dia makan, atau ia termasuk musafir boleh saja ia tidak berpuasa.\n" +
                    "\n" +
                    "Ketiga: Kemungkaran harus dinilai sebagai kemungkaran oleh yang mengingkari dan pelaku yang diingkari. Jika perkara yang diingkari adalah perkara khilafiyah (masih ada beda pendapat), tidak ada pelarangan kemungkaran pada orang yang mengira bahwa hal itu tidak termasuk kemungkaran.\n" +
                    "Contoh: Kita melihat ada seseorang yang memakan daging unta, setelah itu ia langsung shalat. Yang ia lakukan tidak perlu diingkari. Masalah ini masuk dalam perkara silang pendapat. Sebagian ulama menyatakan, wajib berwudhu ketika memakan daging unta. Sebagian ulama mengatakan tidaklah wajib berwudhu. Namun, jika ingin membahas hal ini dan ingin menjelaskan kebenaran, tidaklah masalah.\n" +
                    "\n" +
                    "Keempat: Apakah mengubah dengan tangan dilakukan untuk setiap keadaan? Jawabannya, tidak. Jika ada masalah, kita tidak perlu melarang kemungkaran dengan tangan. Kerusakan yang besar bisa saja terhindar, caranya dengan menerjang kerusakan yang lebih ringan.\n" +
                    "\n" +
                    "Kelima: Tangan adalah aalatul fi’li (organ untuk berbuat) sehingga disebutkan dalam hadits ubahlah dengan tangan. Oleh karena itu, perbuatan seseorang disandarkan pada tangannya seperti ayat,\n" +
                    "وَمَا أَصَابَكُمْ مِنْ مُصِيبَةٍ فَبِمَا كَسَبَتْ أَيْدِيكُمْ\n" +
                    "“Dan apa saja musibah yang menimpa kamu maka adalah disebabkan oleh perbuatan tanganmu sendiri.” (QS. Asy-Syura: 30)\n" +
                    "\n" +
                    "Keenam: Ajaran Islam itu tidak ada kesulitan. Kewajiban itu tetap melihat pada kemampuan seseorang (istitha’ah).\n" +
                    "\n" +
                    "Ketujuh: Jika seseorang tidak mampu mengubah kemungkaran dengan tangan, ia mengubahnya dengan lisan. Jika tidak bisa dengan lisan, ia mengubahnya dengan hati. Bentuk mengubah dengan hati adalah tidak suka dan bertekad saat memiliki kemampuan akan mengubahnya dengan lisan atau dengan tangan.\n" +
                    "Ulama lain menyebutkan bahwa mengingkari kemungkaran dalam hati dengan cara:\n" +
                    "Benci akan kemungkaran tersebut.\n" +
                    "Berpindah dari tempat kemungkaran tadi.\n" +
                    "Ibnu Rajab Al-Hambali rahimahullah mengatakan, “Pengingkaran suatu kemungkaran dengan hati adalah wajib bagi setiap muslim dalam segala keadaan. Adapun pengingkaran dengan tangan dan lisan dipandang dari kemampuan.” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:246)\n" +
                    "\n" +
                    "Kedelapan: Hati juga memiliki amalan. Hadits di atas menyebutkan, ubahlah dengan tangan, selanjutnya menyebutkan ubahlah dengan hati.\n" +
                    "\n" +
                    "Kesembilan: Iman itu terdiri dari amal dan niat. Nabi shallallahu ‘alaihi wa sallam menjadikan dalam mengubah kemungkaran ada amal dan niat. Mengubah kemungkaran dengan tangan termasuk amal. Mengubah kemungkaran dengan lisan termasuk amal. Mengubah kemungkaran dengan hati termasuk dalam niat.\n" +
                    "\n" +
                    "Kesepuluh: Kemungkaran diingatkan dengan cara yang halus dan lemah lembut. Sufyan Ats-Tsauri mengatakan,\n" +
                    "\n" +
                    "لاَ يَأْمُرُ بِالمَعْرُوْفِ وَيَنْهَى عَنِ المُنْكَرِ إِلاَّ مَنْ كَانَ فِيْهِ خِصَالٌ ثَلاَثٌ : رَفِيقٌ بِمَا يَأْمُرُ ، رَفِيْقٌ بِمَا يَنْهَى ، عَدْلٌ بِمَا يَأْمُرُ ، عَدْلٌ بِمَا يَنْهَى ، عَالِمٌ بِماَ يَأْمُرُ ، عَالِمٌ بِمَا يَنْهَى\n" +
                    "“Hendaklah memerintah pada yang makruf dan melarang dari kemungkaran dengan tiga hal:\n" +
                    "Lemah lembut ketika memerintahkan yang makruf dan melarang yang mungkar.\n" +
                    "Bersikap adil ketika memerintah dan melarang.\n" +
                    "Berilmu pada apa yang akan diperintahkan dan yang akan dilarang.” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:256)\n" +
                    "Ibnu Rajab Al-Hambali menyebutkan perkataan Imam Ahmad berikut ini,\n" +
                    "\n" +
                    "وقال أحمد : النّاسُ محتاجون إلى مداراة ورفق الأمر بالمعروف بلا غِلظةٍ إلا رجل معلن بالفسق ، فلا حُرمَةَ له ، قال : وكان أصحابُ ابن مسعود إذا مرُّوا بقومٍ يرون منهم ما يكرهونَ ، يقولون : مهلاً رحمكم الله ، مهلاً رحمكم الله .\n" +
                    "\n" +
                    "“Imam Ahmad berkata, ‘Manusia itu membutuhkan sikap lemah lembut (mudaaroh) dan lemah lembut ketika diingatkan pada kebaikan dan kemungkaran. Hal yang dikecualikan adalah orang yang terang-terangan dalam kefasikan, maka ia tidak dimuliakan. Para murid Ibnu Mas’ud jika melewati sekelompok orang yang mereka pandang sedang berbuat jelek, mereka mengatakan, ‘Tak perlu tergesa-gesa, tak perlu tergesa-gesa, semoga Allah merahmati kalian.’” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:256)\n" +
                    "Dilanjutkan oleh Imam Ibnu Rajab, Imam Ahmad rahimahullah berkata,\n" +
                    "\n" +
                    "يأمر بالرِّفقِ والخضوع ، فإن أسمعوه ما يكره ، لا يغضب ، فيكون يريدُ ينتصرُ لنفسه .\n" +
                    "\n" +
                    "“Perintah lemah lembut dan halus tetap ada walaupun sedang mendengar kemungkaran yang tidak disukai. Saat itu, janganlah dahulukan emosi. Itulah orang yang disebut meraih kemenangan pada momen tersebut.” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:256)\n" +
                    "\n" +
                    "\n" +
                    "Kaedah dari hadits\n" +
                    "1. Mengingkari kemungkaran itu sama dengan menasihati, bukan menjelekkan.\n" +
                    "2. Mengingkari kemungkaran itu berdasarkan apa yang dilihat, bukan dari tajassus (mencari-cari aib orang beriman).\n" +
                    "3. Hendaklah mengajak yang baik dengan cara yang baik dan tidak mengingkari kemungkaran dengan cara yang mungkar.\n" +
                    "4. Masalah khilafiyah tidak diingkari dengan meninjau:\n" +
                    "khilafnya kuat; sehingga tidak boleh mengatakan pada yang berbeda dengan kita sebagai orang yang menyelisihi sunnah.\n" +
                    "orang yang kita kira terjatuh dalam kemungkaran menganggapnya masih boleh.\n" +
                    "Walhamdulillah, penuh faedah dari hadits Nabi shallallahu ‘alaihi wa sallam yang luar biasa. Moga kita semakin bijak dalam berdakwah dan amar makruf nahi mungkar.\n" +
                    "\n",
            R.drawable.img_news34
        ),

        news(
            "Hadis 35 : Kita itu bersaudara",
            "عَنْ أَبِي هُرَيْرَةَ رَضِيَ اللهُ عَنْهُ، قَالَ: قَالَ رَسُولُ اللهِ ﷺ: «لاَ تَحَاسَدُوا، وَلاَتَنَاجَشُوا، وَلاَ تَبَاغَضُوا، وَلاَ تَدَابَرُوا، وَلاَ يَبِعْ بَعْضُكُمْ عَلَى بَيْعِ بَعْضٍ، وَكُوْنُوا عِبَادَ اللهِ إِخوَاناً. المُسْلِمُ أَخُو المُسْلِمِ، لاَ يَظْلِمُهُ، وَلاَ يَخذُلُهُ، وَلَا يَكْذِبُهُ، وَلَايَحْقِرُهُ. التَّقْوَى هَاهُنَا -وَيُشِيْرُ إِلَى صَدْرِهِ ثَلاَثَ مَرَّاتٍ- بِحَسْبِ امْرِىءٍ مِنَ الشَّرِّ أَنْ يَحْقِرَ أَخَاهُ المُسْلِمَ. كُلُّ المُسْلِمِ عَلَى المُسْلِمِ حَرَامٌ: دَمُهُ وَمَالُهُ وَعِرْضُهُ» رَوَاهُ مُسْلِمٌ.\n" +
                    "\n" +
                    "Dari Abu Hurairah radhiyallahu ‘anhu, ia berkata, Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Janganlah kalian saling mendengki, janganlah saling tanajusy (menyakiti dalam jual beli), janganlah saling benci, janganlah saling membelakangi (mendiamkan), dan janganlah menjual di atas jualan saudaranya. Jadilah hamba Allah yang bersaudara. Seorang muslim adalah saudara untuk muslim lainnya. Karenanya, ia tidak boleh berbuat zalim, menelantarkan, berdusta, dan menghina yang lain. Takwa itu di sini–beliau memberi isyarat ke dadanya tiga kali–. Cukuplah seseorang berdosa jika ia menghina saudaranya yang muslim. Setiap muslim atas muslim lainnya itu haram darahnya, hartanya, dan kehormatannya.’” (HR. Muslim) [HR. Muslim no. 2564]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "1. Islam mengajarkan untuk menjalin ukhuwah (persaudaraan).\n" +
                    "2. Islam melarang hasad (walaupun hanya dari satu pihak saja), najsy (menaikkan harga barang lalu memudaratkan penjual atau memberikan manfaat pada pembeli), saling benci, saling membelakangi (mendiamkan), menjual di atas jualan saudaranya, menzalimi, enggan menolong (menelantarkan), merendahkan, mengabarkan berita bohong, merampas harta, darah, hingga kehormatan orang lain.\n" +
                    "3. Hadits ini menganjurkan kaum muslimin untuk saling mencintai. Hadits menyebutkan larangan saling membenci, itulah mantuqnya (tekstualnya). Sebaliknya (secara mafhum), kita dianjurkan untuk saling mencintai.\n" +
                    "4. Larangan menjual di atas jualan saudaranya berlaku saat khiyar dan bakda khiyar. Khiyar adalah memilih untuk melanjutkan atau membatalkan jual beli.\n" +
                    "5. Wajib mewujudkan persaudaraan seiman. Bentuk mewujudkan persaudaraan adalah dengan saling memberi hadiah, berkumpul dalam ibadah secara berjemaah seperti dalam shalat lima waktu, shalat Jumat, dan shalat id.\n" +
                    "6. Setelah Nabi shallallahu ‘alaihi wa sallam menjelaskan bahwa sesama muslim itu bersaudara, beliau menjelaskan pula bagaimana seharusnya seorang muslim pada saudaranya.\n" +
                    "7. Ajaran Islam datang untuk menjaga atau menyelamatkan darah, harta, dan kehormatan.\n" +
                    "8. Tidak boleh menjatuhkan kehormatan seorang muslim. Kita tidak boleh mengghibah yang lainnya. Nabi shallallahu ‘alaihi wa sallam menafsirkan tentang ghibah dengan membicarakan aib suadara kita di saat ia gaib. Bila ia hadir, membicarakan kejelekannya disebut dengan mencela, bukan lagi ghibah.\n" +
                    "9. Tidak boleh menelantarkan sesama muslim, berarti kita diperintahkan untuk menolong mereka. Bahkan kita diperintahkan menolong orang yang dizalimi dan juga menolong orang yang berbuat zalim. Dalam hadits Anas bin Malik radhiyallahu ‘anhu, Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "انْصُرْ أخاكَ ظالِمًا أوْ مَظْلُومًا فقالَ رَجُلٌ: يا رَسولَ اللَّهِ، أنْصُرُهُ إذا كانَ مَظْلُومًا، أفَرَأَيْتَ إذا كانَ ظالِمًا كيفَ أنْصُرُهُ؟ قالَ: تَحْجُزُهُ، أوْ تَمْنَعُهُ، مِنَ الظُّلْمِ فإنَّ ذلكَ نَصْرُهُ.\n" +
                    "\n" +
                    "“Tolonglah saudaramu yang berbuat zalim atau yang dizalimi.” Ada seseorang yang berkata, “Wahai Rasulullah, aku tolong menolongnya jika ia dizalimi. Terus pendapatmu jika ia adalah orang zalim, bagaimana aku bisa menolongnya?” Beliau bersabda, “Engkau mencegah atau menghalanginya dari tindakan zalim, berarti engkau telah menolongnya.” (HR. Bukhari, no. 2444, 6952)\n" +
                    "\n" +
                    "Kita wajib bersikap jujur, tidak boleh berdusta. Berdusta itu haram walaupun pada orang kafir.\n" +
                    "Tidak boleh merendahkan muslim yang lain walau dia itu fakir dan miskin. Kita harus memuliakan dan menghormati muslim lainnya.\n" +
                    "\n",
            R.drawable.img_news35
        ),


        news(
            "Hadis 36 : Rajin menolong (ringan tangan)",
            "عَنْ أَبِي هُرَيْرَةَ رَضِيَ اللهُ عَنْهُ، عَنِ النَّبِيِّ ﷺ قَالَ: «مَنْ نَفَّسَ عَنْ مُؤْمِنٍ كُرْبَةً مِنْ كُرَبِ الدُّنْيَا، نَفَّسَ اللهُ عَنهُ كُرْبَةً مِنْ كُرَبِ يَوْمِ القِيَامَةِ. وَمَنْ يَسَّرَ عَلَى مُعْسِرٍ، يَسَّرَ اللهُ عَلَيْهِ فِي الدُّنْيَا وَالآخِرَةِ. وَمَنْ سَتَرَ مُسْلِماً سَتَرَهُ اللهُ فِي الدُّنْيَا وَالآخِرَةِ. وَاللهُ في عَوْنِ العَبْدِ مَا كَانَ العَبْدُ فِي عَوْنِ أَخِيْهِ.\n" +
                    "\n" +
                    "وَمَنْ سَلَكَ طَرِيْقاً يَلْتَمِسُ فِيْهِ عِلْماً سَهَّلَ اللهُ لَهُ بِهِ طَرِيْقاً إِلَى الجَنَّةِ.\n" +
                    "\n" +
                    "وَمَا اجْتَمَعَ قَوْمٌ فِي بَيْتٍ مِنْ بُيُوْتِ اللهِ يَتْلُوْنَ كِتَابَ اللهِ وَيَتَدَارَسُوْنَهُ بَيْنَهُمْ إِلَّا نَزَلَتْ عَلَيْهِمُ السَّكِيْنَةُ، وَغَشِيَتْهُمُ الرَّحْمَةُ، وَحَفَّتْهُمُ الْمَلَائِكَةُ، وَذَكَرَهُمُ اللهُ فِيْمَنْ عِنْدَهُ، وَمَنْ بَطَّأَ بِهِ عَمَلُهُ لَمْ يُسْرِعْ بهِ نَسَبُهُ» رَوَاهُ مُسْلِمٌ بِهَذَا اللَّفْظِ.\n" +
                    "\n" +
                    "Dari Abu Hurairah radhiyallahu ‘anhu, dari Nabi shallallahu ‘alaihi wa sallam bersabda, “Barangsiapa yang menghilangkan kesusahan dari kesusahan-kesusahan dunia orang mukmin, maka Allah akan menghilangkan kesusahan dari kesusahan-kesusahan hari kiamat. Barangsiapa yang memberi kemudahan orang yang kesulitan (utang), maka Allah akan memberi kemudahan baginya di dunia dan akhirat. Siapa yang menutup aib seorang muslim, maka Allah akan menutup aibnya di dunia dan di akhirat. Siapa saja yang menolong saudaranya, maka Allah akan menolongnya sebagaimana ia menolong saudaraya. Barangsiapa yang menempuh perjalanan dalam rangka menuntut ilmu, maka Allah akan mudahkan baginya jalan menuju surga. Tidaklah berkumpul sekelompok orang di salah satu rumah Allah (masjid) untuk membaca Kitabullah dan saling mempelajarinya di antara mereka, melainkan akan turun kepada mereka ketenangan, rahmat meliputinya, para malaikat mengelilinginya, dan Allah menyanjung namanya kepada Malaikat yang ada di sisi-Nya. Barangsiapa yang lambat amalnya, maka tidak akan bisa dikejar oleh nasabnya (garis keturunannya yang mulia).” (HR. Muslim dengan lafal ini) [HR. Muslim, no. 2699]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Keutamaan tiga hal: naffasa, yassara, sataro (melapangkan, memudahkan, menutup aib).\n" +
                    "Hari kiamat terdapat kesulitan yang luar biasa.\n" +
                    "Menutup aib seorang muslim itu dirinci:\n" +
                    "– Bisa jadi menutupinya itu baik jika yang ditutupi adalah aib dari seseorang yang agamanya baik. Ia melakukan kesalahan lantas menyesalinya, maka menutupi aibnya itu terpuji dan baik.\n" +
                    "– Bisa jadi menutupinya itu jelek jika yang ditutupi adalah aib dari orang yang gemar bermaksiat atau ia berbuat zalim pada yang lain dan akan terus membuatnya semakin rusak. Menutupi aib dalam kondisi seperti ini tercela. Aibnya bisa saja diungkap dan diberitahukan pada orang yang bisa mendidiknya. Misalnya, yang punya aib adalah seorang istri, berarti dilaporkan pada suaminya. Misal lainnya, yang punya aib adalah seorang anak, berarti dilaporkan pada bapaknya. Atau contoh lainnya, yang melakukan aib adalah seorang gurum ia dilaporkan pada kepala sekolah.\n" +
                    "– Bisa jadi menutupinya tidak diketahui baik ataukah jelek, kondisi seperti ini menutupinya lebih baik. Kaedah yang berlaku dalam hal ini adalah hadits ‘Aisyah,\n" +
                    "فَإِنَّ الإِمَامَ أَنْ يُخْطِئَ فِى الْعَفْوِ خَيْرٌ مِنْ أَنْ يُخْطِئَ فِى الْعُقُوبَةِ.\n" +
                    "“Jika imam itu salah dalam memberikan maaf, itu lebih baik, daripada ia salah dalam memberikan hukuman.” (HR. Tirmidzi, no. 1424 dan Al-Baihaqi, 8:238. Al-Hafizh Abu Thahir mengatakan bahwa hadits ini dhaif). Namun, makna hadits ini benar adanya sehingga dipakai sebagai kaedah oleh Syaikh Ibnu ‘Utsaimin sebagaimana dalam Syarh Al-Arba’in An-Nawawiyah, hlm. 390-391.\n" +
                    "Menolong orang lain adalah jalan mendapatkan pertolongan Allah. Namun, kalau menolong dalam dosa, berarti dihukumi haram.\n" +
                    "Keutamaan menuntut ilmu syari, menuntut ilmu adalah jalan mudah menuju surga.\n" +
                    "Hendaklah bersegera dalam mencari ilmu dengan kesungguhan dan kerja keras karena semua orang ingin masuk surga dengan cara yang paling ringkas. Kalau menuntut ilmu adalah jalan ringkas menuju surga, kita harus sungguh-sungguh menempuhnya.\n" +
                    "Keutamaan majelis dzikir (majelis ilmu) yang berada di rumah Allah (masjid) dan keutamaan saling mengkaji Al-Qur’an yaitu mendapatkan ketenangan, dinaungi rahmat, dikelilingi malaikat, dan disanjung oleh Allah di hadapan makhluk-Nya yang lebih mulia.\n" +
                    "Membaca Al-Qur’an dengan berkumpul itu ada tiga bentuk:\n" +
                    "– Membaca bersama-sama dengan satu suara, kalau dalam rangka pengajaran, tidaklah masalah. Seperti pengajar membaca ayat, lalu murid-muridnya mengikuti dan membaca bersama-sama.\n" +
                    "– Membaca Al-Qur’an dengan cara yang satu membaca dan yang lainnya diam, kemudian saling bergiliran untuk membaca, seperti ini tidaklah masalah.\n" +
                    "– Membaca Al-Qur’an dengan cara masing-masing membaca untuk dirinya, yang lain tidak menyimak atau memerhatikan, seperti ini yang kita lihat di masjid-masjid.\n" +
                    "Sebaik-baik tempat adalah masjid.\n" +
                    "Rasulullah shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "أَحَبُّ الْبِلاَدِ إِلَى اللَّهِ مَسَاجِدُهَا وَأَبْغَضُ الْبِلاَدِ إِلَى اللَّهِ أَسْوَاقُهَا.\n" +
                    "“Tempat yang paling dicintai Allah adalah masjid dan tempat yang paling dibenci Allah adalah pasar.” (HR. Muslim, no. 671, dari Abu Hurairah radhiyallahu ‘anhu)\n" +
                    "Nasab tidaklah bermanfaat di akhirat. Karena kita dinilai dengan amalan, bukan dengan nasab. Janganlah seseorang tertipu dengan nasabnya yang mulia.\n" +
                    "Keutamaan bersaudara dalam Islam.\n" +
                    "\n",
            R.drawable.img_news36
        ),

        news(
            "Hadis 37 : Berniat baik dan jelek tapi tidak terlaksana",
            "عَنِ ابْنِ عَبَّاسٍ رَضِيَ اللهُ عَنْهُمَا، عَنِ النَّبِيِّ ﷺ -فِيْمَا يَرْوِي عَنْ رَبِّهِ تَبَارَكَ وَتَعَالَى-، قَالَ: «إِنَّ اللهَ كَتَبَ الحَسَنَاتِ وَالسَّيئَاتِ، ثُمَّ بَيَّنَ ذَلِكَ: فَمَنْ هَمَّ بِحَسَنَةٍ فَلَمْ يَعْمَلْهَا كَتَبَهَا اللهُ عِنْدَهُ حَسَنَةً كَامِلَةً، وَإِنْ هَمَّ بِهَا فَعَمِلَهَا كَتَبَهَا اللهُ عِنْدَهُ عَشْرَ حَسَنَاتٍ إِلَى سَبْعِمِائَةِ ضِعْفٍ إِلَى أَضْعَافٍ كَثِيْرَةٍ.\n" +
                    "\n" +
                    "وَإِنْ هَمَّ بِسَيِّئَةٍ فَلَمْ يَعْمَلْهَا كَتَبَهَا اللهُ عِنْدَهُ حَسَنَةً كَامِلَةً، وَإِنْ هَمَّ بِهَا فَعَمِلَهَا كَتَبَهَا اللهُ سَيِّئَةً وَاحِدَةً» رَوَاهُ البُخَارِيُّ وَمُسْلِمٌ فِي صَحِيْحَيْهِمَا بِهَذِهِ الحُرُوْفِ.\n" +
                    "\n" +
                    "Dari Ibnu ‘Abbas radhiyallahu ‘anhuma, dari Rasulullah shallallahu ‘alaihi wa sallam tentang hadits yang beliau riwayatkan dari Rabb-nya Tabaraka wa Ta’ala. Beliau bersabda, “Sesungguhnya Allah menulis kebaikan-kebaikan dan keburukan-keburukan kemudian menjelaskannya. Barangsiapa yang berniat melakukan kebaikan lalu tidak mengerjakannya, maka Allah menulis itu di sisi-Nya sebagai satu kebaikan yang sempurna, dan jika dia berniat mengerjakan kebaikan lalu mengerjakannya, maka Allah menulis itu di sisi-Nya sebagai sepuluh kebaikan hingga tujuh ratus lipat hingga perlipatan yang banyak. Jika dia berniat melakukan keburukan lalu tidak jadi mengerjakannya, maka Allah menulis itu di sisi-Nya sebagai satu kebaikan yang sempurna, dan jika dia berniat melakukan keburukan lalu mengerjakannya, maka Allah menulis itu sebagai satu keburukan.” (HR. Bukhari, no. 6491 dan Muslim, no. 131 di kitab sahih keduanya dengan lafaz ini).\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "Kebaikan itu ada empat tingkatan:\n" +
                    "– berniat melakukan kebaikan dan mengamalkannya, akan mendapatkan satu kebaikan sempurna hingga sepuluh kebaikan hingga 700 kali lipat.\n" +
                    "– berniat melakukan kebaikan dan tidak mengamalkannya karena tidak mampu (‘ajez), maka dapat pahala satu kebaikan yang sempurna.\n" +
                    "– ada yang sudah punya kebiasaan pada kebaikan lalu ia meninggalkannya karena ada uzur (karena sakit atau safar), ia tetap dicatat pahala yang sempurna.\n" +
                    "– jika ia berniat (bertekad) namun tidak mengamalkannya dan diakhirkan (diundur), bukan karena ‘ajez (tidak mampu) dan bukan karena uzur, Allah catat baginya satu kebaikan yang sempurna.\n" +
                    "Kejelekan itu ada empat tingkatan:\n" +
                    "– berniat melakukan kejelekan dan mengamalkannya, maka dicatat satu kejelekan.\n" +
                    "– berniat melakukan kejelekan dan akhirnya meninggalkannya karena takut kepada Allah, maka dicatat baginya satu kebaikan yang sempurna.\n" +
                    "–  berniat melakukan kejelekan dan meninggalkannya karena tidak mampu (‘ajez), maka dicatat baginya satu kejelekan.\n" +
                    "– berniat melakukan kejelekan dan meninggalkannya bukan karena takut kepada Allah, bukan karena ‘ajez (tidak mampu), maka tidak dicatat baginya apa pun.\n" +
                    "Rahmat Allah bagi hamba-Nya berlipat-lipat untuk kebaikan.\n" +
                    "Baiknya pengajaran Nabi shallallahu ‘alaihi wa sallam dengan menyebut sesuatu secara mujmal (global), lalu dirinci, innallaha katabal hasanaati was sayyiaati.\n" +
                    "Berlipat-lipatnya pahala kebaikan. Asalnya, kebaikan dibalas dengan minimal sepuluh kebaikan yang semisal. Pahala tadi bisa berlipat hingga 700 kali lipat, hingga berlipat-lipat lebih dari itu. Pahala itu bisa berlipat-lipat karena beberapa sebab:\n" +
                    "– waktu\n" +
                    "– tempat\n" +
                    "– jenis amal, amalan wajib ataukah sunnah\n" +
                    "– pelaku amal\n" +
                    "Kejelekan yang dimaksudkan dalam hadits di antaranya adalah dosa besar dan dosa kecil. Sebagaimana kebaikan yang dimaksudkan dalam hadits adalah amalan wajib dan sunnah.\n" +
                    "Kejelekan dibalas satu kejelekan. Ishaq bin Manshur mengatakan bahwa ia berkata kepada Imam Ahmad, “Manakah hadits yang menyebutkan kejelekan dicatat dengan dibalas lebih dari satu?” Imam Ahmad menjawab, “Tidak ada. Yang pernah kami dengar hanyalah di Makkah, karena keagungan negeri Makkah.” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:318)\n" +
                    "\n",
            R.drawable.img_news37
        ),


        news(
            "Hadis 38 : Menjadi wali dengan amalan wajib dan sunnah",
            "عَنْ أَبِي هُرَيْرَةَ رَضِيَ اللهُ عَنْهُ، قَالَ: قَالَ رَسُولُ اللهِ ﷺ : «إِنَّ اللهَ تَعَالَى قَالَ: مَنْ عَادَى لِي وَلِيّاً فَقَدْ آذَنْتُهُ بِالحَرْبِ. وَمَا تَقَرَّبَ إِلَيَّ عَبْدِيْ بِشَيْءٍ أَحَبَّ إِلَيَّ مِمَّا افْتَرَضْتُ عَلَيْهِ. وَمَا يَزَالُ عَبْدِيْ يَتَقَرَّبُ إِلَيَّ بِالنَّوَافِلِ حَتَّى أُحِبَّهُ، فَإِذَا أَحْبَبْتُهُ كُنْتُ سَمْعَهُ الَّذِي يَسْمَعُ بِهِ، وَبَصَرَهُ الَّذِي يُبْصِرُ بِهِ، وَيَدَهُ الَّتِي يَبْطِشُ بِهَا، وَرِجْلَهُ الَّتِي يَمْشِي بِهَا. وَلَئِنْ سَأَلَنِي لَأُعْطِيَنَّهُ، وَلَئِنْ اسْتَعَاذَنِي لَأُعِيْذَنَّهُ» رَوَاهُ البُخَارِيُّ.\n" +
                    "\n" +
                    "Dari Abu Hurairah radhiyallahu ‘anhu berkata, Rasulullah shallallahu ‘slaihi wa sallam bersabda, “Sesungguhnya Allah Ta’ala berfirman, ‘Barangsiapa yang menyakiti waliku, maka Aku mengumumkan perang kepadanya. Tidaklah hamba-Ku mendekat kepada-Ku dengan sesuatu yang paling Aku cintai selain apa yang Aku wajibkan baginya. Hamba-Ku senantiasa mendekat diri kepada-Ku dengan amalan sunnah sehingga Aku mencintainya. Apabila aku telah mencintainya, Aku menjadi pendengarannya yang ia gunakan untuk mendengar, penglihatannya yang ia gunakan untuk melihat, tangannya yang ia gunakan untuk berbuat, dan kakinya yang ia gunakan untuk berjalan. Jika dia meminta kepadaku, pasti aku beri. Jika dia meminta perlindungan kepada-Ku pasti aku lindungi.’” (HR. Bukhari) [HR. Bukhari, no. 6502]\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "1. Memusuhi wali Allah termasuk dosa besar.\n" +
                    "2. Wali Allah itu ada dan tidak bisa diingkari.\n" +
                    "3. Adanya peperangan dari dan terhadap Allah Ta’ala.\n" +
                    "4. Hadits ini jadi dalil keutamaan wali Allah.\n" +
                    "5. Adanya karamah wali, karena siapa saja yang memusuhi wali Allah, Allah mengumumkan perang terhadapnya.\n" +
                    "6. Allah memiliki sifat cinta, dan cinta Allah itu bertingkat-tingkat.\n" +
                    "7. Amal saleh merupakan sarana untuk mendekatkan diri kepada Allah.\n" +
                    "8. Perintah Allah berupa amalan wajib dan amalan sunnah.\n" +
                    "9. Amalan itu bertingkat-tingkat.\n" +
                    "10. Yang Allah cintai adalah amalan wajib, kemudian amalan sunnah.\n" +
                    "11. Yang mesti didahulukan adalah amalan wajib, kemudian amalan sunnah, inilah asalnya.\n" +
                    "12. Ibnu Rajab rahimahullah berkata, “Ketahuilah bahwa semua bentuk maksiat berarti menyatakan perang kepada Allah ‘azza wa jalla.” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:335)\n" +
                    "13. Ibnu Rajab rahimahullah berkata, “Kewajiban badan yang paling agung adalah menunaikan shalat.” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:336).\n" +
                    "14. Ibnu Rajab rahimahullah berkata, “Amalan sunnah yang paling mendekatkan diri kepada Allah adalah memperbanyak membaca, mendengarkan, merenungkan, dan memahami Al-Qur’an.” (Jaami’ Al-‘Ulum wa Al-Hikam, 1:342).\n" +
                    "Manfaat amalan sunnah:\n" +
                    "- mendapatkan cinta Allah\n" +
                    "- mendapatkan ma’iyatullah (pertolongan Allah pada pendengaran, penglihatan, tangan, dan kaki)\n" +
                    "- doanya mudah dikabulkan.\n" +
                    "\n",
            R.drawable.img_news38
        ),

        news(
            "Hadis 39 : Tidak sengaja, lupa, dipaksa berarti terkena dosa",
            "عَنِ ابْنِ عَبَّاسٍ رَضِيَ اللهُ عَنْهُمَا، أَنَّ رَسُولَ اللهِ ﷺ قَال: «إِنَّ اللهَ تَجَاوَزَ لِي عَنْ أُمَّتِي: الخَطَأَ وَالنِّسْيَانَ وَمَا اسْتُكْرِهُوا عَلَيْهِ» حَدِيْثٌ حَسَنٌ رَوَاهُ ابْنُ مَاجَهْ وَالبَيْهَقِيُّ وَغَيْرُهُمَا.\n" +
                    "\n" +
                    "Dari Ibnu ‘Abbas radhiyallahu ‘anhuma bahwa Rasulullah shallallahu ‘alaihi wa sallam bersabda, “Sesungguhnya Allah memaafkan umatku ketika ia tidak sengaja, lupa, dan dipa\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "1. Luasnya rahmat Allah pada hamba-Nya.\n" +
                    "2. Allah memaafkan hamba ketika keliru, lupa, atau dipaksa.\n" +
                    "3. Pemaafan dan kemudahan adalah kekhususan umat ini.\n" +
                    "4. Syariat datang untuk mengangkat kesulitan. Maka konsekuensinya, dosa diangkat dari orang yang tidak berniat yaitu saat keliru, lupa, atau dipaksa.\n" +
                    "\n",
            R.drawable.img_news39
        ),

        news(
            "Hadis 40 : Hidup di dunia hanya sebentar",
            "عَنِ ابْنِ عُمَرَ رَضِيَ اللهُ عَنْهُمَا، قَالَ: أَخَذَ رَسُولُ اللهِ ﷺ بِمَنْكِبَيَّ، فَقَالَ: «كُنْ فِي الدُّنْيَا كَأَنَّكَ غَرِيْبٌ أَوْ عَابِرُ سَبِيْلٍ»\n" +
                    "\n" +
                    "وَكَانَ ابْنُ عُمَرَ رَضِيَ اللهُ عَنْهُمَا يَقُوْلُ: إِذَا أَمْسَيْتَ فَلَا تَنْتَظِرِ الصَّبَاحَ، وَإِذَا أَصْبَحْتَ فَلَا تَنْتَظِرِ المَسَاءَ. وَخُذْ مِنْ صِحَّتِكَ لِمَرَضِكَ، وَمِنْ حَيَاتِكَ لِمَوْتِكَ. رَوَاهُ البُخَارِيُّ.\n" +
                    "\n" +
                    "Dari Ibnu ‘Umar radhiyallahu ‘anhuma berkata: Rasulullah shallallahu ‘alaihi wa sallam memegang kedua pundakku, lalu bersabda, “Jadilah engkau di dunia seperti orang asing atau seorang musafir.”\n" +
                    "\n" +
                    "Ibnu ‘Umar radhiyallahu ‘anhuma berkata, “Jika kamu memasuki sore hari, maka jangan menunggu pagi hari. Jika kamu memasuki pagi hari, maka jangan menunggu sore hari. Manfaatkanlah sehatmu sebelum sakitmu, dan hidupmu sebelum matimu.” (HR. Bukhari, no. 6416)\n" +
                    "\n" +
                    "Kandungan hadis :\n" +
                    "1. Kita dimotivasi untuk meninggalkan dunia dan zuhud pada dunia.\n" +
                    "2. Bagusnya pengajaran Nabi shallallahu ‘alaihi wa sallam dengan memberi contoh yang memuaskan.\n" +
                    "3. Hendaklah kita bersegera memanfaatkan umur, memanfaatkan waktu kuat yaitu masa sehat dan masa hidup.\n" +
                    "4. Keutamaan Ibnu Umar radhiyallahu ‘anhuma karena perkataannya terpengaruh dari sabda Nabi shallallahu ‘alaihi wa sallam.\n" +
                    "5. Bersegera beramal saleh pada waktu kita saat ini, tidak menunda-nundanya, karena kita tidak tahu keadaan setelah itu.\n" +
                    "6. Ibnu Rajab rahimahullah berkata, “Hendaklah setiap mukmin benar-benar memanfaatkan kesempatan dengan sisa umur yang ada.” (Jaami’ Al-‘Ulum wa Al-Hikam, 2:391)\n" +
                    "\n",
            R.drawable.img_news40
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
            R.drawable.img_news1
        )
    )
}