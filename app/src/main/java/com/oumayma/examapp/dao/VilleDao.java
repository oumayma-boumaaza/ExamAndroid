package com.oumayma.examapp.dao;

import com.oumayma.examapp.models.Ville;

public interface VilleDao {

        public Ville addVille(Ville ville);
        public Ville updateVille(Ville ville);
        public boolean deleteVille(String nom);
        public Ville getVille(String nom);
    }





