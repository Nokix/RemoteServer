package gmbh.conteco.RemoteServer;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
