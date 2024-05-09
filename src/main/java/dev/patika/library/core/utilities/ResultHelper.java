package dev.patika.library.core.utilities;

import dev.patika.library.core.result.ResultData;

public class ResultHelper {

    public static <T> ResultData <T> created(T date){
        return new ResultData<>(true,Msg.CREATED,"201",date);
    }

    public static  <T> ResultData<T> validateError(T data){
        return   new ResultData<>(false, Msg.VALIDATE_ERROR,"400",data);
    }
}
