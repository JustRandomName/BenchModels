package model.utils;

import model.dto.FormDto;
import model.entity.Form;
import model.entity.User;

public final class FormUtil {
    protected FormUtil() {
    }

    public static Form fromDtoToModel(final FormDto dto, final User user) {
        return new Form(dto.getId(),
                dto.getRequest(),
                dto.getPhone(),
                dto.getName(),
                user);
    }

    public static FormDto fromModelToDto(final Form form) {
        return new FormDto(form.getId(),
                form.getDateCreated(),
                form.getRequest(),
                form.getName(),
                form.getPhone());
    }
}
