
# TESTING IN CI/CD PIPELINE

## Pengenalan CI/CD
1. Continous Integeration (CI)
   Ci adalah percobaan untuk mengintegerasikan code kedalam sebuah repository terbuka dan membangun atau menguji sesamanya secara otomatis dengan secepat mungkin selama
   sehari.
2. Continous Delivery/Deployment (CD)
   Cd adalah menambahkan sebuah software yang dapat dirilis kepada tim produksi sewaktu-waktu, bahkan pada saat terjadi perubahan mendadak di stagging system.
   perbedan antara delivey dan deployment yaitu :
   - Delivery
     a. secara otomatis menyiapkan dan melacak sebuah rilis ke produklsi.
     b. hasil yang diinginkan adalah bahwa siapa pun dengan cukup hak istimewa untuk menyebarkan rilis baru dapat melakukannya kapan saja di satu atau beberapa klik             dengan menghilangkan hampir semua tugas manual, pengembang menjadi lebih produktif
   - Deployment
     a. setiap kesempatan dalam sebuah source code yang di deploy ke produksi secara otomatis, tanpa persetujuan eksplisit dari developer.
     b. sepanjang itu lolos kontrol kualitas.
     
## APA YANG BAGUS DARI CI/CD
1. Kelebihan CI
   - Decoupled stages
   - repeatable
   - fail fast
2. Kelebihan CD
   - design with system in mind
   - pipelines
   - globally unique versions

## CI/CD PROSES
1. Commit
2. Build
3. Test
4. Deploy
