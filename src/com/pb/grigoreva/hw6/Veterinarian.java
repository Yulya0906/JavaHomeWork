package com.pb.grigoreva.hw6;

import java.lang.reflect.Constructor;

public class Veterinarian {

    private Object treatAnimal;

    public void getName() {
    }

    public void setName(String name) {
    }

    public static void main(String[] args) throws Exception {

        Veterinarian v = new Veterinarian();
        Class<? extends Veterinarian> clazz = v.getClass();
        System.out.println(clazz.getName());
        Class<?> vetClazz = Class.forName("com.pb.grigoreva.hw6.Veterinarian");
        Constructor<?> constructor = vetClazz.getConstructor(String.class);
        Object obj = constructor.newInstance("Доктор Вет");
        if (obj instanceof Veterinarian) {
            Object treatAnimal = ((Veterinarian) obj).treatAnimal;
        }



    }
}
