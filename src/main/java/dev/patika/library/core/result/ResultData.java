package dev.patika.library.core.result;

import lombok.Getter;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super;

@Getter
public class ResultData<T> extends Result {

    private T date;

    public ResultData(boolean status, String message, String code, T date) {
        super(status, message, code);
        this.date = date;
    }
}
