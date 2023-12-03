package store.customer;

import java.util.Date;

public record CustomerOut(
    String id,
    String name,
    Date birthdate,
    String cpf,
    String email
) {

    public CustomerOut(String id) {
        this(id, null, null, null, null);
    }

}