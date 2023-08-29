package com.gismeetscs.gis_backend.Member;

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
@RequestMapping(value = "member")
public class MemberController {
 
    @Autowired
    MemberRepository memberRepository;

    @PostMapping(value = "create")
    public boolean create(Member member){
        memberRepository.save(member);
        return true;
    }

    @GetMapping(value = "find")
    public Member find(int memberId){
        Member member = memberRepository.findById(memberId).get();
        return member;
    }

    @PutMapping(value = "modify")
    public boolean modify(Member member){
        memberRepository.save(member);
        return true;
    }

    @DeleteMapping(value = "delete")
    public boolean delete(Member member){
        memberRepository.delete(member);
        return true;
    }


}
