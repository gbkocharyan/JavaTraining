package com.company.Varkavorum;

import java.io.IOException;
import java.util.Random;

public class Manager {
    private boolean committeeState;
    private boolean decision;
    DecisionListener decisionListener;

    public void setDecisionListener(DecisionListener decisionListener) {
        this.decisionListener = decisionListener;
    }

    public boolean getCommitteeState() {
        return committeeState;
    }

    public boolean committee(LoanApplication loanApplication) throws IOException {
        Random random = new Random();
        if (loanApplication.getScore() < 450) {
            decision = false;
        } else {
            decision = random.nextBoolean();
            System.out.println(decision);
        }
        if (decisionListener != null && decision) {
            decisionListener.logic();
        }

        return committeeState = decision;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "decision=" + decision +
                ", desicionLlistener=" + decisionListener +
                '}';
    }
}