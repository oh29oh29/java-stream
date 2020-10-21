import oh29oh29.User;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void stream() {
        // given
        final String name29 = "oh29oh29";
        final String name30 = "oh30oh30";
        final String name31 = "oh31oh31";
        final String name32 = "oh32oh32";
        final String name33 = "oh33oh33";
        final List<User> users = List.of(
                new User(name29, 29, false),
                new User(name30, 30, false),
                new User(name31, 31, false),
                new User(name32, 32, false),
                new User(name33, 33, true)
        );

        // when
        final List<String> userNames = users.stream().map(User::getName).collect(Collectors.toList());

        // then
        final List<String> expected = List.of(name29, name30, name31, name32, name33);
        assertEquals(expected.get(0), userNames.get(0));
        assertEquals(expected.get(1), userNames.get(1));
        assertEquals(expected.get(2), userNames.get(2));
        assertEquals(expected.get(3), userNames.get(3));
        assertEquals(expected.get(4), userNames.get(4));

    }
}
