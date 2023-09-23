package umc.study.base.exception.handler;

import umc.study.base.Code;
import umc.study.base.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(Code errorCode){
        super(errorCode);
    }
}
