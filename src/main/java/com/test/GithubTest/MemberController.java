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


    public void updateWorld() {
        System.out.println("update World");
    }
    public void ByeWorld(){
        System.out.println("Bye World");

    }


    public void localPull1() {
        System.out.println("LocalPull1");
    }
    public void pullCheck1(){
        System.out.println("pull check1");

    }


    public void originLocalPull2() {
        System.out.println("originLocalPull2");
    }
    public void upstreamPullCheck2(){
        System.out.println("upstream Pull check2");

    }

    public void upstreamPullCheck3(){
        System.out.println("upstream Pull check3");
    }


}
