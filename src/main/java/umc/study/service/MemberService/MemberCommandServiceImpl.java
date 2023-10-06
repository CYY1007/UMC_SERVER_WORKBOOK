package umc.study.service.MemberService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.apiPayload.code.status.ErrorStatus;
import umc.study.apiPayload.exception.handler.FoodCategoryHandler;
import umc.study.converter.MemberConverter;
import umc.study.converter.MemberPreferConverter;
import umc.study.domain.FoodCategory;
import umc.study.domain.Member;
import umc.study.domain.mapping.MemberPrefer;
import umc.study.repository.FoodCategoryRepository;
import umc.study.repository.MemberRepository;
import umc.study.web.dto.MemberRequestDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberCommandServiceImpl implements MemberCommandService{

    private final MemberRepository memberRepository;

    private final FoodCategoryRepository foodCategoryRepository;

    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDto request) {

        Member newMember = MemberConverter.toMember(request);
        List<FoodCategory> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<MemberPrefer> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);

        memberPreferList.forEach(memberPrefer -> {memberPrefer.setMember(newMember);});

        return memberRepository.save(newMember);
    }
}
