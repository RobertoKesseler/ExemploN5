package Kesseler.Roberto.Exemplo5.model;

import lombok.*;

/**
 * @author Roberto Kesseler
 * @version 1.0
 * @since 18/04/2020 - 14:00
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String email;


}
