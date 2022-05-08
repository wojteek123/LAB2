package com.example.lab22;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField wysokosc;
    public TextField promien;
    public TextField grubosc;
    public TextArea results;

    public double truncate(double n){ //funkcja zwraca liczbe skrocona do 2 wartosci po przecinku
        n = n*Math.pow(10,2);
        n = Math.floor(n);
        n = n / Math.pow(10,2);
        return n;
    }

    @FXML
    protected void oblicz () {
        results.setText(""); //wyczycic TextArea przed wyswietleniem

        double d_promien = Double.parseDouble(promien.getText());
        double d_wysokosc = Double.parseDouble(wysokosc.getText());
        double d_grubosc = Double.parseDouble(grubosc.getText());

        double pole_b = 2*3.14*d_promien*d_wysokosc;
        double pole_p = 2*3.14*d_promien*d_promien;
        double pole_c = pole_b + pole_p; // mm^2

        double cięzar = 7.85d; //na m^2 przy 1mm grubosci
        double ciezar_blachy = (pole_c/10000)*d_grubosc;


        String temp = Double.toString(truncate(pole_c/10000));
        String temp2 = Double.toString(truncate(ciezar_blachy));
        String wynik = "Do wykonania walca, potrzeba będzie:"+ temp + " metrów kwadratowych blachy.\n Jej cięzar wynosi "+temp2+" kg.";
        results.appendText(wynik);

    }

}