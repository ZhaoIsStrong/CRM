package test;

import java.util.UUID;

public class test01 {
    public static void main(String[] args) {

        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        System.out.println(str);
        System.out.println(str.length());
        str = str.replaceAll("-","");
        System.out.println(str);
        System.out.println(str.length());
    }
}
