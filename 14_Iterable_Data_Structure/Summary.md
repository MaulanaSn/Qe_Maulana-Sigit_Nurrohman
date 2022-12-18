# SUMMARY ITERABLE DATA STRUCTURE

## STACK
Stack di java adalah tumpukan data linear yang digunakan untuk menyimpan object collections, hal ini berdasarkan dari Last-In-First-Out (LIFO).Kerangka kerja pengumpulan Java menyediakan banyak antarmuka dan kelas untuk menyimpan koleksi objek. Salah satunya adalah kelas Stack yang menyediakan operasi yang berbeda seperti push, pop, search, dll.
Struktur data Stack memiliki dua operasi terpenting yaitu push dan pop. Operasi push memasukkan elemen ke dalam Stack dan operasi pop menghilangkan elemen dari bagian atas Stack. 
  METHOD STACK
  1. empty()
     Method ini digunakan untuk mengecek apakah kelas stack tersebut kosong atau tidak. Pada method ini mempunyai nilai true atau false saja, karena modifier method ini      bertipe boolean.
  2. push(E item)
     Method ini digunakan untuk menginput element ke dalam tumpukan teratas sebuah kelas stack. Method ini mempunyai modifier bertipe E.
  3. pop()
     Method ini digunakan untuk menghapus element ke dalam tumpukan teratas sebuah kelas stack dan mengembalikan nilai awal dari element sebuah fungsi tersebut. Method        ini mempunyai modifier bertipe E.
  4. peek()
     Method ini digunakan untuk melihat isi dari element teratas sebuah stack tanpa harus mengubah nilainya.  Method ini mempunyai modifier bertipe E.
  5. search(Object o)
     Method ini digunakan untuk mencari object tertentu dan mengembalikan posisi sebuah object. Method ini mempunyai modifier bertipe int.
 
 ## SET
 Set di java  adalah sebuah interface yang tersedia di java.util package. Set interface merupakan turunan dari collection interface. Set interface digunakan untuk membuat mathematical set. salah satu implementasi dari set interface adalah sortedset dan navigableset. 
 
  METHOD SET
  1. add()
  Method ini digunakan untuk menambahkan nilai baru kedalam set.
  2. addAll()
  Method ini digunakan untuk menambahkan nilai collection ke dalam set.
  3. clear()
  Method ini digunakan untuk menghapus nilai didalam element set.
  4. contains()
  method ini digunakan untuk  mengetahui keberadaan elemen dalam set.
  5. containsAll()
  method ini digunakan untuk periksa apakah semua elemen koleksi tersedia di set yang ada atau tidak.
  
## QUEUE DAN DEQUE
Queue di java adalah salah satu dari struktur data java yang digunakan untuk menyimpan elemen seperti struktur data lainnya tetapi dengan cara tertentu. Atau bisa juga diartikan adalah jenis struktur data dalam bahasa pemrograman Java yang menyimpan elemen dari jenis yang sama. Komponen dalam queue disimpan dalam perilaku FIFO (First In, First Out).
  METHOD QUEUE
  1. boolean add(E e)
     Method ini digunakan untuk Menambahkan elemen e ke antrian di akhir (ekor) queue tanpa melanggar batasan kapasitas. Mengembalikan true jika berhasil atau              IllegalStateException jika kapasitas habis.
  2. E peek()
     Method ini digunakan untuk Mengembalikan kepala (depan) antrean tanpa menghapusnya.
  3. E element()
     Method ini digunakan untuk Melakukan operasi yang sama dengan metode peek (). Melempar NoSuchElementException saat antrian kosong.
  4. E remove()
     Method ini digunakan untuk Menghapus kepala antrian dan mengembalikannya. Melempar NoSuchElementException jika antrian kosong.
  5. E poll()
     Method ini digunakan untuk Menghapus kepala antrian dan mengembalikannya. Jika antrean kosong, antrean akan mengembalikan null.
  dst...
  
Deque di java adalah koleksi linier yang mendukung penyisipan dan penghapusan elemen dari kedua ujungnya. Nama 'deque' adalah singkatan dari double-ended queue. Tidak ada batasan tetap pada deque untuk jumlah elemen yang mungkin dikandungnya. Namun, antarmuka ini mendukung deques terbatas kapasitas serta deques tanpa batas ukuran tetap. Ada berbagai metode yang disediakan untuk memasukkan, menghapus, dan memeriksa elemen-elemennya.
  METHOD DEQUE
  1. add(E e)
     Metode ini digunakan untuk memasukkan elemen tertentu ke dalam antrian yang diwakili oleh deque.
  2. addAll(Collection<? Extends E>c)
     Menambahkan semua elemen dalam koleksi yang ditentukan di akhir deque.
  dst..
