package kata8;

import java.math.BigDecimal;

public class MultiplyDouble {

    public Double multiply(Double a, Double b) {
        final var BDa = new BigDecimal(a.toString());
        final var BDb = new BigDecimal(b.toString());
        return BDa.multiply(BDb).doubleValue();
    }
}
