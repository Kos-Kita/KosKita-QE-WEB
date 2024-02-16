# KosKita API
  <h1>Welcome to KosKita</h1>

<!-- PROJECT LOGO -->
![LOGO](docs/koskitaa-high-resolution-logo-black.png)

## 📑 About the Project
KosKita adalah aplikasi yang dirancang untuk memudahkan pengguna dalam mencari dan memesan kos. Aplikasi ini menawarkan berbagai fitur yang memudahkan pengguna dalam melakukan transaksi, mulai dari pencarian kos hingga pembayaran

## 🌐 Deployment
 - [VERCEL](https://koskita.netlify.app/)

## 🖼 Prototype
- [FIGMA](https://www.figma.com/file/SLA82Dp0aP8QOWOSRlJqCE/Kost?type=design&node-id=102%3A323&mode=design&t=NVcmjZWyVzodr9FS-1)

## 🤝 Collaboration
- [Github Repository for the team](https://github.com/Kos-Kita/)
- [Discord](https://discord.com/)

### ⚙ QUALITY ENGINEER
- [Github Repository for the QUALITY ENGINEER team](https://github.com/Kos-Kita/KosKita-QE-WEB)
- [Swagger OpenAPI](https://app.swaggerhub.com/apis-docs/L3NONEONE_1/KosKita/1.0.0#/)
- [Postman Workspace](https://koskita.postman.co/workspace/KOSKITA~c8aa6d62-d6b1-489f-8407-086490de72c9/collection/32810927-068cdf9b-73db-430b-9ac7-424db25e4b14?action=share&creator=32810927&active-environment=32810927-cc79e018-0950-486c-9d35-b7c474dcee1d)
- [Spreadsheets API TEST CASE](https://docs.google.com/spreadsheets/d/1X-0gefGNmijdKWHyFATElwY9tAIct8T2rmsPFOd3Jdg/edit)

## 🔮 Features
- 👤Autentikasi dan Manajemen User
    - Registrasi User
    - Login User
    - Mendapatkan Detail User
    - Memperbarui Akun User
    - Memperbarui Sandi User
    - Menghapus User
- 🏠Manajemen Kos
    - Membuat Kos Baru
    - Mendapatkan Semua Kos
    - Mendapatkan Detail Kos
    - Memperbarui Kos
    - Menghapus Kos
    - Mendapatkan Kos Berdasarkan User
    - Mencari Kos
    - Mencari Kos Berdasarkan Filter
- 🖼️Foto Kos
    - Membuat Foto Kos Baru
    - Memperbarui Foto Kos Baru
- ⭐Rating Kos
    - Memberikan Score Rating Untuk Kos
- 📅Proses Booking dan Pembayaran
    - Membuat Booking
    - Membatalkan Booking
    - Mendapatkan Booking User
- 💳Payment Gateway
    - Membuat Pembayaran Booking Baru
    - Membatalkan Pembayaran Booking
    - Menerima Notifikasi Pembayaran
- 💬Real-time Chat
    - Membuat Ruangan Chat Baru
    - Mendapatkan Ruangan Chat Yang Dimiliki User
    - Bergabung Ke Ruangan Chat
    - Mendapatkan Semua Pesan Di Ruangan Chat 
- 👮‍♂️Fitur Admin
    - Mendapatkan Total Semua User, Kos, Booking, Dan Total Booking Per Bulan

## 🗺️ ERD
![ERD](docs/ggpm3egf%20(3).png)

## List Endpoint

| Tag | Endpoint |
| --- | --- |
|👤User | `POST /login` |
|👤User | `POST /users` |
|👤User | `GET /users` |
|👤User | `PUT /users` |
|👤User | `DELETE /users` |
|👤User | `PUT /change-password` |
|🏠Kos | `POST /kos` |
|🏠Kos | `PUT /kos/:id` |
|🏠Kos | `GET /kos` |
|🏠Kos | `DELETE /kos/:id` |
|🏠Kos | `GET /kos/:id` |
|🏠Kos | `GET /users/kos` |
|🏠Kos | `GET /kos/search` |
|🖼️Image | `POST /upload-image/:kosid` |
|🖼️Image | `PUT /upload-image/:kosid` |
|⭐Rating | `POST /kos/:id/rating` |
|📅Booking | `POST /booking` |
|📅Booking | `GET /booking` |
|📅Booking | `PUT /booking/:booking_id` |
|💬Message | `POST /create-room` |
|💬Message | `GET /get-room` |
|💬Message | `GET /join-room/:roomId` |
|💬Message | `GET /room/:roomId` |
|👮‍♂️Admin | `GET /admin` |

## 🛠️Teknologi Stack

- **Java**
    - -> Bahasa pemrograman yang digunakan untuk automation API.
- **IntelliJ IDEA Community Edition**
    - -> IntelliJ IDEA adalah lingkungan pengembangan terintegrasi (IDE) yang kuat untuk Bahasa Java. IntelliJ IDEA Community Edition adalah versi gratis dari IDE ini yang banyak digunakan oleh pengembang Java. Ini menyediakan berbagai fitur seperti refactorings, code completion, debugging, integrasi dengan sistem manajemen versi, dan banyak lagi, yang semuanya membantu dalam pengembangan dan pengujian aplikasi Java.
- **Cucumber**
    - -> Cucumber adalah alat pengujian berbasis perilaku (behavior-driven testing) yang memungkinkan Anda menulis skenario pengujian dalam bahasa alami yang dapat dimengerti oleh orang non-teknis. Skenario ini kemudian dapat dijalankan sebagai pengujian otomatis. Cucumber mempromosikan kolaborasi antara pengembang, pemilik produk, dan QA dengan menggunakan sintaks yang mudah dimengerti oleh semua pihak. Ini membantu dalam mengklarifikasi kebutuhan bisnis dan memastikan bahwa pengujian sesuai dengan perilaku yang diinginkan.
- **Selenium**
    - -> Selenium adalah kerangka kerja pengujian otomatis untuk pengujian web. Ini memungkinkan pengujian fungsional web otomatis dengan mengotomatisasi interaksi pengguna pada browser web. Selenium dapat digunakan untuk mengotomatisasi pengujian pada berbagai browser dan platform. Selenium WebDriver adalah komponen utama dari Selenium yang menyediakan API yang kuat untuk mengotomatisasi pengujian web.
- **Postman**
    - -> Alat pengujian API yang digunakan untuk menguji endpoint API.
- **GitHub**
    - -> Platform pengembangan perangkat lunak yang digunakan untuk kontrol versi dan kolaborasi.

## ✔️ Requirement
Things you need to run the KosKita API
- Java Development Kit (JDK)
- IntelliJ IDEA
- Git

## 🧰 Installation
# Petunjuk Menjalankan Proyek QE untuk Aplikasi Web

Berikut adalah langkah-langkah untuk menjalankan proyek QE untuk aplikasi web menggunakan teknologi stack yang digunakan:

## Persyaratan

- Java Development Kit (JDK)
- IntelliJ IDEA Community Edition
- Git

## Langkah-langkah

1. **Kloning Repositori**
   - Buka terminal atau command prompt.
   - Ketik perintah `git clone <url-repo>` untuk mengkloning repositori proyek ini ke komputer lokal Anda.

2. **Mengimpor Proyek ke IntelliJ IDEA**
   - Buka IntelliJ IDEA.
   - Pilih opsi "Open" dan pilih direktori proyek yang sudah Anda klone.
   - Pastikan IntelliJ IDEA mendeteksi proyek sebagai proyek Maven atau Gradle dan mengunduh semua dependensi yang diperlukan.

3. **Menjalankan Pengujian Otomatis**
   - Buka file konfigurasi pengujian atau skenario pengujian yang ingin Anda jalankan dalam proyek.
   - Pastikan konfigurasi pengujian sudah benar.
   - Jalankan skenario pengujian atau tes dengan menggunakan opsi yang disediakan oleh IntelliJ IDEA atau dengan menjalankan perintah Maven atau Gradle yang sesuai.

4. **Menghentikan Aplikasi**
   - Setelah selesai menjalankan pengujian, pastikan untuk memberhentikan aplikasi atau server lokal yang mungkin dijalankan selama pengujian.


## 🤖 Author

- **JULIARDI DWI ANGGORO / KEIANGGORO12** - QE 13 ALTA
  - [Github](https://github.com/keianggoro12)
- **Andreas Firdaus** - QE 13ALTA
  - [Github](https://github.com/andreasfirdaus)

## License

This project is licensed under the [MIT License](LICENSE).
