package OOPHW3;

import java.util.ArrayList;
import java.util.Iterator;

public class Container implements Iterable, Comparable <Container>{
    private final ArrayList<Box> boxes;
    public Container() {
        boxes = new ArrayList<>();
    }
    public int weight(){
        int weight = 0;
        for (Box box: boxes) {
            weight = weight + box.getWeight();
        }
        return weight;
    }

    public int boxCount(){
        int boxCount = 0;
        for (Box box: boxes) {
            boxCount++;
        }
        return boxCount;
    }

    public Container(ArrayList<Box> boxes) {
        this.boxes = boxes;
    }

    public void addBox(Box box) {
        boxes.add(box);
    }


    public Iterator<Box> iterator() {
        return new ContainerIterator(boxes);
    }

    @Override
    public int compareTo(Container o) {
        return this.weight() - o.weight();
    }
}
