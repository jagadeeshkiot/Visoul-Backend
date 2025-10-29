package com.example.Visoul_Website.Controller;

import com.example.Visoul_Website.DtoEmail.DtoEmail;
import com.example.Visoul_Website.Service.ServiceVisoul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "${frontend.url}")
@RequestMapping("/visoul")
public class ContollerVisoul {
    @Autowired
    ServiceVisoul service;

    @PostMapping
    public ResponseEntity<String> saveEmail(@RequestBody DtoEmail dtoEmail) {
        try {
            service.saveEmail(dtoEmail);
            return new ResponseEntity<>("Email saved successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            //e.printStackTrace(); // Optional: log for debugging
            return new ResponseEntity<>("Failed to save email!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
