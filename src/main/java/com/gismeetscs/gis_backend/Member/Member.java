package com.gismeetscs.gis_backend.Member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="member")
public class Member {
    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_id;

    @Column(name="email")
    private String email;

    @Column(name="member_name")
    private String memberName;

    @Column(name="nickname")
    private String nickname;

    @Column(name="password")
    private String password;

    @Column(name="status")
    private Integer status;

    @Column(name="jwt_token")
    private String jwtToken;

    @Column(name="num_upload")
    private Integer numUpload;

    @Column(name="num_issue")
    private Integer numIssue;
}
