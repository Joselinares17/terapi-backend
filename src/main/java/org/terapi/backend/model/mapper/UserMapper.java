package org.terapi.backend.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.terapi.backend.entity.User;
import org.terapi.backend.model.response.UserResponse;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface UserMapper {
    @Mapping(source = "user.email", target = "email")
    @Mapping(source = "user.password", target = "password")
    UserResponse toUserResponse(User user);
}
