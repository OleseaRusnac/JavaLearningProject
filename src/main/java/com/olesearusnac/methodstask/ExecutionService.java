package com.olesearusnac.methodstask;

import javax.xml.crypto.Data;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(130, 170);
        System.out.println("Variable randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(130);
        System.out.println("Variable randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000);
        System.out.println("Variable randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000);
        System.out.println("Variable randomDouble: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("\nRandom Email Address 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email Address 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String of X chars: " + DataGeneratorUtil.generateValidRandomString(56));
        System.out.println("Random Valid String of X chars: " + DataGeneratorUtil.generateValidRandomString(76));
        System.out.println("Random Invalid String of X chars: " + DataGeneratorUtil.generateInvalidRandomString(-3));

        Customer marthaConsumer = new Customer("Martha Cocktail", 30, "martha.cocktail@gmail.com");

        System.out.println("The object Name Martha: " + marthaConsumer.getName());
        System.out.println("The object Age Martha: " + marthaConsumer.getAge());
        System.out.println("The object Email Address Martha: " + marthaConsumer.getEmailAddress());

        marthaConsumer.setName("Martha IceCream");
        marthaConsumer.setAge(200);
        marthaConsumer.setEmailAddress("martha.icecream@gmail.com");

        System.out.println("The object Name Martha: " + marthaConsumer.getName());
        System.out.println("The object Age Martha: " + marthaConsumer.getAge());
        System.out.println("The object Email Address Martha: " + marthaConsumer.getEmailAddress());

        Customer randomDataCustomer = new Customer (DataGeneratorUtil.generateValidRandomString(34),
                DataGeneratorUtil.getRandomInt(127), DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.getAge());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(12));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(15, 45));
        randomDataCustomer.setEmailAddress(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }
}
