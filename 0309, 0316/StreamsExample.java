import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;
import static java.nio.file.Files.copy;

import java.io.IOException;
import java.io.PrintWriter;

public class StreamsExample {
    public static void main(String[] args) throws IOException {
        //1/a
        /*lines(Path.of("tmp.txt"))
            .forEach(System.out::println);
        */

        //1/b
        /*lines(Path.of("tmp.txt"))
            .map(n -> n + " extreme")
            .forEach(System.out::println);
        */

        //1/c
        //copy(Path.of("tmp.txt"),Path.of("new.txt"));

        //1/d
        /*Object[] in = lines(Path.of("tmp.txt"))
            .map(n -> n + " extreme")
            .filter(line -> line.length() > 5)
            .toArray();

        try (PrintWriter pw = new PrintWriter(
            Files.newBufferedWriter(Paths.get("new.txt")))) {
            Stream.of(in).forEach(pw::println);
        }*/

        //1/e
        /*Object[] in = lines(Path.of("tmp.txt"))
            .map(n -> n + " extreme")
            .skip(0)
            .skip(1)
            .skip(2)
            .toArray();

        try (PrintWriter pw = new PrintWriter(
            Files.newBufferedWriter(Paths.get("new.txt")))) {
            Stream.of(in).forEach(pw::println);
        }*/

        //1/f
        /*Object[] in = lines(Path.of("tmp.txt"))
            .map(n -> n + " extreme")
            .limit(10)
            .toArray();
        
        try (PrintWriter pw = new PrintWriter(
            Files.newBufferedWriter(Paths.get("new.txt")))) {
            Stream.of(in).forEach(pw::println);
        }*/

        //1/g

        //1/h
        /*Object[] in =  lines(Path.of("tmp.txt"))
            .map(n -> n + " extreme")
            .sorted()
            .toArray();
        
        try (PrintWriter pw = new PrintWriter(
            Files.newBufferedWriter(Paths.get("new.txt")))) {
            Stream.of(in).forEach(pw::println);
        }*/

        //1//h
        /*Object[] in = lines(Path.of("tmp,txt"))
            .map(n -> n + " extreme")
        */

        //Többi megoldások/ más megoldások a 14:10-es csoport szünet elötti videójában és a mi csoportunk utolsó videójábn.
    }
}
