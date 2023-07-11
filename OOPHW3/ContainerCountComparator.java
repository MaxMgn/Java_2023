package OOPHW3;

import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {
    @Override
    public int compare(Container o1, Container o2) {
        return o1.boxCount() - o2.boxCount() ;
    }
}
