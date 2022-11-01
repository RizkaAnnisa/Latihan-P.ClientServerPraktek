/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizka.pengembalian.service.controller;

import com.rizka.pengembalian.service.VO.ResponseTemplateVo;
import com.rizka.pengembalian.service.entity.Pengembalian;
import com.rizka.pengembalian.service.service.PengembalianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@RequestMapping("/pengembalian")
public class PengembalianContoller {

    @Autowired
    private PengembalianService pengembalianService;

    @PostMapping("/")
    public Pengembalian savePengembalian(@RequestBody Pengembalian pengembalian) {
        return pengembalianService.savePengembalian(pengembalian);
    }

    @GetMapping("{id}")
    public Pengembalian findPengembalianById (@PathVariable("id") Long pengembalianId) {
       return  pengembalianService.findPengembalianById(pengembalianId);    

    }
}



