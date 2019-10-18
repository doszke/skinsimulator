package com.doszke.model;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

public class MyStepHandler implements StepHandler {
    public void init(double v, double[] doubles, double v1) {

    }

    public void handleStep(StepInterpolator stepInterpolator, boolean b) throws MaxCountExceededException {
        System.out.println(stepInterpolator.getCurrentTime() + "," + stepInterpolator.getInterpolatedDerivatives()[0] + "," + stepInterpolator.getInterpolatedDerivatives()[1]);
    }
}
