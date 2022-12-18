# SUMMARY MAP DATA STRUCTURE
## ITERABLE

Iterable di java adalah sebuah interface yang menyediakan sebuah fungsi untuk mengakses element dari collections satu per satu. Element dari collections yang seperti array, set, queue, map, dll dapat diakses dengan mudah menggunakan Iterable. Ketika collections memanggil sebuah itarable interface maka dia akan memanggil sebuah iterator method. Method ini akan mengembalikan nilai spesifik sebuah iterator. Jika dia mengembalikan nilai true maka akan memanggil nilai dari method next() jika tidak maka akan memberhentikan loop.
  METHOD ITERABLE
  Iterable mempunyai 3 method, yaitu :
  1. void forEach(Consumer<? super T> action)
     method yang memproses setiap item dari iterable atau method ini akan memberikan exeptions.
  2. Iterator<T> iterator()
     method ini memanggil interface dari iterator dimana akan mengembalikan nilai dari iterator yang akan digunakan untuk iterate elements tersebut dalam sebuah              container.
  3. Spliterator<T> spliterator()
     method ini membuat sebuah spliterator dari items dimana mendeskripsikan sebagai iterable. spliterator adalah objek untuk melintasi dan mempartisi elemen koleksi, di      mana koleksi dapat berupa array, set, tree, atau fungsi generator.

## COLLECTIONS

Collections di java adalah sebuah framework yang menyediakan arsitektur untuk menyimpan dan memanipulasi kelompok objek. Java Collections dapat mencapai semua operasi yang akan dilakukan pada data seperti searching, sorting, insertion, manipulation, and deletion.Java collections adalah sebuah single unit dari objek. Java collections menyediakan beberapa interface seperti Set, List, Queue, Deque dan class seperti ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet.

  METHOD COLLECTION 
  1. public boolean add(E e)
     method ini digunakan untuk memasukkan element ke dalam collections.
  2. public boolean addAll(Collection<? extends E> c)
     method ini digunakan untuk element spesifik dari collections ke dalam invoke collections.
  3. public boolean remove(Object element)
     method ini digunakan untuk element dari collections.
  4. public boolean removeAll(Collection<?> c)
     mthod ini digunakan untuk semua element spesifik dari collection.
  5. default boolean removeIf(Predicate<? super E> filter)
     method ini digunakan untuk menghapus semua element yang memenuhi persyaratan.
  dll...

## LIST

List di java menyediakan fasilitas untuk memelihara koleksi yang dipesan. Ini berisi metode berbasis indeks untuk memasukkan, memperbarui, menghapus, dan mencari elemen. Itu dapat memiliki elemen duplikat juga. Kita juga dapat menyimpan elemen null dalam daftar. list interface dapat digunakan dengan java.util package dan pewarisan dari collection interface. 

  METHOD LIST
  1. void add(int index, E element)
     method ini digunakan untuk menambahkan element ke dalam posisi di list.
  2. boolean add(E e)
     method ini digunakan untuk menambahkan element ke akhir dari sebuah list.
  3. boolean addAll(Collection<? extends E> c)
     menambahkan element collection ke akhir sebuah list.
  4. boolean addAll(int index, Collection<? extends E> c)
     menambahkan element collection ke dalam posisi sebuah list.
  5. void clear()
     method ini digunakan untuk menghapus element dari list.
  dll...
