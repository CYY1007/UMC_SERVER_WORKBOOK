package umc.study.apiPayload.exception.handler;

import umc.study.apiPayload.code.BaseErrorCode;
import umc.study.apiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
