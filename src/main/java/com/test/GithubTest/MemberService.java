package com.test.GithubTest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false)
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void saveMember(MemberSaveDto memberSaveDto){
        Member member=Member.builder()
                .name(memberSaveDto.getName())
                .build();
        memberRepository.save(member);
    }

    public MemberShowDto getMember(Long id){
        Member member=memberRepository.findById(id).get();
        return new MemberShowDto(member);

    }

}
