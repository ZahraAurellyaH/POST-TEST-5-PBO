# POST-TEST-5-PBO

## NAMA: ZAHRA AURELLYA HERDIANSYAH
## NIM: 2409116062

<img width="345" height="478" alt="image" src="https://github.com/user-attachments/assets/981f609a-814f-4c01-b02f-ded94ddac471" />

### LETAK PENERAPAN JDBC
1. Class Koneksi.java
- Berfungsi menginisialisasi koneksi ke database MySQL menggunakan JDBC.
- Penerapan JDBC: membuka koneksi ke database menggunakan driver MySQL.
<img width="973" height="222" alt="image" src="https://github.com/user-attachments/assets/f50aa559-65ba-4ba4-af9b-2b5eadf00de1" />

#
2. Class CRUD.java
- Semua operasi database dilakukan menggunakan JDBC Statement atau PreparedStatement.
> tambah data
<img width="847" height="406" alt="image" src="https://github.com/user-attachments/assets/ac4f84a7-683e-4d70-81fc-ebeee3cdea6b" />

> tampil data
<img width="876" height="584" alt="image" src="https://github.com/user-attachments/assets/d07057b2-a3ab-496c-9b7b-477ea77994c6" />

> update data
<img width="890" height="321" alt="image" src="https://github.com/user-attachments/assets/1afee987-164e-4998-90aa-49ded3cb3d22" />

> hapus data
<img width="769" height="292" alt="image" src="https://github.com/user-attachments/assets/a19340a4-16a7-4c4a-9838-9e120257bed0" />

- Query SQL dikirim langsung ke database lewat JDBC driver.
- Hasilnya (data dari tabel peminjaman) diambil melalui objek ResultSet.

### LETAK PENERAPAN ORM
1. Class Peminjaman.java
- Mewakili satu entitas tabel peminjaman di database.
- Field dalam class sesuai dengan kolom tabel:
<img width="402" height="214" alt="image" src="https://github.com/user-attachments/assets/fda420b4-b852-43a9-9eec-d3f17370e0fb" />

- Jadi, setiap baris data di tabel akan "diubah" menjadi satu objek Peminjaman.

#
2. Class CRUD.java
- Di bagian tampilData(), hasil dari ResultSet diubah menjadi objek Peminjaman:
<img width="420" height="213" alt="image" src="https://github.com/user-attachments/assets/bc318da1-66cb-48ae-b0df-a5c6cab64ac1" />

- Inilah proses mapping dari data relasional (baris tabel SQL) ke objek Java (class Peminjaman).

### PHP MY ADMIN
- Database SQL db_sekre
<img width="277" height="106" alt="image" src="https://github.com/user-attachments/assets/8e796eca-c61a-44ab-9955-b91b0a357b8f" />

- Data awal database
<img width="1074" height="109" alt="image" src="https://github.com/user-attachments/assets/eaa0ffb2-05d6-4202-b8ae-09b87e4fa0c6" />

### ALUR PROGRAM
