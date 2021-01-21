public class Book{
    private String judul;
    private String penulis;
    private String penerbit;
    private int tahunTerbit;
    private int harga;

    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getJudul(){
        return this.judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }

    public String getPenerbit(){
        return this.penerbit;
    }

    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit(){
        return this.tahunTerbit;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public int getHarga(){
        return this.harga;
    }

}