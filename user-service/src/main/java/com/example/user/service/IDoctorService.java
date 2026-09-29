package com.example.user.service;

import com.example.user.dto.doctor.DoctorCreateDTO;
import com.example.user.dto.doctor.DoctorResponseSummaryDTO;

import java.util.List;

public interface IDoctorService {
    List<DoctorResponseSummaryDTO> getDoctors();
    DoctorResponseSummaryDTO createDoctor(DoctorCreateDTO request);
    DoctorResponseSummaryDTO getDoctorSummary(Long id);
}
