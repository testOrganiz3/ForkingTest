package com.test.GithubTest;

import lombok.Data;

@Data
public class MemberShowDto {
    private Long id;
    private String name;
    public MemberShowDto(Member member){
        this.id=member.getId();
        this.name=member.getName();
    }
}
