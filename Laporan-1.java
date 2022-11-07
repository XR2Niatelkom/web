package laundryonline;

public class Laporan {

    public void laporan(JenisLaundry j) {
        int z = j.getJmlJenisLaundry();

        System.out.println();
        System.out.println("Tabel Laundry");
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi \tHarga");
        for (int i = 0; i < z; i++) {
            System.out.println(j.getJenisLaundry(i) + "\t"
                    + j.getdurasi(i) + "\t" + j.getHarga(i));
        }
    }

    public void Laporan(Client e) {
        int y = e.getJmlClient();

        System.out.println();
        System.out.println("Tabel Client");
        System.out.println();
        System.out.println("Nama \tAlamat \tTelepon \tSaldo");
        for (int i = 0; i < y; i++) {
            System.out.println(e.getNama(i) + "\t"
                    + e.getAlamat(i) + "\t" + e.getTelepon(i) + "\t"
                    + e.getSaldo(i));
        }
    }

    public void laporan(Transaksi s, JenisLaundry l) {
        int p = s.getJmlTransaksi();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Jenis Laundry \tQty \tHarga \tDurasi");

        int total = 0;
        for (int i = 0; i < p; i++) {
            int jumlah = s.getBanyaknya(i) * l.getHarga(s.getIdJenisLaundry(i));
            total += jumlah;

            System.out.println(l.getJenisLaundry(s.getIdJenisLaundry(i)) + "\t" + s.getBanyaknya(i) + "\t" + l.getHarga(s.getIdJenisLaundry(i)) + "\t"
                    + jumlah);
        }
        System.out.println("Total Omset = " + total);
    }
}

