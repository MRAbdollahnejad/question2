package maktab_question_two;

public class NonMetalElement extends Element{
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("NonMetalElement{" +
                "symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", atomicWeight=" + atomicWeight +
                "nonmetals are poor conductors of " +
                "electricity"+
                '}');
    }

}
