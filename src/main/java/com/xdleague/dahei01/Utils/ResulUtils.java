package com.xdleague.dahei01.Utils;

import com.xdleague.dahei01.enumes.ResultCodeEnum;
import com.xdleague.dahei01.model.vo.ResultVo;

public class ResulUtils {
    public static ResultVo getResult(ResultCodeEnum resultCodeEnum, Object object, String string) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(resultCodeEnum.getValue());
        resultVo.setData(object);
        resultVo.setMessage(string);
        return resultVo;
    }
}
