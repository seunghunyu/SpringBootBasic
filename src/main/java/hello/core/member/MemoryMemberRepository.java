package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MemoryMemberRepository implements MemberRepository{

    private static HashMap<Long, Member> store = new HashMap<>();
    //실무에서는 컨터런트 해쉬맵을 써야한다. 일반해쉬를쓰면 동시성의 문제가 발생할 수 있음.
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
