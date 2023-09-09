package ru.geekbrains.lesson1.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private static int counter = 1000;
    private int id;
    private Camera camera;
    private List<PoligonalModel> models;
    private List<Flash> flashes;

    {
        id = ++counter;
    }

    public void addModel(PoligonalModel model) {
        models.add(model);
    }

    public void addFlash(Flash flash) {
        flashes.add(flash);
    }

    public List<PoligonalModel> getModels() {
        return models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public Scene(Camera camera, List<PoligonalModel> models) {
        this.camera = camera;
        this.models = models;
    }

    public Scene(Camera camera, List<PoligonalModel> models, List<Flash> flashes) {
        this.camera = camera;
        this.models = models;
        this.flashes = flashes;
    }
}