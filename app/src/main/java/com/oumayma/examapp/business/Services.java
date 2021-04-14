package com.oumayma.examapp.business;


import com.oumayma.examapp.models.Ville;

import java.util.List;

public interface Services {
    public int CalculatePrice(double quantity, Ville ville);
    public List<String> getVillesNames();
    public Ville GetVilleByName(String name);
}
