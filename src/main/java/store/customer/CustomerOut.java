package store.customer;

public record CustomerOut(
    String id,
    String name,
    String birthdate,
    String cpf,
    String email
) {

    public CustomerOut(String id) {
        this(id, null, null, null, null);
    }

}