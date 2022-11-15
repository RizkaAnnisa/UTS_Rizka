/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.UTSrizka.gaji.service.repository;

import com.UTSrizka.gaji.service.entity.Gaji;
import java.util.Collection;

/**
 *
 * @author DELL
 */
public interface GajiService {
    public void addGaji (Gaji gaji);
    public Collection<Gaji> getGaji();
    public Gaji getGaji(String id);
    public Gaji editGaji(Gaji gaji);
    public void deleteGaji(String id);
    public boolean gajiExist(String id);

    public Object getgaji();
    
}
