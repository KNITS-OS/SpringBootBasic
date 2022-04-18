package com.knits.product.controller;

import com.knits.product.model.Group;
import com.knits.product.service.group.GroupService;
import com.knits.product.service.group.dto.GroupDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/groups")
@RestController
public class GroupController extends BaseEntityController<Group, GroupDto> {
    public GroupController(GroupService service) {
        super(service);
    }
}
