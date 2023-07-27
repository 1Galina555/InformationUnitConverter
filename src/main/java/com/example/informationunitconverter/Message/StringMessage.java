package com.example.informationunitconverter.Message;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class StringMessage implements Data{
    private String message;
    private LocalDateTime createTime;
    public StringMessage(){
        this("");
    }
    public StringMessage(String message){
        this.message = message;
        createTime = LocalDateTime.now();

    }
    @Override
    public String toString(){
        return createTime + ":" + message;
    }

}
