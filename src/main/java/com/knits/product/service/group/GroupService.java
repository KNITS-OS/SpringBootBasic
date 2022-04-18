package com.knits.product.service.group;

import com.knits.product.model.Group;
import com.knits.product.repository.GroupRepository;
import com.knits.product.service.base.BaseEntityService;
import com.knits.product.service.group.dto.GroupDto;
import com.knits.product.service.group.mapper.GroupMapper;
import org.springframework.stereotype.Service;

@Service
public class GroupService extends BaseEntityService<Group, GroupDto> {
    public GroupService(GroupRepository repository, GroupMapper mapper) {
        super(repository, mapper);
    }
}
