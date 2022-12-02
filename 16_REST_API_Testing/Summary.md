# BASIC API TESTING

## API & REST API
API atau Application  Programming Interface memungkinkan komunikasi dan pertukaran data antara 2 atau lebih software / sistem terpisah. Sedangkan REST API atau Respresentational
State Transfer adalah salah satu teknologi API yang sering kita gunakan ketika akan mengembangkan sebuah Web APIs. Untuk mengakses REST API kita perlu untuk memahami http method.
HTTP method terdiri dari sebagai berikut :
1. GET
2. PUT
3. POST
4. DELETE
Setelah kita mencoba untuk mengakses sebuah REST API maka kita akan mendapatkan sebuah response untuk mengecek apakah kita berhasil mengakses REST API tersebut. Adapun http 
response yang kita peroleh antara lain : 
a. 200 = OK
b. 201 = Created
c. 400 = Bad Request
d. 404 = Not Found
e. 401 = Unauthorized
f. 405 = Method Not Allowed
g. 500 = Internal Server Error

## TESTING API
Untuk melakukan testing API kita harus mengenal dan mengerti fungsi dari API, dapat mengaplikasikan tekni testing, menginputkan parameter untuk API perlu direncanakan dan 
ditentukan sebelumnya. 
Macam - macam dari testing API adalah : 
1. Functionality
2. Load Test
3. Security
Proses dari Api testing adalah spesifitcation review -> spesifitcation development -> framework development -> test case development -> execution & report.
Test case untuk API testing yaitu untuk mendapatkan balikan(Response) yang sesuai dengan inputan, Apakah memberikan response atau tidak, Apakah menggangu fitur yang lain atau tidak,
update struktur data dan memodifikasi data yang ada.

## ADVANTAGE & CHALLENGE
Keuntungan dari testing API yaitu efisiensi waktu, bahasa yang independen, mengurangi biaya testing dan mengurangi resiko. Sedangkan tantangan dalam testing API yaitu kombinasi dan pemilihan 
parameter, tidak ada GUI, harus mengetahui dahulu parameter dan perlu untuk mengetes error handling dari setiap API.
