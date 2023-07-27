package com.example.informationunitconverter.Service;

import com.example.informationunitconverter.Message.SolutionData;
import org.springframework.stereotype.Service;

@Service
public class InformUnitConverter {
    public SolutionData converter(Integer num, String unitMeasure, String translationUnit)  {
        if (num == 0){
            throw new ArithmeticException("num=o");
        }
        switch (unitMeasure){
            case "byt":
                switch ( translationUnit){
                    case "kb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 10)));
                    case "mb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 20)));
                    case "gb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 30)));
                    case "tb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 40)));
                    case "pb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 50)));
                    case "eb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 60)));
                    case "zb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 70)));
                    case "ab":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 80)));
                    default:throw new RuntimeException("Invalid unitMeasure value '"+ translationUnit+"'");
                }
            case "kb":
                switch ( translationUnit){
                    case "byt":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 10)));
                    case "mb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 10)));
                    case "gb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 20)));
                    case "tb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 30)));
                    case "pb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 40)));
                    case "eb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 50)));
                    case "zb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 60)));
                    case "ab":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 70)));
                    default:throw new RuntimeException("Invalid unitMeasure value '"+ translationUnit+"'");
                }

            case "mb":
                switch ( translationUnit){
                    case "byt":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 20)));
                    case "kb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 10)));
                    case "gb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 10)));
                    case "tb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 20)));
                    case "pb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 30)));
                    case "eb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 40)));
                    case "zb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 50)));
                    case "ab":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 60)));
                    default:throw new RuntimeException("Invalid unitMeasure value '"+ translationUnit+"'");
                }

            case "gb":
                switch ( translationUnit){
                    case "byt":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 30)));
                    case "kb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 20)));
                    case "mb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 10)));
                    case "tb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 10)));
                    case "pb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 20)));
                    case "eb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 30)));
                    case "zb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 40)));
                    case "ab":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 50)));
                    default:throw new RuntimeException("Invalid unitMeasure value '"+ translationUnit+"'");
                }
            case "tb":
                switch ( translationUnit){
                    case "byt":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 40)));
                    case "kb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 30)));
                    case "mb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 20)));
                    case "gb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 10)));
                    case "pb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 10)));
                    case "eb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 20)));
                    case "zb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 30)));
                    case "ab":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 40)));
                    default:throw new RuntimeException("Invalid unitMeasure value '"+ translationUnit+"'");
                }
            case "pb":
                switch ( translationUnit){
                    case "byt":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 50)));
                    case "kb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 40)));
                    case "mb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 30)));
                    case "gb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 20)));
                    case "tb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 10)));
                    case "eb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 10)));
                    case "zb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 20)));
                    case "ab":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 30)));
                    default:throw new RuntimeException("Invalid unitMeasure value '"+ translationUnit+"'");
                }
            case "eb":
                switch ( translationUnit){
                    case "byt":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 50)));
                    case "kb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 40)));
                    case "mb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 30)));
                    case "gb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 20)));
                    case "tb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 10)));
                    case "pb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 10)));
                    case "zb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 20)));
                    case "ab":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 30)));
                    default:throw new RuntimeException("Invalid unitMeasure value '"+ translationUnit+"'");
                }
            case "zb":
                switch ( translationUnit){
                    case "byt":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 60)));
                    case "kb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 50)));
                    case "mb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 40)));
                    case "gb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 30)));
                    case "tb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 20)));
                    case "pb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 10)));
                    case "eb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 10)));
                    case "ab":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 20)));
                    default:throw new RuntimeException("Invalid unitMeasure value '"+ translationUnit+"'");
                }
            case "ab":
                switch ( translationUnit){
                    case "byt":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 70)));
                    case "kb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 60)));
                    case "mb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 50)));
                    case "gb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 40)));
                    case "tb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 30)));
                    case "pb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 20)));
                    case "eb":
                        return new SolutionData(translationUnit, (int) (num * Math.pow(2, 10)));
                    case "zb":
                        return new SolutionData(translationUnit, (int) (num / Math.pow(2, 10)));
                    default:throw new RuntimeException("Invalid unitMeasure value '"+ translationUnit+"'");
                }
            default:
                throw new RuntimeException("Invalid unitMeasure value '" + unitMeasure+"'");
        }
        }

    }

