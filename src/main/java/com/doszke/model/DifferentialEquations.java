package com.doszke.model;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;

public class DifferentialEquations implements FirstOrderDifferentialEquations {


    private double A;
    private double D;
    private double h;

    public DifferentialEquations(double a, double d, double h) {
        A = a;
        D = d;
        this.h = h;
    }

    public int getDimension() {
        return 2;
    }

    public void computeDerivatives(double t, double[] x, double[] dxdt) throws MaxCountExceededException, DimensionMismatchException {
        dxdt[0] = x[1]/h*D*A * t;
        dxdt[1] = -x[0]*t*0.00001;
    }
}
