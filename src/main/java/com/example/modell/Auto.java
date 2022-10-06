package com.example.modell;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Auto {
    private String fabrikat;
    private int laufleistung;
    private double preis;
    private String farbe;
    private boolean unfallWagen;
    private String kraftstoff;
    private double leistung;

    public Auto(String fabrikat, int laufleistung, double preis, String farbe, boolean unfallWagen, String kraftstoff, double leistung) {
        this.fabrikat = fabrikat;
        this.laufleistung = laufleistung;
        this.preis = preis;
        this.farbe = farbe;
        this.unfallWagen = unfallWagen;
        this.kraftstoff = kraftstoff;
        this.leistung = leistung;
    }

    public static double fuel(List<Auto> list, String str) {
        double i = 0;
        double size = list.size();
        for (Auto a : list) {
            if (a != null) {
                if (str.toLowerCase().equals(a.getKraftstoff().toLowerCase())) {
                    i++;
                }
            }
        }
        return prozent(i, size);
    }

    public static double accidents(List<Auto> list) {
        double anzahl = list.size();
        double hasUnfall = 0;
        //IntFunction s = j -> (list.stream().iterator().next().isUnfallWagen()) ? j++ : 0;
        for (Auto a : list) {
            if (a != null) {
                if (a.isUnfallWagen()) {
                    hasUnfall++;
                }
            }
        }
        return prozent(hasUnfall, anzahl);
    }

    static double prozent(double a, double b) {
        double prozent = (a / b) * 100;
        return Math.round(prozent * 10000.0) / 10000.0;
    }

    public String getFabrikat() {
        return fabrikat;
    }

    public void setFabrikat(String fabrikat) {
        this.fabrikat = fabrikat;
    }

    public int getLaufleistung() {
        return laufleistung;
    }

    public void setLaufleistung(int laufleistung) {
        this.laufleistung = laufleistung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public boolean isUnfallWagen() {
        return unfallWagen;
    }

    public void setUnfallWagen(boolean unfallWagen) {
        this.unfallWagen = unfallWagen;
    }

    public String getKraftstoff() {
        return kraftstoff;
    }

    public void setKraftstoff(String kraftstoff) {
        this.kraftstoff = kraftstoff;
    }

    public double getLeistung() {
        return leistung;
    }

    public void setLeistung(double leistung) {
        this.leistung = leistung;
    }

    @Override
    public String toString() {
        String str = unfallWagen ? "" : "!!! Unfallfrei";
        return fabrikat + "(" + kraftstoff + "; " + leistung + " PS; " + farbe + ";" + laufleistung + " km)" + " für "
                + preis + " EUR" + str;
    }
}
