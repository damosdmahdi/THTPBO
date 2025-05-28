class Main {
    public static void main(String[] args) {
        Transportasi[] daftarTransportasi = new Transportasi[3];

        daftarTransportasi[0] = new Bus("Bus AKAP", 40, "Bandung");
        daftarTransportasi[1] = new Kereta("Kereta Ekspres", 100, "Surabaya");
        daftarTransportasi[2] = new Pesawat("Garuda Indonesia", 180, "Bali");

        String[] kelasLayanan = { "ekonomi", "bisnis", "vip" };

        for (Transportasi t : daftarTransportasi) {
            System.out.println("===========================");
            System.out.println("Nama: " + t.getNama());
            System.out.println("Tujuan: " + t.getTujuan());
            System.out.println("Jumlah Kursi: " + t.getJumlahKursi());
            System.out.println("Harga Tiket (default): Rp " + t.hitungHargaTiket());
            for (String kelas : kelasLayanan) {
                System.out.println("Harga Tiket kelas " + kelas + ": Rp " + t.hitungHargaTiket(kelas));
            }
        }
    }
}
