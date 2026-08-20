package com.amansharma.docusphere.Service;

import com.amansharma.docusphere.Model.DTO.UserDetailsDTO;
import com.amansharma.docusphere.Model.User;
import com.amansharma.docusphere.Model.DTO.UpdateRolesDTO;
import com.amansharma.docusphere.Model.DTO.UserRegistrationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDTO userRegistrationDTO);

    ResponseEntity<String> updateRole(UpdateRolesDTO updateRolesDTO);

    ResponseEntity<String> deleteUser(Long id);

    ResponseEntity<List<UserDetailsDTO>> getAllUsers();

    ResponseEntity<UserDetailsDTO> getUserById(Long id);
}
