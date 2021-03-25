package fr.eni.ecole.starwars.distant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class RestWeb {
    public static SWInterface getSwapi() {
        return new Retrofit.Builder()
                .baseUrl(SWInterface.URL_WEB)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(SWInterface.class);
    }
}
