package com.example.user.controller;

import com.example.user.dto.apiresponse.ApiResponse;
import com.example.user.dto.doctor.DoctorCreateDTO;
import com.example.user.dto.doctor.DoctorResponseSummaryDTO;
import com.example.user.service.IDoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final IDoctorService doctorService;
    @PostMapping()
    public ResponseEntity<ApiResponse<DoctorResponseSummaryDTO>> createDoctor(
            @Valid @RequestBody DoctorCreateDTO request
    ) {
        return ResponseEntity.ok(ApiResponse.success(
                201,
                doctorService.createDoctor(request),
                "Register successfully"
        ));
    }

    @GetMapping()
    public ResponseEntity<ApiResponse<List<DoctorResponseSummaryDTO>>> getDoctors() {
        return ResponseEntity.ok(ApiResponse.success(
                200,
                doctorService.getDoctors(),
                "8081 Success"
        ));
    }

    @GetMapping("/{id}/summary")
    public ResponseEntity<ApiResponse<DoctorResponseSummaryDTO>> getDoctorSummary(
            @PathVariable long id
    ) {
        return ResponseEntity.ok(ApiResponse.success(
                200,
                doctorService.getDoctorSummary(id),
                "8081 Success"
        ));
    }

}
