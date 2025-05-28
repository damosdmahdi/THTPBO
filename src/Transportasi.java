// Kelas Induk
public class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double hitungHargaTiket() {
        return 100000.0;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        return hitungHargaTiket();
    }
}

// Subclass Bus
class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.1;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double base = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis":
                return base * 1.25;
            case "vip":
                return base * 1.5;
            default:
                return base;
        }
    }
}

// Subclass Kereta
class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.2;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double base = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis":
                return base * 1.25;
            case "vip":
                return base * 1.5;
            default:
                return base;
        }
    }
}

// Subclass Pesawat
class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.5;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double base = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis":
                return base * 1.25;
            case "vip":
                return base * 1.5;
            default:
                return base;
        }
    }
}
