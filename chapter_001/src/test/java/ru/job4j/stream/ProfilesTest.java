package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        List<Profile> profiles = List.of(new Profile(new Address("Minsk","Koshevogo",1,21)),
                new Profile(new Address("Polotsk", "Skariny",1,23)));
        Profiles addresses = new Profiles();
        assertThat(addresses.collect(profiles).get(0).toString(), is("Address{city='Minsk', street='Koshevogo', home=1, apartment=21}"));
     }

    @Test
    public void collectUnique() {
        List<Profile> profiles = List.of(new Profile(new Address("Minsk","Koshevogo",1,21)),
                new Profile(new Address("Minsk","Koshevogo",1,21)),
                new Profile(new Address("Polotsk", "Skariny",1,23)));
        Profiles addresses = new Profiles();
        int i = addresses.collectUnique(profiles).size();
        assertThat(i, is(2));
    }
}