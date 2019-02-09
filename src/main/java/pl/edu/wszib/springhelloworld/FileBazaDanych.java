package pl.edu.wszib.springhelloworld;

import ch.qos.logback.core.util.FileUtil;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.*;
import java.util.Scanner;

public class FileBazaDanych implements BazaDanych {
    @Override
    public void zapis(String klucz, String wartosc) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(klucz + ".txt", "UTF-8");
            writer.append(wartosc);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String pobierz(String klucz) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(klucz + ".txt"));
            return scanner.next("\\A");
        } catch (FileNotFoundException e) {
            //ignored
        }
        return null;
    }

    @Override
    public void usun(String klucz) {
        try {
            FileUtils.forceDelete(new File(klucz + ".txt"));
        } catch (IOException e) {
            //ignored
        }

    }


}
