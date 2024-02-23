package org.example.factory;

import org.example.model.Calculable;
import org.example.model.ComplexCalculator;
import org.example.model.LogCalculator;
import org.example.model.ComplexNumber;
import org.example.logger.Logable;

public class LogCalculableFactory implements ICalculableFactory {
    private Logable logable;

    @Override
    public Calculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new ComplexCalculator(primaryArg), logable);
    }

    public LogCalculableFactory(Logable logable) {
        this.logable = logable;
    }
}