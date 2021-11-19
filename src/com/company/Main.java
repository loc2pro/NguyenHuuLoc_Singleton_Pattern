package com.company;

//import com.company.builder.Computer;
import com.company.builder.Student;
//import com.company.singleton.*;

import java.io.*;

public class Main {

    public static void main(String[] args) throws
            FileNotFoundException, IOException, ClassNotFoundException {
//        SerializedSingleton instanceOne =
//                SerializedSingleton.getInstance();
//        SerializedSingleton instanceTwo =
//                SerializedSingleton.getInstance();

//        EagerInitializedSingleton instanceOne =
//                EagerInitializedSingleton.getInstance();
//        EagerInitializedSingleton instanceTwo =
//                EagerInitializedSingleton.getInstance();

//        LazyInitializedSingleton instanceOne =
//                LazyInitializedSingleton.getInstance();
//        LazyInitializedSingleton instanceTwo =
//                LazyInitializedSingleton.getInstance();

//        StaticBlockSingleton instanceOne =
//                StaticBlockSingleton.getInstance();
//        StaticBlockSingleton instanceTwo =
//                StaticBlockSingleton.getInstance();

//        ThreadSafeSingleton instanceOne =
//                ThreadSafeSingleton.getInstanceUsingDoubleLocking();
//        ThreadSafeSingleton instanceTwo =
//                ThreadSafeSingleton.getInstanceUsingDoubleLocking();
//        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
//        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
//
//
//        Computer comp = new Computer.ComputerBuilder(
//                "500 GB", "2 GB")
//                .setGraphicsCardEnabled(true).build();
//        System.out.println(comp);


        Student student = new Student.StudentBuilder(
                1, "Lộc","14CTT",21,"Nam")
                .build();
        System.out.println(student);
    }
}
