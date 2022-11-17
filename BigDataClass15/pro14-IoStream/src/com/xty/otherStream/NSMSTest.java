package com.xty.otherStream;

import com.xty.homework.Student;

import java.io.File;
import java.io.IOException;

public class NSMSTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        NSMS nsms = new NSMS(new File("F:\\Code\\Java\\git\\BigDataClass15\\BigDataClass15\\pro14-IoStream\\objs\\students.obj"));
        nsms.showAllSutdents();
    }
}
