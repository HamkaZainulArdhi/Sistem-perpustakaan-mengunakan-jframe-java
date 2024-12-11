/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

/**
 *
 * @author hamka
 */
public class buku {

    private String judul;
    private String pengarang;
    private String isbn;
    private String tahun;
    private String harga;
    private String jenis;

    public buku(String judul, String pengarang, String isbn, String tahun, String harga, String jenis) throws
            ValidasiInputException {
        if (judul.isEmpty()) {
            throw new ValidasiInputException("Judul buku tidak boleh kosong!");
}
if (pengarang.isEmpty()) {
            throw new ValidasiInputException("Pengarang tidak boleh kosong !");
}
if (!isbn.matches("\\d{13}")) {
            throw new ValidasiInputException("ISBN harus 13 digit angka!");
        }
if (!tahun.matches("\\d{4}")) {
            throw new ValidasiInputException("Tahun harus 4 digit angka!");
        }
if (harga == null || harga.isEmpty() || !harga.matches("\\d+(\\.\\d+)?") || Double.parseDouble(harga) <= 0) {
            throw new ValidasiInputException("Harga buku harus berupa angka positif yang valid!");
        }
if (jenis == null || jenis.equals("pilih")) {
            throw new ValidasiInputException("Jenis buku harus diisi!");
        }
        



        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.tahun = tahun;
        this.harga = harga;
        this.jenis = jenis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getIsbn() {
        return isbn;
    }
    
     public String getTahun() {
        return tahun;
    }

    public String getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }
}
