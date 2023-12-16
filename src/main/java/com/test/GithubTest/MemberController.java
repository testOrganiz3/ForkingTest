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


    public void upstreamPullCheck3() {
        System.out.println("upstream Pull check3");
    }
    public void originLocalPull3(){
        System.out.println("originLocalPull3");
    }


    public void upstreamPullCheck4() {
        System.out.println("upstream Pull Check4");
    }
    public void originLocalPull4(){
        System.out.println("originLocalPull4");
    }
    public void originLocalPull51(){
        System.out.println("originLocalPull5");
    }

    public void upstreamPullCheck5(){
        System.out.println("upstream Pull Check5");
    }

    public void upstreamPullCheck6() {
        System.out.println("upstream Pull Check6");
    }

    public void upstreamPullCheck7(){
        System.out.println("upstream Pull Check7");
    }


    public void originLocalPull6(){
        System.out.println("originLocalPull6");

    }
    public void upstreamPullCheck8(){
        System.out.println("upstream Pull Check");
    }

    public void afterNoonLocal1() {
        System.out.println("afterNoonLocal1");
    }
    public void afterNoonUpstream1(){
        System.out.println("afterNoonUpStream1");
    }

    public void afterNoonUpstream2() {
        System.out.println("afterNoonUpStream2");
    }
    public void afterNoonLocal2(){
        System.out.println("afterNoonLocal2");
    }
    public void nextDayLocal1(){

        System.out.println("nextDayLocal1");
    }

    public void finalDayLocal1(){
        System.out.println("finalDayLocal1");
    }


    public void finalDayLocal(){
        System.out.println("finalDayReal");
    }

    public void nextDayTest(){
        System.out.println("NextDayTest");
    }
















    public void originLocalPull5(){
        System.out.println("originLocalPull5");
    }


}
