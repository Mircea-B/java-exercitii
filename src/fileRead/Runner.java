package fileRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Runner {
    public static void main(String[] args) throws IOException {

        Path getfile = Paths.get("C:\\Users\\Endless\\Desktop\\Fisiere\\Data.txt");

        List<String> strings = Files.readAllLines(getfile);

        System.out.println(strings);

        List<String> intList = Arrays.asList(" ","====","Necromancer:","STATS=2.8","GOLD=5.7K","ATTACK=24","DEFENSE=6","LUCK=9.3");
        Files.write(getfile,intList, StandardOpenOption.APPEND);
        List<String> newgetfile=Files.readAllLines(getfile);
        System.out.println(newgetfile);
        String persoana = null;
        StringTokenizer tokenizer = new StringTokenizer(persoana,"=");

    }
}
