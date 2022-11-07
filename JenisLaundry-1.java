package laundryonline;

import java.util.ArrayList;

public class JenisLaundry  {

    private ArrayList<String> JenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        this.JenisLaundry.add("Setel Seragam");
        this.durasi.add(1);
        this.harga.add(20000);

        this.JenisLaundry.add("Sprei");
        this.durasi.add(1);
        this.harga.add(40000);

        this.JenisLaundry.add("Pakaian");
        this.durasi.add(1);
        this.harga.add(15000);

        this.JenisLaundry.add("Alat Sholat");
        this.durasi.add(1);
        this.harga.add(50000);
    }

    public int getJmlJenisLaundry() {
        return this.JenisLaundry.size();
    }

    public void setJenisLaundry(String JenisLaundry) {
        this.JenisLaundry.add(JenisLaundry);
    }

    public String getJenisLaundry(int idJenisLaundry) {
        return this.JenisLaundry.get(idJenisLaundry);
    }

    public void setdurasi(int durasi) {
        this.durasi.add(durasi);
    }

    public int getdurasi(int iddurasi) {
        return this.durasi.get(iddurasi);
    }

    public void editdurasi(int idJenisLaundry, int durasi) {
        this.durasi.set(idJenisLaundry, durasi);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idJenisLaundry) {
        return this.harga.get(idJenisLaundry);
    }
}
