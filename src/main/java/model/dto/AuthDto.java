package model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author n.zhuchkevich
 * @since 09/23/2020
 * Dto for answer on auth request
 * */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthDto {
    private String token;
    private String username;
    private String userId;
    private boolean admin;
}
