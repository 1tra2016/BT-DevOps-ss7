package com.example.user.service.impl;

import com.example.user.dto.doctor.DoctorCreateDTO;
import com.example.user.dto.doctor.DoctorResponseSummaryDTO;
import com.example.user.entity.Doctor;
import com.example.user.exception.exceptions.ResourceNotFoundException;
import com.example.user.mapper.DoctorMapper;
import com.example.user.repository.DoctorRepository;
import com.example.user.service.IDoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DoctorServiceImpl implements IDoctorService {
    private final DoctorMapper doctorMapper;
    private final DoctorRepository doctorRepository;

    @Override
    public List<DoctorResponseSummaryDTO> getDoctors(){
        return doctorRepository.findAll()
                .stream()
                .map(doctorMapper::toResponseSummary)
                .toList();
    }

    @Override
    public DoctorResponseSummaryDTO createDoctor(DoctorCreateDTO request) {
        Doctor doctor = doctorMapper.toEntity(request);
        doctor = doctorRepository.save(doctor);
        return doctorMapper.toResponseSummary(doctor);
    }

    @Override
    public DoctorResponseSummaryDTO getDoctorSummary(Long id) {
        Doctor doctor =  doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
        return  doctorMapper.toResponseSummary(doctor);
    }

}
