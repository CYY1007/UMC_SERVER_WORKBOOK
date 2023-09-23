package umc.study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.study.base.Code;
import umc.study.base.ResponseDto;
import umc.study.converter.TempConverter;
import umc.study.service.TempService.TempCommandService;
import umc.study.service.TempService.TempQueryService;
import umc.study.web.dto.TempRequest;
import umc.study.web.dto.TempResponse;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempRestController {

    private final TempQueryService tempQueryService;

    @GetMapping("/test")
    public ResponseDto<TempResponse.TempTestDTO> testAPI(){

        return ResponseDto.onSuccess(TempConverter.toTempTestDTO(), Code.OK);
    }

    @GetMapping("/exception")
    public ResponseDto<TempResponse.TempExceptionDTO> exceptionAPI(@RequestParam Integer flag){
        tempQueryService.CheckFlag(flag);
        return ResponseDto.onSuccess(TempConverter.toTempExceptionDTO(flag), Code.OK);
    }
}
