package com.gismeetscs.gis_backend.Member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;


@Api(tags="Member")
@RestController
@RequestMapping(value = "members")
public class MemberController {
 
    @Autowired
    MemberRepository memberRepository;

    @PostMapping
    public boolean create(Member member){
        memberRepository.save(member);
        return true;
    }

    // @GetMapping
    // public Member find(int memberId){
    //     Member member = memberRepository.findById(memberId).get();
    //     return member;
    // }

    @GetMapping
    public List<Member> find(){
        List<Member> members = memberRepository.findAll();
        return members;
    }

    @PutMapping
    public boolean modify(Member member){
        memberRepository.save(member);
        return true;
    }

    @DeleteMapping
    public boolean delete(int memberId){
        memberRepository.deleteById(memberId);
        return true;
    }


}
