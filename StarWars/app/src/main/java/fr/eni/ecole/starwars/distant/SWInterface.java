package fr.eni.ecole.starwars.distant;

import java.util.List;

import fr.eni.ecole.starwars.bo.Planet;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SWInterface {
    public static final String URL_WEB = "https://swapi.dev/api/";

    @GET("planets/{id}/")
    Call<Planet> getPlanet(@Path("id") int id);

    @GET("planets/")
    Call<List<Planet>> planetList();

    @GET("planets/{id}/people/")
    Call<List<Planet>> listResident(@Path("planets") String planets);
}
