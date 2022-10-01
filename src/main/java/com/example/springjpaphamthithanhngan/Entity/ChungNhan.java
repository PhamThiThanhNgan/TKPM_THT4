package com.example.springjpaphamthithanhngan.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
public class ChungNhan implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "manv", columnDefinition = "varchar(10)")
    public NhanVien MaNV;

    @Id
    @ManyToOne
    @JoinColumn(name = "mamb", columnDefinition = "int")
    public MayBay MaMB;
}