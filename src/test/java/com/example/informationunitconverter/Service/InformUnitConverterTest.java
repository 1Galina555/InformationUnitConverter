package com.example.informationunitconverter.Service;

import com.example.informationunitconverter.Message.SolutionData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InformUnitConverterTest {
    public static InformUnitConverter converter;
@BeforeAll
public static void testConverter(){
    converter=new InformUnitConverter();
}
    @Test
    void converter() {
        Integer num=24;
        String unitMeasure= "tb";
        String translationUnit="mb";
          SolutionData expected=new SolutionData(translationUnit,25165824);
          SolutionData actual=converter.converter(num,unitMeasure,translationUnit);
        assertEquals(expected.getUnitMeasure(),actual.getUnitMeasure());
        assertEquals(expected.getNum(),actual.getNum());
    }
}