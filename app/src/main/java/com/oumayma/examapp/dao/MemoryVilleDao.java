package com.oumayma.examapp.dao;

import com.oumayma.examapp.models.Ville;

import java.util.ArrayList;
import java.util.List;

public class MemoryVilleDao  implements  VilleDao{
    private List<Ville> cities;

    public MemoryVilleDao() {
        cities = new ArrayList<>();
        cities.add(new Ville("Rabat",2,4,8,15));
        cities.add(new Ville("Casa",2.5,4.5,9,15));
        cities.add(new Ville("Fes",3,4.5,8,15));
        cities.add(new Ville("Autre",1,3,7,12));
    }

    @Override
    public Ville addVille(Ville ville) {
        for (Ville v:cities)
            if(ville.getCityName().equals(v.getCityName()))
                return null;

        cities.add(ville);
        return ville;
    }

    @Override
    public Ville updateVille(Ville ville) {
        for (Ville v:cities)
            if(ville.getCityName().equals(v.getCityName())) {
                v = ville;
                return ville;
            }
        return null;
    }

    @Override
    public boolean deleteVille(String nom) {
        for (Ville v:cities)
            if(nom.equals(v.getCityName())) {
                cities.remove(v);
                return true;
            }
        return false;
    }

    @Override
    public Ville getVille(String nom) {
        for (Ville c:cities)
            if(nom.equals(c.getCityName())) {
                return c;
            }
        return null;
    }
}