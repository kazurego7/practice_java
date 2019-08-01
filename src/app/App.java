package app;

import java.util.stream.IntStream;

interface IHelloRepeater {
    void repeatHelloAt(int i);
}

class HelloRepeater implements IHelloRepeater {
    public void repeatHelloAt(int i) {
        for (int k : IntStream.range(0, i).toArray()) {
            System.out.println(String.format("hello %05d", k));
        }
        return;
    }
}

class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        HelloRepeater speaker = new HelloRepeater();
        speaker.repeatHelloAt(6);
    }
}