package tugasrpl.modul2.enkapsulasi.latihan1;

import tugasrpl.Modul1.*;

public class UjiBus {
    public static void main(String[] args) {
        Bus busMini=new Bus();
        busMini.penumpang=5;
        busMini.maxpenumpang=5;
        busMini.cetak();

        busMini.penumpang=busMini.penumpang+5;
        busMini.cetak();

        busMini.penumpang=busMini.penumpang-2;
        busMini.cetak();


        busMini.penumpang=busMini.penumpang+8;
        busMini.cetak();


    }


}
