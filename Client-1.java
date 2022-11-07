package laundryonline;

import java.util.ArrayList;

public class Client implements User2{
   private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    //konstruktor : metod yang namanya sama dengan kelas itu sendiri dan dia akan dijalankan saat di eksekusi
    public Client() {
        this.namaClient.add("Dila");
        this.alamat.add("Madiun");
        this.telepon.add("081934829847");
        this.saldo.add(400000);

        this.namaClient.add("Abidah");
        this.alamat.add("Malang");
        this.telepon.add("082637627367");
        this.saldo.add(700000);

        this.namaClient.add("Razita");
        this.alamat.add("Tulungagung");
        this.telepon.add("081235989079");
        this.saldo.add(100000);

        this.namaClient.add("Zaskia");
        this.alamat.add("Jepang");
        this.telepon.add("089832756493");
        this.saldo.add(100000);

        this.namaClient.add("Peina");
        this.alamat.add("Arab");
        this.telepon.add("089838353255");
        this.saldo.add(50000);

    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idClient) {
        return this.saldo.get(idClient);
    }

    public void editSaldo(int idClient, int saldo) {
        this.saldo.set(idClient, saldo);
    }

    @Override
    public void setNama(String namaClient) {
        this.namaClient.add(namaClient);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
    }

    @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);
    }

    @Override
    public String getAlamat(int idClient) {
        return this.alamat.get(idClient);

    }

    int getJmlClient() {
        return this.saldo.size();

    }  
}
