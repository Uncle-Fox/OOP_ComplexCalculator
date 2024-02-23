package org.example.controller;

import org.example.factory.ICalculableFactory;
import org.example.factory.LogCalculableFactory;
import org.example.logger.ConsoleLogger;
import org.example.view.ViewCalculator;


public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
