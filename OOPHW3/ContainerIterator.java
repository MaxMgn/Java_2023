package OOPHW3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ContainerIterator
    implements Iterator<Box> {
        private final List<Box> boxes;
        private int position;

    public ContainerIterator(List<Box> boxes) {
        this.boxes = boxes;
    }

        @Override
        public boolean hasNext() {
        return position < boxes.size();
    }

        @Override
        public Box next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return boxes.get(position++);
    }

}
