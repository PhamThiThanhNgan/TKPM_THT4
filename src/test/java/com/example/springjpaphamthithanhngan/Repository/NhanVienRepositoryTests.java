package com.example.springjpaphamthithanhngan.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NhanVienRepositoryTests {
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Test
    void cau3(){
        System.out.println(nhanVienRepository.findNhanVienByLuong());
    }
}
