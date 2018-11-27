package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VueIHMFX {

    CommandeTabInt commandeGetEtat;
    Button[] myButton;
    GridPane gridPane = new GridPane();

    Image[] soko = new Image[]{new Image(new FileInputStream(
            "caisse1.png"), 64, 64, false, false),
            new Image(new FileInputStream(
                    "caisse2.png"), 64, 64, false, false),
            new Image(new FileInputStream(
                    "destination.png"), 32, 32, false, false),
            new Image(new FileInputStream(
                    "mur.png"), 64, 64, false, false),
            new Image(new FileInputStream(
                    "sol.png"), 64, 64, false, false),
            new Image(new FileInputStream(
                    "sokoB.png"), 37, 59, false, false),
            new Image(new FileInputStream(
                    "sokoD.png"), 42, 59, false, false),
            new Image(new FileInputStream(
                    "sokoG.png"), 42, 59, false, false),
            new Image(new FileInputStream(
                    "sokoH.png"), 37, 60, false, false)
    };


    public VueIHMFX(Controleur controleur) throws FileNotFoundException {
        commandeGetEtat = controleur.commandeGetEtat();
        myButton = new Button[commandeGetEtat.exec().length];
        for (int i = 0; i < commandeGetEtat.exec().length; i++) {
            myButton[i] = new Button();
            myButton[i].setMinSize(80, 80);
            gridPane.add(myButton[i], i, 0);
        }
    }

    public void dessine() {
        for (int i = 0; i < commandeGetEtat.exec().length; i++) {
            myButton[i].setGraphic(new ImageView(soko[0]));

            }

        }
    }