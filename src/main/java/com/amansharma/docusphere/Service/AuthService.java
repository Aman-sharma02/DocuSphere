package com.amansharma.docusphere.Service;

import com.amansharma.docusphere.Model.DTO.JwtRequestDTO;
import com.amansharma.docusphere.Model.JwtResponse;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity<JwtResponse> authenticateUser(JwtRequestDTO loginRequest);
}
