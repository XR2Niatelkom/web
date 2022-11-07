package laundryonline;

public class LaundryOnline {

    public static void main(String[] args) {
        Client c = new Client();
        Petugas p = new Petugas();
        JenisLaundry j = new JenisLaundry();
        Transaksi t = new Transaksi();
        Laporan l = new Laporan();
        l.laporan(j);
        l.Laporan(c);
        l.laporan(t, j);
        t.prosesTransaksi(c, t, j);
        l.laporan(t, j);

    }

}
