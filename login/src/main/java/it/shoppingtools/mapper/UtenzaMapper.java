package it.shoppingtools.mapper;

import it.shoppingtools.dto.UserDTO;
import it.shoppingtools.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UtenzaMapper {
    User toUser (UserDTO utenza);
    UserDTO toUser (User utenza);
    UtenzaMapper INSTANCE = Mappers.getMapper(UtenzaMapper.class);
}

