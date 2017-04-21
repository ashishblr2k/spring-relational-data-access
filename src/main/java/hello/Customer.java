package hello;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * Created by agup101 on 4/19/2017.
 */
@AllArgsConstructor
@ToString
public class Customer {

    private long id;
    private String firstName;
    private String lastName;
}
