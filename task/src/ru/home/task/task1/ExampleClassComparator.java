package ru.home.task.task1;

import java.util.Comparator;

public class ExampleClassComparator implements Comparator<ExampleClass>{

    @Override
    public int compare(ExampleClass o1, ExampleClass o2) {
        {
            if (o1.number == o2.number)
                return 0;
            else if (o1.number > o2.number)
                return 1;
            else
                return -1;
        }
    }
}

