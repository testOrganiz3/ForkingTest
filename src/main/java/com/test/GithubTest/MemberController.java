package com.test.GithubTest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/member")
    public void saveMember(@RequestBody MemberSaveDto memberSaveDto){
        memberService.saveMember(memberSaveDto);
    }

    @GetMapping("/member/{id}")
    public MemberShowDto getMember(@PathVariable Long id){
        return memberService.getMember(id);
    }

    @DeleteMapping("/member/{id}")
    public void Delete(){

    }

    public void HelloWorld() {
        System.out.println("Hello World");
    }
    @GetMapping("/kkk")
    public void update(){

    }


}
