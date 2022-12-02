# POST PROCESSOR

## APA ITU POST PROCESSOR
post processor adalah sebuah elemen test plan yang digunakan untuk menampilkan beberapa tindakan setelah memproses request sampler. post prosesor biasanya digunakan untuk mengekstrak beberapa nilai value dari response sebuah request sampler. atau kita dapat mengekstrak sesi calue dari sebuah http request dan pass sesi variable value
ke subsequent request.

# JSON PATH
digunakan untuk mengekstrak isi dari json response
beberapa ekspresi yang umum digunakan :
- $ = root element
- . = child operator object
- [] = child operator array\
- .. = recursive descent
- * = wildcard
- [start:end] = array slice operator borrowed
