/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rizka.pengembalian.service.repository;

import com.rizka.pengembalian.service.entity.Pengembalian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface PengembalianRepository extends JpaRepository<Pengembalian, Long> {

    public Pengembalian findByPengembalianId(Long pengembalianId);
}