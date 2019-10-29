# Laporan Praktikum #9 - Abstract Class dan Interface 

## Kompetensi

1. Menjelaskan maksud dan tujuan penggunaan Abstract Class
2. Menjelaskan maksud dan tujuan penggunaan Interface
3. Menerapkan Abstract Class dan Interface di dalam pembuatan program. 

## Ringkasan Materi
Abstract Class Abstract Class adalah class yang tidak dapat diinstansiasi namun dapat di-extend. Abstract class baru dapat dimanfaatkan ketika ia di-extend.

Interface Interface adalah struktur data yang hanya berisi abstract methods. Tidak ada apa-apa selain method abstract pada interface, termasuk atribut getter dan setter.
## Percobaan

### Percobaan 1 -  Abstract Class 

Di dunia ini terdapat banyak jenis hewan. Semua hewan memiliki beberapa karakteristik yang sama, seperti contohnya semua hewan memiliki umur, hewan apapun itu, umurnya akan bertambah sama jumlahnya setiap tahun. 

Selain karakteristik yang sama, masing-masing hewan juga memiliki karakteristik yang berbeda satu dengan yang lainnya. Contohnya dalam hal bergerak. Cara kucing bergerak berbeda dengan cara ikan bergerak. Kucing bergerak dengan cara melangkahkan kaki-kakinya sedangkan ikan bergerak dengan cara menggerakkan siripnya.


![percobaan 1](img/percobaan1.png)

Link Kode Program : 
[Hewan1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/AbstractClass/Hewan1841720098Bulan.java)


![percobaan 1](img/percobaan1a.png)

Link Kode Program : 
[Kucing1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/AbstractClass/Kucing1841720098Bulan.java)

![percobaan 1](img/percobaan1b.png)

Link Kode Program : 
[Ikan1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/AbstractClass/Ikan1841720098Bulan.java)

![percobaan 1](img/percobaan1c.png)

Link Kode Program : 
[Orang1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/AbstractClass/Orang1841720098Bulan.java)

![percobaan 1](img/percobaan1d.png)

Link Kode Program : 
[Program1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/AbstractClass/Program1841720098Bulan.java)

## Pertanyaan diskusi:  
Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!

Jawab : Tidak boleh , karena saat kita meng-extends suatu method berarti kita mewarisi sifat yang ada pada class yang kita extends. Bila kita tidak mengimplementasikan maka program tidak bisa di tampilkan artinya dengan mengimplementasikan kita berarti memanggil data atau isi yang ada pada kelas yang sudah di extends



### Percobaan 2 - Interface 
![percobaan 2](img/percobaan2.png)

Link Kode Program : 
[ICumlaude1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/ICumlaude1841720098Bulan.java)

![percobaan 2](img/percobaan2a.png)

Link Kode Program : 
[Mahasiswa1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/Mahasiswa1841720098Bulan.java)

![percobaan 2](img/percobaan2b.png)

Link Kode Program : 
[Sarjana1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/Sarjana1841720098Bulan.java)

![percobaan 2](img/percobaan2c.png)

Link Kode Program : 
[PascaSarjana1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/PascaSarjana1841720098Bulan.java)

![percobaan 2](img/percobaan2d.png)

Link Kode Program : 
[Rektor1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/Rektor1841720098Bulan.java)

![percobaan 2](img/percobaan2e.png)

Link Kode Program : 
[Program1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/Program1841720098Bulan.java)


 #### Pertanyaan diskusi:  
 -  Mengapa pada langkah nomor 9 terjadi error? Jelaskan! 
        
        Jawab : Karena Class mahasiswa tidak mengimplements kan class ICumlaude. Sehingga saat di panggil terjadi error 

 -  Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?
        
        Jawab : Bisa , karena pada class Sarjana sudah di instansiasi menjadi object sajanaCumlaude di class Program. Dan class Sarjana sudah ter-extends dengan class Mahasiswa 

 -  Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian? 

        Jawab : Tidak, Karena Tidak Ada abstract method pada interface ICumlaude 

 - Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: 

Jawab : 
![Pertanyaan D](img/pertanyaan4.png)

![Pertanyaan D](img/pertanyaan4a.png)



### Percobaan 3 - Multiple Interfaces Implementation 

![percobaan 3](img/percobaan3.png)

Link Kode Program : 
[IBerprestasi1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/IBerprestasi1841720098Bulan.java)

![percobaan 3](img/percobaan3a.png)

Link Kode Program : 
[PascaSarjana1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/PascaSarjana1841720098Bulan.java)

![percobaan 3](img/percobaan3b.png)

Link Kode Program : 
[Rektor1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/Rektor1841720098Bulan.java)

![percobaan 3](img/percobaan3c.png)

Link Kode Program : 
[Program1841720098Bulan](../../src/9_Abstract_Class_dan_Interface/interfacelatihan/Program1841720098Bulan.java)

 #### Pertanyaan diskusi:
 Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude. 

 Jawab : 
 ![Pertanyaan 7](img/pertanyaan7.png)





## Kesimpulan

dalam pratikum ini kita dapat mengenal dan memahami konsep dari Abstract Class dan Interface 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Defika Bulan Rahmaningrum)***
