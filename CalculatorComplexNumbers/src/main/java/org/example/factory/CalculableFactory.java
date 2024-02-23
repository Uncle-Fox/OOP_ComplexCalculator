package org.example.factory;

import org.example.model.Calculable;
import org.example.model.ComplexCalculator;
import org.example.model.ComplexNumber;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(ComplexNumber primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}
