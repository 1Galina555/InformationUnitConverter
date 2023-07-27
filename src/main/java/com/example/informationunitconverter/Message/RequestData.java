package com.example.informationunitconverter.Message;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class RequestData implements Data{
   private Integer num;
    private String unitMeasure;
    private String translationUnit;

    public RequestData() {
        unitMeasure = "";
        translationUnit = "";
        num = 0;
    }

    public RequestData(@NonNull Integer num, @NonNull String unitMeasure,@NonNull String translationUnit) {
        this.num = num;
        this.unitMeasure = unitMeasure;
        this.translationUnit = translationUnit;
    }
    @Override
    public String toString(){
        return "Конвертировать:" + num + unitMeasure + " в единицы измерения информации " + translationUnit;
    }
}
