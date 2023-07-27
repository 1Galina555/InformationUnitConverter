package com.example.informationunitconverter.Controller;

import com.example.informationunitconverter.Message.*;
import com.example.informationunitconverter.Service.InformUnitConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private final InformUnitConverter converter;
    public MainController(InformUnitConverter converter){
        this.converter=converter;
    }
    @GetMapping("status")
    public Data work(){
        return new StringMessage("сервер доступен и работает");
    }
    @GetMapping("ping")
    public Data ping(){
        return new StringMessage("pong");
    }
   @PostMapping("solve")
    public Data solve(@RequestBody RequestData requestData){
        try {
            System.out.println("получено:" + requestData);
            SolutionData solution = converter.converter(requestData.getNum(), requestData.getUnitMeasure(), requestData.getTranslationUnit());
            System.out.println("solution: " + solution);
            return solution;
        }catch (Exception ex){
            return new ErrorData("Ошибка при конвертации " + ex.getMessage());
        }
   }

}
