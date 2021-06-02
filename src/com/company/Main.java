package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = null;
        List<User> userList = new LinkedList<>();
        try {
            br = new BufferedReader(new FileReader("file.txt"));
            String line;
            User user = new User();
            while ((line = br.readLine()) != null) {
                user.setSurname(line);
                line = br.readLine();
                user.setName(line);
                line = br.readLine();
                user.setSecondName(line);
                line = br.readLine();
                user.setAge(Integer.parseInt(line));
                line = br.readLine();
                user.setPassport(line);

                System.out.println("Имя:" + user.getAge());
                System.out.println("Фамилия:" + user.getSurname());
                System.out.println("Отчество:" + user.getSecondName());
                System.out.println("Возраст:" + user.getAge());
                System.out.println("Паспорт:" + user.getPassport());
                userList.add(user);
                System.out.println(userList.get(0));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
