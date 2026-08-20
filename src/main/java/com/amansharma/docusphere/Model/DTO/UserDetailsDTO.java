package com.amansharma.docusphere.Model.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class UserDetailsDTO {

    private Long id;

    private String username;

    private String role;
}
