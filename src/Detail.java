public class Detail extends Book {
    public void detailBuku(){
        System.out.println("Judul Buku\t: "+getJudul());
        System.out.println("Penulis\t\t: " + getPenulis());
        System.out.println("Penerbit\t: " + getPenerbit());
        System.out.println("Tahun Terbit\t: " + getTahunTerbit());
        System.out.println("Harga\t\t: " + getHarga());
    }
}
