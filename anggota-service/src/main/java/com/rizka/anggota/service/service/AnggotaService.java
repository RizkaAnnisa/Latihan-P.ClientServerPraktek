/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizka.anggota.service.service;

import com.rizka.anggota.service.repository.AnggotaRepository;
import com.rizka.anggota.service.repository.AnggotaRepository.Anggota;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





/**
 *
 * @author DELL
 */
@Service
public class AnggotaService {
    @Autowired
    private AnggotaRepository anggotaRepository;

    public Anggota saveAnggota(Anggota anggota){
        return anggotaRepository.save(anggota);
    }

    public Anggota findAnggotaById(Long anggotaId){
        return anggotaRepository.findByAnggotaId(anggotaId);
    }
    public List <com.rizka.anggota.service.entity.Anggota> getAllAnggota(){
        return anggotaRepository.findAll();
    }
    public void deleteAnggotaById(Long anggotaId){
        anggotaRepository.deleteById(anggotaId);
    }
    public Anggota updateAnggota(Anggota anggota){
        return anggotaRepository.save(anggota);
    }

    public com.rizka.anggota.service.entity.Anggota saveAnggota(com.rizka.anggota.service.entity.Anggota anggota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public com.rizka.anggota.service.entity.Anggota updateAnggota(com.rizka.anggota.service.entity.Anggota anggota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}