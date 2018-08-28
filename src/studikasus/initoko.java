package studikasus;
class initoko extends pembeli{
    public int total;
    public initoko (int id_barang, String nama_barang, String merk_barang, 
    int harga_brg, int id_beli, String nama_beli, String alamat, String telp, int total){
    super(id_barang, nama_barang, merk_barang, harga_brg, id_beli, nama_beli, alamat, telp);
        this.total = total;
}
public void info()
{
    super.info();
    System.out.println("Total :"+this.total);
}
    public static void main(String[] args) {
        System.out.println("Data pembelian :");
        System.out.println("-----------------");
        System.out.println("Nama Kasir : Sasa");
        System.out.println("Date : 1/10/2018");
        System.out.println("-----------------");
        initoko transaksi = new initoko(101, "Buku Gambar", "Sidu", 5000, 110, "Mesa", "Lesanpuro","08194554211" , 5000);
        transaksi.info();
    }
}
