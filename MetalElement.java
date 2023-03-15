package maktab_question_two;

public class MetalElement extends Element{
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("NonMetalElement{" +
                "symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", atomicWeight=" + atomicWeight +
                "metals are good conductors of " +
                "electricity"+
                '}');
    }
}
