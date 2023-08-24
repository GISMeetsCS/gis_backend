package com.gismeetscs.gis_backend.User;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity(name="user")
public class User {
    @Id
    private int user_id;

    private String email;

    private String user_name;

    private String nickname;

    private String password;

    private int status;

    private String jwt_token;

    private int num_upload;

    private int num_issue;
}
