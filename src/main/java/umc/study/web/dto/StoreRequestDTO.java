package umc.study.web.dto;

import lombok.Getter;
import umc.study.validation.annotation.ExistCategories;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class StoreRequestDTO {

    @Getter
    public static class ReveiwDTO{
        @NotBlank
        String title;
        @NotNull
        Float score;
        @NotBlank
        String body;
    }
}
