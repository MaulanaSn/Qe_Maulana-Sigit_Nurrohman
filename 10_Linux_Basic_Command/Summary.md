Basic Linux Commands
## LINUX OS
Linux adalah salah satu Operating System (OS), sama seperti Windows. Linux merupakan sistem operasi yang OPENSOURCE, artinya linux dapat dilihat source codenya, 
dimodifikasi, dan dikembangkan oleh siapa saja, Linux pada awalnya dibuat oleh seorang mahasiswa Finlandia yang bernama Linus Torvalds.

## Basic Command
- cal : command untuk kalendar pada linux OS.
- Date : command untuk menampilkan tanggal pada linux OS.
- etc

## Macam Macam Command Pada Linux OS
-$man apt= akan menampilkan manual penggunaan dari program apt.
-$–help
-$sudo= Menjalankan program sebagai user root atau super user.
-$ls= untuk melihat file dan folder yang ada di dalam direktori
-$cd/home= untuk menjadikan foder home sebagai direktori saat itu
-$mkdir (nama folder)= perintah ini di peruntukan untuk membuat folde di menggunakan command line
-$kill= menghentikan program yang sedang berjalan menggunakan signal
-$vim= untuk membuat text editor (nanti kita bahas yang ini)
-$unzip= untuk meng ekstrak file yang berformat .zip
-$fdisk= Menampilkan list partisi pada perangkat, biasanya menggunakan opsi “-l”, contohnya | $ sudo fdisk -l |

-$rm (file)= command line ini di gunakan saat ingin menghapus folder di direktori tertentu
-$find (nama file)= Mencari file dalam direktori hirarki. Contoh penggunaannya | $ find -name niagahoster.txt |
-$history= Perintah dasar linux ini digunakan untuk melihat riwayat perintah yang sudah pernah digunakan sebelumnya. Jika ingin mencari perintah tertentu bisa menggunakan $ history | grep apt untuk mencari nama perintah yang sudah pernah diketikan dan mengandung potongan kata apt.
-$cat= untuk melihat isi dari sebuah file
-$echo= perintah ini untuk menampilkan satu baris teks
-$grep= Menampilkan baris yang mengandung kata yang sama sesuai dengan pattern
-$chmod= Mengganti pemilik dan group dari sebuah file. Contohnya jika ingin mengubah kepemilikan oncom.txt menjadi “oncom”
-$su= mengganti user ID
-$passwd= Perintah ini digunakan untuk mengganti password dari user

-$mount= Melampirkan sebuah filesystem kedalam satu folder besar. Sehingga tidak perlu melakukan akses langsung ke filesystem. Sebagai contoh menggunakan | $ sudo mount /dev/sda2 /mnt |. Perintah ini akan membuat isi partisi /dev/sda2 bisa diakses melalui /mnt.
-$umount= Mengunlock perintah mount
-$reboot= untuk merestart laptop/ pc
-$shutdown/poweroff= untuk mematikan laptop/pc dalam command line
-$gedit= membuka text editor untuk mengedit file contoh kita bias merubah repository
-$ifconfig= untuk melihat ip yang sedang terkoneksi
-$dpkg –i= untuk menginstall suatu program
