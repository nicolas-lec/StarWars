package fr.eni.ecole.starwars;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

import fr.eni.ecole.starwars.bo.Planet;

public class DetailPlanet extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_planet);
    }

    private void updateView(Planet planet) {
        if(planet != null) {

        }
    }
}