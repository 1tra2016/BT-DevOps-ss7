package com.example.user.dto.doctor;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DoctorCreateDTO {
    @NotBlank(message = "Tên bác sĩ không được để trống")
    private String name;

    @NotBlank(message = "Chuyên khoa không được để trống")
    private String specialization;

    @Min(value = 0, message = "Số năm kinh nghiệm phải lớn hơn hoặc bằng 0")
    private Integer experienceYears;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;
}