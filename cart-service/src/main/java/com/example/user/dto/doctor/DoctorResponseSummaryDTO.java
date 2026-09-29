package com.example.user.dto.doctor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorResponseSummaryDTO {
    private Long id;
    private String name;
    private String specialization;
}