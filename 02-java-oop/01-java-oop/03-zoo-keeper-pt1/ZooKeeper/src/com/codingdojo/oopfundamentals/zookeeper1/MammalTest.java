package com.codingdojo.oopfundamentals.zookeeper1;

public class MammalTest {
    public static void main(String[] args) {
        Mammal mammalOne = new Mammal();
        Gorilla gorillaOne = new Gorilla(1001);
        mammalOne.displayEnergy().displayEnergy();
        gorillaOne.throwSomething().throwSomething().throwSomething().eatBanana().eatBanana().climb();
    }

}
