package com.company.Varkavorum;

import java.text.DateFormat;

public enum LoanEnum {
    APARIK(10,2,0.0),
    BUSINESS(15,2,2.2),
    SPAROXAKAN(24,1,1.8);

    final double  percent;
    final int duration;
    final double otherFees;
    LoanEnum(double percent, int duration, double otherFees){
        this.percent= percent;
        this.duration=duration;
        this.otherFees=otherFees;
    }
}
