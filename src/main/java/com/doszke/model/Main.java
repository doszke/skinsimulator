package com.doszke.model;

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;

public class Main {

    public static void main(String[] args) {
        double a = 1; //cm
        double d = 10; //chuj wi
        double h = 0.5; //cm
        FirstOrderDifferentialEquations integrator = new DifferentialEquations(a, d, h);
        FirstOrderIntegrator rkIntegrator=new ClassicalRungeKuttaIntegrator(0.01);
        MyStepHandler trajectory = new MyStepHandler();
        rkIntegrator.addStepHandler(trajectory);

        //TurningPoint turningPoint = new TurningPoint(c,d);
        //rkIntegrator.addEventHandler(turningPoint,0.1,0.001,2000);

        double [] xStart = new double [] {0.01, 4};
        double [] xStop = new double [] {500, 0};
        rkIntegrator.integrate(integrator,0,xStart,30,xStop);
    }


}
