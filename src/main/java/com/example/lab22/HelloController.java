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

    @FXML
    protected void oblicz () {
        String s_promien =promien.getText();
        String s_wysokosc =wysokosc.getText();
        String s_grubosc =grubosc.getText();



        System.out.printf(s_grubosc);
        double d_promien = Double.parseDouble(s_promien);
        double d_wysokosc = Double.parseDouble(s_wysokosc);
        double d_grubosc = Double.parseDouble(s_grubosc);

        double pole_b = 2*3.14*d_promien*d_wysokosc;
        double pole_p = 2*3.14*d_promien*d_promien;
        double pole_c = pole_b + pole_p;

        double cięzar = 7.85d; //na m^2 przy 1mm grubosci
        double ciezar_blachy = pole_c*d_grubosc;
        String temp = Double.toString(ciezar_blachy);

        String wynik = "Ciężar blachy stalowej o podanych wymiarach wynosić będzie: "+ temp+" kg.";
        results.appendText(wynik);


    }

}