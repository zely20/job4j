package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAsc() {
        Set<Job> users = new TreeSet<>();
        users.add(new Job("Ab", 2));
        users.add(new Job("Ba", 1));
        Iterator<Job> it = users.iterator();
        assertThat(it.next(), is(new Job("Ba", 1)));
        assertThat(it.next(), is(new Job("Ab", 2)));
    }

    @Test
    public void whenCompatorByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDescByName() {
        JobDescByName rsl = new JobDescByName();
        int result = rsl.compare(new Job("a", 1), new Job("b", 2));
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenByName() {
        JobByName rsl = new JobByName();
        int result = rsl.compare(new Job("a", 1), new Job("b", 2));
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenDescByPriority() {
        JobDescByPriority rsl = new JobDescByPriority();
        int result = rsl.compare(new Job("a", 1), new Job("b", 2));
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenByPriority() {
        JobByPriority rsl = new JobByPriority();
        int result = rsl.compare(new Job("a", 1), new Job("b", 2));
        assertThat(result, lessThan(0));
    }
}
