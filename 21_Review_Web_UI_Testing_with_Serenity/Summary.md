# REVIEW WEB UI TESTING WITH SERENITY

## Serenity BDD
Arsitektur serenity BDD yaitu :
  - Serenity merupakan framework BDD open source yang membantu untuk menuliskan acceptance test dengan struktur bagus dan dapat diperbarui secara otomatis.
  - Arsitektur serenity terdiri dari requirement, test, step, pages, dan report.
Definisi requirement
  - ketika menggunakan serenity, kita akan memulai dengan requirement yang dibutuhkan untuk di implementasi.
  - mengekspresikan "story" pengguna dengan accpetance criteria untuk membantu mengklarifikasi requirement.
  - story merupakan automasi serenity.
Automate acceptance criteria
ketika menggunakan serenity kita akan dapat menuliskan accpetance kriteria secara otomatis dengan high-level bussiness terms. 
Impentassi test
ketika mengimplementasika acceptance criteria kedalam code maka kita akan dapat menjalankan kode dengan aktual. ketika dijalankan test akan diturunkan menjadi beberapa 
nested steps untuk memperoleh readability dan dapat dilakukan maintenance lebih mudah.
Report test result
Serenity dapat menampilkan report test dengan detail meliputi :
- naratif dalam setiap test
- screenshot dalam setiap langkah di test 
- hasil test meliputi waktu eksekusi dan pesan error ketika gagal.

## BDD FRAMEWORK
Untuk membuat BDD dengan cucumber, langkah untuk membuatnya yaitu :
1. Membuat story
   menggunakan gherkin syntax (Given. When, Then)
2. Map steps ke java
   konfigurasi step script dan validation.
3. Konfigurasi story
   menggabungkan story dan step.
4. Menjalankan story
   menggunakan IDE intelij dengan java maven.
5. Menampilkan report

## Serenity properti
1. serenity support beberapa properti untuk membantu menjalankan pengujian.
2. webdriver.driver yang mendefinisikan browser yang akan digunakan untuk melakukan pengujian.
3. Ignore.failures.in.stories untuk membuat serenity tetap berjalan meskipun ada tahapan yang gagal diproses/. 
