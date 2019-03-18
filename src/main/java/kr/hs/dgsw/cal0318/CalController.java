package kr.hs.dgsw.cal0318;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {

    @Autowired Calculator cc;

    @GetMapping("/cal/{one}/{two}/{oper}")
    public int calcul(@PathVariable Integer one,
                      @PathVariable Integer two,
                      @PathVariable Integer oper){
         cc = new CalculatorImpl();
        switch(oper){
            case 1: return cc.plus(one, two);
            case 2: return cc.minus(one, two);
            case 3: return cc.division(one, two);
            case 4: return cc.multiply(one, two);
        }

        return 0;
    }

}
