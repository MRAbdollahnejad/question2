package maktab_question_two;

import java.util.Arrays;

public class ElementArray {
    public static void main(String[] args) {
        Element[] array=new Element[4];
        array[0]=new MetalElement("Na",11,22.98d);
        array[1]=new MetalElement("Cu",29,63.54d);
        array[2]=new NonMetalElement("C",6,12.01d);
        array[3]=new NonMetalElement("O",8,15.99d);
        for (int i = 0; i < array.length; i++) {
           array[i].describeElement();
        }
    }
}
