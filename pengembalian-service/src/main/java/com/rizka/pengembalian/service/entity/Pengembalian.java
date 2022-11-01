/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizka.pengembalian.service.entity;

import com.rizka.pengembalian.service.VO.Peminjaman;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author DELL
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pengembalian {

    Peminjaman Peminjaman;

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PengembalianId;
    private Long PeminjamanId;
    private String tglpengembalian;
    private Integer terlambat;
    private Double denda;

    public Pengembalian(Long PengembalianId, Long PeminjamanId, String tglpengembalian, Integer terlambat, Double denda) {
        this.PengembalianId = PengembalianId;
        this.PeminjamanId = PeminjamanId;
        this.tglpengembalian = tglpengembalian;
        this.terlambat = terlambat;
        this.denda = denda;
    }

    public void setPengembalianId(Long PengembalianId) {
        this.PengembalianId = PengembalianId;
    }

    public Long getPengembalianId() {
        return PengembalianId;
    }

    public Long getPeminjamanId() {
        return PeminjamanId;
    }

    public void setPeminjamanId(Long peminjamanId) {
        this.PeminjamanId = peminjamanId;
    }

    public void setTglPengembalian(String tglpengembalian) {
        this.tglpengembalian = tglpengembalian;
    }

    public String getTglPengembalian() {
        return tglpengembalian;
    }

    public double getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(Integer terlambat) {
        this.terlambat = terlambat;
    }

    public double getDenda() {
        denda = terlambat * 1000.0;
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
}
