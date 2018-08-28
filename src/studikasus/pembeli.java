package studikasus;
class pembeli extends tokobuku{
    public String nama_beli, alamat, telp;
    public int id_beli;
   
    public pembeli(int id_barang, String nama_barang, String merk_barang, 
    int harga_brg, int id_beli, String nama_beli, String alamat, String telp ){
    super(id_barang,nama_barang, merk_barang, harga_brg);
        this.id_beli = id_beli;
        this.nama_beli = nama_beli;
        this.alamat = alamat;
        this.telp = telp;
}
public void info ()
    {
        System.out.println("ID Barang : "+this.id_barang);
        System.out.println("Bama Barang : "+this.nama_barang);
        System.out.println("Merk Barang : "+this.merk_barang);
        System.out.println("Harga Barang : "+this.harga_brg);
        System.out.println("ID Beli : "+this.id_beli);
        System.out.println("Nama Beli : "+this.nama_beli);
        System.out.println("Alamat : "+this.alamat);
        System.out.println("Telp : "+this.telp);
    }
}

