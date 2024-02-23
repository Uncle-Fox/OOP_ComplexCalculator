package org.example.factory;

import org.example.model.Calculable;
import org.example.model.ComplexNumber;

public interface ICalculableFactory {
    Calculable create(ComplexNumber primaryArg);
}
