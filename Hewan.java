class Hewan {
    String jenis;
    //            Konstruktor kelas dasar
    public Hewan(String jenis) { this.jenis = jenis; }
    //Metode kelas dasar
    void bersuara() { System.out.println("Sebuah hewan bersuara"); }
}
//    Kelas turunan atau sub kelas
class Kucing extends Hewan {
    //    Konstruktor kelas turunan
    public Kucing(String jenis) { super(jenis); }

    @Override
    void bersuara() { System.out.println("Meow!"); }
    void tidur() { System.out.println("Kucing tidur..."); }
}

class ContohPewarisan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Persia");
        System.out.println("Jenis kucing: " + kucing.jenis);
        kucing.bersuara();
        kucing.tidur();
    }
}