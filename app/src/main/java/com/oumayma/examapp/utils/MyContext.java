package com.oumayma.examapp.utils;

import android.app.Application;

import com.oumayma.examapp.business.DefaultServices;
import com.oumayma.examapp.business.Services;
import com.oumayma.examapp.dao.MemoryVilleDao;

public class MyContext extends Application {
    private Services services;
    public MyContext(){
        this.services= (Services) new DefaultServices(new MemoryVilleDao());
    }
    public Services getServices() {return services;}
}