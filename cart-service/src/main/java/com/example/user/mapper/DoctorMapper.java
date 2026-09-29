package com.example.user.mapper;

import com.example.user.dto.doctor.DoctorCreateDTO;
import com.example.user.dto.doctor.DoctorResponseSummaryDTO;
import com.example.user.entity.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    Doctor toEntity(DoctorCreateDTO dto);
    DoctorResponseSummaryDTO toResponseSummary(Doctor doctor);
}