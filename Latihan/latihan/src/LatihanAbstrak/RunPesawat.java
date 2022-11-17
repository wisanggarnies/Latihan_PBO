package LatihanAbstrak;

public class RunPesawat {
    public static void main(String[] args) {
        PesawatJet pj = new PesawatJet();
        PesawatKomersial pk = new PesawatKomersial();
        System.out.println("==========================");
        System.out.println("        Pesawat Jet       ");
        System.out.println("==========================");
        pj.terbang();
        pj.manuver();
        pj.menembak();
        System.out.println("==========================");
        System.out.println("     Pesawat Komersial    ");
        System.out.println("==========================");
        pk.terbang();
        pk.mengangkutPenumpang();
    }
}
