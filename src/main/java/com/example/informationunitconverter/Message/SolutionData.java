package com.example.informationunitconverter.Message;

import lombok.Getter;

@Getter
public class SolutionData implements Data{
    private final String unitMeasure;
    private final Integer num;

    public SolutionData(String unitMeasure, Integer num){
        this.unitMeasure = unitMeasure;

        this.num = num;

    }
    @Override
    public String toString(){
        switch (unitMeasure){
            case "byt":
                return "В байтах:" + num;
            case "kb":
                return "В килобайтах:" + num;
            case "mb":
                return "В мегабайтах:" + num;
            case "gb":
                return "В гигабайтах:" + num;
            case "tb":
                return "В терабайтах : " + num;
            case "pb":
                return "В петабайтах:" + num;
            case "eb":
                return "В экзабайтах:" + num;
            case "zb":
                return "В зеттабайтах :" + num;
            case "ab":
                return "В  йоттабайт экзабайтах:" + num;
            default:
                throw new RuntimeException("Invalid unitMeasure value'" + unitMeasure + "'" );
        }
    }

}