package com.oumayma.examapp.business;

import com.oumayma.examapp.dao.MemoryVilleDao;
import com.oumayma.examapp.dao.VilleDao;
import com.oumayma.examapp.models.Ville;

import java.util.ArrayList;
import java.util.List;

public class DefaultService implements Services{
    VilleDao dao ;
    public DefaultService() {
        dao = new MemoryVilleDao();
    }

    @Override
    public int CalculerMontant(float quantity, Ville ville){
        double total = 0;
        while (quantity>0){
            total+=0;
        }
        return 0;
    }

    @Override
    public List<String> getVillesNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Ville v :dao.getVille(String name)){
            names.add(v.getCityName());
        }
        return names;
    }

    @Override
    public Ville GetVilleByName(String name) {
        return dao.getVille(name);
    }
}
