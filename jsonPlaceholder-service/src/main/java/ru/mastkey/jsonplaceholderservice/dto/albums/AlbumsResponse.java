package ru.mastkey.jsonplaceholderservice.dto.albums;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlbumsResponse {
    private Integer userId;
    private Integer id;
    private String title;
}
