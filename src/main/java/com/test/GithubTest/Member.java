package com.test.GithubTest;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String name;

    @Builder
    public Member(String name){
        this.name=name;
    }


}
