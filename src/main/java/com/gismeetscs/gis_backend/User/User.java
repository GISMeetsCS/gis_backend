package com.gismeetscs.gis_backend.model;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name="user")
public class UserDTO {
    @Id
    private int userNum;

    private String email;

    private String userName;

    private String nickname;

    private String password;

    private int status;

    private String jwtToken;

    private int numUpload;
    
    private int numIssue;
}
