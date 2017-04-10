package com.kpi.listener;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestRunner extends BlockJUnit4ClassRunner {

    public TestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    public void run(RunNotifier notifier){
        notifier.addListener(new JUnitExecutionListener());
        super.run(notifier);
    }
}