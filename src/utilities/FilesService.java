package utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Item;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesService {
    private static final Gson GSON = new GsonBuilder().create();
    private static Path PATH = Paths.get("data/product.json");

    public static Item[] getGoods() {
        String json = "";
        try {
            json = Files.readString(PATH);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(json, Item[].class);
    }
}
