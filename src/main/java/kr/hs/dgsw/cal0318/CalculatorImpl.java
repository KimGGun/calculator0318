package kr.hs.dgsw.cal0318;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {

    @Override
    public int plus(int one, int two) {
        return one + two;
    }

    @Override
    public int minus(int one, int two) {
        return one - two;
    }

    @Override
    public int division(int one, int two) {
        return one / two;
    }

    @Override
    public int multiply(int one, int two) {
        return one * two;
    }
}
